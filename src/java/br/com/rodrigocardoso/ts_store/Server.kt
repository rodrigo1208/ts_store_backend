package br.com.rodrigocardoso.ts_store

import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.resources.CategoriaResource
import br.com.rodrigocardoso.ts_store.util.toJson
import spark.Spark.exception
import spark.kotlin.before
import spark.kotlin.options
import java.lang.Exception

class Server {
    fun initialize() {
        configureHeaders()
        configureExceptions()
        CategoriaResource()
    }

    private fun configureExceptions() {
        exception(ServiceException::class.java) { exception, _, response ->
            exception.printStackTrace()
            response.status(exception.status.value)
            response.body(toJson(exception))
        }

        exception(Exception::class.java) { exception, _, response ->
            exception.printStackTrace()
            response.status(500)
            response.body(toJson(ServiceException(ResponseStatus.INTERNAL_ERROR, message = exception.message
                    ?: "")))
        }
    }

    private fun configureHeaders() {
        options(path = "/*", function = {
            response.header("Access-Control-Allow-Headers", "Content-Type, Authorization")
            response.body("")
        })
        before(function = {
            response.header("Access-Control-Allow-Credentials", "true")
            response.header("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS")
            response.header("Access-Control-Allow-Origin", "*")
        })
    }

}
package br.com.rodrigocardoso.ts_store.resources

import br.com.rodrigocardoso.ts_store.service.Service
import br.com.rodrigocardoso.ts_store.util.Context
import br.com.rodrigocardoso.ts_store.util.fromJson
import br.com.rodrigocardoso.ts_store.util.toJson
import org.jooq.DAO
import org.jooq.TableRecord
import spark.kotlin.*
import java.util.*

abstract class Resource <R : TableRecord<R>, P,  D: DAO<R, P, UUID>, T : Service<R, P, D>> (protected val service: T, private val uri: String, protected val type: Class<P>) {

    protected val jsonType = "application/json"

    init {
        post(uri, jsonType, ::create)
        put("$uri/:id", jsonType, ::update)
        delete("$uri/:id", jsonType, ::remove)
        get("$uri/:id", jsonType, ::retrieveById)
        get(uri, jsonType, ::find)
    }

    protected fun create(handler: RouteHandler): Any {
        return with(handler) {
            val entity = fromJson(request.body(), type)
            toJson(service.create(entity, request.attribute("context") ?: Context(request, UUID.randomUUID()) ))
        }
    }

    protected fun update(handler: RouteHandler): Any {
        return with(handler) {
            val entity = fromJson(request.body(), type)
            toJson(service.update(entity, request.attribute("context")))
        }
    }

    protected fun remove(handler: RouteHandler): Any {
        return with(handler) {
            val id = UUID.fromString(request.params("id"))
            service.remove(id, request.attribute("context"))
            ""
        }
    }

    protected fun retrieveById(handler: RouteHandler): Any {
        return with(handler) {
            val id = UUID.fromString(request.params("id"))
            toJson(service.retrieveById(id))
        }
    }

    protected fun find(handler: RouteHandler): Any {
        return with(handler) {
            val context: Context = request.attribute("context")
            val offset = context.params["offset"].takeIf { a -> !a.isNullOrEmpty() }.let { a -> (a ?: "0").toInt()  }
            val size = context.params["size"].takeIf { a -> !a.isNullOrEmpty() }.let { a -> (a ?: "10").toInt()  }
            toJson(service.find(context.params, offset, size))
        }
    }
}
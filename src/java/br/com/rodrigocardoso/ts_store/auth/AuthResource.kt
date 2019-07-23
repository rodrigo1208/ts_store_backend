package br.com.rodrigocardoso.ts_store.auth

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.resources.ResponseStatus
import br.com.rodrigocardoso.ts_store.util.Context
import br.com.rodrigocardoso.ts_store.util.Jwt
import br.com.rodrigocardoso.ts_store.util.fromJson
import com.google.gson.Gson
import spark.Filter
import spark.kotlin.before
import spark.kotlin.post

class AuthResource {
    private val service = AuthService()
    init {
        post("/login", "application/json") {
            val login = fromJson(request.body(), Login::class.java)
            service.login(login)
        }

        before(path = "/api/*") {
            val token = request.headers("authorization")
            val usuario = service.authenticate(token)
            request.attribute("context", Context(request, usuario.id))
        }
    }
}
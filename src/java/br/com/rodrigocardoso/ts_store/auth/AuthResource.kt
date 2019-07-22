package br.com.rodrigocardoso.ts_store.auth

import br.com.rodrigocardoso.ts_store.util.fromJson
import com.google.gson.Gson
import spark.kotlin.post

class AuthResource {
    private val service = AuthService()
    init {
        post("/login", "application/json") {
            val login = fromJson(request.body(), Login::class.java)
            service.login(login)
        }
    }
}
package br.com.rodrigocardoso.ts_store.util

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

object Jwt {
    private const val secret = "@Ts_StoR&"
    private const val issuer = "ts_store"

    fun createToken(login: String): String {
        val algorithm = Algorithm.HMAC512(secret)

        return JWT.create()
                .withIssuer(issuer)
                .withSubject(login)
                .withExpiresAt(Date.from(LocalDateTime.now().plusDays(1).atZone(ZoneId.systemDefault()).toInstant()))
                .sign(algorithm)
    }

    fun verify(token: String): String {
        val algorithm = Algorithm.HMAC512(secret)
        val verifier = JWT.require(algorithm).withIssuer(issuer).build()
        return verifier.verify(token).subject
    }
}
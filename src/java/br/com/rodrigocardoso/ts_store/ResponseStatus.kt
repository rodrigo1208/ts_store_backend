package br.com.rodrigocardoso.ts_store

enum class ResponseStatus (val value: Int) {
    SUCCESS(200),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_ERROR(500)
}
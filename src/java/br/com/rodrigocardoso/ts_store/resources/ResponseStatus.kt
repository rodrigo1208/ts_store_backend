package br.com.rodrigocardoso.ts_store.resources

enum class ResponseStatus (val value: Int) {
    SUCCESS(200),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    CONFLICT(409),
    INTERNAL_ERROR(500)
}
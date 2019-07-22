package br.com.rodrigocardoso.ts_store.util

import spark.Request
import kotlin.collections.HashMap
import java.util.UUID



class Context (
        val params: Map<String, String>,
        val body: String,
        val headers: Set<String>,
        val userId: UUID
) {

    constructor(request: Request, userId: UUID) : this(
            params = mapParams(request),
            body = request.body(),
            headers = request.headers(),
            userId =  userId
    )

    companion object factory {
        private fun mapParams(request: Request): Map<String, String> {
            return request.queryParams()
                    .stream()
                    .collect(({ HashMap() }),
                            { m, v -> m[v] = request.queryParams(v) },
                            { _, _ -> })
        }
    }
}
package br.com.rodrigocardoso.ts_store.util

import com.google.gson.Gson
import java.time.ZonedDateTime
import java.time.LocalDate
import java.time.LocalDateTime
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer
import com.google.gson.JsonObject


fun <T> toJson(obj: T): String {
    return Gson().toJson(obj)
}

fun <T> fromJson(jsonString: String, clazz: Class<T>): T {
    val gson = localDateTimeGson()
    return gson.fromJson(jsonString, clazz)
}

fun localDateTimeGson(): Gson {
    val gson = GsonBuilder()

    gson.registerTypeAdapter(LocalDateTime::class.java, JsonDeserializer
            { json, _, _ ->
                ZonedDateTime
                        .parse(json.asJsonPrimitive.asString).toLocalDateTime()
            } as JsonDeserializer<LocalDateTime>)
            .registerTypeAdapter(LocalDate::class.java, JsonDeserializer { json, _, _ ->
                ZonedDateTime
                        .parse(json.asJsonPrimitive.asString).toLocalDate()
            } as JsonDeserializer<LocalDate>)
    return gson.create()
}
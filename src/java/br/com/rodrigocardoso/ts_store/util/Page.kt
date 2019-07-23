package br.com.rodrigocardoso.ts_store.util

data class Page <T> (val content: List<T>, val page: Int, val size: Int, val totalElements: Int)
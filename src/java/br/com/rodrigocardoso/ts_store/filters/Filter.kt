package br.com.rodrigocardoso.ts_store.filters

import org.jooq.Condition

class Filter (private val filters: Map<String, String>) {
    var condition: Condition? = null
        private set

    constructor() : this(HashMap())
    constructor(condition: Condition, filters: Map<String, String>) : this(filters) {
        this.condition = condition
    }

    fun and(key: String, op: (String) -> Condition): Filter {
        if (!filters.containsKey(key)) return this

        if (condition != null) {
            return Filter(condition!!.and(filters[key]?.let { op(it) }), filters)
        }
        return Filter(filters[key]?.let { op(it) }!!, filters)
    }
}
package br.com.rodrigocardoso.ts_store.service

import br.com.rodrigocardoso.ts_store.resources.ResponseStatus
import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.filters.Filter
import br.com.rodrigocardoso.ts_store.util.Context
import br.com.rodrigocardoso.ts_store.util.Page
import org.jooq.Condition
import org.jooq.DAO
import org.jooq.TableRecord
import org.jooq.impl.DSL
import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.*

abstract class Service <R : TableRecord<R>, P, D : DAO<R, P, UUID>> (protected open val dao: D, val type: Class<P>) {

    open fun create(entity: P, context: Context): P {
        onCreate(entity, context)
        dao.insert(entity)
        return entity
    }

    fun update(entity: P, context: Context): P {
        onUpdate(entity, context)
        dao.update(entity)
        return entity
    }

    fun remove(id: UUID, context: Context) {
        val entity = retrieveById(id)
        inactive(entity, context)
    }

    fun retrieveById(id: UUID): P {
        return dao.findById(id) ?: throw ServiceException(ResponseStatus.NOT_FOUND, "Entity not found - $id")
    }

    fun find(filter: Map<String, String>, offset: Int = 0, size: Int = 10): Page<P> {
        val total: Int = dao.configuration().dsl()
                .selectCount()
                .from(dao.table)
                .where(DSL.field("active").eq(true))
                .fetchOne(DSL.count())

        val content = dao.configuration().dsl()
                .select()
                .from(dao.table)
                .where(getFilters(filter))
                .offset(offset * size)
                .limit(size)
                .fetch()
                .map { r -> r.into(type) }

        return Page(content, offset + 1, size, total)
    }

    protected fun now (): Timestamp { return Timestamp.valueOf(LocalDateTime.now()) }

    protected fun getFilters(filter: Map<String, String>): Condition? {
        return Filter(filter).condition
    }

    abstract fun onCreate(entity: P, context: Context)
    abstract fun onUpdate(entity: P, context: Context)
    abstract fun inactive(entity: P, context: Context)
}
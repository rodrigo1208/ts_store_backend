package br.com.rodrigocardoso.ts_store.service

import br.com.rodrigocardoso.ts_store.resources.ResponseStatus
import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.filters.Filter
import org.jooq.Condition
import org.jooq.DAO
import org.jooq.TableRecord
import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.*

abstract class Service <R : TableRecord<R>, P, D : DAO<R, P, UUID>> (protected open val dao: D, val type: Class<P>) {

    open fun create(entity: P): P {
        onCreate(entity);
        dao.insert(entity)
        return entity
    }

    fun update(entity: P): P {
        onUpdate(entity)
        dao.update(entity)
        return entity
    }

    fun remove(id: UUID) {
        val entity = retrieveById(id)
        inactive(entity)
    }

    fun retrieveById(id: UUID): P {
        return dao.findById(id) ?: throw ServiceException(ResponseStatus.NOT_FOUND, "Entity not found - $id")
    }

    fun find(filter: Map<String, String>): List<P>? {
        return dao.configuration()
                .dsl()
                .select()
                .from(dao.table)
                .where(getFilters(filter))
                .fetch()
                .map { r -> r.into(type) }
    }

    protected fun now (): Timestamp { return Timestamp.valueOf(LocalDateTime.now()) }

    protected fun getFilters(filter: Map<String, String>): Condition? {
        return Filter(filter).condition
    }

    abstract fun onCreate(entity: P)
    abstract fun onUpdate(entity: P)
    abstract fun inactive(entity: P)
}
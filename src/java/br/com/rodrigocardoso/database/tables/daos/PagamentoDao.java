/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.daos;


import br.com.rodrigocardoso.database.tables.Pagamento;
import br.com.rodrigocardoso.database.tables.records.PagamentoRecord;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PagamentoDao extends DAOImpl<PagamentoRecord, br.com.rodrigocardoso.database.tables.pojos.Pagamento, UUID> {

    /**
     * Create a new PagamentoDao without any configuration
     */
    public PagamentoDao() {
        super(Pagamento.PAGAMENTO, br.com.rodrigocardoso.database.tables.pojos.Pagamento.class);
    }

    /**
     * Create a new PagamentoDao with an attached configuration
     */
    public PagamentoDao(Configuration configuration) {
        super(Pagamento.PAGAMENTO, br.com.rodrigocardoso.database.tables.pojos.Pagamento.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(br.com.rodrigocardoso.database.tables.pojos.Pagamento object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByCreatedDate(Timestamp... values) {
        return fetch(Pagamento.PAGAMENTO.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>created_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByCreatedUser(UUID... values) {
        return fetch(Pagamento.PAGAMENTO.CREATED_USER, values);
    }

    /**
     * Fetch records that have <code>updated_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByUpdatedDate(Timestamp... values) {
        return fetch(Pagamento.PAGAMENTO.UPDATED_DATE, values);
    }

    /**
     * Fetch records that have <code>updated_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByUpdatedUser(UUID... values) {
        return fetch(Pagamento.PAGAMENTO.UPDATED_USER, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByActive(Boolean... values) {
        return fetch(Pagamento.PAGAMENTO.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchById(UUID... values) {
        return fetch(Pagamento.PAGAMENTO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public br.com.rodrigocardoso.database.tables.pojos.Pagamento fetchOneById(UUID value) {
        return fetchOne(Pagamento.PAGAMENTO.ID, value);
    }

    /**
     * Fetch records that have <code>descricao IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByDescricao(String... values) {
        return fetch(Pagamento.PAGAMENTO.DESCRICAO, values);
    }

    /**
     * Fetch records that have <code>valor IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByValor(Double... values) {
        return fetch(Pagamento.PAGAMENTO.VALOR, values);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByData(Timestamp... values) {
        return fetch(Pagamento.PAGAMENTO.DATA, values);
    }

    /**
     * Fetch records that have <code>pessoa_id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Pagamento> fetchByPessoaId(UUID... values) {
        return fetch(Pagamento.PAGAMENTO.PESSOA_ID, values);
    }
}

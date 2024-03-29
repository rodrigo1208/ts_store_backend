/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables;


import br.com.rodrigocardoso.database.Indexes;
import br.com.rodrigocardoso.database.Keys;
import br.com.rodrigocardoso.database.Public;
import br.com.rodrigocardoso.database.tables.records.PagamentoRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Pagamento extends TableImpl<PagamentoRecord> {

    private static final long serialVersionUID = -764399103;

    /**
     * The reference instance of <code>public.pagamento</code>
     */
    public static final Pagamento PAGAMENTO = new Pagamento();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PagamentoRecord> getRecordType() {
        return PagamentoRecord.class;
    }

    /**
     * The column <code>public.pagamento.created_date</code>.
     */
    public final TableField<PagamentoRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.pagamento.created_user</code>.
     */
    public final TableField<PagamentoRecord, UUID> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.pagamento.updated_date</code>.
     */
    public final TableField<PagamentoRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.pagamento.updated_user</code>.
     */
    public final TableField<PagamentoRecord, UUID> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>public.pagamento.active</code>.
     */
    public final TableField<PagamentoRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.pagamento.id</code>.
     */
    public final TableField<PagamentoRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.pagamento.descricao</code>.
     */
    public final TableField<PagamentoRecord, String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.pagamento.valor</code>.
     */
    public final TableField<PagamentoRecord, Double> VALOR = createField("valor", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.pagamento.data</code>.
     */
    public final TableField<PagamentoRecord, Timestamp> DATA = createField("data", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.pagamento.pessoa_id</code>.
     */
    public final TableField<PagamentoRecord, UUID> PESSOA_ID = createField("pessoa_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>public.pagamento</code> table reference
     */
    public Pagamento() {
        this(DSL.name("pagamento"), null);
    }

    /**
     * Create an aliased <code>public.pagamento</code> table reference
     */
    public Pagamento(String alias) {
        this(DSL.name(alias), PAGAMENTO);
    }

    /**
     * Create an aliased <code>public.pagamento</code> table reference
     */
    public Pagamento(Name alias) {
        this(alias, PAGAMENTO);
    }

    private Pagamento(Name alias, Table<PagamentoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pagamento(Name alias, Table<PagamentoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PAGAMENTO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PagamentoRecord> getPrimaryKey() {
        return Keys.PAGAMENTO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PagamentoRecord>> getKeys() {
        return Arrays.<UniqueKey<PagamentoRecord>>asList(Keys.PAGAMENTO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PagamentoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PagamentoRecord, ?>>asList(Keys.PAGAMENTO__PAGAMENTO_PESSOA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pagamento as(String alias) {
        return new Pagamento(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pagamento as(Name alias) {
        return new Pagamento(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pagamento rename(String name) {
        return new Pagamento(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pagamento rename(Name name) {
        return new Pagamento(name, null);
    }
}

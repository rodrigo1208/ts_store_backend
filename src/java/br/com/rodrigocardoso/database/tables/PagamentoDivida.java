/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables;


import br.com.rodrigocardoso.database.Indexes;
import br.com.rodrigocardoso.database.Keys;
import br.com.rodrigocardoso.database.Public;
import br.com.rodrigocardoso.database.tables.records.PagamentoDividaRecord;

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
public class PagamentoDivida extends TableImpl<PagamentoDividaRecord> {

    private static final long serialVersionUID = 1411338544;

    /**
     * The reference instance of <code>public.pagamento_divida</code>
     */
    public static final PagamentoDivida PAGAMENTO_DIVIDA = new PagamentoDivida();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PagamentoDividaRecord> getRecordType() {
        return PagamentoDividaRecord.class;
    }

    /**
     * The column <code>public.pagamento_divida.created_date</code>.
     */
    public final TableField<PagamentoDividaRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.created_user</code>.
     */
    public final TableField<PagamentoDividaRecord, UUID> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.updated_date</code>.
     */
    public final TableField<PagamentoDividaRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.pagamento_divida.updated_user</code>.
     */
    public final TableField<PagamentoDividaRecord, UUID> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>public.pagamento_divida.active</code>.
     */
    public final TableField<PagamentoDividaRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.pagamento_divida.id</code>.
     */
    public final TableField<PagamentoDividaRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.descricao</code>.
     */
    public final TableField<PagamentoDividaRecord, String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.valor</code>.
     */
    public final TableField<PagamentoDividaRecord, Double> VALOR = createField("valor", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.data</code>.
     */
    public final TableField<PagamentoDividaRecord, Timestamp> DATA = createField("data", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.pagamento_divida.pessoa_id</code>.
     */
    public final TableField<PagamentoDividaRecord, UUID> PESSOA_ID = createField("pessoa_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>public.pagamento_divida</code> table reference
     */
    public PagamentoDivida() {
        this(DSL.name("pagamento_divida"), null);
    }

    /**
     * Create an aliased <code>public.pagamento_divida</code> table reference
     */
    public PagamentoDivida(String alias) {
        this(DSL.name(alias), PAGAMENTO_DIVIDA);
    }

    /**
     * Create an aliased <code>public.pagamento_divida</code> table reference
     */
    public PagamentoDivida(Name alias) {
        this(alias, PAGAMENTO_DIVIDA);
    }

    private PagamentoDivida(Name alias, Table<PagamentoDividaRecord> aliased) {
        this(alias, aliased, null);
    }

    private PagamentoDivida(Name alias, Table<PagamentoDividaRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PAGAMENTO_DIVIDA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PagamentoDividaRecord> getPrimaryKey() {
        return Keys.PAGAMENTO_DIVIDA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PagamentoDividaRecord>> getKeys() {
        return Arrays.<UniqueKey<PagamentoDividaRecord>>asList(Keys.PAGAMENTO_DIVIDA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PagamentoDividaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PagamentoDividaRecord, ?>>asList(Keys.PAGAMENTO_DIVIDA__PAGAMENTO_DIVIDA_PESSOA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagamentoDivida as(String alias) {
        return new PagamentoDivida(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagamentoDivida as(Name alias) {
        return new PagamentoDivida(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PagamentoDivida rename(String name) {
        return new PagamentoDivida(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PagamentoDivida rename(Name name) {
        return new PagamentoDivida(name, null);
    }
}

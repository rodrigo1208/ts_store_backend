/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables;


import br.com.rodrigocardoso.database.Public;
import br.com.rodrigocardoso.database.tables.records.EntidadeRecord;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Entidade extends TableImpl<EntidadeRecord> {

    private static final long serialVersionUID = -913176090;

    /**
     * The reference instance of <code>public.entidade</code>
     */
    public static final Entidade ENTIDADE = new Entidade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntidadeRecord> getRecordType() {
        return EntidadeRecord.class;
    }

    /**
     * The column <code>public.entidade.created_date</code>.
     */
    public final TableField<EntidadeRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.entidade.created_user</code>.
     */
    public final TableField<EntidadeRecord, UUID> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.entidade.updated_date</code>.
     */
    public final TableField<EntidadeRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.entidade.updated_user</code>.
     */
    public final TableField<EntidadeRecord, UUID> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>public.entidade.active</code>.
     */
    public final TableField<EntidadeRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.entidade</code> table reference
     */
    public Entidade() {
        this(DSL.name("entidade"), null);
    }

    /**
     * Create an aliased <code>public.entidade</code> table reference
     */
    public Entidade(String alias) {
        this(DSL.name(alias), ENTIDADE);
    }

    /**
     * Create an aliased <code>public.entidade</code> table reference
     */
    public Entidade(Name alias) {
        this(alias, ENTIDADE);
    }

    private Entidade(Name alias, Table<EntidadeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Entidade(Name alias, Table<EntidadeRecord> aliased, Field<?>[] parameters) {
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
    public Entidade as(String alias) {
        return new Entidade(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Entidade as(Name alias) {
        return new Entidade(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Entidade rename(String name) {
        return new Entidade(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Entidade rename(Name name) {
        return new Entidade(name, null);
    }
}

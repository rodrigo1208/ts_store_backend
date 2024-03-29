/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database;


import br.com.rodrigocardoso.database.tables.Categoria;
import br.com.rodrigocardoso.database.tables.Divida;
import br.com.rodrigocardoso.database.tables.Doacao;
import br.com.rodrigocardoso.database.tables.Pagamento;
import br.com.rodrigocardoso.database.tables.PagamentoDivida;
import br.com.rodrigocardoso.database.tables.Pessoa;
import br.com.rodrigocardoso.database.tables.Produto;
import br.com.rodrigocardoso.database.tables.Usuario;
import br.com.rodrigocardoso.database.tables.Venda;
import br.com.rodrigocardoso.database.tables.VendaDia;
import br.com.rodrigocardoso.database.tables.VendaProduto;
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord;
import br.com.rodrigocardoso.database.tables.records.DividaRecord;
import br.com.rodrigocardoso.database.tables.records.DoacaoRecord;
import br.com.rodrigocardoso.database.tables.records.PagamentoDividaRecord;
import br.com.rodrigocardoso.database.tables.records.PagamentoRecord;
import br.com.rodrigocardoso.database.tables.records.PessoaRecord;
import br.com.rodrigocardoso.database.tables.records.ProdutoRecord;
import br.com.rodrigocardoso.database.tables.records.UsuarioRecord;
import br.com.rodrigocardoso.database.tables.records.VendaDiaRecord;
import br.com.rodrigocardoso.database.tables.records.VendaProdutoRecord;
import br.com.rodrigocardoso.database.tables.records.VendaRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoriaRecord> CATEGORIA_PKEY = UniqueKeys0.CATEGORIA_PKEY;
    public static final UniqueKey<DividaRecord> DIVIDA_PKEY = UniqueKeys0.DIVIDA_PKEY;
    public static final UniqueKey<DoacaoRecord> DOACAO_PKEY = UniqueKeys0.DOACAO_PKEY;
    public static final UniqueKey<PagamentoRecord> PAGAMENTO_PKEY = UniqueKeys0.PAGAMENTO_PKEY;
    public static final UniqueKey<PagamentoDividaRecord> PAGAMENTO_DIVIDA_PKEY = UniqueKeys0.PAGAMENTO_DIVIDA_PKEY;
    public static final UniqueKey<PessoaRecord> PESSOA_PKEY = UniqueKeys0.PESSOA_PKEY;
    public static final UniqueKey<ProdutoRecord> PRODUTO_PKEY = UniqueKeys0.PRODUTO_PKEY;
    public static final UniqueKey<UsuarioRecord> USUARIO_PKEY = UniqueKeys0.USUARIO_PKEY;
    public static final UniqueKey<VendaRecord> VENDA_PKEY = UniqueKeys0.VENDA_PKEY;
    public static final UniqueKey<VendaDiaRecord> VENDA_DIA_PKEY = UniqueKeys0.VENDA_DIA_PKEY;
    public static final UniqueKey<VendaProdutoRecord> VENDA_PRODUTO_PKEY = UniqueKeys0.VENDA_PRODUTO_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<DividaRecord, PessoaRecord> DIVIDA__DIVIDA_PESSOA_ID_FKEY = ForeignKeys0.DIVIDA__DIVIDA_PESSOA_ID_FKEY;
    public static final ForeignKey<DoacaoRecord, PessoaRecord> DOACAO__DOACAO_PESSOA_ID_FKEY = ForeignKeys0.DOACAO__DOACAO_PESSOA_ID_FKEY;
    public static final ForeignKey<DoacaoRecord, VendaDiaRecord> DOACAO__DOACAO_VENDA_DIA_ID_FKEY = ForeignKeys0.DOACAO__DOACAO_VENDA_DIA_ID_FKEY;
    public static final ForeignKey<PagamentoRecord, PessoaRecord> PAGAMENTO__PAGAMENTO_PESSOA_ID_FKEY = ForeignKeys0.PAGAMENTO__PAGAMENTO_PESSOA_ID_FKEY;
    public static final ForeignKey<PagamentoDividaRecord, PessoaRecord> PAGAMENTO_DIVIDA__PAGAMENTO_DIVIDA_PESSOA_ID_FKEY = ForeignKeys0.PAGAMENTO_DIVIDA__PAGAMENTO_DIVIDA_PESSOA_ID_FKEY;
    public static final ForeignKey<ProdutoRecord, CategoriaRecord> PRODUTO__PRODUTO_CATEGORIA_ID_FKEY = ForeignKeys0.PRODUTO__PRODUTO_CATEGORIA_ID_FKEY;
    public static final ForeignKey<VendaRecord, VendaDiaRecord> VENDA__VENDA_VENDA_DIA_ID_FKEY = ForeignKeys0.VENDA__VENDA_VENDA_DIA_ID_FKEY;
    public static final ForeignKey<VendaRecord, PessoaRecord> VENDA__VENDA_PESSOA_ID_FKEY = ForeignKeys0.VENDA__VENDA_PESSOA_ID_FKEY;
    public static final ForeignKey<VendaProdutoRecord, ProdutoRecord> VENDA_PRODUTO__VENDA_PRODUTO_PRODUTO_ID_FKEY = ForeignKeys0.VENDA_PRODUTO__VENDA_PRODUTO_PRODUTO_ID_FKEY;
    public static final ForeignKey<VendaProdutoRecord, VendaRecord> VENDA_PRODUTO__VENDA_PRODUTO_VENDA_ID_FKEY = ForeignKeys0.VENDA_PRODUTO__VENDA_PRODUTO_VENDA_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CategoriaRecord> CATEGORIA_PKEY = createUniqueKey(Categoria.CATEGORIA, "categoria_pkey", Categoria.CATEGORIA.ID);
        public static final UniqueKey<DividaRecord> DIVIDA_PKEY = createUniqueKey(Divida.DIVIDA, "divida_pkey", Divida.DIVIDA.ID);
        public static final UniqueKey<DoacaoRecord> DOACAO_PKEY = createUniqueKey(Doacao.DOACAO, "doacao_pkey", Doacao.DOACAO.ID);
        public static final UniqueKey<PagamentoRecord> PAGAMENTO_PKEY = createUniqueKey(Pagamento.PAGAMENTO, "pagamento_pkey", Pagamento.PAGAMENTO.ID);
        public static final UniqueKey<PagamentoDividaRecord> PAGAMENTO_DIVIDA_PKEY = createUniqueKey(PagamentoDivida.PAGAMENTO_DIVIDA, "pagamento_divida_pkey", PagamentoDivida.PAGAMENTO_DIVIDA.ID);
        public static final UniqueKey<PessoaRecord> PESSOA_PKEY = createUniqueKey(Pessoa.PESSOA, "pessoa_pkey", Pessoa.PESSOA.ID);
        public static final UniqueKey<ProdutoRecord> PRODUTO_PKEY = createUniqueKey(Produto.PRODUTO, "produto_pkey", Produto.PRODUTO.ID);
        public static final UniqueKey<UsuarioRecord> USUARIO_PKEY = createUniqueKey(Usuario.USUARIO, "usuario_pkey", Usuario.USUARIO.ID);
        public static final UniqueKey<VendaRecord> VENDA_PKEY = createUniqueKey(Venda.VENDA, "venda_pkey", Venda.VENDA.ID);
        public static final UniqueKey<VendaDiaRecord> VENDA_DIA_PKEY = createUniqueKey(VendaDia.VENDA_DIA, "venda_dia_pkey", VendaDia.VENDA_DIA.ID);
        public static final UniqueKey<VendaProdutoRecord> VENDA_PRODUTO_PKEY = createUniqueKey(VendaProduto.VENDA_PRODUTO, "venda_produto_pkey", VendaProduto.VENDA_PRODUTO.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<DividaRecord, PessoaRecord> DIVIDA__DIVIDA_PESSOA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PESSOA_PKEY, Divida.DIVIDA, "divida__divida_pessoa_id_fkey", Divida.DIVIDA.PESSOA_ID);
        public static final ForeignKey<DoacaoRecord, PessoaRecord> DOACAO__DOACAO_PESSOA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PESSOA_PKEY, Doacao.DOACAO, "doacao__doacao_pessoa_id_fkey", Doacao.DOACAO.PESSOA_ID);
        public static final ForeignKey<DoacaoRecord, VendaDiaRecord> DOACAO__DOACAO_VENDA_DIA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.VENDA_DIA_PKEY, Doacao.DOACAO, "doacao__doacao_venda_dia_id_fkey", Doacao.DOACAO.VENDA_DIA_ID);
        public static final ForeignKey<PagamentoRecord, PessoaRecord> PAGAMENTO__PAGAMENTO_PESSOA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PESSOA_PKEY, Pagamento.PAGAMENTO, "pagamento__pagamento_pessoa_id_fkey", Pagamento.PAGAMENTO.PESSOA_ID);
        public static final ForeignKey<PagamentoDividaRecord, PessoaRecord> PAGAMENTO_DIVIDA__PAGAMENTO_DIVIDA_PESSOA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PESSOA_PKEY, PagamentoDivida.PAGAMENTO_DIVIDA, "pagamento_divida__pagamento_divida_pessoa_id_fkey", PagamentoDivida.PAGAMENTO_DIVIDA.PESSOA_ID);
        public static final ForeignKey<ProdutoRecord, CategoriaRecord> PRODUTO__PRODUTO_CATEGORIA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.CATEGORIA_PKEY, Produto.PRODUTO, "produto__produto_categoria_id_fkey", Produto.PRODUTO.CATEGORIA_ID);
        public static final ForeignKey<VendaRecord, VendaDiaRecord> VENDA__VENDA_VENDA_DIA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.VENDA_DIA_PKEY, Venda.VENDA, "venda__venda_venda_dia_id_fkey", Venda.VENDA.VENDA_DIA_ID);
        public static final ForeignKey<VendaRecord, PessoaRecord> VENDA__VENDA_PESSOA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PESSOA_PKEY, Venda.VENDA, "venda__venda_pessoa_id_fkey", Venda.VENDA.PESSOA_ID);
        public static final ForeignKey<VendaProdutoRecord, ProdutoRecord> VENDA_PRODUTO__VENDA_PRODUTO_PRODUTO_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.PRODUTO_PKEY, VendaProduto.VENDA_PRODUTO, "venda_produto__venda_produto_produto_id_fkey", VendaProduto.VENDA_PRODUTO.PRODUTO_ID);
        public static final ForeignKey<VendaProdutoRecord, VendaRecord> VENDA_PRODUTO__VENDA_PRODUTO_VENDA_ID_FKEY = createForeignKey(br.com.rodrigocardoso.database.Keys.VENDA_PKEY, VendaProduto.VENDA_PRODUTO, "venda_produto__venda_produto_venda_id_fkey", VendaProduto.VENDA_PRODUTO.VENDA_ID);
    }
}

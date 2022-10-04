package br.com.gabrielly.aula.dao;

import br.com.gabrielly.aula.bd.OperacaoBD;
import br.com.gabrielly.aula.entidade.Conhecido;
import br.com.gabrielly.aula.enums.Referencia;
import br.com.gabrielly.aula.util.Base;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConhecidoDAO {

    private static final String INSERT_SQL = "Insert into conhecido "
            + "(nome, referencia) "
            + "values ('%s', '%s')";
    private static final String UPDATE_SQL = "Update conhecido "
            + "set nome = '%s', referencia = '%s' "
            + "where id = %d";
    private static final String DELETE_SQL = "Delete from conhecido "
            + "where id = %d";
    private static final String SELECT_TODOS = "Select * from conhecido";
    private static final String SELECT_POR_ID = "Select * from conhecido "
            + "where id = %d;";

    public static void inserir(Conhecido conhecido) {
        String sql = String.format(INSERT_SQL,
                conhecido.getNome(),
                conhecido.getReferencia().getReferencia());
        OperacaoBD.execute(sql, true);

    }

    public static void alterar(Conhecido conhecido) {
        String sql = String.format(UPDATE_SQL,
                conhecido.getNome(),
                conhecido.getReferencia().getReferencia(),
                conhecido.getId());
        OperacaoBD.execute(sql, true);

    }

    public static void apagar(Conhecido conhecido) {
        String sql = String.format(DELETE_SQL, conhecido.getId());
        OperacaoBD.execute(sql, true);
    }

    public static List<Conhecido> selecionarTodos() {
        List<Conhecido> lista = new ArrayList<>();
        Connection con = OperacaoBD.conectar();
        try {
            ResultSet rs = con.createStatement().executeQuery(SELECT_TODOS);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Referencia referencia = Referencia.getReferenciaPorNome(
                        rs.getString("referencia"));
                lista.add(new Conhecido(id, nome, referencia));
            }
            OperacaoBD.desconectar(con);
        } catch (SQLException e) {
            Base.mensagemDeErro("Não foi possível executar \n" + SELECT_TODOS);
        }
        return lista;
    }

    public static Conhecido getConhecidoPorNome(String nome) {
        return null;
    }

    public static Conhecido getConhecidoPorId(int idPesquisa) {
        Conhecido retorno = null;
        Connection con = OperacaoBD.conectar();
        try {
            String sql = String.format(SELECT_POR_ID, idPesquisa);
            ResultSet rs = con.createStatement().executeQuery(sql);
            rs.next();
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            Referencia referencia = Referencia.getReferenciaPorNome(
                    rs.getString("referencia"));
            retorno = new Conhecido(id, nome, referencia);
            OperacaoBD.desconectar(con);
        } catch (SQLException e) {
            Base.mensagemDeErro("Não foi possível executar \n" + SELECT_POR_ID);
        }
        return retorno;
    }
}

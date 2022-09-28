package br.com.vitorguedes.pokedex.dao;

import br.com.vitorguedes.pokedex.bd.PokedexBD;
import br.com.vitorguedes.pokedex.entidade.Lider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LiderDAO {

    private static final String INSERIR_SQL = "Insert into lider "
            + "(lider, tipo, jogo, pagina, numero) "
            + "values ('%s','%s','%s',%d, %d)";
    private static final String ALTERAR_SQL = "Update lider "
            + "set lider = '%s',tipo ='%s', jogo = '%s'  where numero = %d";
    private static final String REMOVER_SQL = "delete from lider "
            + "where numero = %d";
    private static final String SELECIONAR_SQL = "Select * from lider";
    private static final String SELECIONAR_PAGINA_SQL = "Select * "
            + "from lider where pagina =%d";

    public static void inserir(Lider lider) {
        String sql = String.format(INSERIR_SQL,
                lider.getNomeDoLider(),
                lider.getTipoDoTime(),
                lider.getTipoJogo(),
                lider.getPagina(),
                lider.getNumero()
        );
        PokedexBD.execute(sql, true);
    }

    public static void alterar(Lider lider) {
        String sql = String.format(ALTERAR_SQL,
                lider.getNomeDoLider(),
                lider.getTipoDoTime(),
                lider.getTipoJogo(),
                lider.getNumero());
        
        PokedexBD.execute(sql, true);
    }

    public static void remover(Integer numero) {
        String sql = String.format(REMOVER_SQL,
                numero);
        PokedexBD.execute(sql, true);
    }

    private static List<Lider> selecionar(String sql) {
        List<Lider> lista = new ArrayList<>();
        Connection con = PokedexBD.conectar();
        try {
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()) {
                String nomeDoLider = rs.getString("lider");
                String tipoDoTime = rs.getString("tipo");
                String tipoJogo = rs.getString("jogo");
                int pagina = rs.getInt("pagina");
                int numero = rs.getInt("numero");
                lista.add(new Lider(nomeDoLider, tipoDoTime, tipoJogo, pagina, numero));

            }
            PokedexBD.desconectar(con);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.exit(1);
        }
        return lista;
    }

    public static List<Lider> selecionarTodos() {
        return selecionar(SELECIONAR_SQL);
    }

    public static List<Lider> selecionarPorPagina(int pagina) {
        return selecionar(String.format(
                SELECIONAR_PAGINA_SQL, pagina));
    }
}

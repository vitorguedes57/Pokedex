package br.com.vitorguedes.pokedex.dao;

import br.com.vitorguedes.pokedex.bd.PokedexBD;
import br.com.vitorguedes.pokedex.entidade.Pokemon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAO {

    private static final String INSERIR_SQL = "Insert into pokemon "
            + "(pokemon, tipo, jogo, status, pagina) "
            + "values ('%s','%s','%s','%s',%d)";
    private static final String ALTERAR_SQL = "Update pokemon "
            + "set pokemon = '%s' ,tipo ='%s', jogo = '%s', status = '%s' where numero = %d";
    private static final String REMOVER_SQL = "delete from pokemon "
            + "where numero = %d";
    private static final String SELECIONAR_SQL = "Select * from pokemon";
    private static final String SELECIONAR_PAGINA_SQL = "Select * "
            + "from pokemon where pagina =%d";

    public static void inserir(Pokemon pokemon) {
        String sql = String.format(INSERIR_SQL,
                pokemon.getNomeDoPokemon(),
                pokemon.getTipoPokemon(),
                pokemon.getTipoJogo(),
                pokemon.getStatusPokemon(),
                pokemon.getPagina()
        );
        PokedexBD.execute(sql, true);
    }

    /*public static void inserir(int numero) {
        "Insert into pokemon "
            + "(pokemon, tipo, jogo, status, pagina, numero) "
            + "values ('%s','%s','%s','%s',%d,%d)";
        String sql = String.format(INSERIR_SQL,
                Pokemon, 
                numero, (int) Math.ceil(numero / 10) + 1,
                );
        PokedexBD.execute(sql, true);
    }*/

    public static void alterar(Pokemon pokemon) {
        String sql = String.format(ALTERAR_SQL,
                pokemon.getNomeDoPokemon(),
                pokemon.getTipoPokemon(),
                pokemon.getTipoJogo(),
                pokemon.getStatusPokemon(),
                pokemon.getNumero()
        );
        PokedexBD.execute(sql, true);
    }

    public static void remover(int numero) {
        String sql = String.format(REMOVER_SQL,
                numero);
        PokedexBD.execute(sql, true);
    }

    private static List<Pokemon> selecionar(String sql) {
        List<Pokemon> lista = new ArrayList<>();
        Connection con = PokedexBD.conectar();
        try {
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()) {
                String nomeDoPokemon = rs.getString("pokemon");
                int pagina = rs.getInt("pagina");
                String tipoPokemon = rs.getString("tipo");
                String tipoJogo = rs.getString("jogo");
                String status = rs.getString("status");
                int numero = rs.getInt("numero");
                lista.add(new Pokemon(nomeDoPokemon, tipoPokemon, tipoJogo, status, pagina, numero));
            }
            PokedexBD.desconectar(con);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.exit(1);
        }
        return lista;
    }

    public static List<Pokemon> selecionarTodos() {
        int quantidade = selecionar(SELECIONAR_SQL).size();
        System.out.println(quantidade);
       return selecionar(SELECIONAR_SQL);
        
    }

    public static List<Pokemon> selecionarPorPagina(int pagina) {
        return selecionar(String.format(
                SELECIONAR_PAGINA_SQL, pagina));
    }
}

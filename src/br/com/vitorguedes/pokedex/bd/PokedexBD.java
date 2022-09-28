package br.com.vitorguedes.pokedex.bd;

import br.com.vitorguedes.pokedex.dao.PokemonDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PokedexBD {
    
    /*public static void popular() {
        int numero = PokemonDAO.selecionarTodos().size();
        if (numero < 900) {
            for (int i = 1; i <= 900; i++) {
                PokemonDAO.inserir(i);
            }
        }
    } */
    
    
    public static void execute(String sql, boolean continuaNoErro) {
        // Fazer versão para conexões seguidas não desconectar
        Connection con = conectar();
        try {
            con.createStatement().executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            if (!continuaNoErro) {
                System.exit(1);
            }
        }
        desconectar(con);
    }
        public static Connection conectar() {
        Connection con = null;
        final String USUARIO = "root";
        final String SENHA = "zeca3197";
        final String URL = "jdbc:mysql://localhost:3306/pokedex";//Inserir o banco
        try {
            con = DriverManager.getConnection(URL,
                    USUARIO, SENHA);
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            System.exit(1);
        }
        return con;
    }

    public static void desconectar(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
        }
    }

}

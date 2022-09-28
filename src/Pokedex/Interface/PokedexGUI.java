package Pokedex.Interface;

import br.com.vitorguedes.pokedex.bd.PokedexBD;
import br.com.vitorguedes.pokedex.dao.LiderDAO;
import br.com.vitorguedes.pokedex.dao.PokemonDAO;
import br.com.vitorguedes.pokedex.entidade.Lider;
import br.com.vitorguedes.pokedex.entidade.Pokemon;
import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PokedexGUI extends javax.swing.JFrame {

    private final int pagina;

    public PokedexGUI() {
        initComponents();
        pagina = 1;
        atualiza();
    }

    private void atualiza() {
        String[] pokemon = {"pokemon", "tipo", "jogo", "status", "numero"};
        List<Pokemon> pokemons = PokemonDAO.selecionarTodos();
        String[][] dadosPokemon;
        dadosPokemon = new String[pokemons.size()][5];
        int posicao = 0;
        for (Pokemon itemPokemon : pokemons) {
            String[] umPokemon = new String[5];
            umPokemon[0] = String.valueOf(itemPokemon.getNomeDoPokemon());
            umPokemon[1] = itemPokemon.getTipoPokemon();
            umPokemon[2] = itemPokemon.getTipoJogo();
            umPokemon[3] = itemPokemon.getStatusPokemon();
            umPokemon[4] = String.valueOf(itemPokemon.getNumero());
            dadosPokemon[posicao++] = umPokemon;
        }
        DefaultTableModel modelo = new DefaultTableModel(
                dadosPokemon, pokemon);
        jTabelaPokemon.setModel(modelo);
        //Tabela Pokemon
        String[] lider = {"lider", "tipo", "jogo", "numero"};
        List<Lider> lideres = LiderDAO.selecionarPorPagina(pagina);
        String[][] dadosLider;
        dadosLider = new String[lideres.size()][4];
        posicao = 0;
        for (Lider itemLider : lideres) {
            String[] umLider = new String[4];
            umLider[0] = itemLider.getNomeDoLider();
            umLider[1] = itemLider.getTipoDoTime();
            umLider[2] = itemLider.getTipoJogo();
            umLider[3] = String.valueOf(itemLider.getNumero());
            dadosLider[posicao++] = umLider;
        }
        DefaultTableModel modelo2 = new DefaultTableModel(
                dadosLider, lider);
        jTabelaLider.setModel(modelo2);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelPokedex = new javax.swing.JPanel();
        jPokedex = new javax.swing.JTabbedPane();
        jPokemon = new javax.swing.JPanel();
        jTreinador = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabelaPokemon = new javax.swing.JTable();
        jAdicionarPokemon = new javax.swing.JButton();
        jRemoverPokemon = new javax.swing.JButton();
        jModificarPokemon = new javax.swing.JButton();
        jVideoPokemon = new javax.swing.JButton();
        jPokeInfo = new javax.swing.JButton();
        jJogoPokemon = new javax.swing.JButton();
        jBotaoPokedex = new javax.swing.JButton();
        jLider = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaLider = new javax.swing.JTable();
        jAdicionarLider = new javax.swing.JButton();
        jRemoverLider = new javax.swing.JButton();
        jModificarLider = new javax.swing.JButton();
        jLiderVideo = new javax.swing.JButton();
        jLiderInfo = new javax.swing.JButton();
        jJogo = new javax.swing.JButton();
        jBotaoLiderNet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPainelPokedex.setBackground(new java.awt.Color(220, 10, 45));

        jPokemon.setBackground(new java.awt.Color(220, 10, 45));

        jTreinador.setBackground(new java.awt.Color(210, 10, 45));

        jTabelaPokemon.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jTabelaPokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTabelaPokemon);

        jAdicionarPokemon.setBackground(new java.awt.Color(51, 51, 51));
        jAdicionarPokemon.setText("Adicionar");
        jAdicionarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarPokemonActionPerformed(evt);
            }
        });

        jRemoverPokemon.setBackground(new java.awt.Color(51, 51, 51));
        jRemoverPokemon.setText("Remover");
        jRemoverPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverPokemonActionPerformed(evt);
            }
        });

        jModificarPokemon.setBackground(new java.awt.Color(51, 51, 51));
        jModificarPokemon.setText("Modificar");
        jModificarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarPokemonActionPerformed(evt);
            }
        });

        jVideoPokemon.setBackground(new java.awt.Color(51, 51, 51));
        jVideoPokemon.setText("PokeVideo");
        jVideoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVideoPokemonActionPerformed(evt);
            }
        });

        jPokeInfo.setBackground(new java.awt.Color(51, 51, 51));
        jPokeInfo.setText("PokeInfo");
        jPokeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPokeInfoActionPerformed(evt);
            }
        });

        jJogoPokemon.setBackground(new java.awt.Color(51, 51, 51));
        jJogoPokemon.setText("Jogo");
        jJogoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJogoPokemonActionPerformed(evt);
            }
        });

        jBotaoPokedex.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoPokedex.setText("Pokenet");
        jBotaoPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoPokedexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTreinadorLayout = new javax.swing.GroupLayout(jTreinador);
        jTreinador.setLayout(jTreinadorLayout);
        jTreinadorLayout.setHorizontalGroup(
            jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTreinadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVideoPokemon)
                .addGroup(jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTreinadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jModificarPokemon)
                            .addComponent(jJogoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jTreinadorLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPokeInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTreinadorLayout.createSequentialGroup()
                        .addComponent(jAdicionarPokemon)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTreinadorLayout.createSequentialGroup()
                        .addComponent(jRemoverPokemon)
                        .addGap(112, 112, 112))))
            .addGroup(jTreinadorLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTreinadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotaoPokedex)
                .addGap(318, 318, 318))
        );
        jTreinadorLayout.setVerticalGroup(
            jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTreinadorLayout.createSequentialGroup()
                .addGroup(jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTreinadorLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jAdicionarPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRemoverPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTreinadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jModificarPokemon)
                        .addGap(18, 18, 18)
                        .addGroup(jTreinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jVideoPokemon)
                            .addComponent(jPokeInfo))
                        .addGap(18, 18, 18)
                        .addComponent(jJogoPokemon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jBotaoPokedex)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPokemonLayout = new javax.swing.GroupLayout(jPokemon);
        jPokemon.setLayout(jPokemonLayout);
        jPokemonLayout.setHorizontalGroup(
            jPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPokemonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPokemonLayout.setVerticalGroup(
            jPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTreinador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPokedex.addTab("Pokemon", jPokemon);

        jLider.setBackground(new java.awt.Color(220, 10, 45));

        jTabelaLider.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jTabelaLider.setForeground(new java.awt.Color(102, 102, 102));
        jTabelaLider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabelaLider);

        jAdicionarLider.setBackground(new java.awt.Color(51, 51, 51));
        jAdicionarLider.setText("Adicionar");
        jAdicionarLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarLiderActionPerformed(evt);
            }
        });

        jRemoverLider.setBackground(new java.awt.Color(51, 51, 51));
        jRemoverLider.setText("Remover");
        jRemoverLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverLiderActionPerformed(evt);
            }
        });

        jModificarLider.setBackground(new java.awt.Color(51, 51, 51));
        jModificarLider.setText("Modificar");
        jModificarLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarLiderActionPerformed(evt);
            }
        });

        jLiderVideo.setBackground(new java.awt.Color(51, 51, 51));
        jLiderVideo.setText("LiderVideo");
        jLiderVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLiderVideoActionPerformed(evt);
            }
        });

        jLiderInfo.setBackground(new java.awt.Color(51, 51, 51));
        jLiderInfo.setText("LiderInfo");
        jLiderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLiderInfoActionPerformed(evt);
            }
        });

        jJogo.setBackground(new java.awt.Color(51, 51, 51));
        jJogo.setText("Jogo");
        jJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJogoActionPerformed(evt);
            }
        });

        jBotaoLiderNet.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoLiderNet.setText("Lidernet");
        jBotaoLiderNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoLiderNetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLiderLayout = new javax.swing.GroupLayout(jLider);
        jLider.setLayout(jLiderLayout);
        jLiderLayout.setHorizontalGroup(
            jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLiderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLiderVideo)
                .addGroup(jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLiderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jModificarLider)
                            .addComponent(jJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLiderLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLiderInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLiderLayout.createSequentialGroup()
                        .addComponent(jAdicionarLider)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLiderLayout.createSequentialGroup()
                        .addComponent(jRemoverLider)
                        .addGap(112, 112, 112))))
            .addGroup(jLiderLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLiderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotaoLiderNet)
                .addGap(321, 321, 321))
        );
        jLiderLayout.setVerticalGroup(
            jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLiderLayout.createSequentialGroup()
                .addGroup(jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLiderLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jAdicionarLider, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRemoverLider, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLiderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jModificarLider)
                        .addGap(18, 18, 18)
                        .addGroup(jLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLiderVideo)
                            .addComponent(jLiderInfo))
                        .addGap(18, 18, 18)
                        .addComponent(jJogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jBotaoLiderNet)
                .addGap(59, 59, 59))
        );

        jPokedex.addTab("Líder", jLider);

        javax.swing.GroupLayout jPainelPokedexLayout = new javax.swing.GroupLayout(jPainelPokedex);
        jPainelPokedex.setLayout(jPainelPokedexLayout);
        jPainelPokedexLayout.setHorizontalGroup(
            jPainelPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelPokedexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPokedex)
                .addContainerGap())
        );
        jPainelPokedexLayout.setVerticalGroup(
            jPainelPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPokedex)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPokedex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPainelPokedex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Botões da parte dos pokemon
    
    private void jModificarPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarPokemonActionPerformed
        String pokemon = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 0).toString();
        String tipo = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 1).toString();
        String jogo = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 2).toString();
        String status = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 3).toString();
        Integer numero = Integer.valueOf( jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 4).toString());
        String novoPokemon = JOptionPane.showInputDialog("Escreva o novo Pokemon", pokemon );
        String novoTipo = JOptionPane.showInputDialog("Escreva o novo Tipo", tipo );
        String novoJogo = JOptionPane.showInputDialog("Escreva o Jogo", jogo);
        String novoStatus = JOptionPane.showInputDialog("Escreva o Status novo", status);
        
        PokemonDAO.alterar(new Pokemon(novoPokemon, novoTipo, novoJogo, novoStatus, pagina, numero));
        this.atualiza();
        
    }//GEN-LAST:event_jModificarPokemonActionPerformed

    private void jVideoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVideoPokemonActionPerformed

        try{
            String nomePokemon = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 0).toString();
            URI link = new URI("https://www.youtube.com/results?search_query=pokedex+" + nomePokemon.replace(" ", "+") );
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jVideoPokemonActionPerformed

    private void jPokeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPokeInfoActionPerformed
 
        try{
            String nomePokemon = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 0).toString();
            URI link = new URI("https://www.pokemon.com/br/pokedex/" + nomePokemon );
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jPokeInfoActionPerformed

    private void jJogoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJogoPokemonActionPerformed
             try{
            String nomeJogo = jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 2).toString();
            URI link = new URI("https://www.google.com/search?q=jogo+" + nomeJogo.replace(" ", "+") );
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }

    }//GEN-LAST:event_jJogoPokemonActionPerformed

    private void jRemoverPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverPokemonActionPerformed
          int resposta = JOptionPane.showConfirmDialog(this, "Você quer deletar esse `Pokemon?", "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
           Integer numero = Integer.valueOf(jTabelaPokemon.getValueAt(jTabelaPokemon.getSelectedRow(), 4).toString());
            PokemonDAO.remover (numero);
            this.atualiza();
        }
    }//GEN-LAST:event_jRemoverPokemonActionPerformed

    private void jAdicionarPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarPokemonActionPerformed
        String pokemon = JOptionPane.showInputDialog("Digite o novo Pokemon");
        String tipo = JOptionPane.showInputDialog("Digite o novo Tipo");
        String jogo = JOptionPane.showInputDialog("Digite o novo Jogo");
        String status = JOptionPane.showInputDialog("Digite o novo Status");

        PokemonDAO.inserir(new Pokemon(pokemon, tipo, jogo, status, pagina, 1));
        this.atualiza();
    }//GEN-LAST:event_jAdicionarPokemonActionPerformed

//Botões do Líder    
    
    private void jModificarLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarLiderActionPerformed
        String lider = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 0).toString();
        String tipo = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 1).toString();
        String jogo = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 2).toString();
        String novoLider = JOptionPane.showInputDialog("Escreva o novo Lider", lider );
        String novoTipo = JOptionPane.showInputDialog("Escreva o novo Tipo", tipo );
        String novoJogo = JOptionPane.showInputDialog("Escreva o Jogo", jogo);
        
        LiderDAO.alterar(new Lider(novoLider, novoTipo, novoJogo, pagina, 1));
        this.atualiza();
    }//GEN-LAST:event_jModificarLiderActionPerformed

    private void jLiderVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLiderVideoActionPerformed
           try{
             String nomeLider = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 0).toString();
            URI link = new URI("https://www.youtube.com/results?search_query=lider+pokemon+" + nomeLider.replace(" ", "+"));
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
    }//GEN-LAST:event_jLiderVideoActionPerformed
    }
    private void jJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJogoActionPerformed
        try{
             String nomeJogo = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 2).toString();
            URI link = new URI("https://www.google.com/search?q=jogo+" + nomeJogo.replace(" ", "+"));
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jJogoActionPerformed

    private void jLiderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLiderInfoActionPerformed
        try{
             String nomeLider = jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 0).toString();
            URI link = new URI("https://www.google.com/search?q=lider+" + nomeLider.replace(" ", "+"));
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jLiderInfoActionPerformed

    private void jRemoverLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverLiderActionPerformed
            int resposta = JOptionPane.showConfirmDialog(this, "Você quer deletar esse Lider ?", "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
           Integer numero = Integer.valueOf(jTabelaLider.getValueAt(jTabelaLider.getSelectedRow(), 3).toString());
          LiderDAO.remover (numero);
            this.atualiza();
    }//GEN-LAST:event_jRemoverLiderActionPerformed
    }
    private void jAdicionarLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarLiderActionPerformed
        String lider = JOptionPane.showInputDialog("Digite o novo Lider");
        String tipo = JOptionPane.showInputDialog("Digite o novo Tipo");
        String jogo = JOptionPane.showInputDialog("Digite o novo Jogo");

       LiderDAO.inserir(new Lider(lider, tipo, jogo, pagina, 1));
        this.atualiza();
    }//GEN-LAST:event_jAdicionarLiderActionPerformed
//Botao para acessar url
    
    private void jBotaoPokedexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoPokedexActionPerformed

        try{
            URI link = new URI("https://www.pokemon.com/br/pokedex/");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jBotaoPokedexActionPerformed

    private void jBotaoLiderNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoLiderNetActionPerformed
        try{
            URI link = new URI("https://www.pokemythology.net/personagens/lideres/");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jBotaoLiderNetActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokedexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokedexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokedexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokedexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokedexGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionarLider;
    private javax.swing.JButton jAdicionarPokemon;
    private javax.swing.JButton jBotaoLiderNet;
    private javax.swing.JButton jBotaoPokedex;
    private javax.swing.JButton jJogo;
    private javax.swing.JButton jJogoPokemon;
    private javax.swing.JPanel jLider;
    private javax.swing.JButton jLiderInfo;
    private javax.swing.JButton jLiderVideo;
    private javax.swing.JButton jModificarLider;
    private javax.swing.JButton jModificarPokemon;
    private javax.swing.JPanel jPainelPokedex;
    private javax.swing.JButton jPokeInfo;
    private javax.swing.JTabbedPane jPokedex;
    private javax.swing.JPanel jPokemon;
    private javax.swing.JButton jRemoverLider;
    private javax.swing.JButton jRemoverPokemon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabelaLider;
    private javax.swing.JTable jTabelaPokemon;
    private javax.swing.JPanel jTreinador;
    private javax.swing.JButton jVideoPokemon;
    // End of variables declaration//GEN-END:variables
}

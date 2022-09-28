package br.com.vitorguedes.pokedex.entidade;

public class Pokemon {

    private final String nomeDoPokemon;
    private final int numero;
    private String tipoPokemon;
    private String tipoJogo;
    private String statusPokemon;
    private final int pagina;

    public Pokemon(String nomeDoPokemon, String tipoPokemon, String tipoJogo, String statusPokemon, int pagina, int numero) {
        this.nomeDoPokemon = nomeDoPokemon;
        this.tipoPokemon = tipoPokemon;
        this.tipoJogo = tipoJogo;
        this.statusPokemon = statusPokemon;
        this.pagina = pagina;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getPagina() {
        return pagina;
    }

    public String getNomeDoPokemon() {
        return nomeDoPokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public String getStatusPokemon() {
        return statusPokemon;
    }

    public void setStatusPokemon(String statusPokemon) {
        this.statusPokemon = statusPokemon;
    }

}

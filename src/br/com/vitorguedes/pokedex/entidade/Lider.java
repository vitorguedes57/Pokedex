package br.com.vitorguedes.pokedex.entidade;

public class Lider {

    private final String nomeDoLider;
    private final int numero;
    private String tipoDoTime;
    private String tipoJogo;
    private final int pagina;

    public Lider(String nomeDoLider, String tipoDoTime, String tipoJogo, int pagina, int numero) {
        this.nomeDoLider = nomeDoLider;
        this.tipoDoTime = tipoDoTime;
        this.tipoJogo = tipoJogo;
        this.pagina = pagina;
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    public int getPagina() {
        return pagina;
    }

    public String getNomeDoLider() {
        return nomeDoLider;
    }

    public String getTipoDoTime() {
        return tipoDoTime;
    }

    public void setTipoDoTime(String tipoDoTime) {
        this.tipoDoTime = tipoDoTime;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

}

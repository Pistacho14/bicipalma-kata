package edu.teamrocket.domain.tarjetausuario;

public class TarjetaUsuario {
    
    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    @Override
    public String toString() {
        return "TarjetaUsuario [id=" + id + ", activada=" + activada + "]";
    }    
}

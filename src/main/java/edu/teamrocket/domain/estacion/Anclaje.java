package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.bicicleta.Movil;

public class Anclaje {

    private boolean ocupado = false;
    private Movil bici = null;

    protected Anclaje() {
    }

    protected boolean isOcupado() {
        return this.ocupado;
    }

    protected Movil getBici() {
        return this.bici;
    }

    protected void anclarBici(Movil bici) {
        this.ocupado = true;
        this.bici = bici;
    }

    protected void librarBici() {
        this.bici = null;
    }

    @Override
    public String toString() {
        return "Anclaje [ocupado=" + ocupado + ", bici=" + bici + "]";
    }

}

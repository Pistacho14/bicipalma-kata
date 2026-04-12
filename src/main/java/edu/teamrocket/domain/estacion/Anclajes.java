package edu.teamrocket.domain.estacion;

public class Anclajes {

    private Anclaje[] anclajes;

    protected Anclajes(int capacidad) {
        this.anclajes = new Anclaje[capacidad];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            anclajes[i] = new Anclaje();
        }
    }

    protected Anclaje[] anclajes() {
        return this.anclajes;
    }

    protected int numAnclajes() {
        return 1;
    }

    /* protected void ocuparAnclaje(int numeroAnclaje, Movil movil){} */

    protected boolean isAnclajeOcupado(int posicion) {
        return true;
    }

    protected void liberarAnclaje(int posicion) {
    }

    /* protected Movil getBiciAt(int posicion){} */

    /* protected int seleccionarAnclaje(){} */

    @Override
    public String toString() {
        return "Anclajes []";
    }
}

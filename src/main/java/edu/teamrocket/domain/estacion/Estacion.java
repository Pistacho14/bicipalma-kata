package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.bicicleta.Bicicleta;

public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(anclajes);
    }

    private Integer getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    public void consultarEstacion() {
        System.out.print("Estacion [id=" + Integer.toString(this.id) + ", direccion= " + this.direccion + " ]" + "\n");
    }

    public void consultarAnclajes() {
    }

    public int anclajesLibres() {

        int counter = 0;
        for (Anclaje anclaje : this.anclajes.anclajes()) {
            if (!anclaje.isOcupado()) {
                counter += 1;
            }
        }
        return counter;
    }

    public void anclarBicicleta(Bicicleta bicicleta) {
        
        for (Anclaje anclaje : this.anclajes.anclajes()) {
            if (!anclaje.isOcupado()) {
                anclaje.anclarBici(bicicleta);
            }
        }
    }

    @Override
    public String toString() {
        return "Estacion [id=" + id + ", direccion=" + direccion + "]";
    }
}

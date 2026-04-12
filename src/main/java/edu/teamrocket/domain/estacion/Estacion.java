package edu.teamrocket.domain.estacion;

public class Estacion {

    private final Integer id;
    private final String direccion;
    private final Integer anclajes;

    public Estacion(Integer id, String direccion, Integer anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = anclajes;
    }

    private Integer getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Estacion [id=" + id + ", direccion=" + direccion + "]";
    }
}

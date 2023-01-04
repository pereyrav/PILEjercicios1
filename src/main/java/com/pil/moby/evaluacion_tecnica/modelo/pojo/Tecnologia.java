package main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.Objects;

public class Tecnologia {

    private Long id;

    private String nombre;

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnologia that = (Tecnologia) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Tecnologia:{" +
                "nombre=" + nombre + '\'' +
                "id=" + id +
                '}';
    }
//    public boolean esIdPar() {
//        String obtenerId
//    }
}
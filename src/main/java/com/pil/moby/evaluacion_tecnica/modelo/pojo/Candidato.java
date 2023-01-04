package main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.*;

public class Candidato implements Comparable<Candidato> {

    private Long id;

    private String nombre;

    private String apellido;

    private double pretensionSalarial;
    private static Integer aniosExperiencia;


    private static String tecnologias;

    public Candidato(Long id, String nombre, String apellido, Double pretensionSalarial, Integer aniosExperiencia, String tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pretensionSalarial = pretensionSalarial;
        this.aniosExperiencia = aniosExperiencia;
        this.tecnologias = tecnologias;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public static String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id) && Objects.equals(nombre, candidato.nombre) && Objects.equals(apellido, candidato.apellido) && Objects.equals(aniosExperiencia, candidato.aniosExperiencia) && Objects.equals(pretensionSalarial, candidato.pretensionSalarial) && Objects.equals(tecnologias, candidato.tecnologias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, aniosExperiencia, pretensionSalarial, tecnologias);
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", pretensionSalarial=" + pretensionSalarial +
                ", tecnologias=" + tecnologias +
                '}';
    }

    @Override
    public int compareTo(Candidato o) {
        return this.id.compareTo(o.id);
    }

    public static void Tecnologias() {
        List<Tecnologia> listaTecnologias = new ArrayList<>();
        Tecnologia tecnologia = new Tecnologia(1L, "Java");
        Tecnologia tecnologia1 = new Tecnologia(2L, "Angular");
        Tecnologia tecnologia2 = new Tecnologia(3L, "SQL");
        Tecnologia tecnologia3 = new Tecnologia(4L, "NoSQL");
        Tecnologia tecnologia4 = new Tecnologia(5L, "Vue");
        Tecnologia tecnologia5 = new Tecnologia(6L, ".NET");
        Tecnologia tecnologia6 = new Tecnologia(7L, "MongoDB");
        Tecnologia tecnologia7 = new Tecnologia(8L, "NodeJS");
        listaTecnologias.add(tecnologia);
        listaTecnologias.add(tecnologia1);
        listaTecnologias.add(tecnologia2);
        listaTecnologias.add(tecnologia3);
        listaTecnologias.add(tecnologia4);
        listaTecnologias.add(tecnologia5);
        listaTecnologias.add(tecnologia6);
        listaTecnologias.add(tecnologia7);
    }
    public static String ordenarTecnologias() {
        String tecnologiasOrdenadas = Candidato.getTecnologias();
        tecnologiasOrdenadas.toString().compareToIgnoreCase(tecnologias);
        return tecnologiasOrdenadas;
    }
}

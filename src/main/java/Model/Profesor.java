package Model;

import java.util.ArrayList;

public abstract class Profesor {

    protected String id;
    protected String nombre;
    protected String titulo;
    protected int aniosExperencia;
    protected ArrayList<Materia> listaMaterias;

    public Profesor(String id, String nombre, String titulo, int aniosExperencia) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.aniosExperencia = aniosExperencia;
        this.listaMaterias = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExperencia() {
        return aniosExperencia;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}

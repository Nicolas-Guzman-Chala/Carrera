package Model;

import java.util.ArrayList;

public abstract class Estudiante {

    protected String id;
    protected String nombre;
    protected String documento;
    protected int semestre;
    protected ArrayList<Materia> listaMaterias;

    public Estudiante(String id, String nombre, String documento, int semestre, ArrayList<Materia> listaMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.semestre = semestre;
        this.listaMaterias = listaMaterias;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}

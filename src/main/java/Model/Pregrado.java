package Model;

import java.util.ArrayList;

public class Pregrado extends Estudiante{

    protected boolean beca;
    protected double promedioAcumulado;

    public Pregrado(String id, String nombre, String documento, int semestre, ArrayList<Materia> listaMaterias, boolean beca, double promedioAcumulado) {
        super(id, nombre, documento, semestre, listaMaterias);
        this.beca = beca;
        this.promedioAcumulado = promedioAcumulado;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
}

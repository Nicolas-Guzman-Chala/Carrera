package Model;

public class Practica extends Materia{
    protected int horasPractica;
    protected int laboratorios;

    public Practica(String codigo, String nombre, int horaSemana, int creditos, byte semestres, Profesor profesor, int horasPractica, int laboratorios) {
        super(codigo, nombre, horaSemana, creditos, semestres, profesor);
        this.horasPractica = horasPractica;
        this.laboratorios = laboratorios;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(int laboratorios) {
        this.laboratorios = laboratorios;
    }
}

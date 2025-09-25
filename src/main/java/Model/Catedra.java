package Model;

public class Catedra extends Profesor{

    protected int hContrato;
    protected boolean trabajoExtra;

    public Catedra(String id, String nombre, String titulo, int aniosExperencia, int hContrato, boolean trabajoExtra) {
        super(id, nombre, titulo, aniosExperencia);
        this.hContrato = hContrato;
        this.trabajoExtra = trabajoExtra;
    }

    public int gethContrato() {
        return hContrato;
    }

    public void sethContrato(int hContrato) {
        this.hContrato = hContrato;
    }

    public boolean isTrabajoExtra() {
        return trabajoExtra;
    }

    public void setTrabajoExtra(boolean trabajoExtra) {
        this.trabajoExtra = trabajoExtra;
    }
}

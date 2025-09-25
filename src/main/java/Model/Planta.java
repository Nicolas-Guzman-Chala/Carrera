package Model;

public class Planta extends Profesor{
    protected TipoContrato tipoContrato;
    protected boolean participaProyecto;

    public Planta(String id, String nombre, String titulo, int aniosExperencia, boolean participaProyecto, TipoContrato tipoContrato) {
        super(id, nombre, titulo, aniosExperencia);
        this.participaProyecto = participaProyecto;
        this.tipoContrato = tipoContrato;
    }

    public boolean isParticipaProyecto() {
        return participaProyecto;
    }

    public void setParticipaProyecto(boolean participaProyecto) {
        this.participaProyecto = participaProyecto;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}

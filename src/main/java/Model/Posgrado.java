package Model;

public class Posgrado {
    protected String temaInvestigacion;
    protected TipoCurso tipoCurso;

    public Posgrado(String temaInvestigacion, TipoCurso tipoCurso) {
        this.temaInvestigacion = temaInvestigacion;
        this.tipoCurso = tipoCurso;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}

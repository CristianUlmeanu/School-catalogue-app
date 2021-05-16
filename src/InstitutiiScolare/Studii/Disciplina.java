package InstitutiiScolare.Studii;

import java.util.Vector;

public class Disciplina extends Domeniu {

    private String NumeMaterie;
    private Integer NrCrediteMax;
    private Vector<Float> nota;

    public Disciplina(String nume_domeniu, int ani_studii, String NumeMaterie, Integer NrCrediteMax, Vector<Float> nota) {
        super(nume_domeniu, ani_studii);
        this.NumeMaterie = NumeMaterie;
        this.NrCrediteMax = NrCrediteMax;
        this.nota = nota;
    }

    public Disciplina() {
        super();
    }

    public String getNumeMaterie() {
        return NumeMaterie;
    }

    public void setNumeMaterie(String NumeMaterie) {
        this.NumeMaterie = NumeMaterie;
    }

    public Integer getNrCrediteMax() {
        return NrCrediteMax;
    }

    public void setNrCrediteMax(Integer NrCrediteMax) {
        this.NrCrediteMax = NrCrediteMax;
    }

    public Vector<Float> getNota() {
        return nota;
    }

    public void setNota(Vector<Float> nota) {
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Domeniul "+NumeDomeniu+" , materia "+NumeMaterie+"\nNumarul de credite posibile: "+NrCrediteMax+"\nNote:"+nota;
    }

}

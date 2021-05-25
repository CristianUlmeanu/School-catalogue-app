package InstitutiiScolare.Studii;

import java.util.Vector;

public class Disciplina extends Domeniu {

    private String numeMaterie;
    private Integer nrCrediteMax;
    private Vector<Float> nota;

    public Disciplina(String nume_domeniu, int ani_studii, String NumeMaterie, Integer NrCrediteMax, Vector<Float> nota) {
        super(nume_domeniu, ani_studii);
        this.numeMaterie = NumeMaterie;
        this.nrCrediteMax = NrCrediteMax;
        this.nota = nota;
    }

    public Disciplina() {
        super();
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void setNumeMaterie(String NumeMaterie) {
        this.numeMaterie = NumeMaterie;
    }

    public Integer getNrCrediteMax() {
        return nrCrediteMax;
    }

    public void setNrCrediteMax(Integer NrCrediteMax) {
        this.nrCrediteMax = NrCrediteMax;
    }

    public Vector<Float> getNota() {
        return nota;
    }

    public void setNota(Vector<Float> nota) {
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Domeniul "+ numeDomeniu +" , materia "+ numeMaterie +"\nNumarul de credite posibile: "+ nrCrediteMax +"\nNote:"+nota;
    }

}

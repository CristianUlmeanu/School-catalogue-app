package Clasa_disciplina;

import Clasa_domeniu.Domeniu;

import java.util.Vector;

public class Disciplina extends Domeniu {

    private String nume_materie;
    private Integer nr_credite_max;
    private Vector<Float> nota;

    public Disciplina(String nume_domeniu, int ani_studii, String nume_materie, Integer nr_credite_max, Vector<Float> nota) {
        super(nume_domeniu, ani_studii);
        this.nume_materie = nume_materie;
        this.nr_credite_max = nr_credite_max;
        this.nota = nota;
    }

    public String getNume_materie() {
        return nume_materie;
    }

    public void setNume_materie(String nume_materie) {
        this.nume_materie = nume_materie;
    }

    public Integer getNr_credite_max() {
        return nr_credite_max;
    }

    public void setNr_credite_max(Integer nr_credite_max) {
        this.nr_credite_max = nr_credite_max;
    }

    public Vector<Float> getNota() {
        return nota;
    }

    public void setNota(Vector<Float> nota) {
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Domeniul "+nume_domeniu+" , materia "+nume_materie+"\nNumarul de credite posibile: "+nr_credite_max+"\nNote:"+nota;
    }

}

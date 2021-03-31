package Clasa_student;

import Clasa_disciplina.Disciplina;
import Clasa_persoana.Persoana;

import java.util.Vector;

public class Student extends Persoana {

    private String nr_matricol;
    private int an;
    private Vector<Disciplina> lista_discipline;

    public Student(String cnp, String nume, String prenume, int varsta, String nr_matricol, int an, Vector<Disciplina> lista_discipline) {
        super(cnp, nume, prenume, varsta);
        this.nr_matricol = nr_matricol;
        this.an = an;
        this.lista_discipline = lista_discipline;
    }

    public String getNr_matricol() {
        return nr_matricol;
    }

    public void setNr_matricol(String nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public Vector<Disciplina> getLista_discipline() {
        return lista_discipline;
    }

    public void setLista_discipline(Vector<Disciplina> lista_discipline) {
        this.lista_discipline = lista_discipline;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta+"\n Numarul de inmatriculare: "+nr_matricol+"\n An: "+an+"\n Disciplinele la care a participat: "+lista_discipline;
    }
}

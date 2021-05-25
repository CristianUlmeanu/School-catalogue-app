package Persoane;

import InstitutiiScolare.Studii.Disciplina;

import java.util.Vector;

public class Student extends Persoana {

    private String nrMatricol;
    private int an;
    private Vector<Disciplina> listaDiscipline;

    public Student(String cnp, String nume, String prenume, int varsta, String NrMatricol, int an, Vector<Disciplina> ListaDiscipline) {
        super(cnp, nume, prenume, varsta);
        this.nrMatricol = NrMatricol;
        this.an = an;
        this.listaDiscipline = ListaDiscipline;
    }

    public String getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(String NrMatricol) {
        this.nrMatricol = NrMatricol;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public Vector<Disciplina> getListaDiscipline() {
        return listaDiscipline;
    }

    public void setListaDiscipline(Vector<Disciplina> ListaDiscipline) {
        this.listaDiscipline = ListaDiscipline;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta+"\n Numarul de inmatriculare: "+ nrMatricol +"\n An: "+an+"\n Disciplinele la care a participat: "+ listaDiscipline;
    }
}

package Persoane;

import InstitutiiScolare.Studii.Disciplina;

import java.util.Vector;

public class Student extends Persoana {

    private String NrMatricol;
    private int an;
    private Vector<Disciplina> ListaDiscipline;

    public Student(String cnp, String nume, String prenume, int varsta, String NrMatricol, int an, Vector<Disciplina> ListaDiscipline) {
        super(cnp, nume, prenume, varsta);
        this.NrMatricol = NrMatricol;
        this.an = an;
        this.ListaDiscipline = ListaDiscipline;
    }

    public String getNrMatricol() {
        return NrMatricol;
    }

    public void setNrMatricol(String NrMatricol) {
        this.NrMatricol = NrMatricol;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public Vector<Disciplina> getListaDiscipline() {
        return ListaDiscipline;
    }

    public void setListaDiscipline(Vector<Disciplina> ListaDiscipline) {
        this.ListaDiscipline = ListaDiscipline;
    }

    @Override
    public String toString(){
        return "CNP: "+cnp+"\n Nume: "+nume+" "+prenume+"   Varsta: "+varsta+"\n Numarul de inmatriculare: "+NrMatricol+"\n An: "+an+"\n Disciplinele la care a participat: "+ListaDiscipline;
    }
}

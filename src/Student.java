import java.util.Vector;

public class Student extends Persoana{

    private String nr_matricol;
    private Integer an;
    private Vector<Disciplina> lista_discipline;

    public Student(String cnp, String nume, String prenume, Integer varsta, String nr_matricol, Integer an, Vector<Disciplina> lista_discipline) {
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

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Vector<Disciplina> getLista_discipline() {
        return lista_discipline;
    }

    public void setLista_discipline(Vector<Disciplina> lista_discipline) {
        this.lista_discipline = lista_discipline;
    }
}

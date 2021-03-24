public class Disciplina {

    private String nume_materie;
    private Integer nr_credite_max;
    private Float nota;

    public Disciplina(String nume_materie, Integer nr_credite_max, Float nota) {
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

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
}

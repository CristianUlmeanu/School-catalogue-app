import java.util.List;
import java.util.Vector;

public class Sala {
    private String nume_sala;
    private Vector<Profesor> lista_profesori;
    private Integer nr_loc;
    private List<String> materiale;

    public Sala(String nume_sala, Vector<Profesor> lista_profesori, Integer nr_loc, List<String> materiale) {
        this.nume_sala = nume_sala;
        this.lista_profesori = lista_profesori;
        this.nr_loc = nr_loc;
        this.materiale = materiale;
    }

    public String getNume_sala() {
        return nume_sala;
    }

    public void setNume_sala(String nume_sala) {
        this.nume_sala = nume_sala;
    }

    public Vector<Profesor> getLista_profesori() {
        return lista_profesori;
    }

    public void setLista_profesori(Vector<Profesor> lista_profesori) {
        this.lista_profesori = lista_profesori;
    }

    public Integer getNr_loc() {
        return nr_loc;
    }

    public void setNr_loc(Integer nr_loc) {
        this.nr_loc = nr_loc;
    }

    public List<String> getMateriale() {
        return materiale;
    }

    public void setMateriale(List<String> materiale) {
        this.materiale = materiale;
    }
}

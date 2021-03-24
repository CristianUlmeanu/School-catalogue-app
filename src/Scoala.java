import java.util.List;
import java.util.Vector;

public class Scoala extends Locatie{
    private Integer nr_locuri;
    private Vector<String> domenii;
    private String tip_admitere;
    private List<Persoana> lista_persoane;
    private List<Sala> lista_sali;

    public Scoala(String tara, String judet, String localitate, String strada, String numar, Integer nr_locuri, Vector<String> domenii, String tip_admitere, List<Persoana> lista_persoane, List<Sala> lista_sali) {
        super(tara, judet, localitate, strada, numar);
        this.nr_locuri = nr_locuri;
        this.domenii = domenii;
        this.tip_admitere = tip_admitere;
        this.lista_persoane = lista_persoane;
        this.lista_sali = lista_sali;
    }

    public Integer getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(Integer nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    public Vector<String> getDomenii() {
        return domenii;
    }

    public void setDomenii(Vector<String> domenii) {
        this.domenii = domenii;
    }

    public String getTip_admitere() {
        return tip_admitere;
    }

    public void setTip_admitere(String tip_admitere) {
        this.tip_admitere = tip_admitere;
    }

    public List<Persoana> getLista_persoane() {
        return lista_persoane;
    }

    public void setLista_persoane(List<Persoana> lista_persoane) {
        this.lista_persoane = lista_persoane;
    }

    public List<Sala> getLista_sali() {
        return lista_sali;
    }

    public void setLista_sali(List<Sala> lista_sali) {
        this.lista_sali = lista_sali;
    }
}

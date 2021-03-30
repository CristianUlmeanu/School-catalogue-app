package Clasa_scoala;

import Clasa_domeniu.Domeniu;
import Clasa_locatie.Locatie;
import Clasa_persoana.Persoana;
import Clasa_sala.Sala;

import java.util.Vector;

public class Scoala extends Locatie {
    private String nume_scoala;
    private Integer nr_locuri;
    private Vector<Domeniu> lista_domenii;
    private String tip_admitere;
    private Vector<Persoana> lista_persoane;
    private Vector<Sala> lista_sali;

    public Scoala(String tara, String judet, String localitate, String strada, String numar, String nume_scoala, Integer nr_locuri, Vector<Domeniu> lista_domenii, String tip_admitere, Vector<Persoana> lista_persoane, Vector<Sala> lista_sali) {
        super(tara, judet, localitate, strada, numar);
        this.nume_scoala = nume_scoala;
        this.nr_locuri = nr_locuri;
        this.lista_domenii = lista_domenii;
        this.tip_admitere = tip_admitere;
        this.lista_persoane = lista_persoane;
        this.lista_sali = lista_sali;
    }

    public String getNume_scoala() {
        return nume_scoala;
    }

    public void setNume_scoala(String nume_scoala) {
        this.nume_scoala = nume_scoala;
    }

    public Integer getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(Integer nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    public Vector<Domeniu> getLista_domenii() {
        return lista_domenii;
    }

    public void setLista_domenii(Vector<Domeniu> lista_domenii) {
        this.lista_domenii = lista_domenii;
    }

    public String getTip_admitere() {
        return tip_admitere;
    }

    public void setTip_admitere(String tip_admitere) {
        this.tip_admitere = tip_admitere;
    }

    public Vector<Persoana> getLista_persoane() {
        return lista_persoane;
    }

    public void setLista_persoane(Vector<Persoana> lista_persoane) {
        this.lista_persoane = lista_persoane;
    }

    public Vector<Sala> getLista_sali() {
        return lista_sali;
    }

    public void setLista_sali(Vector<Sala> lista_sali) {
        this.lista_sali = lista_sali;
    }

    @Override
    public String toString(){
        return "Scoala se afla in urmaotarea locatie: "+super.toString()+"\n Numele scolii este: "+nume_scoala+", are "+nr_locuri+" disponibile."+" Metoda de examinare este: "+tip_admitere+".\nScoala dispune de urmatoarele sali: "+lista_sali+".\nPersoanele din cadrul scolii sunt: "+lista_persoane;
    }
    
}

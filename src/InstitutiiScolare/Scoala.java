package InstitutiiScolare;

import InstitutiiScolare.Studii.Domeniu;
import Persoane.Persoana;

import java.util.HashMap;
import java.util.Vector;

public class Scoala extends Locatie {
    protected String NumeScoala;
    private int NrLocuri;
    private Vector<Domeniu> ListaDomenii;
    protected String TipAdmitere;
    private HashMap<String,Persoana> ListaPersoane;
    private Vector<Sala> ListaSali;

    public Scoala(String tara, String judet, String localitate, String strada, String numar, String NumeScoala, int NrLocuri, Vector<Domeniu> ListaDomenii, String TipAdmitere, HashMap<String,Persoana> ListaPersoane, Vector<Sala> ListaSali) {
        super(tara, judet, localitate, strada, numar);
        this.NumeScoala = NumeScoala;
        this.NrLocuri = NrLocuri;
        this.ListaDomenii = ListaDomenii;
        this.TipAdmitere = TipAdmitere;
        this.ListaPersoane = ListaPersoane;
        this.ListaSali = ListaSali;
    }

    public String getNumeScoala() {
        return NumeScoala;
    }

    public void setNumeScoala(String NumeScoala) {
        this.NumeScoala = NumeScoala;
    }

    public int getNrLocuri() {
        return NrLocuri;
    }

    public void setNrLocuri(int NrLocuri) {
        this.NrLocuri = NrLocuri;
    }

    public Vector<Domeniu> getListaDomenii() {
        return ListaDomenii;
    }

    public void setListaDomenii(Vector<Domeniu> ListaDomenii) {
        this.ListaDomenii = ListaDomenii;
    }

    public String getTipAdmitere() {
        return TipAdmitere;
    }

    public void setTipAdmitere(String TipAdmitere) {
        this.TipAdmitere = TipAdmitere;
    }

    public HashMap<String,Persoana> getListaPersoane() {
        return ListaPersoane;
    }

    public void setListaPersoane(HashMap<String,Persoana> ListaPersoane) {
        this.ListaPersoane = ListaPersoane;
    }

    public Vector<Sala> getListaSali() {
        return ListaSali;
    }

    public void setListaSali(Vector<Sala> ListaSali) {
        this.ListaSali = ListaSali;
    }

    @Override
    public String toString(){
        return "Scoala se afla in urmaotarea locatie: "+super.toString()+"\n Numele scolii este: "+NumeScoala+", are "+NrLocuri+" disponibile."+" Metoda de examinare este: "+TipAdmitere+".\nScoala dispune de urmatoarele sali: "+ListaSali+".\nPersoanele din cadrul scolii sunt: "+ListaPersoane;
    }
    
}

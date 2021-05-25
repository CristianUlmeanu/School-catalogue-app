package InstitutiiScolare;

import InstitutiiScolare.Studii.Domeniu;
import Persoane.Persoana;

import java.util.HashMap;
import java.util.Vector;

public class Scoala extends Locatie {
    private String numeScoala;
    private int nrLocuri;
    private Vector<Domeniu> listaDomenii;
    private String tipAdmitere;
    private HashMap<String,Persoana> listaPersoane;
    private Vector<Sala> listaSali;

    public Scoala(String tara, String judet, String localitate, String strada, String numar, String NumeScoala, int NrLocuri, Vector<Domeniu> ListaDomenii, String TipAdmitere, HashMap<String,Persoana> ListaPersoane, Vector<Sala> ListaSali) {
        super(tara, judet, localitate, strada, numar);
        this.numeScoala = NumeScoala;
        this.nrLocuri = NrLocuri;
        this.listaDomenii = ListaDomenii;
        this.tipAdmitere = TipAdmitere;
        this.listaPersoane = ListaPersoane;
        this.listaSali = ListaSali;
    }

    public String getNumeScoala() {
        return numeScoala;
    }

    public void setNumeScoala(String NumeScoala) {
        this.numeScoala = NumeScoala;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int NrLocuri) {
        this.nrLocuri = NrLocuri;
    }

    public Vector<Domeniu> getListaDomenii() {
        return listaDomenii;
    }

    public void setListaDomenii(Vector<Domeniu> ListaDomenii) {
        this.listaDomenii = ListaDomenii;
    }

    public String getTipAdmitere() {
        return tipAdmitere;
    }

    public void setTipAdmitere(String TipAdmitere) {
        this.tipAdmitere = TipAdmitere;
    }

    public HashMap<String,Persoana> getListaPersoane() {
        return listaPersoane;
    }

    public void setListaPersoane(HashMap<String,Persoana> ListaPersoane) {
        this.listaPersoane = ListaPersoane;
    }

    public Vector<Sala> getListaSali() {
        return listaSali;
    }

    public void setListaSali(Vector<Sala> ListaSali) {
        this.listaSali = ListaSali;
    }

    @Override
    public String toString(){
        return "Scoala se afla in urmaotarea locatie: "+super.toString()+"\n Numele scolii este: "+ numeScoala +", are "+ nrLocuri +" disponibile."+" Metoda de examinare este: "+ tipAdmitere +".\nScoala dispune de urmatoarele sali: "+ listaSali +".\nPersoanele din cadrul scolii sunt: "+ listaPersoane;
    }
    
}

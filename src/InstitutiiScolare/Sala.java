package InstitutiiScolare;

import Persoane.Profesor;

import java.util.List;
import java.util.Vector;

public class Sala {
    private String nume_sala;
    private Vector<Profesor> lista_profesori;
    private Vector<String> materiale;

    public Sala(String nume_sala, Vector<Profesor> lista_profesori, Vector<String> materiale) {
        this.nume_sala = nume_sala;
        this.lista_profesori = lista_profesori;
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

    public List<String> getMateriale() {
        return materiale;
    }

    public void setMateriale(Vector<String> materiale) {
        this.materiale = materiale;
    }

    @Override
    public String toString(){
        return "Sala: "+nume_sala+"\n Profesori ce predau in aceasta sala: "+lista_profesori+"\n Materiale de care dispune sala: "+materiale;
    }
}

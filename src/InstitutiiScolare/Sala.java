package InstitutiiScolare;

import Persoane.Profesor;

import java.util.List;
import java.util.Vector;

public class Sala {
    private String NumeSala;
    private Vector<Profesor> ListaProfesori;
    private Vector<String> materiale;

    public Sala(String NumeSala, Vector<Profesor> ListaProfesori, Vector<String> materiale) {
        this.NumeSala = NumeSala;
        this.ListaProfesori = ListaProfesori;
        this.materiale = materiale;
    }

    public String getNumeSala() {
        return NumeSala;
    }

    public void setNumeSala(String NumeSala) {
        this.NumeSala = NumeSala;
    }

    public Vector<Profesor> getListaProfesori() {
        return ListaProfesori;
    }

    public void setListaProfesori(Vector<Profesor> ListaProfesori) {
        this.ListaProfesori = ListaProfesori;
    }

    public List<String> getMateriale() {
        return materiale;
    }

    public void setMateriale(Vector<String> materiale) {
        this.materiale = materiale;
    }

    @Override
    public String toString(){
        return "Sala: "+NumeSala+"\n Profesori ce predau in aceasta sala: "+ListaProfesori+"\n Materiale de care dispune sala: "+materiale;
    }
}

package InstitutiiScolare;

import Persoane.Profesor;

import java.util.List;
import java.util.Vector;

public class Sala {
    private String numeSala;
    private Vector<Profesor> listaProfesori;
    private Vector<String> materiale;

    public Sala(String NumeSala, Vector<Profesor> ListaProfesori, Vector<String> materiale) {
        this.numeSala = NumeSala;
        this.listaProfesori = ListaProfesori;
        this.materiale = materiale;
    }

    public String getNumeSala() {
        return numeSala;
    }

    public void setNumeSala(String NumeSala) {
        this.numeSala = NumeSala;
    }

    public Vector<Profesor> getListaProfesori() {
        return listaProfesori;
    }

    public void setListaProfesori(Vector<Profesor> ListaProfesori) {
        this.listaProfesori = ListaProfesori;
    }

    public List<String> getMateriale() {
        return materiale;
    }

    public void setMateriale(Vector<String> materiale) {
        this.materiale = materiale;
    }

    @Override
    public String toString(){
        return "Sala: "+ numeSala +"\n Profesori ce predau in aceasta sala: "+ listaProfesori +"\n Materiale de care dispune sala: "+materiale;
    }
}

package Services;

import InstitutiiScolare.Studii.Disciplina;
import InstitutiiScolare.Studii.Domeniu;
import InstitutiiScolare.Locatie;
import Persoane.Persoana;
import Persoane.Profesor;
import InstitutiiScolare.Sala;
import InstitutiiScolare.Scoala;
import Persoane.Student;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        Vector<Disciplina> discipline=new Vector<Disciplina>();
        Vector<Domeniu> domenii=new Vector<Domeniu>();
        Vector<Persoana> persoane=new Vector<Persoana>();
        Vector<Profesor> profesor=new Vector<Profesor>();
        Vector<Sala> sali=new Vector<Sala>();
        Vector<Scoala> scoli=new Vector<Scoala>();
        Vector<Locatie> lista_locatii = new Vector<Locatie>();
        Vector<Student> studenti=new Vector<Student>();
        Servicii serv=new Servicii();
        serv.citireFisiere(discipline,domenii,lista_locatii,persoane);
        System.out.println(persoane);
        Meniu meniu=new Meniu();
        meniu.meniu(discipline,domenii,lista_locatii,persoane,profesor,sali,scoli,studenti);
    }


}

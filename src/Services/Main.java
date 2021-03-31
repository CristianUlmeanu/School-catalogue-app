package Services;

import Clasa_disciplina.Disciplina;
import Clasa_domeniu.Domeniu;
import Clasa_locatie.Locatie;
import Clasa_persoana.Persoana;
import Clasa_profesor.Profesor;
import Clasa_sala.Sala;
import Clasa_scoala.Scoala;
import Clasa_student.Student;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Vector<Disciplina> discipline=new Vector<Disciplina>();
        Vector<Domeniu> domenii=new Vector<Domeniu>();
        Vector<Persoana> persoane=new Vector<Persoana>();
        Vector<Profesor> profesor=new Vector<Profesor>();
        Vector<Sala> sali=new Vector<Sala>();
        Vector<Scoala> scoli=new Vector<Scoala>();
        Vector<Locatie> lista_locatii = new Vector<Locatie>();
        Vector<Student> studenti=new Vector<Student>();
        Meniu meniu=new Meniu();
        Meniu.meniu(discipline,domenii,lista_locatii,persoane,profesor,sali,scoli,studenti);
    }


}

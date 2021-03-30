package Services;


import Clasa_disciplina.Disciplina;
import Clasa_domeniu.Domeniu;
import Clasa_locatie.Locatie;
import Clasa_persoana.Persoana;
import Clasa_profesor.Profesor;
import org.w3c.dom.ls.LSInput;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Servicii
{
    public static Locatie add_location()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adauga tara: ");
        String t;
        t= scanner.nextLine();
        System.out.println("Adauga judet: ");
        String j;
        j= scanner.nextLine();
        System.out.println("Adauga localitate: ");
        String loc;
        loc=scanner.nextLine();
        System.out.println("Adauga strada: ");
        String str;
        str=scanner.nextLine();
        System.out.println("Adauga numar: ");
        String nr;
        nr=scanner.next();
        Locatie locatie=new Locatie(t,j,loc,str,nr);
        return locatie;
    }
    public static void Afisare_locatie(Locatie x){
        System.out.println(x.toString());
    }
    public static void Stergere_locatie(Vector<Locatie> x,int y){
        x.remove(y);
    }
    public static Locatie Modificare_locatie(Locatie x){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica tara in: ");
        String t;
        t= scanner.nextLine();
        x.setTara(t);
        System.out.println("Modifica judet in: ");
        String j;
        j= scanner.nextLine();
        x.setJudet(j);
        System.out.println("Modifica localitate in: ");
        String loc;
        loc=scanner.nextLine();
        x.setLocalitate(loc);
        System.out.println("Modifica strada in: ");
        String str;
        str=scanner.nextLine();
        x.setStrada(str);
        System.out.println("Modifica numar in: ");
        String nr;
        nr=scanner.nextLine();
        x.setNumar(nr);
        return x;
    }
    public static Domeniu Adaugare_domeniu()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adauga numele domeniului: ");
        String dom;
        dom= scanner.nextLine();
        System.out.println("Adauga numarul anilor de studii: ");
        int ani;
        ani= scanner.nextInt();
        Domeniu domeniu=new Domeniu(dom,ani);
        return domeniu;
    }
    public static void Afisare_domeniu(Domeniu x){
        System.out.println(x.toString());
    }
    public static void Stergere_domeniu(Vector<Domeniu> x,int y){
        x.remove(y);
    }
    public static Domeniu Modificare_domeniu(Domeniu x){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica numele domeniului in: ");
        String dom;
        dom= scanner.nextLine();
        x.setNume_domeniu(dom);
        System.out.println("Modifica numarul anilor de studii in: ");
        int ani;
        ani= scanner.nextInt();
        x.setAni_studii(ani);
        return x;
    }
    public static Disciplina Adaugare_disciplina(){
        Scanner scanner=new Scanner(System.in);
        Domeniu domeniu=Adaugare_domeniu();
        System.out.println("Adauga numele materiei: ");
        String mat;
        mat= scanner.nextLine();
        System.out.println("Adauga numarul maxim de credite disponibile: ");
        int credite;
        credite= scanner.nextInt();
        System.out.println("Cate note sunt obtinute? ");
        int nr_note;
        nr_note=scanner.nextInt();
        Vector <Float> note=new Vector<Float>();
        for(int i=1;i<=nr_note;i++) {
            System.out.println("Adauga nota obtinuta");
            float nota= scanner.nextFloat();
            note.add(nota);
        }
        Disciplina disciplina=new Disciplina(domeniu.getNume_domeniu(), domeniu.getAni_studii(), mat,credite,note);
        return disciplina;
    }
    public static void Afisare_disciplina(Disciplina x){
        System.out.println(x.toString());
    }
    public static void Stergere_disciplina(Vector<Disciplina> x,int y){
        x.remove(y);
    }
    public static Disciplina Modificare_disciplina(Disciplina x){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica numele domeniului in: ");
        String dom;
        dom= scanner.nextLine();
        x.setNume_domeniu(dom);
        System.out.println("Modifica numarul anilor de studii in: ");
        int ani;
        ani= scanner.nextInt();
        x.setAni_studii(ani);
        System.out.println("Modifica numele materiei in: ");
        String mat;
        mat= scanner.nextLine();
        x.setNume_materie(mat);
        System.out.println("Modifica numarul maxim de credite disponibile in: ");
        int credite;
        credite= scanner.nextInt();
        x.setNr_credite_max(credite);
        Vector<Float> note_modificate= new Vector<Float>();
        for(Float i: x.getNota()) {
            System.out.println("Modifica nota obtinuta in");
            float nota= scanner.nextFloat();
            note_modificate.add(nota);
        }
        x.setNota(note_modificate);
        return x;
    }
    public static Persoana Adagaure_persona(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adauga CNPul persoanei:");
        String CNP=scanner.nextLine();
        System.out.println("Adauga numele persoanei:");
        String nume=scanner.nextLine();
        System.out.println("Adauga prenumele persoanei:");
        String prenume=scanner.nextLine();
        System.out.println("Adauga varsta persoanei:");
        int varsta=scanner.nextInt();
        Persoana persoana=new Persoana(CNP,nume,prenume,varsta);
        return persoana;
    }
    public static void Afisare_persoana(Persoana x){
        x.toString();
    }
    public static void Stergere_persoana(Vector<Persoana> x, int y){
        x.remove(y);
    }
    public static Persoana Modificare_persoana(Persoana x){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica CNPul persoanei in:");
        String CNP=scanner.nextLine();
        x.setCnp(CNP);
        System.out.println("Modifica numele persoanei in:");
        String nume=scanner.nextLine();
        x.setNume(nume);
        System.out.println("Modifica prenumele persoanei in:");
        String prenume=scanner.nextLine();
        x.setPrenume(prenume);
        System.out.println("Modifica varsta persoanei in:");
        int varsta=scanner.nextInt();
        x.setVarsta(varsta);
        return x;
    }
    public static Profesor Adaugare_profesor(){
        Scanner scanner=new Scanner(System.in);
        Persoana persoana_aux=Adagaure_persona();
        System.out.println("Adauga gradul profesorului: ");
        String grad=scanner.nextLine();
        System.out.println("Adauga anii de experienta a profesorului");
        int an=scanner.nextInt();
        Profesor profesor=new Profesor(persoana_aux.getCnp(), persoana_aux.getNume(), persoana_aux.getPrenume(), persoana_aux.getVarsta(), grad,an);
        return profesor;
    }
    public static void Afisare_profesor(Profesor x){
        x.toString();
    }
    public static void Stergere_profesor(Vector<Profesor> x,int y){
        x.remove(y);
    }
    public static Profesor Modificare_profesor(Profesor x){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica CNPul persoanei in:");
        String CNP=scanner.nextLine();
        x.setCnp(CNP);
        System.out.println("Modifica numele persoanei in:");
        String nume=scanner.nextLine();
        x.setNume(nume);
        System.out.println("Modifica prenumele persoanei in:");
        String prenume=scanner.nextLine();
        x.setPrenume(prenume);
        System.out.println("Modifica varsta persoanei in:");
        int varsta=scanner.nextInt();
        x.setVarsta(varsta);
        System.out.println("Modifica gradul persoanei in:");
        String grad=scanner.nextLine();
        x.setGrad(grad);
        System.out.println("Modifica anii de experienta persoanei in:");
        int ani=scanner.nextInt();
        x.setAni_experienta(ani);
        return x;
    }





}

package Services;

import Clasa_disciplina.Disciplina;
import Clasa_domeniu.Domeniu;
import Clasa_locatie.Locatie;
import Clasa_persoana.Persoana;
import Clasa_profesor.Profesor;
import Clasa_sala.Sala;
import Clasa_scoala.Scoala;
import Clasa_student.Student;

import java.util.Scanner;
import java.util.Vector;

public class Meniu {
    public static void meniu(Vector<Disciplina>a, Vector<Domeniu>b, Vector<Locatie>c, Vector<Persoana>d, Vector<Profesor>e, Vector<Sala>f, Vector<Scoala>g,Vector<Student>h) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Citire");
        System.out.println("\n2. Afisare");
        System.out.println("\n3. Modificare");
        System.out.println("\n4. Stergere");
        System.out.println("\n5. Afisare scoli dintr-o locatie");
        System.out.println("\n6. Afisare domeniile disponibile ale unei scoli");
        System.out.println("\n7. Calculare medie elev");
        System.out.println("\n8. Calculare numar de credite");
        System.out.println("\n9. Iesire");
        int opt=0;
        while (opt >= 0 & opt < 10) {
        System.out.println("\n_____________________________________________________\nAlege ce optiune doresti sa testezi: ");
        opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    String Clasa;
                    System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                    Clasa=scanner.next();
                    switch (Clasa){
                        case "Disciplina":
                        {
                            int nr_discipline;
                            System.out.println("Cate discipline aveti? ");
                            nr_discipline=scanner.nextInt();
                            for (int i=1;i<=nr_discipline;i++)
                                a.add(Servicii.Adaugare_disciplina());
                            break;
                        }
                        case "Domeniu":
                        {
                            int nr_domenii;
                            System.out.println("Cate domenii aveti? ");
                            nr_domenii=scanner.nextInt();
                            for (int i=1;i<=nr_domenii;i++)
                                b.add(Servicii.Adaugare_domeniu());
                            break;
                        }
                        case "Locatie":
                        {
                            int nr_locatie;
                            System.out.println("Cate locatii aveti? ");
                            nr_locatie=scanner.nextInt();
                            for (int i=1;i<=nr_locatie;i++)
                                c.add(Servicii.Adaugare_locatie());
                            break;
                        }
                        case "Persoana":
                        {
                            int nr_persoane;
                            System.out.println("Cate persoane aveti? ");
                            nr_persoane=scanner.nextInt();
                            for (int i=1;i<=nr_persoane;i++)
                                d.add(Servicii.Adaugare_persona());
                            break;
                        }
                        case "Profesor":
                        {
                            int nr_profesori;
                            System.out.println("Cate profesori aveti? ");
                            nr_profesori=scanner.nextInt();
                            for (int i=1;i<=nr_profesori;i++)
                                e.add(Servicii.Adaugare_profesor());
                            break;
                        }
                        case "Sala":
                        {
                            int nr_sali;
                            System.out.println("Cate sali aveti? ");
                            nr_sali=scanner.nextInt();
                            for (int i=1;i<=nr_sali;i++)
                                f.add(Servicii.Adaugare_sala());
                            break;
                        }
                        case "Scoala":
                        {
                            int nr_scoli;
                            System.out.println("Cate scoli aveti? ");
                            nr_scoli=scanner.nextInt();
                            for (int i=1;i<=nr_scoli;i++)
                                g.add(Servicii.Adaugare_scoala());
                            break;
                        }
                        case "Student":
                        {
                            int nr_studenti;
                            System.out.println("Cate studenti aveti? ");
                            nr_studenti=scanner.nextInt();
                            for (int i=1;i<=nr_studenti;i++)
                                h.add(Servicii.Adaugare_student());
                            break;
                        }
                        default:
                            System.out.println("Alege o varianta din cele mentionate anterior.");
                            break;
                    }
                }
                break;
                case 2: {
                    String Clasa;
                    System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                    Clasa=scanner.next();
                    switch (Clasa) {
                        case "Disciplina": {
                            for (Disciplina it : a)
                                Servicii.Afisare_disciplina(it);
                            break;
                        }
                        case "Domeniu": {
                            for (Domeniu it : b)
                                Servicii.Afisare_domeniu(it);
                            break;
                        }
                        case "Locatie": {
                            for (Locatie it : c)
                                Servicii.Afisare_locatie(it);
                            break;
                        }
                        case "Persoana": {
                            for (Persoana it : d)
                                Servicii.Afisare_persoana(it);
                            break;
                        }
                        case "Profesor": {
                            for (Profesor it : e)
                                Servicii.Afisare_profesor(it);
                            break;
                        }
                        case "Sala": {
                            for (Sala it : f)
                                Servicii.Afisare_sala(it);
                            break;
                        }
                        case "Scoala": {
                            for (Scoala it : g)
                                Servicii.Afisare_scoala(it);
                            break;
                        }
                        case "Student": {
                            for (Student it : h)
                                Servicii.Afisare_student(it);
                            break;
                        }
                        default: {
                            System.out.println("Alege o varianta din cele mentionate anterior.");
                            break;
                        }
                    }
                }
                break;
                case 3: {
                    String Clasa;
                    System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                    Clasa = scanner.next();
                    switch (Clasa) {
                        case "Disciplina": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_disciplina(a.get(obiect));
                            break;
                        }
                        case "Domeniu": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_domeniu(b.get(obiect));
                            break;
                        }
                        case "Locatie": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_locatie(c.get(obiect));
                            break;
                        }
                        case "Persoana": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_persoana(d.get(obiect));
                            break;
                        }
                        case "Profesor": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_profesor(e.get(obiect));
                            break;
                        }
                        case "Sala": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_sala(f.get(obiect));
                            break;
                        }
                        case "Scoala": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_scoala(g.get(obiect));
                            break;
                        }
                        case "Student": {
                            System.out.println("Al catalea obiect doresti sa modifici?");
                            int obiect = scanner.nextInt();
                            Servicii.Modificare_student(h.get(obiect));
                            break;
                        }
                        default: {
                            System.out.println("Alege o varianta din cele mentionate anterior.");
                            break;
                        }
                    }
                }
                break;
                case 4: {
                    String Clasa;
                    System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                    Clasa = scanner.next();
                    switch (Clasa) {
                        case "Disciplina": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_disciplina(a,obiect);
                            break;
                        }
                        case "Domeniu": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_domeniu(b,obiect);
                            break;
                        }
                        case "Locatie": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_locatie(c,obiect);
                            break;
                        }
                        case "Persoana": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_persoana(d,obiect);
                            break;
                        }
                        case "Profesor": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_profesor(e,obiect);
                            break;
                        }
                        case "Sala": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_sala(f,obiect);
                            break;
                        }
                        case "Scoala": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_scoala(g,obiect);
                            break;
                        }
                        case "Student": {
                            System.out.println("Al catalea obiect doresti sa stergi?");
                            int obiect = scanner.nextInt();
                            Servicii.Stergere_student(h,obiect);
                            break;
                        }
                        default: {
                            System.out.println("Alege o varianta din cele mentionate anterior.");
                            break;
                        }
                    }
                }
                break;
                case 5: {
                    Servicii.Cautare_scoala(g);
                }
                break;
                case 6: {
                    Servicii.Cautare_specializare(g);
                }
                break;
                case 7: {
                    System.out.println("Cui doresti sa aflii media");
                    int obiect=scanner.nextInt();
                    System.out.println(Servicii.Calcul_medie(a.get(obiect)));
                }
                break;
                case 8: {
                    System.out.println("Cui doresti sa aflii numarul de credite");
                    int obiect=scanner.nextInt();
                    System.out.println(Servicii.Calcul_nr_credite(a.get(obiect)));
                }
                break;
                case 9: {
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Alege o varianta dintre 1 si 9 data viitoare.");
                    break;
            }
        }
    }
}

package Services;

import InstitutiiScolare.Studii.Disciplina;
import InstitutiiScolare.Studii.Domeniu;
import InstitutiiScolare.Locatie;
import Persoane.Persoana;
import Persoane.Profesor;
import InstitutiiScolare.Sala;
import InstitutiiScolare.Scoala;
import Persoane.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Meniu {
    public void meniu(Vector<Disciplina> a, Vector<Domeniu> b, Vector<Locatie> c, Vector<Persoana> d, Vector<Profesor> e, Vector<Sala> f, Vector<Scoala> g, Vector<Student> h) throws IOException, SQLException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Servicii serv = new Servicii();
        FileWriter writerReset=new FileWriter("src/Services/Date/Audit.csv", false);
        writerReset.write("Optiunea folosita, Timestampul utilizarii\n");
        writerReset.close();
        System.out.println("Cum doresti sa lucrezi manual/csv/baza de date?");
        String optiune = scanner.nextLine();
        if (optiune.equals("manual")) {
            System.out.println("1. Citire");
            System.out.println("\n2. Afisare");
            System.out.println("\n3. Modificare");
            System.out.println("\n4. Stergere");
            System.out.println("\n5. Afisare scoli dintr-o locatie");
            System.out.println("\n6. Afisare domeniile disponibile ale unei scoli");
            System.out.println("\n7. Calculare medie elev");
            System.out.println("\n8. Calculare numar de credite");
            System.out.println("\n9. Afisare note");
            System.out.println("\n10. Iesire");
            int opt = 0;
            while (opt >= 0 & opt < 100) {
                System.out.println("\n_____________________________________________________\nAlege ce optiune doresti sa testezi: ");
                opt = scanner.nextInt();
                switch (opt) {
                    case 1: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                int nr_discipline;
                                System.out.println("Cate discipline aveti? ");
                                nr_discipline = scanner.nextInt();
                                for (int i = 1; i <= nr_discipline; i++)
                                    a.add(serv.adaugareDisciplina());
                                break;
                            }
                            case "Domeniu": {
                                int nr_domenii;
                                System.out.println("Cate domenii aveti? ");
                                nr_domenii = scanner.nextInt();
                                for (int i = 1; i <= nr_domenii; i++)
                                    b.add(serv.adaugareDomeniu());
                                break;
                            }
                            case "Locatie": {
                                int nr_locatie;
                                System.out.println("Cate locatii aveti? ");
                                nr_locatie = scanner.nextInt();
                                for (int i = 1; i <= nr_locatie; i++)
                                    c.add(serv.adaugareLocatie());
                                break;
                            }
                            case "Persoana": {
                                int nr_persoane;
                                System.out.println("Cate persoane aveti? ");
                                nr_persoane = scanner.nextInt();
                                for (int i = 1; i <= nr_persoane; i++)
                                    d.add(serv.adaugarePersoana());
                                break;
                            }
                            case "Profesor": {
                                int nr_profesori;
                                System.out.println("Cate profesori aveti? ");
                                nr_profesori = scanner.nextInt();
                                for (int i = 1; i <= nr_profesori; i++)
                                    e.add(serv.adaugareProfesor());
                                break;
                            }
                            case "Sala": {
                                int nr_sali;
                                System.out.println("Cate sali aveti? ");
                                nr_sali = scanner.nextInt();
                                for (int i = 1; i <= nr_sali; i++)
                                    f.add(serv.adaugareSala());
                                break;
                            }
                            case "Scoala": {
                                int nr_scoli;
                                System.out.println("Cate scoli aveti? ");
                                nr_scoli = scanner.nextInt();
                                for (int i = 1; i <= nr_scoli; i++)
                                    g.add(serv.adaugareScoala());
                                break;
                            }
                            case "Student": {
                                int nr_studenti;
                                System.out.println("Cate studenti aveti? ");
                                nr_studenti = scanner.nextInt();
                                for (int i = 1; i <= nr_studenti; i++)
                                    h.add(serv.adaugareStudent());
                                break;
                            }
                            default:
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Citire", timp);
                    }
                    break;
                    case 2: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                for (Disciplina it : a)
                                    serv.afisareDisciplina(it);
                                break;
                            }
                            case "Domeniu": {
                                for (Domeniu it : b)
                                    serv.afisareDomeniu(it);
                                break;
                            }
                            case "Locatie": {
                                for (Locatie it : c)
                                    serv.afisareLocatie(it);
                                break;
                            }
                            case "Persoana": {
                                for (Persoana it : d)
                                    serv.afisarePersoana(it);
                                break;
                            }
                            case "Profesor": {
                                for (Profesor it : e)
                                    serv.afisareProfesor(it);
                                break;
                            }
                            case "Sala": {
                                for (Sala it : f)
                                    serv.afisareSala(it);
                                break;
                            }
                            case "Scoala": {
                                for (Scoala it : g)
                                    serv.afisareScoala(it);
                                break;
                            }
                            case "Student": {
                                for (Student it : h)
                                    serv.afisareStudent(it);
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Afisare", timp);
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
                                serv.modificareDisciplina(a.get(obiect));
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareDomeniu(b.get(obiect));
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareLocatie(c.get(obiect));
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(d.get(obiect));
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(e.get(obiect));
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareSala(f.get(obiect));
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareScoala(g.get(obiect));
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareStudent(h.get(obiect));
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Modificare", timp);
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
                                serv.stergereDisciplina(a, obiect);
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereDomeniu(b, obiect);
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereLocatie(c, obiect);
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergerePersoana(d, obiect);
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereProfesor(e, obiect);
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereSala(f, obiect);
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereScoala(g, obiect);
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereStudent(h, obiect);
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Stergere", timp);
                    }
                    break;
                    case 5: {
                        serv.cautareScoala(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei scoli", timp);
                    }
                    break;
                    case 6: {
                        serv.cautareSpecializare(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei specializari", timp);
                    }
                    break;
                    case 7: {
                        System.out.println("Cui doresti sa aflii media");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii media");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculMedie(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unei medii", timp);
                    }
                    break;
                    case 8: {
                        System.out.println("Cui doresti sa aflii numarul de credite");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii numarul de credite");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculNrCredite(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    break;
                    case 9: {
                        System.out.println("Cui doresti sa aflii notele");
                        int persoana = scanner.nextInt();
                        System.out.println("Notele la ce disciplina doresti sa aflii");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.noteSortate(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    case 10: {
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Iesire", timp);
                        System.exit(0);
                    }
                    break;
                    default:
                        System.out.println("Alege o varianta dintre 1 si 10 data viitoare.");
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Eroare de alegere actiune", timp);
                        break;
                }
            }

        } else if (optiune.equals("csv")) {
            serv.citireFisiere(a, b, c, d);
            serv.scriereFisier(a, b, c, d);
            Date timestampInitial = new Date();
            SimpleDateFormat dataInitial = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String timpInitial = dataInitial.format(timestampInitial);
            serv.creareAudit("Preluare date din CSV.", timpInitial);
            serv.creareAudit("Populare CSVuri initiala", timpInitial);
            System.out.println("\n1. Modificare");
            System.out.println("\n2. Stergere");
            System.out.println("\n3. Afisare scoli dintr-o locatie");
            System.out.println("\n4. Afisare domeniile disponibile ale unei scoli");
            System.out.println("\n5. Calculare medie elev");
            System.out.println("\n6. Calculare numar de credite");
            System.out.println("\n7. Afisare note");
            System.out.println("\n8. Updatare fisiere pentru afisare");
            System.out.println("\n9. Iesire");
            int opt = 0;
            while (opt >= 0 & opt < 100) {
                System.out.println("\n_____________________________________________________\nAlege ce optiune doresti sa testezi: ");
                opt = scanner.nextInt();
                switch (opt) {
                    case 1: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareDisciplina(a.get(obiect));
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareDomeniu(b.get(obiect));
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareLocatie(c.get(obiect));
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(d.get(obiect));
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(e.get(obiect));
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareSala(f.get(obiect));
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareScoala(g.get(obiect));
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareStudent(h.get(obiect));
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Modificare", timp);
                    }
                    break;
                    case 2: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereDisciplina(a, obiect);
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereDomeniu(b, obiect);
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereLocatie(c, obiect);
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergerePersoana(d, obiect);
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereProfesor(e, obiect);
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereSala(f, obiect);
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereScoala(g, obiect);
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereStudent(h, obiect);
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Stergere", timp);
                    }
                    break;
                    case 3: {
                        serv.cautareScoala(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei scoli", timp);
                    }
                    break;
                    case 4: {
                        serv.cautareSpecializare(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei specializari", timp);
                    }
                    break;
                    case 5: {
                        System.out.println("Cui doresti sa aflii media");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii media");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculMedie(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unei medii", timp);
                    }
                    break;
                    case 6: {
                        System.out.println("Cui doresti sa aflii numarul de credite");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii numarul de credite");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculNrCredite(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    break;
                    case 7: {
                        System.out.println("Cui doresti sa aflii notele");
                        int persoana = scanner.nextInt();
                        System.out.println("Notele la ce disciplina doresti sa aflii");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.noteSortate(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    case 8: {
                        serv.scriereFisier(a, b, c, d);
                        System.out.println("Fisierele au fost updatate cu succes!");
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Iesire", timp);
                    }
                    case 9: {
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Iesire", timp);
                        System.exit(0);
                    }
                    break;
                    default:
                        System.out.println("Alege o varianta dintre 1 si 10 data viitoare.");
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Eroare de alegere actiune", timp);
                        break;
                }
            }
        }
        else if (optiune.equals("baza de date")) {
            //serv.scriereFisier(a, b, c, d);
            System.out.println("1. Citire manuala");
            System.out.println("\n2. Preluare de date din CSV");
            System.out.println("\n3. Preluare de date din BD");
            System.out.println("\n4. Afisare");
            System.out.println("\n5. Inserare in BD");
            System.out.println("\n6. Modificare doar in App");
            System.out.println("\n7. Modificare in BD cat si App");
            System.out.println("\n8. Stergere");
            System.out.println("\n9. Stergere in BD");
            System.out.println("\n10. Afisare scoli dintr-o locatie");
            System.out.println("\n11. Afisare domeniile disponibile ale unei scoli");
            System.out.println("\n12. Calculare medie elev");
            System.out.println("\n13. Calculare numar de credite");
            System.out.println("\n14. Afisare note");
            System.out.println("\n15. Iesire");
            int opt = 0;
            while (opt >= 0 & opt < 100) {
                System.out.println("\n_____________________________________________________\nAlege ce optiune doresti sa testezi: ");
                opt = scanner.nextInt();
                switch (opt) {
                    case 1: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                int nr_discipline;
                                System.out.println("Cate discipline aveti? ");
                                nr_discipline = scanner.nextInt();
                                for (int i = 1; i <= nr_discipline; i++)
                                    a.add(serv.adaugareDisciplina());
                                break;
                            }
                            case "Domeniu": {
                                int nr_domenii;
                                System.out.println("Cate domenii aveti? ");
                                nr_domenii = scanner.nextInt();
                                for (int i = 1; i <= nr_domenii; i++)
                                    b.add(serv.adaugareDomeniu());
                                break;
                            }
                            case "Locatie": {
                                int nr_locatie;
                                System.out.println("Cate locatii aveti? ");
                                nr_locatie = scanner.nextInt();
                                for (int i = 1; i <= nr_locatie; i++)
                                    c.add(serv.adaugareLocatie());
                                break;
                            }
                            case "Persoana": {
                                int nr_persoane;
                                System.out.println("Cate persoane aveti? ");
                                nr_persoane = scanner.nextInt();
                                for (int i = 1; i <= nr_persoane; i++)
                                    d.add(serv.adaugarePersoana());
                                break;
                            }
                            case "Profesor": {
                                int nr_profesori;
                                System.out.println("Cate profesori aveti? ");
                                nr_profesori = scanner.nextInt();
                                for (int i = 1; i <= nr_profesori; i++)
                                    e.add(serv.adaugareProfesor());
                                break;
                            }
                            case "Sala": {
                                int nr_sali;
                                System.out.println("Cate sali aveti? ");
                                nr_sali = scanner.nextInt();
                                for (int i = 1; i <= nr_sali; i++)
                                    f.add(serv.adaugareSala());
                                break;
                            }
                            case "Scoala": {
                                int nr_scoli;
                                System.out.println("Cate scoli aveti? ");
                                nr_scoli = scanner.nextInt();
                                for (int i = 1; i <= nr_scoli; i++)
                                    g.add(serv.adaugareScoala());
                                break;
                            }
                            case "Student": {
                                int nr_studenti;
                                System.out.println("Cate studenti aveti? ");
                                nr_studenti = scanner.nextInt();
                                for (int i = 1; i <= nr_studenti; i++)
                                    h.add(serv.adaugareStudent());
                                break;
                            }
                            default:
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Citire", timp);
                    }
                    break;
                    case 2: {
                        serv.citireFisiere(a, b, c, d);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Preluare de date din CSV", timp);
                    }
                    break;
                    case 3: {
                        serv.populareApp(DbConnectionSingleton.getConnection(),e,c,d,b);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Preluare de date din BD", timp);
                    }
                    break;
                    case 4: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                for (Disciplina it : a)
                                    serv.afisareDisciplina(it);
                                break;
                            }
                            case "Domeniu": {
                                for (Domeniu it : b)
                                    serv.afisareDomeniu(it);
                                break;
                            }
                            case "Locatie": {
                                for (Locatie it : c)
                                    serv.afisareLocatie(it);
                                break;
                            }
                            case "Persoana": {
                                for (Persoana it : d)
                                    serv.afisarePersoana(it);
                                break;
                            }
                            case "Profesor": {
                                for (Profesor it : e)
                                    serv.afisareProfesor(it);
                                break;
                            }
                            case "Sala": {
                                for (Sala it : f)
                                    serv.afisareSala(it);
                                break;
                            }
                            case "Scoala": {
                                for (Scoala it : g)
                                    serv.afisareScoala(it);
                                break;
                            }
                            case "Student": {
                                for (Student it : h)
                                    serv.afisareStudent(it);
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Afisare", timp);
                    }
                    break;
                    case 5: {
                        serv.populareBD(DbConnectionSingleton.getConnection(),e,c,d,b);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Inserare in BD", timp);
                    }
                    break;
                    case 6: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareDisciplina(a.get(obiect));
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareDomeniu(b.get(obiect));
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareLocatie(c.get(obiect));
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(d.get(obiect));
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificarePersoana(e.get(obiect));
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareSala(f.get(obiect));
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareScoala(g.get(obiect));
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa modifici?");
                                int obiect = scanner.nextInt();
                                serv.modificareStudent(h.get(obiect));
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Modificare", timp);
                    }
                    break;
                    case 7: {
                        serv.modificareBdApp(DbConnectionSingleton.getConnection(),e,c,d,b);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Modificare in BD si App", timp);
                    }
                    break;
                    case 8: {
                        String Clasa;
                        System.out.println("Pe ce clasa doresti sa lucrezi? (Disciplina / Domeniu / Locatie / Persoana / Profesor / Sala / Scoala / Student");
                        Clasa = scanner.next();
                        switch (Clasa) {
                            case "Disciplina": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereDisciplina(a, obiect);
                                break;
                            }
                            case "Domeniu": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereDomeniu(b, obiect);
                                break;
                            }
                            case "Locatie": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereLocatie(c, obiect);
                                break;
                            }
                            case "Persoana": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergerePersoana(d, obiect);
                                break;
                            }
                            case "Profesor": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereProfesor(e, obiect);
                                break;
                            }
                            case "Sala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereSala(f, obiect);
                                break;
                            }
                            case "Scoala": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereScoala(g, obiect);
                                break;
                            }
                            case "Student": {
                                System.out.println("Al catalea obiect doresti sa stergi?");
                                int obiect = scanner.nextInt();
                                serv.stergereStudent(h, obiect);
                                break;
                            }
                            default: {
                                System.out.println("Alege o varianta din cele mentionate anterior.");
                                break;
                            }
                        }
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Stergere", timp);
                    }
                    break;
                    case 9: {
                        serv.stergereBD(DbConnectionSingleton.getConnection(),e,c,d,b);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Stergere in BD", timp);
                    }
                    break;
                    case 10: {
                        serv.cautareScoala(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei scoli", timp);
                    }
                    break;
                    case 11: {
                        serv.cautareSpecializare(g);
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Cautarea unei specializari", timp);
                    }
                    break;
                    case 12: {
                        System.out.println("Cui doresti sa aflii media");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii media");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculMedie(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unei medii", timp);
                    }
                    break;
                    case 13: {
                        System.out.println("Cui doresti sa aflii numarul de credite");
                        int persoana = scanner.nextInt();
                        System.out.println("Carei discipline vrei sa aflii numarul de credite");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.calculNrCredite(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    break;
                    case 14: {
                        System.out.println("Cui doresti sa aflii notele");
                        int persoana = scanner.nextInt();
                        System.out.println("Notele la ce disciplina doresti sa aflii");
                        int disciplina = scanner.nextInt();
                        System.out.println(serv.noteSortate(h.get(persoana).getListaDiscipline().get(disciplina)));
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Calcularea unui numar de credite", timp);
                    }
                    case 15: {
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Iesire", timp);
                        System.exit(0);
                    }
                    break;
                    default:
                        System.out.println("Alege o varianta dintre 1 si 10 data viitoare.");
                        Date timestamp = new Date();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String timp = data.format(timestamp);
                        serv.creareAudit("Eroare de alegere actiune", timp);
                        break;
                }
            }
        }
    }
}
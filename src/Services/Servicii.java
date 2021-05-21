package Services;


import InstitutiiScolare.Studii.Disciplina;
import InstitutiiScolare.Studii.Domeniu;
import InstitutiiScolare.Locatie;
import Persoane.Persoana;
import Persoane.Profesor;
import InstitutiiScolare.Sala;
import InstitutiiScolare.Scoala;
import Persoane.Student;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Servicii {
    public Locatie adaugareLocatie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga tara: ");
        String t;
        t = scanner.nextLine();
        System.out.println("Adauga judet: ");
        String j;
        j = scanner.nextLine();
        System.out.println("Adauga localitate: ");
        String loc;
        loc = scanner.nextLine();
        System.out.println("Adauga strada: ");
        String str;
        str = scanner.nextLine();
        System.out.println("Adauga numar: ");
        String nr;
        nr = scanner.next();
        Locatie locatie = new Locatie(t, j, loc, str, nr);
        return locatie;
    }

    public void afisareLocatie(Locatie x) {
        System.out.println(x.toString());
    }

    public void stergereLocatie(Vector<Locatie> x, int y) {
        x.remove(y);
    }

    public Locatie modificareLocatie(Locatie x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica tara in: ");
        String t;
        t = scanner.nextLine();
        x.setTara(t);
        System.out.println("Modifica judet in: ");
        String j;
        j = scanner.nextLine();
        x.setJudet(j);
        System.out.println("Modifica localitate in: ");
        String loc;
        loc = scanner.nextLine();
        x.setLocalitate(loc);
        System.out.println("Modifica strada in: ");
        String str;
        str = scanner.nextLine();
        x.setStrada(str);
        System.out.println("Modifica numar in: ");
        String nr;
        nr = scanner.nextLine();
        x.setNumar(nr);
        return x;
    }

    public Domeniu adaugareDomeniu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga numele domeniului: ");
        String dom;
        dom = scanner.nextLine();
        System.out.println("Adauga numarul anilor de studii: ");
        int ani;
        ani = scanner.nextInt();
        Domeniu domeniu = new Domeniu(dom, ani);
        return domeniu;
    }

    public void afisareDomeniu(Domeniu x) {
        System.out.println(x.toString());
    }

    public void stergereDomeniu(Vector<Domeniu> x, int y) {
        x.remove(y);
    }

    public Domeniu modificareDomeniu(Domeniu x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica numele domeniului in: ");
        String dom;
        dom = scanner.nextLine();
        x.setNumeDomeniu(dom);
        System.out.println("Modifica numarul anilor de studii in: ");
        int ani;
        ani = scanner.nextInt();
        x.setAniStudii(ani);
        return x;
    }

    public Disciplina adaugareDisciplina() {
        Scanner scanner = new Scanner(System.in);
        Domeniu domeniu = adaugareDomeniu();
        System.out.println("Adauga numele materiei: ");
        String mat;
        mat = scanner.nextLine();
        System.out.println("Adauga numarul maxim de credite disponibile: ");
        int credite;
        credite = scanner.nextInt();
        System.out.println("Cate note sunt obtinute? ");
        int nr_note;
        nr_note = scanner.nextInt();
        Vector<Float> note = new Vector<Float>();
        for (int i = 1; i <= nr_note; i++) {
            System.out.println("Adauga nota obtinuta");
            Float nota = scanner.nextFloat();
            note.add(nota);
        }
        Disciplina disciplina = new Disciplina(domeniu.getNumeDomeniu(), domeniu.getAniStudii(), mat, credite, note);
        return disciplina;
    }

    public void afisareDisciplina(Disciplina x) {
        System.out.println(x.toString());
    }

    public void stergereDisciplina(Vector<Disciplina> x, int y) {
        x.remove(y);
    }

    public Disciplina modificareDisciplina(Disciplina x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica numele domeniului in: ");
        String dom;
        dom = scanner.nextLine();
        x.setNumeDomeniu(dom);
        System.out.println("Modifica numarul anilor de studii in: ");
        int ani;
        ani = scanner.nextInt();
        x.setAniStudii(ani);
        System.out.println("Modifica numele materiei in: ");
        String mat;
        mat = scanner.next();
        x.setNumeMaterie(mat);
        System.out.println("Modifica numarul maxim de credite disponibile in: ");
        int credite;
        credite = scanner.nextInt();
        x.setNrCrediteMax(credite);
        Vector<Float> note_modificate = new Vector<Float>();
        for (Float i : x.getNota()) {
            System.out.println("Modifica nota obtinuta in");
            Float nota = scanner.nextFloat();
            note_modificate.add(nota);
        }
        x.setNota(note_modificate);
        return x;
    }

    public Persoana adaugarePersoana() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga CNPul persoanei:");
        String CNP = scanner.nextLine();
        System.out.println("Adauga numele persoanei:");
        String nume = scanner.nextLine();
        System.out.println("Adauga prenumele persoanei:");
        String prenume = scanner.nextLine();
        System.out.println("Adauga varsta persoanei:");
        int varsta = scanner.nextInt();
        Persoana persoana = new Persoana(CNP, nume, prenume, varsta);
        return persoana;
    }

    public void afisarePersoana(Persoana x) {
        System.out.println(x.toString());
    }

    public void stergerePersoana(Vector<Persoana> x, int y) {
        x.remove(y);
    }

    public Persoana modificarePersoana(Persoana x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica CNPul persoanei in:");
        String CNP = scanner.nextLine();
        x.setCnp(CNP);
        System.out.println("Modifica numele persoanei in:");
        String nume = scanner.nextLine();
        x.setNume(nume);
        System.out.println("Modifica prenumele persoanei in:");
        String prenume = scanner.nextLine();
        x.setPrenume(prenume);
        System.out.println("Modifica varsta persoanei in:");
        int varsta = scanner.nextInt();
        x.setVarsta(varsta);
        return x;
    }

    public Profesor adaugareProfesor() {
        Scanner scanner = new Scanner(System.in);
        Persoana persoana_aux = adaugarePersoana();
        System.out.println("Adauga gradul profesorului: ");
        String grad = scanner.nextLine();
        System.out.println("Adauga anii de experienta a profesorului");
        int an = scanner.nextInt();
        Profesor profesor = new Profesor(persoana_aux.getCnp(), persoana_aux.getNume(), persoana_aux.getPrenume(), persoana_aux.getVarsta(), grad, an);
        return profesor;
    }

    public void afisareProfesor(Profesor x) {
        System.out.println(x.toString());}

    public void stergereProfesor(Vector<Profesor> x, int y) {
        x.remove(y);
    }

    public Profesor modificareProfesor(Profesor x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica CNPul persoanei in:");
        String CNP = scanner.nextLine();
        x.setCnp(CNP);
        System.out.println("Modifica numele persoanei in:");
        String nume = scanner.nextLine();
        x.setNume(nume);
        System.out.println("Modifica prenumele persoanei in:");
        String prenume = scanner.nextLine();
        x.setPrenume(prenume);
        System.out.println("Modifica varsta persoanei in:");
        int varsta = scanner.nextInt();
        x.setVarsta(varsta);
        System.out.println("Modifica gradul persoanei in:");
        String grad = scanner.nextLine();
        x.setGrad(grad);
        System.out.println("Modifica anii de experienta persoanei in:");
        int ani = scanner.nextInt();
        x.setAniExperienta(ani);
        return x;
    }

    public Sala adaugareSala() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga numele salii: ");
        String sala_nume = scanner.nextLine();
        System.out.println("Cati profesori lucreaza in sala respectiva? ");
        int nr_profi = scanner.nextInt();
        Vector<Profesor> lista_prof = new Vector<Profesor>();
        System.out.println("Adauga profesorii ce lucreaza in sala respectiva: ");
        for (int i = 1; i <= nr_profi; i++)
            lista_prof.add(adaugareProfesor());
        System.out.println("De cate materiale dispune sala? ");
        int nr_echip = scanner.nextInt();
        Vector<String> lista_mat = new Vector<String>();
        System.out.println("Adauga materialele din sala respectiva: ");
        for (int i = 1; i <= nr_echip; i++)
            lista_mat.add(scanner.nextLine());
        Sala sala = new Sala(sala_nume, lista_prof, lista_mat);
        return sala;
    }

    public void afisareSala(Sala x) {
        System.out.println(x.toString());
    }

    public void stergereSala(Vector<Sala> x, int y) {
        x.remove(y);
    }

    public Sala modificareSala(Sala x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica numele salii: ");
        String sala_nume = scanner.nextLine();
        x.setNumeSala(sala_nume);
        System.out.println("Cati profesori lucreaza in sala respectiva? ");
        int nr_profi = scanner.nextInt();
        Vector<Profesor> lista_prof = new Vector<Profesor>();
        System.out.println("Modifica profesorii ce lucreaza in sala respectiva: ");
        for (int i = 1; i <= nr_profi; i++)
            lista_prof.add(adaugareProfesor());
        x.setListaProfesori(lista_prof);
        System.out.println("De cate materiale dispune sala? ");
        int nr_echip = scanner.nextInt();
        Vector<String> lista_mat = new Vector<String>();
        System.out.println("Modifica materialele din sala respectiva: ");
        for (int i = 1; i <= nr_echip; i++)
            lista_mat.add(scanner.nextLine());
        x.setMateriale(lista_mat);
        return x;
    }

    public Scoala adaugareScoala() {
        Scanner scanner = new Scanner(System.in);
        Locatie loc = adaugareLocatie();
        System.out.println("Adauga numele scolii: ");
        String scoala_nume = scanner.nextLine();
        System.out.println("Adauga numarul de locuri disponibile ale scolii");
        int nr_loc = scanner.nextInt();
        System.out.println("Ce tip de admitere are scoala? (Examen / Dosar / Interviu)");
        String admitere = scanner.nextLine();
        System.out.println("Cate domenii are scoala? ");
        int nr_domenii = scanner.nextInt();
        Vector<Domeniu> lista_domeniu = new Vector<Domeniu>();
        System.out.println("Adauga domeniile care sunt: ");
        for (int i = 1; i <= nr_domenii; i++)
            lista_domeniu.add(adaugareDomeniu());
        System.out.println("De cate sali dispune scoala? ");
        int nr_sali = scanner.nextInt();
        Vector<Sala> ListaSali = new Vector<Sala>();
        System.out.println("Adauga salile din scoala respectiva: ");
        for (int i = 1; i <= nr_sali; i++)
            ListaSali.add(adaugareSala());
        System.out.println("Cate persoane fac parte din scoala? ");
        int nr_pers = scanner.nextInt();
        HashMap<String,Persoana> lista_pers = new HashMap<String,Persoana>();
        System.out.println("Adauga persoanele ce fac parte din scoala");
        for (int i = 1; i <= nr_pers; i++) {
            lista_pers.put(adaugarePersoana().getNume(), adaugarePersoana());
        }
        Scoala scoala = new Scoala(loc.getTara(), loc.getJudet(), loc.getLocalitate(), loc.getStrada(), loc.getNumar(), scoala_nume, nr_loc, lista_domeniu, admitere, lista_pers, ListaSali);
        return scoala;
    }

    public void afisareScoala(Scoala x) {
        System.out.println(x.toString());
    }

    public void stergereScoala(Vector<Scoala> x, int y) {
        x.remove(y);
    }

    public Scoala modificareScoala(Scoala x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica numele scolii: ");
        String scoala_nume = scanner.nextLine();
        x.setNumeScoala(scoala_nume);
        System.out.println("Modifica numarul de locuri disponibile ale scolii");
        int nr_loc = scanner.nextInt();
        x.setNrLocuri(nr_loc);
        System.out.println("Ce tip de admitere are scoala? (Examen / Dosar / Interviu)");
        String admitere = scanner.nextLine();
        x.setTipAdmitere(admitere);
        System.out.println("Cate domenii are scoala? ");
        int nr_domenii = scanner.nextInt();
        Vector<Domeniu> lista_domeniu = new Vector<Domeniu>();
        System.out.println("Modifica domeniile care sunt: ");
        for (int i = 1; i <= nr_domenii; i++)
            lista_domeniu.add(adaugareDomeniu());
        x.setListaDomenii(lista_domeniu);
        System.out.println("De cate sali dispune scoala? ");
        int nr_sali = scanner.nextInt();
        Vector<Sala> ListaSali = new Vector<Sala>();
        System.out.println("Modifica salile din scoala respectiva: ");
        for (int i = 1; i <= nr_sali; i++)
            ListaSali.add(adaugareSala());
        x.setListaSali(ListaSali);
        System.out.println("Cate persoane fac parte din scoala? ");
        int nr_pers = scanner.nextInt();
        HashMap<String,Persoana> lista_pers = new HashMap<String,Persoana>();
        for (int i = 1; i <= nr_pers; i++)
            lista_pers.put(adaugarePersoana().getNume(), adaugarePersoana());
        x.setListaPersoane(lista_pers);
        return x;
    }

    public Student adaugareStudent() {
        Scanner scanner = new Scanner(System.in);
        Persoana pers = adaugarePersoana();
        System.out.println("Adauga numarul matricol al studentului: ");
        String matricol = scanner.nextLine();
        System.out.println("Adauga in ce an se afla plesoana: ");
        int an = scanner.nextInt();
        System.out.printf("La cate discipline este inscris? ");
        int nr_disc = scanner.nextInt();
        Vector<Disciplina> lista_disc = new Vector<Disciplina>();
        System.out.println("Adauga disciplinele la care este inscris: ");
        for (int i = 1; i <= nr_disc; i++)
            lista_disc.add(adaugareDisciplina());
        Student stud = new Student(pers.getCnp(), pers.getNume(), pers.getPrenume(), pers.getVarsta(), matricol, an, lista_disc);
        return stud;
    }

    public void afisareStudent(Student x) {
        System.out.println(x.toString());
    }

    public  void stergereStudent(Vector<Student> x, int y) {
        x.remove(y);
    }

    public  Student modificareStudent(Student x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica numarul matricol al studentului: ");
        String matricol = scanner.nextLine();
        x.setNrMatricol(matricol);
        System.out.println("Modifica in ce an se afla plesoana: ");
        int an = scanner.nextInt();
        x.setAn(an);
        System.out.printf("La cate discipline este inscris? ");
        int nr_disc = scanner.nextInt();
        Vector<Disciplina> lista_disc = new Vector<Disciplina>();
        System.out.println("Modifica disciplinele la care este inscris: ");
        for (int i = 1; i <= nr_disc; i++)
            lista_disc.add(adaugareDisciplina());
        x.setListaDiscipline(lista_disc);
        return x;
    }

    public  void cautareScoala(Vector<Scoala> x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege tara dupa care vrei sa filtrezi cautarea: ");
        String tara = scanner.nextLine();
        String opt = scanner.nextLine();
        System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
        if (opt.equals("Da")) {
            System.out.println("Alege dupa ce vrei sa filtrezi cautarea: (Judet / Localitate / Strada)");
            String filtru1 = scanner.nextLine();
            switch (filtru1) {
                case "Judet": {
                    System.out.println("Alege dupa ce judet doresti sa filtrezi: ");
                    String judet = scanner.nextLine();
                    System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                    opt = scanner.nextLine();
                    if (opt.equals("Da")) {
                        System.out.println("Alege dupa ce vrei sa filtrezi cautarea: (Localitate / Strada)");
                        String filtru2 = scanner.nextLine();
                        switch (filtru2) {
                            case "Localitate": {
                                System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                String localitate = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce strada doresti sa filtrezi: ");
                                    String strada = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & judet.equals(it.getJudet()) & localitate.equals(it.getLocalitate()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            case "Strada": {
                                System.out.println("Alege dupa ce strada doresti sa filtrezi: ");
                                String strada = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                    String localitate = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & judet.equals(it.getJudet()) & strada.equals(it.getStrada()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            default:
                                System.out.println("Varianta aleasa este invalida te rog alege dintre Localitate sau Strada.");
                                break;
                        }
                    } else {
                        for (Scoala it : x) {
                            if (tara.equals(it.getTara()) & judet.equals(it.getJudet()))
                                afisareScoala(it);
                        }
                    }
                    break;
                }
                case "Localitate": {
                    System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                    String localitate = scanner.nextLine();
                    System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                    opt = scanner.nextLine();
                    if (opt.equals("Da")) {
                        System.out.println("Alege dupa ce vrei sa filtrezi cautarea: (Judet / Strada)");
                        String filtru2 = scanner.nextLine();
                        switch (filtru2) {
                            case "Judet": {
                                System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                String judet = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce strada doresti sa filtrezi: ");
                                    String strada = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getStrada()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            case "Strada": {
                                System.out.println("Alege dupa ce strada doresti sa filtrezi: ");
                                String strada = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce judet doresti sa filtrezi: ");
                                    String judet = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & localitate.equals(it.getLocalitate()) & strada.equals(it.getStrada()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            default:
                                System.out.println("Varianta aleasa este invalida te rog alege dintre Judet sau Strada.");
                                break;
                        }
                    } else {
                        for (Scoala it : x) {
                            if (tara.equals(it.getTara()) & localitate.equals(it.getLocalitate()))
                                afisareScoala(it);
                        }
                    }
                    break;
                }
                case "Strada": {
                    System.out.println("Alege dupa ce strada doresti sa filtrezi: ");
                    String strada = scanner.nextLine();
                    System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                    opt = scanner.nextLine();
                    if (opt.equals("Da")) {
                        System.out.println("Alege dupa ce vrei sa filtrezi cautarea: (Judet / Localitate)");
                        String filtru2 = scanner.nextLine();
                        switch (filtru2) {
                            case "Judet": {
                                System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                String judet = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                    String localitate = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            case "Localitate": {
                                System.out.println("Alege dupa ce localitate doresti sa filtrezi: ");
                                String localitate = scanner.nextLine();
                                System.out.printf("Doresti sa mai adaugi filtre cautarii? (Da/Nu)");
                                opt = scanner.nextLine();
                                if (opt.equals("Da")) {
                                    System.out.println("Alege dupa ce judet doresti sa filtrezi: ");
                                    String judet = scanner.nextLine();
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()) & judet.equals(it.getJudet()))
                                            afisareScoala(it);
                                    }
                                } else {
                                    for (Scoala it : x) {
                                        if (tara.equals(it.getTara()) & strada.equals(it.getStrada()) & localitate.equals(it.getLocalitate()))
                                            afisareScoala(it);
                                    }
                                }
                                break;
                            }
                            default:
                                System.out.println("Varianta aleasa este invalida te rog alege dintre Judet sau Localitate.");
                                break;
                        }
                    } else {
                        for (Scoala it : x) {
                            if (tara.equals(it.getTara()) & strada.equals(it.getStrada()))
                                afisareScoala(it);
                        }
                    }
                    break;
                }
                default:
                    System.out.println("Varianta aleasa este invalida te rog alege dintre Judet / Localitate / Strada.");
                    break;
            }
        } else {
            for (Scoala it : x) {
                if (tara.equals(it.getTara()))
                    afisareScoala(it);
            }
        }
    }

    public  void cautareSpecializare(Vector<Scoala> x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In cadrul a catei scoli doresti sa ii aflii domeniile disponibile: ");
        int nr_scoala = scanner.nextInt();
        int index = 1;
        for (Scoala it : x) {
            if (index == nr_scoala)
                System.out.println("Disciplinele scolii: " + it.getNumeScoala() + " sunt " + it.getListaDomenii());
        }
    }

    public  Float calculMedie(Disciplina x) {
        float medie, suma = 0;
        for (Float it : x.getNota()) {
            suma = suma + it;
        }
        medie = suma / x.getNota().size();
        return medie;
    }

    public  int calculNrCredite(Disciplina x) {
        int nr_credite;
        Float medie_materie = calculMedie(x);
        nr_credite = (int) (x.getNrCrediteMax() * medie_materie / 10);
        return nr_credite;
    }

    public Vector<Float> noteSortate(Disciplina x){
        Vector<Float> NoteSortate;
        NoteSortate=x.getNota();
        NoteSortate.sort(Collections.reverseOrder());
        return NoteSortate;
    }

    public void citireFisiere(Vector<Disciplina> a, Vector<Domeniu> b, Vector<Locatie> c, Vector<Persoana> d) {
        try {
            File fisierDisciplina = new File("src/Services/Date/ListaDiscipline.csv");
            Scanner scanner = new Scanner(fisierDisciplina);
            if (scanner.hasNextLine())
                scanner.nextLine();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Disciplina disc = new Disciplina();
                disc.setNumeDomeniu(arg_of_Data[0]);
                disc.setAniStudii(Integer.parseInt(arg_of_Data[1]));
                disc.setNumeMaterie(arg_of_Data[2]);
                disc.setNrCrediteMax(Integer.parseInt(arg_of_Data[3]));
                String[] totalitateNote = arg_of_Data[4].split(";");
                Vector<Float> note = new Vector<Float>();
                for (int i = 0; i < totalitateNote.length; i++)
                    note.add(Float.parseFloat(totalitateNote[i]));
                disc.setNota(note);
                a.add(disc);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSVul nu exista.");
            e.printStackTrace();
        }
        try {
            File fisierDomeniu = new File("src/Services/Date/ListaDomenii.csv");
            Scanner scanner = new Scanner(fisierDomeniu);
            if (scanner.hasNextLine())
                scanner.nextLine();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Domeniu dom = new Domeniu();
                dom.setNumeDomeniu(arg_of_Data[0]);
                dom.setAniStudii(Integer.parseInt(arg_of_Data[1]));
                b.add(dom);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSVul nu exista.");
            e.printStackTrace();
        }
        try {
            File fisierLocatie = new File("src/Services/Date/ListaDiscipline.csv");
            Scanner scanner = new Scanner(fisierLocatie);
            if (scanner.hasNextLine())
                scanner.nextLine();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Locatie loc = new Locatie();
                loc.setTara(arg_of_Data[0]);
                loc.setJudet(arg_of_Data[1]);
                loc.setLocalitate(arg_of_Data[2]);
                loc.setStrada(arg_of_Data[3]);
                loc.setNumar(arg_of_Data[4]);
                c.add(loc);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSVul nu exista.");
            e.printStackTrace();
        }
        try {
            File fisierPersoana = new File("src/Services/Date/ListaDiscipline.csv");
            Scanner scanner = new Scanner(fisierPersoana);
            if (scanner.hasNextLine())
                scanner.nextLine();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Persoana pers = new Persoana();
                pers.setCnp(arg_of_Data[0]);
                pers.setNume(arg_of_Data[1]);
                pers.setPrenume(arg_of_Data[2]);
                pers.setVarsta(Integer.parseInt(arg_of_Data[3]));
                d.add(pers);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSVul nu exista.");
            e.printStackTrace();
        }
    }

    public void creareAudit(String actiune, String timestamp) throws IOException{

        FileWriter writer = new FileWriter("src/Services/Date/Audit.csv", true);
        writer.write( "\n"+actiune+" realizata la data de: " + timestamp);
        writer.close();
    }

    public void scriereFisier(Vector<Disciplina> a, Vector<Domeniu> b, Vector<Locatie> c, Vector<Persoana> d) throws IOException {
        //Scriere pentru disciplina
        FileWriter afisajPentruDisciplina = new FileWriter("src/Services/Date/AfisajDiscipline.csv");
        afisajPentruDisciplina.write("Numele Domeniului,Numarul de ani de studii,Numele Materiei,Numarul de credite,Note\n");
        for(Disciplina it:a) {
            Vector<Float> aux = it.getNota();
            afisajPentruDisciplina.write(it.getNumeDomeniu()
                    + "," + it.getAniStudii()
                    + "," + it.getNumeMaterie()
                    + "," + it.getNrCrediteMax()
                    + ",");
            for (int i = 0; i < aux.size(); i++) {
                afisajPentruDisciplina.write(String.valueOf(aux.get(i)));
                if (i != aux.size() - 1)
                    afisajPentruDisciplina.write(";");
            }
            afisajPentruDisciplina.write("\n");
        }
        afisajPentruDisciplina.close();

        //Scriere pentru domeniu
        FileWriter afisajPentruDomeniu=new FileWriter("src/Services/Date/AfisajDomenii.csv");
        afisajPentruDomeniu.write("Numele Domeniului,Numarul de ani de studii\n");
        for(Domeniu it:b) {
            afisajPentruDomeniu.write(it.getNumeDomeniu()
                    + "," + it.getAniStudii()
                    + "\n");
        }
            afisajPentruDomeniu.close();

        //Scriere pentru locatie
        FileWriter afisajPentruLocatie = new FileWriter("src/Services/Date/AfisajLocatii.csv");
        afisajPentruLocatie.write("Tara,Judet,Localitate,Strada,Numar\n");
        for(Locatie it:c){
            afisajPentruLocatie.write( it.getTara()
                    + "," + it.getJudet()
                    + "," + it.getLocalitate()
                    + "," + it.getStrada()
                    + "," + it.getNumar()
                    + "\n");
        }
        afisajPentruLocatie.close();

        //Scriere pentru persoana
        FileWriter afisajPentruPersoana=new FileWriter("src/Services/Date/AfisajPersoane.csv");
        afisajPentruPersoana.write("CNP,Nume,Prenume,Varsta\n");
        for(Persoana it:d) {
            afisajPentruPersoana.write(it.getCnp()
                    + "," + it.getNume()
                    + "," + it.getPrenume()
                    + "," + it.getVarsta()
                    + "\n");
        }
        afisajPentruPersoana.close();
    }
}

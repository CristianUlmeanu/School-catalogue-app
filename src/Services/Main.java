package Services;

import Clasa_locatie.Locatie;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nr = 2;
        Vector<Locatie> lista_locatii = new Vector<Locatie>();
        for (int i=0;i<nr;i++)
            lista_locatii.add(Servicii.add_location());
        Iterator <Locatie> it=lista_locatii.iterator();
        while(it.hasNext())
          Servicii.Afisare_locatie(it.next());
        System.out.println("Ce locatie doresti sa stergi?");
        int sterg_loc=scanner.nextInt();
        Servicii.Stergere_locatie(lista_locatii,sterg_loc);
        System.out.println("\nDupa stergere:");
        for(Locatie i:lista_locatii)
            Servicii.Afisare_locatie(i);
        System.out.println("Ce locatie doresti sa modifici?");
        int modific_loc=scanner.nextInt();
        Servicii.Modificare_locatie(lista_locatii.get(modific_loc));
        System.out.println("\nDupa stergere:");
        for(Locatie i:lista_locatii)
            Servicii.Afisare_locatie(i);

    }


}

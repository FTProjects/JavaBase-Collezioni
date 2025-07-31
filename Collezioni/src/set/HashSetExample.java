package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        Creazione di un hash set
        Set<String> colori = new HashSet<>();

        colori.add("Rosso");
        colori.add("Verde");
        colori.add("Blu");
        colori.add("Rosso");

        System.out.println("Set di colori: " + colori);
        System.out.println("Dimensione: " + colori.size());

//        veridica presenza
        if (colori.contains("Verde")) {
            System.out.println("Nei colori è presente il verde!");
        }

//        rimozione
        boolean rimosso = colori.remove("Blu");
        System.out.println("Blu rimosso: " + rimosso);
        System.out.println("Set dopo rimozione: " + colori);

//        unione di insiemi
        Set<String> unione = new HashSet<>(colori);

        Set<String> altricolori = new HashSet<>();
        altricolori.add("Ocra");
        altricolori.add("Ciano");
        altricolori.add("Magenta");
        altricolori.add("Verde");

        unione.addAll(altricolori);
        System.out.println("unione di insiemi: " + unione);

        Set<String> intersezione = new HashSet<>(colori);
        intersezione.retainAll(altricolori);
        System.out.println("Intersezione: " + intersezione);

        Set<String> differenza = new HashSet<>(altricolori);
        differenza.retainAll(altricolori);
        System.out.println("Differenza: " + differenza);

        for (String colore : unione)
            System.out.println("- " + colore);
    }
}

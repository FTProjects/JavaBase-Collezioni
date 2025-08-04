package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//  LinkedHashSet ordine in base all'inserimento
public class LinkedHashSetExample {
    public static void main(String[] args) {
        System.out.println("Confronto tra HASHET e LINKEDHASHSET");

        // Hashset
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Primo");
        hashSet.add("Secondo");
        hashSet.add("Terzo");
        hashSet.add("Quarto");
        hashSet.add("Quinto");

        // Ordine casuale con hashset
        for (String elem : hashSet)
            System.out.println("- " + elem);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Primo");
        linkedHashSet.add("Secondo");
        linkedHashSet.add("Terzo");
        linkedHashSet.add("Quarto");
        linkedHashSet.add("Quinto");

        System.out.println("\n--------------------------------\n");

        // Mantiene Ordine Inserimento
        for (String elem : linkedHashSet)
            System.out.println("- " + elem);

        Set<String> pagineVisitate = new LinkedHashSet<>();
        visitaPagina(pagineVisitate, "Home");
        visitaPagina(pagineVisitate, "Prodotti");
        visitaPagina(pagineVisitate, "Contatti");
        visitaPagina(pagineVisitate, "Home");
        visitaPagina(pagineVisitate, "Chi Siamo");
        visitaPagina(pagineVisitate, "Prodotti");
        visitaPagina(pagineVisitate, "Home");

        System.out.println("\n--------------------------------\n");

        int numero = 1;
        for (String pagina : pagineVisitate)
            System.out.println(numero++ + " - " + pagina);
    }

    public static void visitaPagina(Set<String> cronologia, String pagina) {
        if (cronologia.add(pagina)) {
            System.out.println("Pagina aggiunta per la prima: " + pagina);
        } else {
            System.out.println("Già visitata: " + pagina);
        }
    }
}

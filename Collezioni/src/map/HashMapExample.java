package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> etaPersone = new HashMap<>();
//        inserisco coppie chiabe-valore
        etaPersone.put("Mario", 25);
        etaPersone.put("Anna", 30);
        etaPersone.put("Luigi", 28);
        etaPersone.put("Carla", 35);

        System.out.println(etaPersone);
        System.out.println(etaPersone.size());

//        inserimento duplicato e aggiornamento
        etaPersone.put("Carla", 40);
        System.out.println(etaPersone);

//        ricerca valore per chiave
        Integer etaMario = etaPersone.get("Mario");
        System.out.println("Età mario: " + etaMario);

//        controllo esistenza chiave
        if (etaPersone.containsKey("Anna"))
            System.out.println("Anna è presente nella mappa");

//        controllo esistenza valore
        if (etaPersone.containsValue(28))
            System.out.println("Qualcuno ha 28 anni");

//        aggiunge o aggiorna solo se non esiste
        etaPersone.putIfAbsent("Mario", 50);
        System.out.println("età Mario: " + etaPersone.get("Mario"));

//        rimuovo per chiave, mi ritorna il valore
        Integer eraRimossa = etaPersone.remove("Luigi");
        System.out.println("Età rimossa di Luigi: " + eraRimossa);

//        Iterazione sulle chiavi
        System.out.println("Iterazione sulle chiavi:");
        Set<String> chiavi = etaPersone.keySet();
        for (String nome : chiavi)
            System.out.println(nome + " -> " + etaPersone.get(nome));

//        Iteriamo sui valori
        System.out.println("Iterazione sui valori");
        for (Integer eta : etaPersone.values())
            System.out.println(" - " + eta + " anni");

//        Iterazione sulle Entry (coppia chiave-valore che ficchiamo nella mappa
        System.out.println("Iterazione sulle entry");
        for (Map.Entry<String, Integer> entry : etaPersone.entrySet())
            System.out.println(entry.getKey() + " ha " + entry.getValue() + " anni");


    }
}

package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

//        creazione list tramite array list
        List<String> frutti = new ArrayList<>();

//    aggiunta di elementi
        frutti.add("Mela");
        frutti.add("Pera");
        frutti.add("Arancia");
        frutti.add("Mela"); // duplicato permesso

        System.out.println("Lista iniziale: " + frutti);

//        Accediamo tramite indice
        System.out.println("Primo elemento: " + frutti.get(0));
        System.out.println("Ultimo elemento: " + frutti.get(frutti.size() - 1));

//        Inseriamo in posizione specifiche
        frutti.add(1, "kiwi");
        System.out.println("Dopo modifica: " + frutti);

//        modifica di un elemento
        String modificato = frutti.set(2, "Pesca");
        System.out.println("Ho modificato " + modificato + " per inserire " + frutti.get(2));

//        ricerca di elementi
        boolean presente = frutti.contains("Mela");
        System.out.println("Contiene mela: " + presente);
        int indice = frutti.indexOf("Mela");
        System.out.println("Indice della prima istanza di mela: " + indice);

//        rimozione di elementi
        frutti.remove("Arancia");
        frutti.remove(0);
        System.out.println("Dopo le rimozioni: " + frutti);

// iterazione
        System.out.println("Iterazione for tradizionale");
        for (int i = 0; i < frutti.size(); i++) {
            System.out.println(i + " " + frutti.get(i));
        }
        System.out.println("Iterazione enhanced for (for-each)");
        for (String frutto : frutti) {
            System.out.println("- " + frutto);
        }
    }
}

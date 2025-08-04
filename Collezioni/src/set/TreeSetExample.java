package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//        Tree Set con ordinamento naturale
public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> numeri = new TreeSet<>();
        numeri.add(50);
        numeri.add(20);
        numeri.add(80);
        numeri.add(10);
        numeri.add(30);
        System.out.println(numeri);

        Set<String> nomi = new TreeSet<>();
        nomi.add("Marco");
        nomi.add("Tarma");
        nomi.add("Eri");
        nomi.add("Fio");
        System.out.println(nomi);

//        test con comparatore personalizzato, che compara per lunghezza stringa
        Set<String> nomiPerLunghezza = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.compare(o1.length(), o2.length());
                if (result == 0)
                    return o1.compareTo(o2); // se la lunghezza p la stessa vado in ordine alfabetico
                return result;
            }
        });

        nomiPerLunghezza.add("Alessandro");
        nomiPerLunghezza.add("Bernardo");
        nomiPerLunghezza.add("Carla");
        nomiPerLunghezza.add("Marco");
        nomiPerLunghezza.add("Mario");
        System.out.println(nomiPerLunghezza);

    }
}

package map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
//        Tree map con ordinamento naturale
        Map<String, Double> voti = new TreeMap<>();
        voti.put("Matematica", 8.5);
        voti.put("Fisica", 7.0);
        voti.put("Chimica", 9.0);
        voti.put("Biologia", 8.0);
        voti.put("Informatica", 8.5);
        voti.put("Religione", 9.5);

        for (Map.Entry<String, Double> entry : voti.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

//        Ordinamento personalizzato, ordina in base al voto più basso al più alto
        Map<String, Double> votiPerVoto = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String v1, String v2) {
                Double voto1 = voti.get(v1);
                Double voto2 = voti.get(v2);

//                Ordino per voto decrescente
                int res = Double.compare(voto2, voto1);
                if (res == 0) return v1.compareTo(v2);
                return res;
            }
        });

        votiPerVoto.putAll(voti);

        System.out.println("\n***************************\n");

        for (Map.Entry<String, Double> entry : votiPerVoto.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

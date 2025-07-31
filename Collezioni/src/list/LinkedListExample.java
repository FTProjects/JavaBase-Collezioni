package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> numeri = new LinkedList<>();

        numeri.add(1);
        numeri.add(2);
        numeri.add(3);

        System.out.println("Lista: " + numeri);

//        accesso agli estremi efficiente
        System.out.println("Primo: " + numeri.getFirst());
        System.out.println("Ultimo: " + numeri.getLast());


//        rimozione dagli estremi efficiente
        Integer rimossoPrimo = numeri.removeFirst();
        Integer rimossoUltimo = numeri.removeLast();

        System.out.println("Primo: " + rimossoPrimo);
        System.out.println("Ultimo: " + rimossoUltimo);
        System.out.println("Lista dopo le rimozioni: " + numeri);

//        Array list - inserimento in testa, costoso
        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        long timeArray = System.nanoTime() - start;

//        Linked List - inserimento in testa, efficiente
        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.addFirst(i);
        }
        long timeLinked = System.nanoTime() - start;

        System.out.println("Array time: " + timeArray);
        System.out.println("List time: " + timeLinked);
        System.out.println("Linked è melgio di array di: " + timeArray/timeLinked);




    }
}

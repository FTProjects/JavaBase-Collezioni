package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Linked lista implementa queue
        Queue<String> coda = new LinkedList<>();
        coda.offer("Primo cliente");
        coda.offer("Secondo cliente");
        coda.offer("Terzo cliente");
        System.out.println(coda);
        System.out.println(coda.size());

//        ispezione senza rimozione
        String prossimo = coda.peek();
        System.out.println("Prossimo da servire: " + prossimo);
        System.out.println(coda);

//        rimozione o e ottenimento
        String servito = coda.poll();
        System.out.println("serviamo il cliente: " + servito);
        System.out.println(coda);

//        metodi di accesso che lanciano eccezioni
        try {
            String testa = coda.element();
            System.out.println("Testa: " + testa);

            String removed = coda.remove();
            System.out.println("Rimosso: " + removed);

            removed = coda.remove();
            System.out.println("Rimosso: " + removed);

            removed = coda.remove(); // eccezione perchè coda vuota
            System.out.println("Rimosso: " + removed);

        } catch (NoSuchElementException nseEx) {
            System.out.println("Errore: " + nseEx.getMessage());
        }

    }
}

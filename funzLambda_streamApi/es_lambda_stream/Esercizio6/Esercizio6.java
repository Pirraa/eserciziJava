package Esercizio6;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class Esercizio6 {
    public static void main(String[] args){
        List<Transazione> transazioni = Arrays.asList(
            new Transazione(LocalDate.of(2023, Month.NOVEMBER, 15), 100.0, "credito"),
            new Transazione(LocalDate.of(2023, Month.APRIL, 11), 200.0, "debito"),
            new Transazione(LocalDate.of(2023, Month.AUGUST, 9), 300.0, "credito"),
            new Transazione(LocalDate.of(2023, Month.OCTOBER, 2), 400.0, "debito"),
            new Transazione(LocalDate.of(2023, Month.NOVEMBER, 8), 500.0, "credito")
        );

        // Punto 1: filtrare le transazioni effettuate in un determinato mese dell'anno
        List<Transazione> transazioniNovembre = transazioni.stream().filter(t -> t.getData().getMonth() == Month.NOVEMBER).collect(Collectors.toList());
        System.out.println(transazioniNovembre);

        // Punto 2: Calcolare l'importo totale dei crediti e dei debiti separatamente
        double crediti = transazioni.stream().filter(t -> t.getTipo().equals("credito")).map(t -> t.getImporto()).reduce(0.0, (a,b) -> a+b);
        double debiti = transazioni.stream().filter(t -> t.getTipo().equals("debito")).map(t -> t.getImporto()).reduce(0.0, (a,b) -> a+b);
        System.out.println("Totale crediti: " + crediti);
        System.out.println("Totale debiti: " + debiti);

        // Punto 3: Trovare la transazione con l'importo più alto in valore assoluto (crediti e debiti)
        Optional<Transazione> maxCredito = transazioni.stream().filter(t -> t.getTipo().equals("credito")).max(Comparator.comparingDouble(t -> t.getImporto()));
        Optional<Transazione> maxDebito = transazioni.stream().filter(t -> t.getTipo().equals("debito")).max(Comparator.comparingDouble(t -> t.getImporto()));
        System.out.println("Transazione massima in credito: " + maxCredito.orElse(null));
        System.out.println("Transazione massima in debito: " + maxDebito.orElse(null));

        // Punto 4: Ordinare le transazioni i nbase alla data in ordine cronologico
        List<Transazione> transazioni_ordinate = transazioni.stream().sorted((t1,t2) -> t1.getData().compareTo(t2.getData())).collect(Collectors.toList());
        System.out.println(transazioni_ordinate);
    }
}

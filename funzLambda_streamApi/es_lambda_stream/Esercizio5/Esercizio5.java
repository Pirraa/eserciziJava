package Esercizio5;

import java.util.*;
import java.util.stream.Collectors;

public class Esercizio5 {
    public static void main(String[] args){
        List<Persona> persone = Arrays.asList(
            new Persona("Mario", "Rossi", 30, Arrays.asList("calcio", "lettura")),
            new Persona("Enrico", "Verdi", 13, Arrays.asList("basket")),
            new Persona("Luigi", "Bianchi", 18, Arrays.asList("calcio", "volley", "pugilato")),
            new Persona("Nico", "Neri", 24, Arrays.asList("lettura"))
        );

        Map<String, List<Persona>> personePerPassione = persone.stream()
            .filter(p -> p.getEta() >= 18)
            .sorted(Comparator.comparing(Persona::getEta))
            .collect(Collectors.groupingBy(p -> p.getPassioni().get(0)));
    
        personePerPassione.forEach((passione, personeConPassione) -> {
            System.out.println("Passione: "+passione);
            System.out.println("Numero persone: "+personeConPassione.size());
            personeConPassione.forEach(p -> System.out.println(p.toString()));
        });
    }
}

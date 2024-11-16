package Esercizio3;

import java.util.*;
import static java.util.Arrays.asList;

public class Esercizio3 {
    public static void main(String[] args){
        List<String> strings = asList("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit.");
        
        Optional<Integer> risultato = exercise_3(strings);
        System.out.println(risultato.orElse(0));
    }

    public static Optional<Integer> exercise_3(List<String> strings){
        return strings.stream().map(String::length).reduce(Math::max);
    }
}
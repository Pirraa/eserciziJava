package Esercizio2;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

public class Esercizio2 {
    public static void main(String[] args){
        List<Integer> numbers = asList(1, 2, 3, 4, 5);

        Set<Integer> risultato = exercise_2(numbers);
        System.out.println(risultato);
    }

    public static Set<Integer> exercise_2(List<Integer> numbers) {
        return numbers.stream().map(n -> n / 2).collect(Collectors.toSet());
    }
    
}

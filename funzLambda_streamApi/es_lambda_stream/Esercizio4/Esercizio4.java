package Esercizio4;

import java.util.*;
import java.util.stream.*;

public class Esercizio4 {
    public static void main(String[] args){
        IntStream numbers = new Random().ints().map(Math::abs);

        List<Integer> risultato = exercise_4(numbers);
        System.out.println(risultato);
    }

    public static List<Integer> exercise_4(IntStream numbers){
        return numbers.filter(n -> n % 17 == 0).limit(5).mapToObj(n -> n).collect(Collectors.toList());
    }
}
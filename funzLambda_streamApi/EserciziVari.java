//Listato 17.7 (b)
import java.util.stream.Collectors;
import java.util.*;

public class EserciziVari {
	
	public static void main(String ar[]) 
	{
		String array[] = {"Mela", "Pera", "Arancia", "Fragola", "Kiwi", "Arancia"};
		Arrays.stream(array).distinct().forEach(s->System.out.println(s));
		
		List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> primoPari = numeri.stream()
                                            .filter(n -> n % 2 == 0)
                                            .findFirst();
		int pari=numeri.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).size();
        primoPari.ifPresent(System.out::println);

		List<Spesa> spese = new ArrayList<Spesa>();
		spese.add(new Spesa(10.00, "vitto"));
		spese.add(new Spesa(15.50, "cinema"));
		spese.add(new Spesa(300.00, "alloggio"));
		spese.add(new Spesa(32.70, "vitto"));
		spese.add(new Spesa(52.10, "vitto"));
		Map<String, List<Spesa>> mappa =
		spese.stream().collect(Collectors.groupingBy(spesa ->spesa.getTipologia()));


		List<String> parole = Arrays.asList("luna", "stitch", "miguel", "speedy");
		List<String> maiuscole = parole.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		maiuscole.stream().forEach((String s) -> System.out.println(s));
	}
}

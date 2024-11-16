//Listato 17.7 (b)
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.*;

public class ContoDemo {
	
	public static void main(String ar[]) {
		//metodo tradizionale
		Conto tradizionale = new Conto();
		
		//attraverso un'espressione lambda
		Supplier<Conto> lambda = () -> new Conto();
		Conto daLambda = lambda.get();
		
		//attraverso il riferimento a metodi
		Supplier<Conto> riferimento = Conto::new;
		Conto daRiferimento = riferimento.get();
		
		//costruttore con parametri
		Function<Integer, Conto> conParametri = Conto::new; 
		Conto daConParametri = conParametri.apply(30);
		System.out.println("Saldo: " + daConParametri.getSaldo());

		// Test del metodo selezionaContiSaldoMaggioreDi
        List<Conto> conti = new ArrayList<Conto>();
        conti.add(new Conto(100));
        conti.add(new Conto(10));
        conti.add(new Conto(50));
        conti.add(new Conto(200));
        conti.add(new Conto(250));

        List<Conto> contiSaldoMaggiore50 = ContoDemo.selezionaContiSaldoMaggioreDi(conti, 50);
        System.out.println(contiSaldoMaggiore50);

		System.out.println(ContoDemo.verificaSaldoMaggioreDi(conti, 50));

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

	public static List<Conto> selezionaContiSaldoMaggioreDi(List<Conto> conti,int soglia)
	{
		return conti.stream().filter(conto -> conto.getSaldo() > soglia).collect(Collectors.toList());
	}

	public static boolean verificaSaldoMaggioreDi(List<Conto> conti,int soglia)
	{
		return conti.stream().allMatch(conto -> conto.getSaldo() > soglia);
	}


}

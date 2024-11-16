//Listato 17.2

interface NoParam {
	void stampa();
}

interface UnParam {
	void stampaNome(String nome);
	static void fotosintesiClorofilliana() {
		System.out.println("Sto facendo la fotosintesi clorofilliana");
	}
}

interface DueParam {
	void stampaSomma(int x, int y);
}

public class EspressionILambda {
	public static void main(String[] args) {
		NoParam id1 = () -> {System.out.println("Ciao!");};
		id1.stampa();
		
		UnParam id2 = (String nome) -> {System.out.println("Ciao " + nome + "!");};
		id2.stampaNome("Luna");
		
		DueParam id3 = (int x, int y) -> {System.out.println("Somma: " + (x + y));};
		id3.stampaSomma(2, 3);
	}
}

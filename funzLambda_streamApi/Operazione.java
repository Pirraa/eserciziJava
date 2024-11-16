//Listato 17.1

//è funzionale perché definisce 1 solo metodo astratto
@FunctionalInterface
interface Operazione {
	//metodo astratto
	public int calcola(int a, int b);
}

//NON è funzionale perchè definisce 2 metodi astratti
interface Operazioni {
	//metodo astratto	
	public int somma(int a, int b);
	
	//metodo astratto	
	public int moltiplica(int a, int b);

}

//è funzionale perchè definisce 1 solo metodo astratto
interface Animale {
	//metodo astratto
	void dormi();

	//Metodo di default 
	default void mangia() {
		System.out.println("Gnam gnam");
	}	
}

//è funzionale perchè definisce 1 solo metodo astratto
interface Pianta {
	//metodo astratto
	void cresci();

	//Metodo statico
	static void fotosintesiClorofilliana() {
		System.out.println("Sto facendo la fotosintesi clorofilliana");
	}
}

//è funzionale perchè definisce 1 solo metodo astratto
interface Fiore {
	//metodo astratto
	void cresci();

	//Metodo statico
	static void fotosintesiClorofilliana() {
		System.out.println("Sto facendo la fotosintesi clorofilliana");
	}

	//Metodo di default 
	default void fiorisci() {
		System.out.println("sto fiorendo");
	}	
}

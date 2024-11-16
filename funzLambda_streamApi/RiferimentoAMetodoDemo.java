//Listato 17.5

interface OperazioneMR {
	double calcola(double x, double y);
}

public class RiferimentoAMetodoDemo {

	public static void main(String[] args) {
		OperazioneMR opLambda = (a, b) -> Math.min(a,  b);
		OperazioneMR opMR = Math::min;
		
		double m1 = opLambda.calcola(2, 3);
		double m2 = opMR.calcola(2, 3);
		
		System.out.println("m1 con espressione lambda vale: " + m1);
		System.out.println("m2 con riferimento a metodo vale: " + m2);
	}
}

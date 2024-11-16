//Listato 17.6

interface MR_Statico {	
	double metodo(double a);
}

interface MR_TipoGenerico {
	int metodo(String s);
}


interface MR_OggettoSpecifico {
	int metodo();
}

interface MR_OggettoSpecifico2 {
	char metodo(int pos);
}

public class RiferimentoAMetodiDemo {

	public static void main(String[] args) {
		//MR_Statico p0 = x -> Math.sqrt(x); //con lambda
		MR_Statico p0 = Math::sqrt;
		double radice = p0.metodo(4);
		System.out.println("Radice quadrata di 4: "+ radice);
		
		//MR_TipoGenerico p1 = stringa -> stringa.length(); //con lambda
		MR_TipoGenerico p1 = String::length; 
		int lunghezza1 = p1.metodo("Stitch");
		System.out.println("'Stitch' ha lunghezza: " + lunghezza1);
		
		String stringa = "Luna";
		//MR_OggettoSpecifico p2 = () -> stringa.length(); //con lambda
		MR_OggettoSpecifico p2 = stringa::length;
		int lunghezza2 = p2.metodo();
		System.out.println("'Luna' ha lunghezza: " + lunghezza2);
		
		
		//MR_OggettoSpecifico2 p3 = (x) -> stringa.charAt(x); //con lambda
		MR_OggettoSpecifico2 p3 = stringa::charAt;
		char carattere = p3.metodo(1);
		System.out.println("Carattere alla posizone 1 di 'Luna': " + carattere);
	}
}

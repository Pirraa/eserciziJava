//Listato 17.4

import java.util.ArrayList;
import java.util.List;

interface CriterioSelezione {
	boolean isSelezionabile(Persona2 persona);
}

public class PersonaDemo {

	//Estrate dalla lista persone quelle che soddisfano il criterio specificato da criterio
	public static List<Persona2> estrai(List<Persona2> persone, CriterioSelezione criterio) {
		List<Persona2> estratti = new ArrayList<Persona2>();
		for (Persona2 persona : persone) {
			if(criterio.isSelezionabile(persona))
				estratti.add(persona);
		}
		return estratti;
	}
	
	
	public static void main(String[] args) {
		
		List<Persona2> persone = new ArrayList<Persona2>();
		persone.add(new Persona2(3, "Italia"));
		persone.add(new Persona2(18, "Spagna"));
		persone.add(new Persona2(25, "Italia"));
		persone.add(new Persona2(22, "Grecia"));
		persone.add(new Persona2(45, "Italia"));
		
		//Seleziona i maggiorenni usando le classi anonime
		List<Persona2> maggiorenni = estrai(persone, new CriterioSelezione() {
			public boolean isSelezionabile(Persona2 persona) {
				return persona.getAnni() > 17;
			}
		});
		System.out.println(maggiorenni);
		
		//Seleziona i maggiorenni usando le espressioni lambda
		List<Persona2> maggiorenniL = estrai(persone, persona -> persona.getAnni() > 17);
		System.out.println(maggiorenniL);
		
		//Seleziona i maggiorenni residenti in Italia usando le classi anonime
		List<Persona2> maggiorenniInItalia = estrai(persone, new CriterioSelezione() {
			public boolean isSelezionabile(Persona2 persona) {
				return persona.getAnni() > 17 && persona.getResidenza().equals("Italia");
			}
		});
		System.out.println(maggiorenniInItalia);

		//Seleziona i maggiorenni residenti in Italia usando le espressioni lambda
		List<Persona2> maggiorenniInItaliaL = 
				estrai(persone, persona -> persona.getAnni() > 17 && persona.getResidenza().equals("Italia"));
		System.out.println(maggiorenniInItaliaL);
	}
}

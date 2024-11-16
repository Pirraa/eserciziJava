//Listato 17.3

public class Persona2 {
	private int anni;
	private String residenza;

	public Persona2(int anni, String residenza) {
		super();
		setAnni(anni);
		setResidenza(residenza);
	}

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}

	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public String toString() {
		return "Persona [anni=" + anni + ", residenza=" + residenza + "]";
	}
}
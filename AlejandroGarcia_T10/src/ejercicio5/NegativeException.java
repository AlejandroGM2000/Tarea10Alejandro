package ejercicio5;

public class NegativeException extends Exception {

	private float number;
	private boolean esNegativo;
	
	public NegativeException(float i) {
		super();
		this.number=i;
	}
	
	//Sobreescribo el método message
	
	public String getMessage() {
		if (number<=0) {
			return("El numero "+number+" es igual o inferior a 0");
		}
		else if (number>=25) {
			return("El numero "+number+" es igual o superior a 25");
		}
		else {
			return("");
		}
	}
}

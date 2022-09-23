package ejercicio4;

public class NegativeException extends Exception {

	private float number;
	private boolean esNegativo;
	
	/*
	 * Excepción personalizada, que dirigida al control de rango de seleccion
	 */
	
	public NegativeException(float i) {
		super();
		this.number=i;
	}
	/*
	 * Se sobreescribe el metodo getMessage. Puede mostrar dos mensajes:
	 * Si el valor es igual o inferior a 0
	 * Si el valor es igual o superior a 9
	 */
	
	public String getMessage() {
		if (number<=0) {
			return("El numero "+number+" es igual o inferior a 0");
		}
		else if (number>=9) {
			return("El numero "+number+" es igual o superior a 9");
		}
		else {
			return("");
		}
	}
}

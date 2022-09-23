package ejercicio4;

public class PowException extends Exception{
	
	private float base;
	private float exp;
	/*
	 * Excepción dirigida hacia los posibles NaN generados por la función pow.
	 */
	
	public PowException(float base,float exp) {
		super();
		this.base=base;
		this.exp=exp;
	}
	public String getMessage() {
		return("La base "+base+" junto con el exponente "+exp+" no es valido");
	}
}

package ejercicio3;

//Excepción propia, hereda de la clase Exception

public class ParImparException extends Exception {
	
	//Definición de los atributos propios de la clase.
	
	private int residuo;
	private boolean par;
	
	/*
	 * Constructor de la excepción.
	 * Se realiza la operación mod, para conocer si el numero es par o impar 
	 * Si el residuo es 0, este será par. En caso contrario, será impar.
	 */
	
	public ParImparException(int numero) {
		//Inicializo constructor padre
		
		super();
		
		//Inicializo la variable
		residuo=numero%2;
		if (residuo==0) {
			par=true;
		}
		else {
			par=false;
		}
	}
	//Sobreescribo el método getMessage() para mostrar un mensaje personalizado
	
	public String getMessage() {
		String message="";
		if (par==true) {
			message="Es par";
		}
		else {
			message="Es impar";
		}
		return(message);	
	}
}

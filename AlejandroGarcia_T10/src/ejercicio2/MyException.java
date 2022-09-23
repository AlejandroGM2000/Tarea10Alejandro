package ejercicio2;

/*
 * Genero una excepción propia.
 * Hereda de la clase Java Exception
 */


public class MyException extends Exception {
	private int codigo;
	
	//Constructor de clase, clase hija de la clase Exception de Java
	public MyException(int codigo) {
		//Inicializo constructor padre
		super();
		//Inicializo la variable
		this.codigo=codigo;
	}
	//Sobreescribo el método getMessage() para mostrar un mensaje personalizado
	
	public String getMessage() {
		String message="";
		switch (codigo) {
			case 100:
				message="Excepcion "+String.valueOf(codigo)+" capturada con mensaje:Esto es un objeto Exception";
				break;
			case 101:
				message="Excepcion "+String.valueOf(codigo)+" capturada con mensaje:Esto es un objeto Exception";
				break;
			case 102:
				message="Excepcion "+String.valueOf(codigo)+" capturada con mensaje:Esto es un objeto Exception";
				break;
				
		}
		return(message);	
	}

}

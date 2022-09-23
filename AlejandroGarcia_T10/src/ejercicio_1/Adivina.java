package ejercicio_1;

public class Adivina {
	
	//Definición de constantes
	
	private static final int max=500;
	private static final int min=1;
	
	//Definición de atributos de clase
	
	private int numero;
	private boolean hallado;
	private int contador;
	
	/*
	 * Defino constructor. No recibe ningún parámetro.
	 * Se genera un numero pseudoaleatorio entre 1 y 500, ambos incluidos
	 * Se establece la variable booleana hallada a false, que indica si el
	 * jugador ha encontrado el numero. 
	 * Se establece el contador de intentos a 0.
	 */
	
	public Adivina() {
		this.numero = (int) (Math.random() * (max - min)) + min;
		hallado=false;
		contador=0;
	}
	
	/*
	 * Método que recibe un entero como parámetro y 
	 * lo compara con el numero generado por el programa
	 * En el caso de que el usuario no haya acertado, se le
	 * indicará si el numero es mayor o menor.
	 * Se actualiza el contador de intentos
	 */
	
	public void juego(int numero) {
		if(this.numero<numero) {
			System.out.println("El numero que buscas es menor al que has introducido");
			contador=contador+1;
		}
		else if(this.numero>numero) {
			System.out.println("El numero que buscas es mayor al que has introducido");
			contador=contador+1;
		}
		else {
			hallado=true;
			contador=contador+1;
			System.out.println("Acertaste en"+" "+contador+" intentos");
			System.out.println("El numero era:"+numero);
		}
	}
	
	//Getters
	
	public int getNumero() {
		return numero;
	}
	public boolean isHallado() {
		return hallado;
	}
	public int getContador() {
		return contador;
	}
	
	/*
	 * Método que permite actualizar el contador 
	 * de intentos. Pensado en el caso de que el
	 * usuario introduzca un caracter, decimal...
	 */
	
	public void actualizaContador() {
		contador=contador+1;
	}
	
}

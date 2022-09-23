package ejercicio4operacionesPotencia;

public class Raiz2 {

	private double numero;
	private double resultado;
	
	//Recibe un double como parámetro, al cual se le aplica sqrt
	//Se calcula la raiz cuadrada.
	
	public Raiz2 (double num) {
		numero=num;
		resultado=Math.sqrt(numero);
	}
	public double getResultado() {
		return resultado;
	}
}

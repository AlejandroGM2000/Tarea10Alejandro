package ejercicio4operacionesPotencia;

public class Raiz3 {
	private double numero;
	private double resultado;
	
	//Recibe un double como parámetro, al cual se le aplica sqrt
	//Se calcula la raiz cuadrada.
	
	public Raiz3 (double num) {
		numero=num;
		resultado=Math.cbrt(numero);
	}
	public double getResultado() {
		return resultado;
	}
}

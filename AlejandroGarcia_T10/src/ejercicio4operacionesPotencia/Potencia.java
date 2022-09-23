package ejercicio4operacionesPotencia;

public class Potencia {
	private float base;
	private float exponente;
	private float resultado;
	
	// Constructor que recibe dos float(base y exponente)
	//Gracias a pow, puede realizar la potencia.
	
	public Potencia (float mul1,float mul2) {
		this.base=mul1;
		this.exponente=mul2;
		this.resultado=(float) Math.pow(base, exponente);
	}
	public float getResultado() {
		return resultado;
	}
}

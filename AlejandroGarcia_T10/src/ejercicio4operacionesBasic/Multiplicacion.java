package ejercicio4operacionesBasic;

public class Multiplicacion {
	private float mul1;
	private float mul2;
	private float resultado;

//Constructor que recibe dos float como parámetro y realiza la multiplicacion.
	
	public Multiplicacion(float mul1,float mul2) {
		this.mul1=mul1;
		this.mul2=mul2;
		resultado=this.mul1*this.mul2;
	}
	public float getResultado() {
		return resultado;
	}
}

package ejercicio4operacionesBasic;

public class Suma {
	private float sum1;
	private float sum2;
	private float resultado;
	
	//Constructor que recibe dos float como parámetro y realiza la suma.
	
	public Suma(float sum1,float sum2) {
		this.sum1=sum1;
		this.sum2=sum2;
		resultado=this.sum1+this.sum2;
	}
	public double getResultado() {
		return resultado;
	}
}

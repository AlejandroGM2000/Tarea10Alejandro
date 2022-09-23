package ejercicio4operacionesBasic;

public class Resta {
	private float res1;
	private float res2;
	private float resultado;
	
	//Constructor que recibe dos float como parámetro y realiza la resta.
	
	public Resta(float res1,float res2) {
		this.res1=res1;
		this.res2=res2;
		resultado=this.res1-this.res2;
	}
	public float getResultado() {
		return resultado;
	}
}

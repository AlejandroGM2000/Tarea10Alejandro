package ejercicio4operacionesBasic;

public class Division {
	private float div1;
	private float div2;
	private float resultado;
	
	//Constructor que recibe dos float como parámetro y realiza la division.
	
	public Division(float div1,float div2) throws ArithmeticException {
		this.div1=div1;
		this.div2=div2;
		
		//Si el denominador es 0, se lanza una ArithmeticException
		if(div2==0) {
			throw new ArithmeticException();
		}
		else {
			resultado=this.div1/this.div2;
		}
	}
	public float getResultado() {
		return resultado;
	}
}

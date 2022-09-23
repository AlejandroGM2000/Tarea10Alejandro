package ejercicio4;

public class SqrtException extends Exception {

		private double number;
		private boolean esNegativo;
		
		/*
		 *Excepción dirigida a los Nan generados por la función sqrt. 
		 */
		
		public SqrtException(double i) {
			super();
			this.number=i;
		}
		public String getMessage() {
			return("El numero "+number+" es inferior a 0");
		}
}


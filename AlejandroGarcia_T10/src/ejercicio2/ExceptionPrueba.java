package ejercicio2;


public class ExceptionPrueba {

	public static void main(String[] args) {
		
		//Defino una tabla de enteros
		int[] numPrueba= {104,116,128};
		System.out.println("Bienvenido a prueba de la excepcion customizada");
		
		//Recorro la tabla anterior, y pruebo los tres códigos establecidos
		for (int i=0;i<numPrueba.length;i++) {
			try {
				if((numPrueba[i]>100)&&(numPrueba[i]<110)) {
					throw new MyException(100);
				}
				else if((numPrueba[i]>111)&&(numPrueba[i]<120)) {
					throw new MyException(101);
				}
				else if (numPrueba[i]>=120) {
					throw new MyException(102);
				}
					
			}
		//Muestro los mensajes personalizados
			catch(MyException e){
				System.out.println(e.getMessage());
			}
		}
	}

}

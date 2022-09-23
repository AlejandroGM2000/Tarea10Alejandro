package ejercicio3;

public class MainParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int max=999;
		int min=0;
		
		System.out.println("Bienvendo al programa");
		System.out.println("\nGenerando numero aleatorio...");
		
		try {
			//Se genera un numero pseudoaleatorio entre 0 y 999, ambos incluidos
			
			numero = (int) (Math.random() * (max - min)) + min;
			System.out.println("\nEl numero aleatorio generado es: "+numero);
			//Se lanza la excepción personalizada
			throw new ParImparException(numero);
			
		}
		catch(ParImparException e) {
			//Se muestra por pantalla si el numero es par o impar
			System.out.println(e.getMessage());
		}
	}

}

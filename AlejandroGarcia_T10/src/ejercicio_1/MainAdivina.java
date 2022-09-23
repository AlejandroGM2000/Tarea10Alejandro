package ejercicio_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAdivina {

	public static void main(String[] args) {
		
		
		//Genero un objeto tipo adivina
		System.out.println("Generando numero");
		Adivina ad=new Adivina();
		System.out.println(ad.getNumero());
		System.out.println("\nBienvenido al juego");
		
		
		/*
		 * Mientras la variable booleana hallado (que controla si el jugador
		 * ha acertado) sea diferente de true, se le pide al usuario un 
		 * numero entero. Este se le pasa como parámetro al método juego, que le
		 * indica al usuario si ha acertado o bien el numero es más pequeño o grande. También se
		 * actualiza el contador. 
		 * 
		 * Se controla que el usuario introduzca por pantalla únicamente enteros
		 */
		
		while (ad.isHallado()!=true) {
			try {
				System.out.println("\n Introduzca un numero");
				Scanner sc = new Scanner(System.in);
				int n=sc.nextInt();
				ad.juego(n);
			}
			catch(InputMismatchException e){
				System.out.println("\n Debe introducir un numero entero");
				
				//Se suma +1 al contador
				ad.actualizaContador();
			}
		}
	      
	}

}

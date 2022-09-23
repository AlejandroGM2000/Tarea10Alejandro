package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio5.NegativeException;

public class MainPassword {

	public static void main(String[] args) {
		
		
		//Inicializo la variable booleana fin
		//Genero las tablas de passwords y booleanos correspondientes a esFuerte.
		boolean fin=false;
		Password [] pass= {};
		boolean [] fuerte={};
		
		/*
		 * Mientras no introduzca un valor entere entre 1 y 24
		 * se le pide al usuario que introduzca un numero. 
		 * En caso de introducir un valor no numérico o decimal,
		 * se le indica que debe ser entero(InputMismatchExcetion). Y
		 * si introduce un valor fuera de rango se lanza una negativeException
		 * con su correspondiente mensaje. 
		 */
		while(fin!=true) {
			
			try {
				System.out.println("Introduzca numero passwords:");
				Scanner scn1 = new Scanner(System.in);
				int n1=scn1.nextInt();
				
				if((n1<=0)||(n1>=25)) {
					throw new NegativeException(n1);
				}
				pass=new Password[n1];
				fuerte=new boolean[n1];
				fin=true;
				
			}
			catch(InputMismatchException e){
				System.out.println("\nDebe introducir un numero entero");
			}
			catch(NegativeException en) {
				System.out.println(en.getMessage());
			}
		}
		fin=false;
		
		
		/*
		 * Bucle encargado de leer las longitudes de las contraseñas 
		 * por pantalla. Se controla que el numero introducido sea numerico y
		 * no decimal InputMismatchExCeption. También que los valores introducidos 
		 * esten comprendidos entre 1 y 24(NegativeException)
		 */
		
		while(fin!=true) {
			try {
				System.out.println("Introduzca longitud de password");
				
				for(int i=0;i<pass.length;i++) {
					System.out.println("\nSiguiente longitud:");
					Scanner scn = new Scanner(System.in);
					int n=scn.nextInt();
					if((n<=0)||(n>=25)) {
						throw new NegativeException(n);
					}
					pass[i]=new Password(n);
					fuerte[i]=pass[i].esFuerte();
				}
				fin=true;
			}
			catch(InputMismatchException e){
				System.out.println("\nDebe introducir numeros enteros");
			}
			catch(NegativeException en2) {
				System.out.println(en2.getMessage());
			}
		}
		
		for (int i=0;i<pass.length;i++) {
			System.out.println(pass[i].getContrasena()+"_"+fuerte[i]);
		}
				
	}

}

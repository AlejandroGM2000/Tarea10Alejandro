package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio4operacionesBasic.Division;
import ejercicio4operacionesBasic.Multiplicacion;
import ejercicio4operacionesBasic.Resta;
import ejercicio4operacionesBasic.Suma;
import ejercicio4operacionesPotencia.Potencia;
import ejercicio4operacionesPotencia.Raiz2;
import ejercicio4operacionesPotencia.Raiz3;

public class Calculadora {

	/*
	 * Método static encargado de realizar lectura de tipo float.
	 * Retorna el float leído por pantalla
	 */
	
	static float lecturaFloat() {
		System.out.println("\nIntroduzca un numero:");
		Scanner scn1 = new Scanner(System.in);
		float s1=scn1.nextFloat();
		return(s1);
	}
	
	/*
	 * Método static encargado de realizar lectura de tipo double.
	 * Retorna el double leído por pantalla
	 */
	
	static double lecturaDouble() {
		System.out.println("\nIntroduzca un numero:");
		Scanner scn1 = new Scanner(System.in);
		double s1=scn1.nextDouble();
		return(s1);
	}
	/*
	 * Método static encargado de mostrar el menú de opciones.
	 */
	
	static void menu() {
		System.out.println("\n1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicacion");
		System.out.println("4-Potencia");
		System.out.println("5-Raiz cuadrada");
		System.out.println("6-Raiz Cubica");
		System.out.println("7-Division");
		System.out.println("8-Salir");
		System.out.println("Selecciona una opcion del menu:");
	}
	/*
	 * Método static encargado de lanzar una excepción personalizada,
	 * en el caso de que la base de la potencia sea igual o inferior a 0 y 
	 * el exponente sea decimal. Ya que el metodo pow, genera un resultado Nan al 
	 * producirse dicha combinación.
	 */
	static void compruebaPotencia(float base,float exp ) throws PowException {
		boolean nan=false;
		if((base<=0)&&((exp%1)!=0)){
			throw new PowException(base,exp);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		boolean fin=false;
		int n=0;
		
		/* Mientras el usuario no introduzca la opción 8 del menu (fin=true)
		 * el programa seguirá corriendo. 
		*/
		
		while (fin!=true) {	
		try {
			
				menu();  								//Se muestra el menu por pantalla
				Scanner scn = new Scanner(System.in); 	//Se realiza la lectura del valor entero de selección
				n=scn.nextInt();
				if((n<=0)||(n>=9)) {
					//En el caso de introducir  valores fuera de rango, se lanza una excepción.
					throw new NegativeException(n);     
				}
			}
			catch(InputMismatchException e){
				//Coge la excepción si el valor es no numerico o decimal
				System.out.println("\nDebe introducir un numero entero"); 
				n=0;
			}
			catch(NegativeException en) {
				 //Coge la excepción si se obtiene un valor fuera de rango de menu
				System.out.println(en.getMessage()); 
				//Se dispone la selección de opciones, para evitar posibles errores
				n=0; 								
			}
				
			switch(n) {
				case 1:
					try {
						System.out.println("Introduzca los valores de la operacion");
						float s1=lecturaFloat(); 	//Lectura sumandos
						float s2=lecturaFloat();
						Suma sum=new Suma(s1,s2);	//Se realiza la suma
						System.out.println("\nResultado: "+sum.getResultado());
					}

					catch(InputMismatchException e) {
						
						//Coge la excepción si el valor es no numerico o decimal
						
						System.out.println("\nValor no valido.Debe introducir un numero\n\n");
					}
					
					break;
				
				case 2:
					try {
						System.out.println("Introduzca los valores de la operacion");
						float s3=lecturaFloat(); //Lectura de valores
						float s4=lecturaFloat();
						Resta rest=new Resta(s3,s4); //Se realiza la resta
						System.out.println("\nResultado: "+rest.getResultado());
					}
					catch(InputMismatchException e) {
						//Coge la excepción si el valor es no numerico o decimal
						
						System.out.println("\nValor no valido.Debe introducir un numero\n\n");
					}
					
					break;
				
				case 3:
						try {
							System.out.println("Introduzca los valores de la operacion");
							float s5=lecturaFloat(); //Lectura valores
							float s6=lecturaFloat();
							Multiplicacion mult=new Multiplicacion(s5,s6); //Multiplicacion
							System.out.println("\nResultado: "+mult.getResultado());
						}
						catch(InputMismatchException e) {
							//Coge la excepción si el valor es no numerico o decimal
							System.out.println("\nValor no valido.Debe introducir un numero\n\n");
						}
						
						break;
					  
				case 4:
					System.out.println("\n\nIntroduzca dos cifras para realizar la potencia");
						try {
						
							System.out.println("\nBase");	 //Lectura base y exponente
							float s7=lecturaFloat();
							System.out.println("\nExponente");
							float s8=lecturaFloat();
						
							Potencia pot=new Potencia(s7,s8);	 //Se realiza la potencia
							compruebaPotencia(s7,s8); 			//Si los valores introducidos generan Nan, se lanza excepción.
							System.out.println("\nResultado: "+pot.getResultado());
							}
						catch(InputMismatchException e) {
							
							//Coge la excepción si el valor es no numerico o decimal
							System.out.println("\nValor no valido.Debe introducir un numero\n\n");
						}
						catch(PowException de) {
							
							//Base de la potencia sea igual o inferior a 0 y el exponente sea decimal
							System.out.println(de.getMessage());
						}
						
						break;
				
				case 5:
					System.out.println("\n\nIntroduzca una cifra para realizar la raiz cuadrada:");
						try {
						
							double s9=lecturaDouble();  //Lectura valor
						
							if (s9<0) {
								throw new SqrtException(s9); //Lanza excepción si el valor es negativo
							}
						
							Raiz2 sqr=new Raiz2(s9);  //Raiz cuadrada
							
							System.out.println("\nResultado: "+sqr.getResultado());
							}
						catch(InputMismatchException e) {
							
							//Coge la excepción si el valor es no numerico o decimal
							System.out.println("\nValor no valido.Debe introducir un numero\n\n");
						}
						catch(SqrtException sq) {
							
							//Valores negativos
							System.out.println(sq.getMessage());
						}
						
					break;	
					
				case 6:
					System.out.println("\n\nIntroduzca una cifra para realizar la raiz cubica:");
						try {
						
							double s10=lecturaDouble(); //Lectura del valor
						
							Raiz3 cubic=new Raiz3(s10); //Raiz cúbica
						
							System.out.println("\nResultado: "+cubic.getResultado());
						}
						catch(InputMismatchException e) {
							
							//Coge la excepción si el valor es no numerico o decimal
							System.out.println("\nValor no valido.Debe introducir un numero\n\n");
						}
						
					break;	
						
					
				case 7:
					System.out.println("\n\nIntroduzca dos cifras para realizar la division");
						try {
						
							System.out.println("\nNumerador"); //Lectura valores
							float s11=lecturaFloat();
						
							System.out.println("\nDenominador");
							float s12=lecturaFloat();
							
							Division div=new Division(s11,s12); //Division. Si el denominador es 0, genera ArithmeticException
							System.out.println("\nResultado: "+div.getResultado());
							}
						catch(InputMismatchException e) {
							
							//Coge la excepción si el valor es no numerico o decimal
							System.out.println("\nValor no valido.Debe introducir un numero\n");
						}
						catch(ArithmeticException are2) {
							
							//Coge la excepción si el denominador es 0.
							System.out.println("\nValor no valido.El denominador debe ser diferente de 0\n\n");
						}
						
					break;
				case 8:
					fin=true;
					System.out.println("\nHasta la proxima");
					break;
				}
			}
	}
}



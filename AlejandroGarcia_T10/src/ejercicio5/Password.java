package ejercicio5;

public class Password {
	private int longitud;
	private String contrasena;
	
	//Constructor por defecto, con longitud de contraseña 8.
	
	public Password() {
		longitud=8;
		contrasena="";
	}
	/*
	 * Constructor que dado el atributo longitud como parametro genera una contraseña aleatoria
	 * de dicha longitud. Caracteres alfanuméricos. 
	 */

	public Password(int longitud) {
		this.longitud=longitud;
		
		//Defino los caracteres disponibles para generar la contraseña
		
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper=lower.toUpperCase();
		String numeric="012345678987654321";
		String cadena_alfanumerica=lower+upper+ numeric; 
		
		//Inicializo el objeto StringBuilder con la longitud proporcionada
		
        StringBuilder const_password; 		
        const_password = new StringBuilder(longitud); 

        for (int r = 0; r < longitud; r++) { 
        	
        	// Selecciona de forma pseudoaleatoria una posicion de la cadena
        	
            int control = (int)(cadena_alfanumerica.length()* Math.random()); 

            // Añade los caracteres alfanuméricos
            
            const_password.append(cadena_alfanumerica.charAt(control)); 
        } 

        contrasena=const_password.toString();
	}
	
	//Genero los correspondientes getters de la clase
	
	public int getLongitud() {
		return longitud;
	}
	public String getContrasena() {
		return contrasena;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void generarPassword() {
		//Defino los caracteres disponibles para generar la contraseña
		
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper=lower.toUpperCase();
		String numeric="0123456789";
		String cadena_alfanumerica=lower+upper+numeric; 
		
		//Inicializo el objeto StringBuilder con la longitud proporcionada
		
        StringBuilder const_password; 		
        const_password = new StringBuilder(this.longitud); 

        for (int r = 0; r < this.longitud; r++) { 
        	
        	// Selecciona de forma pseudoaleatoria una posicion de la cadena
        	
            int control = (int)(cadena_alfanumerica.length()* Math.random()); 

            // Añade los caracteres alfanuméricos
            
            const_password.append(cadena_alfanumerica.charAt(control)); 
        } 

        contrasena=const_password.toString();
	}
	
	public boolean esFuerte() {
		char [] ct;
		int contUp=0;
		int contDn=0;
		int contN=0;
		if(contrasena!="") {
			//Convierto el String a un array de char
			ct=contrasena.toCharArray();
			
			//Recorro el char array, comprobando el numero de mayusculas, numeros y minusculas
			for(int i=0;i<ct.length;i++) {
				
				if(Character.isUpperCase(ct[i])) {
					contUp=contUp+1;
				}
				if(Character.isLowerCase(ct[i])) {
					contDn=contDn+1;
				}
				if(Character.isDigit(ct[i])) {
					contN=contN+1;
				}
				
			}
		}
		else {
			return(false);			
		}
		//Compruebo que los contadores cumplan las restricciones de contraseña fuerte.
		if((contUp>2)&&(contDn>1)&&(contN>5)) {
			return(true);
		}
		else {
			return(false);
		}
	}
	
	
}


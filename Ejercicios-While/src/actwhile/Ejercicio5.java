package actwhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Creamos las variables
		int numero = 0, incremento=0, suma=0, media, ceros=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);

		//Mientras el incremento sea distinto a 10, haz lo siguiente: 
		while(incremento!=10) {
			
			//Lo primero, incrementa incremento en 1
			incremento++;
			
			//Le pedimos al usuario que introduzca el siguiente número y declaramos la variable numero
			System.out.println("Introduce el número: ");
			numero=read.nextInt();
			
			//Si numero es igual a 0, incrementa la variable ceros en 1 
			if(numero==0) {
				ceros++;
			}
			
			//Suma es igual a la suma de todos los números introducidos
			suma+=numero;
		}

		//media es igual al resultado de la división de suma entre incremento
		media=suma/incremento;
		
		//Muestra por pantalla la suma y la media de todos los datos introducidos. Y la cantidad de ceros introducidos.
		System.out.println("La suma de su total de números introducidos es de: "+suma);
		System.out.println("La media de la suma de su total de números es de: "+media);
		System.out.println("Usted ha introducido: "+ceros+" ceros");
	}

}

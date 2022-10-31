package actwhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creamos las variables
		int numero;
		String par, impar;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: ");
		
		//Declaramos la variable numero. Guardará el dato introducido por el usuario
		numero = read.nextInt();
		
		//Mientras que numero sea distinto a 0, ejecuta lo siguiente
		while(numero!=0) {
			
			//Si el resto de la división de la variable numero entre 2 es igual a 0 
			if(numero%2==0) {
				
			//Imprime que el número introducido es par
			System.out.println(par="par");
			}
			
			//Si no
			else {
				
				//Es impar
				System.out.println(impar="impar");
			}
			
			//Le volvemos a pedir otro número al usuario y declaramos la variable numero 
			System.out.println("Introduce otro número: ");
			numero=read.nextInt(); //En caso de que el número introducido sea igual a 0, finaliza el bucle
		}
		
		//Cerramos el Scanner
		read.close();

	}

}

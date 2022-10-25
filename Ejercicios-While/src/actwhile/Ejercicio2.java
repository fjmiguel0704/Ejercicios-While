package actwhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos las variables. 
		int numero, contador=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que ingrese una cantidad de números
		System.out.println("Introduce una serie de números. Cuando desee cortar la cadena, introduce un número negativo: ");
		
		//Declaramos la variable numero. Guardará el valor introducido por el usuario
		numero = read.nextInt();
		
		//Mientras que el número introducido sea mayor o igual a 0
		while (numero>=0) {
			
			//Incrementa el valor de contador en 1
			contador++;
			
			//Y le volvemos a pedir al usuario otro número
			System.out.println("Introduce el siguiente número: ");
			
			//Declaramos numero de nuevo
			numero=read.nextInt(); //En caso de ser mayor o igual a 0 se repitirá el bucle. Así sucesivamente hasta recibir un número inferior a 0
		}
		
		//Mostramos el valor de contador al finalizar el bucle
		System.out.println("La cantidad de número introducidos son: "+contador);
		
		//Cerramos el Scanner
		read.close();
	}

}

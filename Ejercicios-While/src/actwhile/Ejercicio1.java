package actwhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Creamos la variable suma y numero
		int suma = 0, numero=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número positivo siempre que quiera seguir sumando
		System.out.println("Introduce números positivos hasta donde quieras sumar. Cuando no desee sumar más números, introduce un número inferior a 0 (-número): ");
		
		//Declaramos la variable numero. Guardará el valor introducido por el usuario, el cual le solicitamos previamente
		numero=read.nextInt();
		
		//Mientras que el número introducido sea mayor o igual a 0
		while (numero>=0) {
			
			//La variable suma guardará la suma de todos esos números introducidos por el usuario
			suma+=numero;
			
			//Le pedimos al usuario que vuelva a introducir un número que desee sumar al anterior
			System.out.println("Introduce un número a sumar al anterior: ");
			
			//La variable numero guardará el siguiente número introducido por el usuario
			numero=read.nextInt(); 
		}
		
		//Mostramos la suma de todos los números que ingresó el usuario una vez haya terminado el bucle
		System.out.println("La suma de sus números introducidos es: "+suma);
		
		//Cerramos el Scanner
		read.close();

	}

}

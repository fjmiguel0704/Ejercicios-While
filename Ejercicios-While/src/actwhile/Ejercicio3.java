package actwhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
				//Creamos las variables. 
				int numero, suma=0, contador=0, media = 0;
				
				//Creamos el Scanner para leer por teclado
				Scanner read = new Scanner (System.in);
				
				//Le pedimos al usuario que ingrese una cantidad de números
				System.out.println("Introduce todos los números positivos de los que quieras hacer la media. Cuando no desee introducir más números, introduce un número negativo: ");
				
				//Declaramos la variable numero. Guardará el valor introducido por el usuario
				numero = read.nextInt();
				
				//Mientras que el número introducido sea mayor o igual a 0
				while (numero>=0) {
					
					//La variable suma guardará la suma de todos esos números positivos introducidos por el usuario
					suma+=numero;
					
					//La variable contador incrementará su valor en 1
					contador++;
					
					//Le pedimos al usuario que introduzca otro número
					System.out.println("Introduce el siguiente número: ");
					
					//Declaramos numero de nuevo
					numero=read.nextInt(); //En caso de este ser mayor o igual a 0 se repitirá el bucle. Así sucesivamente hasta recibir un número negativo
				}
				
				//Una vez finalizado el bucle, declaramos la variable media. Guardará el resultado de dividir la suma de todos los números introducidos por el usuario (suma) entre la cantidad de numeros introducidos (cantidad)
				media=suma/contador;
				
				//Mostramos el valor de la variable media
				System.out.println(media);
				
				//Cerramos el Scanner
				read.close();
	}

}

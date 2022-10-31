package actwhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Creamos las variables
		int numAleatorio, numUsuario;
		
		//Generamos un número aleatorio comprendido entre 1 y 100 que guardará la variable numAleatorio
		numAleatorio= (int)(Math.random()*100+1);
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le mostramos al usuario los parámetros y reglas del juego y declaramos la variable numUsuario. Guardará el dato introducido por el usuario.
		System.out.println("Intenta adivinar el número oculto. Ten en cuenta que se encuentra comprendido entre 1 y 100 \n ¡Ve probando y SUERTE! \n (Si desea rendirse, introduce -1) \n Introduce:");
		numUsuario=read.nextInt();
		
		//Mientras el numUsuario sea distinto al numAleatorio
		while(numUsuario!=numAleatorio) {
			
			//Si el numUsuario es mayor a 100 o menor que 1, muestra un error
			if(numUsuario>100||numUsuario<1) {
				System.out.println("¡ERROR! El número secreto se encuentra entre 1 y 100");
				
			//En caso contrario, si el numUsuario es menor al numAleatorio, muestra que el número introducido es menor que el número aleatorio 
			}else if(numUsuario<numAleatorio) {
				System.out.println("El número "+numUsuario+ " es menor al que se intenta adivinar");
			} 
			
			//En caso contrario, muestra que el número introducido es mayor que el número aleatorio 
			else {
				System.out.println("El número "+numUsuario+ " es mayor al que se intenta adivinar");
			}
			
			//Le pedimos al usuario que siga introduciendo números hasta acertar y declaramos la variable numUsuario de nuevo
			System.out.println("Sigue probando: ");
			numUsuario=read.nextInt();
		}
			
			//Cuando finalice el bucle, si ha acertado el número, muestra un mensaje
			System.out.println("¡Enhorabuena! Has acertado el número oculto");
			
//			if(numUsuario==-1) {
//			System.out.println("¡Ups! Parece que se ha rendido sin lograr acertar el número.¡Suerte en la próxima!");
//			numUsuario=numAleatorio;
		}

	}

//}

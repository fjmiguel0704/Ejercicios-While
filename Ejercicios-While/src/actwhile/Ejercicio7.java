package actwhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numAleatorio, numUsuario;
		
		numAleatorio= (int)(Math.random()*100+1);
		
		Scanner read = new Scanner (System.in);
		System.out.println("Intenta adivinar el número oculto. Ten en cuenta que se encuentra comprendido entre 1 y 100 \n ¡Ve probando y SUERTE! \n (Si desea rendirse, introduce -1) \n Introduce:");
		numUsuario=read.nextInt();
		
		
		
		while(numUsuario!=numAleatorio) {
			if(numUsuario>100||numUsuario<-1) {
				System.out.println("¡ERROR! El número secreto se encuentra entre 1 y 100");
			}else if(numUsuario<numAleatorio) {
				System.out.println("El número "+numUsuario+ " es menor al que se intenta adivinar");
			}  
			else {
				System.out.println("El número "+numUsuario+ " es mayor al que se intenta adivinar");
			}
			
			System.out.println("Sigue probando: ");
			numUsuario=read.nextInt();
		}

			System.out.println("¡Enhorabuena! Has acertado el número oculto");
			
			if(numUsuario==-1) {
			System.out.println("¡Ups! Parece que se ha rendido sin lograr acertar el número.¡Suerte en la próxima!");
			numUsuario=numAleatorio;
		}

	}

}

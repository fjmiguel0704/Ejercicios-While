package actwhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Creamos las variables
		double altArbol, altMayor=0;
		int incremento=0, idenArbol = 0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca las alturas de los arboles en centímetros y declaramos la variable altArbol
		System.out.println("Introduce la altura en centímetros de cada árbol. (Cúando no desee introducir mas alturas, ingrese (-1)): ");
		altArbol=read.nextDouble();
		
		//Mientras la altArbol sea mayor a 0
		while(altArbol>0) {
			
			//Incrementa incremento en 1
			incremento++;
			
			//Y si, la altArbol es mayor a altMayor
			if (altArbol>altMayor) {
				
				//La altMayor va a ser igual a la altArbol y el idenArbol va a ser igual al incremento
				altMayor=altArbol;
				idenArbol=incremento;
			}
			
			//Le pedimos al usuario que siga introduciendo alturas y volvemos a declarar la variable altArbol
			System.out.println("Continúa introduciendo las siguientes alturas: ");
			altArbol=read.nextDouble();
			
		}

		//Una vez finalizado el bucle, si la altMayor es mayor a altArbol, muestra que árbol es el mas alto y cuanto mide.
		if(altMayor>altArbol) {
			System.out.println("El árbol " + idenArbol + " es el mas alto, midiendo: " + altMayor +" cm");
		}

	}

}

package actwhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero = 0, incremento=0, suma=0, media, ceros=0;
		
		Scanner read = new Scanner (System.in);

		while(incremento!=10) {
			incremento++;
			System.out.println("Introduce el siguiente número: ");
			numero=read.nextInt();
			if(numero==0) {
				ceros++;
			}
			suma+=numero;
		}

		
		media=suma/incremento;
		
		System.out.println("La suma de su total de números introducidos es de: "+suma);
		System.out.println("La media de la suma de su total de números es de: "+media);
		System.out.println("Usted ha introducido: "+ceros+" ceros");
	}

}

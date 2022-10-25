package actwhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero;
		String par, impar;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		numero = read.nextInt();
		
		while(numero!=0) {
			if(numero%2==0) {
			System.out.println(par="par");
			}
			else {
				System.out.println(impar="impar");
			}
			System.out.println("Introduce otro número: ");
			numero=read.nextInt();
		}
		
		//Cerramos el Scanner
		read.close();

	}

}

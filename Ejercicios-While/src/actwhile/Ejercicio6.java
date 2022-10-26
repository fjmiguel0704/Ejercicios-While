package actwhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int edad, suma=0, contadorAlumnos=0, media, mayorEdad=0;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce las edades de los alumnos. Cuando no existan mas alumnos de los introducidos, introduce una edad inferior a 1(Ej: 0,-1): ");
		edad=read.nextInt();
		
		while(edad>0) {
			suma+=edad;
			contadorAlumnos++;
			if(edad>=18) {
				mayorEdad++;
			}
			System.out.println("Continúa introduciendo edades: ");
			edad=read.nextInt();
		}
		
		media=suma/contadorAlumnos;
		System.out.println("En el centro hay: " +contadorAlumnos+ " alumnos");
		System.out.println("La suma de las edades de todos los alumnos es: " +suma);
		System.out.println("La media de edad de todos los alunos es de: " +media +" años");
		System.out.println("En el centro hay: " +mayorEdad+" alumno/s mayor/es de edad");
	}

}

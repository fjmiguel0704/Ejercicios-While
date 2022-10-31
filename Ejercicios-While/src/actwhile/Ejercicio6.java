package actwhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creamos las variables
		int edad, suma=0, contadorAlumnos=0, media, mayorEdad=0;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca las edades de los alumnos y declaramos la variable edad.
		System.out.println("Introduce las edades de los alumnos. Cuando no existan mas alumnos de los introducidos, introduce una edad inferior a 1(Ej: 0,-1): ");
		edad=read.nextInt();
		
		//Mientras la edad introducida sea mayor o igual a 0
		while(edad>=0) {
			
			//Suma va a ser el resultado de la suma de todas las edades introducidas
			suma+=edad;
			
			//Incrementa el contadorAlumnos en 1
			contadorAlumnos++;
			
			//Y si alguna edad es mayor o igual a 18, incrementa en 1 mayorEdad
			if(edad>=18) {
				mayorEdad++;
			}
			
			//Le pedimos al usuario que continúe introduciendo edades y volvemos a declarar edad
			System.out.println("Continúa introduciendo edades: ");
			edad=read.nextInt(); //Cuando se ingrese un número negativo finaliza el bucle 
		}
		
		//media es igual al resultado de la división de suma entre contadorAlumnos
		media=suma/contadorAlumnos;
		
		//Muestra la siguiente información: Cuantos alumnos hay en total, la suma de todas las edades, la media de todas las edades y si hay algún mayor de edad.
		System.out.println("En el centro hay: " +contadorAlumnos+ " alumnos");
		System.out.println("La suma de las edades de todos los alumnos es: " +suma);
		System.out.println("La media de edad de todos los alunos es de: " +media +" años");
		System.out.println("En el centro hay: " +mayorEdad+" alumno/s mayor/es de edad");
	}

}

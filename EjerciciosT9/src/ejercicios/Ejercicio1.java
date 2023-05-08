package ejercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		int numAleatorio, numBuscar;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 20; i++) {
			numAleatorio = (int) (Math.random() * 100 + 1);
			numeros.add(numAleatorio);
		}
		
		System.out.println(numeros);

		System.out.println("Introduzca un valor a buscar:");
		numBuscar = sc.nextInt();

		if (numeros.remove(numBuscar)) {
			System.out.println("El número se encontraba en la colección");
		} else {
			System.out.println("El número no se encontraba en la colección");
		}
		
		System.out.println(numeros);
		sc.close();
	}

}

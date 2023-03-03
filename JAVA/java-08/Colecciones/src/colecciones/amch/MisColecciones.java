package colecciones.amch;

import java.util.*;

public class MisColecciones {

	public static void main(String[] args) {
		
		wrapperClass();
	}
	
	static void listasCollection () {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
	}
	
	public void imprimir (Collection collection) {
		for (Objet element : Collection) {
			
		}
	}
	
	
	static void wrapperClass() {
	//byte, short, char, long, float, int, double
		
		byte numeroB = 12;
		System.out.println("El tamaño de  un byte es : " + Byte.SIZE);
		System.out.println("El valor maximo es: " + Byte.MAX_VALUE);
		System.out.println("El valor minimo es: " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);
		
		int numero = 2147483647;
		System.out.println("Tamaño de un entero en bytes: " + Integer.BYTES);
		System.out.println("El tamaño de  un entero es : " + Integer.SIZE);
		System.out.println("El valor maximo es: " + Integer.MAX_VALUE);
		System.out.println("El valor minimo es: " + Integer.MIN_VALUE);
		System.out.println("---> " + numero);
		
		long numL= 2222222222222222222L;
		System.out.println("Tamaño de un long en bytes: " + Long.BYTES);
		System.out.println("El tamaño de  un long es : " + Long.SIZE);
		System.out.println("El valor maximo es: " + Long.MAX_VALUE);
		System.out.println("El valor minimo es: " + Long.MIN_VALUE);
		System.out.println("---> " + numL);
		
		short num = -2222;
		System.out.println("Tamaño de un short en bytes: " + Short.BYTES);
		System.out.println("El tamaño de  un short es : " + Short.SIZE);
		System.out.println("El valor maximo es: " + Short.MAX_VALUE);
		System.out.println("El valor minimo es: " + Short.MIN_VALUE);
		System.out.println("---> " + num);
	} 
	
	
	
	

}

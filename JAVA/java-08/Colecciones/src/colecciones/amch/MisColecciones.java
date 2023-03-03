package colecciones.amch;

import java.util.*;

public class MisColecciones {

	public static void main(String[] args) {
		MisColecciones c = new MisColecciones();
		//imprimir(c.listasCollection());
		//imprimir(c.setCollection());
		mapCollection();
		//wrapperClass();
	}
	
	private  static void mapCollection() {
		Map miMap = new HashMap();
		
		miMap.put("Valor1", "Juan");
		miMap.put("Valor2", "Maria");
		miMap.put("Valor3", "Arturo");
		miMap.put("Valor4", "Karla");
		
		miMap.remove("Valor3");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
	}
	
	Set setCollection() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("cinco");
		System.out.println("--> " + miSet.isEmpty());
		System.out.println("--> " + miSet.iterator());
		System.out.println("--> " + miSet.size());
		return miSet;
	}
	
	private List listasCollection () {
		List miLista = new ArrayList();
		System.out.println(miLista + " Tamaño de la lista antes " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(0,"pato");
		
		miLista.set(0, miLista);
		miLista.remove(0);
		
		System.out.println(miLista + " Tamaño de la lista despues " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());
		
		boolean e = miLista.contains("pato");
		System.out.println("---> " + e);
		
		return miLista;
	}
	
	public static  void imprimir (Collection collection) {
		for (Object element : collection) {
			System.out.println("Elementos " + element);
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

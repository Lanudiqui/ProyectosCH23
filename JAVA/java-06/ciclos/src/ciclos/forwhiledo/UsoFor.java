package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor () {
		System.out.println("Ciclo For");
		for (int i = 0; i < 10; i++) {
			System.out.println("El iterador --> " + i);
		}
	}
	
	public void letrasFor () {
		System.out.println("Ciclo For letras");
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print("soy --> " + i+ ", ");
			char letra = (char) i;
			System.out.println();
			System.out.print("soy --> " + letra+ ", ");
		}
	
	
	}
}




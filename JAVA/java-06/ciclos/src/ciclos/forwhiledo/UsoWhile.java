package ciclos.forwhiledo;
import java.util.Scanner;
public class UsoWhile {
	Scanner entrada = new Scanner(System.in);
	public void cicloW () {
		System.out.println("Ciclo While");
		int iterador = 0;
		while (iterador <= 10) {
			System.out.println("Iterador " + iterador);
			iterador = iterador + 1;
		}
	}
	
	//While uso centinela
	public void centinelaW () {
		System.out.println("Ciclo While centinela");
		final int centinela = -1;
		System.out.print("Introduzca una nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();
			
			
		}
		System.out.println("Fin");
	}
	
	public void banderaW () {
		System.out.println("Ciclo While bandera");
		boolean valorb = false; 
		while (!valorb) {
			System.out.println("Introduzca un valor numerico: ");
			int valor = entrada.nextInt();
			if (valor >= 0 && valor <=5) {
				int potaxio = (int)Math.pow(valor, 2);
				System.out.println("El resultado --> " + potaxio);
			}else {
				valorb = true;
				System.out.println("Adios");
			}
		}
		
		
		//System.out.println("Hola soy el metodo estatico");
		//Math.pow(2,2);
		
	}

}

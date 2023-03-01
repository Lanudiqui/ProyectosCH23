package ciclos.forwhiledo;
import java.util.Scanner;
public class CicloDo {
	Scanner dato = new Scanner(System.in);
	public void digitos() {
		int value = 0;
		int acumulador = 0;
		do {
			System.out.println("Introduzca un digito entre 0-9: ");
			 value = dato.nextInt();
			 acumulador += value;
			 System.out.println("--> " + acumulador);
			
		} while (value >=0 && value <= 9);
		System.out.println("Termina el ciclo Do-While");
	}

}

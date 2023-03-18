import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String entrada = var.nextLine();
		String reverse = "";
		System.out.println("Palabra introducida: " + entrada);

		for (int i = 0;i<entrada.length();i++) {
			reverse = entrada.charAt(i) + reverse;
		} 
		System.out.println("Palabra al reves: " + reverse);
	}

}

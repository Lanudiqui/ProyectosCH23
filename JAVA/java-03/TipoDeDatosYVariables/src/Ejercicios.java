import java.util.Scanner;
public class Ejercicios {
	public static void main(String[]args) {
		//Ejercicio No.1
		Scanner var = new Scanner(System.in); // Se crea el objeto scanner
		System.out.println("Ejercicio No.1");
		System.out.println("Ingrese un valor entero");
		int valor1 = var.nextInt();//Se ingresa el primer valor 
		System.out.println("Ingrese un segundo valor entero");
		int valor2= var.nextInt();//Se ingresa el segundo valor 
		System.out.println("Ingrese un tercer valor entero");
		int valor3 = var.nextInt();//Se ingresa el tercer valor 
		int resultado= (valor1 * valor2) % valor3; // Se efectua una multiplicación y al resultado se le saca el residuo
		System.out.println(resultado);
		System.out.println("  ");
		
		//Ejercicio No.2
		System.out.println("**Ejercicio No.2**");
		System.out.println("Ingrese true o false");
		boolean a = var.nextBoolean();
		System.out.println("Ingrese true o false");
		boolean b = var.nextBoolean();
		System.out.println("Comparación entre datos booleanos");
		System.out.println(a==b);
		System.out.println("  ");
		
		//Ejercicio No.3
		System.out.println("***Ejercicio No.3***");
		System.out.println("Ingrese un valor con decimal");
		double var1 = var.nextFloat();
		System.out.println("Ingrese un valor con decimal");
		double var2 = var.nextFloat();
		
		System.out.println(var1 < var2 );
	}
}

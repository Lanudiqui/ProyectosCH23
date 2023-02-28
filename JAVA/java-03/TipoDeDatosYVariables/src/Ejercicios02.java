import java.util.Scanner;
public class Ejercicios02 {
	public static void main(String[]args) {
		Scanner var = new Scanner(System.in); // Se crea el objeto scanner
		//Conversion de grados farenheit a kelvin y a centigrados
		System.out.println("Ingrese la temperatura en grados farenheit: ");
		double farenth = var.nextFloat();
		double celcious = (farenth-32)/1.8;
		double kelvin = (farenth-32)/1.8 + 273.15;
		System.out.println("La conversión de grados Farenheit a Celcious es: " + celcious + "°");
		System.out.println("La conversión de grados Farenheit a Kelvin es: " + kelvin + "°");
		
		
		while(true) {
			System.out.println("Ingrese un valor entero o 0 para terminar");
			int variable = var.nextInt();//Se ingresa el tercer valor ;
			if(variable == 0){
				break;					
			} if(variable%2==0){
				System.out.println("El numero es par");
				
			} else {
				System.out.println("El numero es impar");
			}
							
		}
		
		
	}

}


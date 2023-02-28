import java.util.Scanner;
public class Java04 {
	public static void main(String[]args) {
		Scanner var = new Scanner(System.in);
		/*int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}*/
		System.out.println("*****EJERCICIO No.1******");
		while(true) {
			System.out.println("Ingrese un numero entero o 0 para terminar");
			int numero = var.nextInt();//Se ingresa el tercer valor ;
			if(numero == 0){
				break;					
			} if(numero%2==0 && numero > 0 ){
				System.out.println("El numero es par y positivo");
				
			} else {
				System.out.println("El numero " + numero + " no es par o positivo ");
			}
							
		}
		System.out.println("*****EJERCICIO No.2******");
		System.out.println("Ingrese un numero entero");
		int numero2 = var.nextInt();
		if(numero2 >= 1 && numero2<=100) {
			System.out.println("El número " + numero2 + " esta entre el rango 1-100");
		}else {
			System.out.println("El valos está fuera del rango 1-100");
		}
		System.out.println("*****EJERCICIO No.3******");
		String cadena1 = "Hola";
		String cadena2 = "hola";
		System.out.println(cadena1 == cadena2);
		
	}

}

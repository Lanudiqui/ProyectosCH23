package control;
import java.util.Scanner;
public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
		
		/*
		
		if (condition) {
			
		}*/
		
		long nota = 5;
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("Continua el control de flujo...");
		
		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);

		}	
	}
	
	public void divisible () {
		System.out.print("Introduzca un primer valor: ");
		int dato1 = entrada.nextInt();
		System.out.print("Introduzca un segundo valor: ");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " es divisible entre " + dato2);
		}else {
			System.out.println(dato1 + " no es divisible entre " + dato2);
		}
	}
	
	public void comparar () {
		System.out.print("Introduzca un primer valor: ");
		int var1 = entrada.nextInt();
		System.out.print("Introduzca un segundo valor: ");
		int var2 = entrada.nextInt();
		
		if (var1 < var2 ) {
			System.out.println(var1 + " es menor que " + var2);
		}else {
			System.out.println(var1 + " es mayor que " + var2);
		}
	}
	
	public void anidado () {
		System.out.print("Introduzca un número: ");
		int a = entrada.nextInt();
		
		if (a < 0 ) {
			System.out.print(a + " es negativo ");
		}else if(a > 0){
			System.out.print(a + " es positivo ");
		}else {
			System.out.print(a + " es igual a 0 ");
		}
	}

}

package control;
import java.util.Scanner;
public class OrdenTres {
	Scanner dato = new Scanner(System.in);
	public void Orden () {
		System.out.println("Igrese el primer valor: ");
		int var1 = dato.nextInt();
		System.out.print("Igrese el segundo valor: ");
		int var2 = dato.nextInt();
		System.out.print("Igrese el tercer valor: ");
		int var3 = dato.nextInt();
		
		int menor, medio, mayor;
		
		if (var1 <= var2 && var1 <= var3) {
			menor = var1;
			if (var2 <= var3) {
				medio = var2;
				mayor = var3;
			}else {
				medio = var3;
				mayor = var2;
			}
		}else if (var2 <= var1 && var2 <= var3) {
			menor = var2;
			if (var1 <= var3) {
				medio = var1;
				mayor = var3;
			}else {
				medio = var3;
				mayor = var1;
			}
		}else {
			menor = var3;
			if (var1 <= var2) {
				medio = var1;
				mayor = var2;
			}else {
				medio = var2;
				mayor = var1;
			}
		}
		System.out.println("Los valores ordenados de menor a mayor son: ");
		System.out.println(menor + " " + medio + " " + mayor);
		
	}

}

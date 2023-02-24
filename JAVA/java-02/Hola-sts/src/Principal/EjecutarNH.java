package Principal;
import java.util.Scanner;
import Clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		NuevoHola nh = new NuevoHola("Alejandro");
		nh.saludo();
		
		String nombre;
		System.out.println("¿Cúal es tu nombre? ");
		nombre = sn.next();
		
		NuevoHola nh1 = new NuevoHola(nombre);
		nh1.saludoConNombre();
		
	}

}

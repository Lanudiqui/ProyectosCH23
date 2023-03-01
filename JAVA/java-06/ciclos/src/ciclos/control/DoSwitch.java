package ciclos.control;
import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;
public class DoSwitch {
	Scanner s = new Scanner(System.in);	
	public void controlador () {
		Menus mp = new Menus ();
		UsoWhile uw = new UsoWhile();
		UsoFor uf = new UsoFor();
		CicloDo cd = new CicloDo();
		int opcion;
		do {
			mp.menuPrincipal();
			System.out.println("Seleccione una opción: ");
			opcion = s.nextInt();
			switch(opcion) {
			case 1:
				uw.cicloW();
				break;
			case 2:
				uw.centinelaW();
				break;
			case 3:
				uw.banderaW();
				break;
			case 4:
				uf.cicloFor();
				break;
			case 5:
				uf.letrasFor();
				break;
			case 6:
				cd.digitos();
				break;
			}
		} while (opcion != 0);
	}

}

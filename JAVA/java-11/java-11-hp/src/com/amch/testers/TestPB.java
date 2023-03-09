package com.amch.testers;

import com.amch.clases.AlumnoB;
import com.amch.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		
		AlumnoB a = new AlumnoB(123, 8.5, "Alejandro", 30);
		PersonaP p = new PersonaP("Carmen",18);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(p.toString());
		a.mostrarDatos();
		a.mostrarDatos("Morales");

	}

}

package com.amch.testers;

import com.amch.clases.Mensajes;
import com.amch.clases.OperacionesAritmeticas;
import com.amch.clases.Suma;

public class TestOA {

	public static void main(String[] args) {
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss=new Suma(10,3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + ss.sumar());
		s.mensaje();
		sss.mensaje();

	}

}

package com.generation.amch.ManejoExcepciones;

import java.util.Scanner;

public class NoComprovadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int divisor;
		
		
		try {
			divisor= Integer.parseInt(dato.next());
			
			int division = 10/divisor;
			System.out.println("--->" +division);
			
		}catch(ArithmeticException e) {
			System.out.println("Capturando la excepcion"+ e.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("El dato es un caracter " + nfe.getMessage());
		}finally {
			System.out.println("Este blok es opcional y se va a ejecutar con o sin la excepcion");
		}
		
		System.out.println("Continua con el flujo de la aplicacion");
		
		
		
	}

}



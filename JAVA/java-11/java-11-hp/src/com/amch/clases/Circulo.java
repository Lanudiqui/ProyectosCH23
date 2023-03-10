package com.amch.clases;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas{
	private int radio;
	
	
	
	public Circulo(int radio) {
		super("circulo");
		this.radio = radio;
	}



	@Override
	public double areas() {
		return Math.PI*Math.pow(radio, 2);
	}



	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.println("****CIRCULO****");
		System.out.print("Introduzca el radio: ");
		this.setRadio(datos.nextInt());
	}
	
	

}

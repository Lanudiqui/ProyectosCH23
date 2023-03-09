package com.amch.clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	private double x;
	private double y;
	
	
	
	
	public Suma() {
		super();
	}

	public Suma(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double sumar() {
		return this.x + this.y;
	}

	@Override
	public double restar() {
		return 0;
	}

	@Override
	public double multiplicar() {
		return 0;
	}

	@Override
	public double dividir() {
		return 0;
	}

	@Override
	public void mensaje() {
		System.out.println("****SUMA****");
		
	}

}

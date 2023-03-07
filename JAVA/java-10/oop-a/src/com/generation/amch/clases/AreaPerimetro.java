package com.generation.amch.clases;

public class AreaPerimetro {
	
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}
	
	public double perimetroCuadrado (double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public double areaTriangulo (int base, int altura) {
		return (base * altura)/2;
	}
	
	public double perimetroTriangulo (double ladoA, double ladoB, double ladoC) {
		double perimetro = ladoA + ladoB + ladoC;
		return perimetro;
	}
	
	public double areaCirculo (double radio) {
		double area = (Math.PI * (radio* radio));
		return  area;
	}
	
	public double perimetroCirculo (double radio) {
		double perimetro = ((2*Math.PI) * radio);
		return  perimetro;
	}

}

package com.generation.amch.mains;

import com.generation.amch.clases.AreaPerimetro;
import com.generation.amch.clases.FigurasGeometricas;

public class TestAreaPerimetro {
	
	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro ();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		
		System.out.println("Area del cuadrado " + ap.areaCuadrado(5));
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado---> " + fg.getPerimetro());
		
		fg.setPerimetro(ap.perimetroTriangulo(5, 6, 10));
		fg.setArea(ap.areaTriangulo(5, 10));
		
		fg.setArea(ap.areaCirculo(12.6));
		System.out.println("El area del circulo es: " + ap.areaCirculo(12.6));
		fg.setPerimetro(ap.perimetroCirculo(12.6));
		System.out.println("El perimetro del circulo es: " + ap.perimetroCirculo(12.6));
	}

}

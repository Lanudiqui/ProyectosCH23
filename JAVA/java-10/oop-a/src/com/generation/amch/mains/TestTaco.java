package com.generation.amch.mains;

import com.generation.amch.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		Taco t = new Taco();
		t.setGuisado("Huevo");
		t.setNumeroDeTortilla(2);
		t.setPrecio(20);
		t.setTamanioDeTortilla("grande");
		t.setTipoDeTortilla("Maiz");
		
		System.out.println("---> " + t.toString());

	}

}

package com.generation.amch.mains;

import com.generation.amch.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> StrObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		StrObj.claseTipo();

	}

}

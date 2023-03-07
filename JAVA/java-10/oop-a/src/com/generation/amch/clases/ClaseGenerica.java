package com.generation.amch.clases;

public class ClaseGenerica <T>{
	
	T obj;
	
	
	
	public ClaseGenerica(T obj) {
		this.obj = obj;
	}



	public void claseTipo () {
		System.out.println("Tipo de dato T es: " + obj.getClass().getName() );
	}

}

package com.generation.amch.mains;

import java.util.*;

public class CollecionesOop {

	public static void main(String[] args) {
		ArrayList <String> coleccion = new ArrayList<String>();
		
		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		
		/*
		coleccion.add(13);
		coleccion.add(15.15);
		coleccion.add('a');
		*/
		for (int i = 0;i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}

	}

}

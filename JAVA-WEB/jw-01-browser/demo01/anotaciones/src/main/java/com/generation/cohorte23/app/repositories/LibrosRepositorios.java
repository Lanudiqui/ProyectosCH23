package com.generation.cohorte23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.cohorte23.app.model.Libro;

@Repository
public class LibrosRepositorios {
	public List <Libro> listarLibros (){
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("Spring Boot", "Alejandro Morales", "1"));
		lista.add(new Libro("Java", "Juanin", "2"));
		lista.add(new Libro("C", "Carlos Bodoque", "3"));
		return lista;
	}
}

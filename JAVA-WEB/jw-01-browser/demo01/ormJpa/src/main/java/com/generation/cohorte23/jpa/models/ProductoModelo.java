package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")

public class ProductoModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;

	
	
	
	  @ManyToOne
	   private UsuarioModel usuario;
	  
	  @OneToOne(mappedBy = "producto")
	  private DetalleOrdenModelo detalleOrden;
	
	
	public ProductoModelo() {
	}



	public ProductoModelo(Long id, String nombreProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	



}

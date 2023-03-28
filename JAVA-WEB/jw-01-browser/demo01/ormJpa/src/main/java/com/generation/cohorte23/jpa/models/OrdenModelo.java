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
@Table(name = "orden")

public class OrdenModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private Long id;
	private String nombreOrden;
	
	
	
	
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToOne(mappedBy = "orden")
	 private DetalleOrdenModelo detalleOrden;
	
	
	
	public OrdenModelo() {
		super();
	}



	public OrdenModelo(Long id, String nombreOrden, Long usuarioId) {
		super();
		this.id = id;
		this.nombreOrden = nombreOrden;
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreOrden() {
		return nombreOrden;
	}
	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}
	
	
	


}

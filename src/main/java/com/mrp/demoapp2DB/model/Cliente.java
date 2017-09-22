package com.mrp.demoapp2DB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cliente")
public class Cliente {
	
	@Id
	private String id;
	private String nombre;
	private String apellido;
	private Integer edad=0;
	
	public Cliente(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad=edad;
	}
	
}

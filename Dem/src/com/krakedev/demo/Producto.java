package com.krakedev.demo;

public class Producto {
	///1 atributos privados 
	/// aplicamos el principio de encapsulamiento private
	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;
	
	/// 3 contructore que recibe codigo y nombre 
	public Producto(int codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	/// 2generamos los codigos getters y setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}

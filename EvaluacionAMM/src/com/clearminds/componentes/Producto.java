package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	//Constructores que reciben 3 parametros
	public Producto(String codigo,String nombre,double precio) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		
		
	}
	// metodo incrementar precio
	public void incrementarPrecio(int porcentajeDerivado) {
		this.precio = this.precio + (this.precio * porcentajeDerivado / 100);
		
	}
	//metodo disminuir precio
	public void disminuirPrecio(double valorDescuento) {
		this.precio=this.precio-valorDescuento;
		
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	

}

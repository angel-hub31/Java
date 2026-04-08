package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	//Constructores que reciben 3 parametros
	public Producto(String nombre, double precio, String codigo) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	// metodo incrementar precio
	public void incrementarPrecio(int porcentajeDerivado) {
		double incremento=(this.precio*porcentajeDerivado)/100;
		this.precio=this.precio+incremento;
		
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

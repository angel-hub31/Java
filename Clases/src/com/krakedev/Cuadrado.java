package com.krakedev;

public class Cuadrado {
	private double base;
	private double altura;
	
	public double calcularArea() {
		double area=base*altura;
		return area;
			
	}
	public double calcularPerimetro() {
		double perimetro= 2*(base+altura);
		return perimetro;

}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
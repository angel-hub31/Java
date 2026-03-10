package com.krakedev;

public class Cuadrado {
	public double base;
	public double altura;
	
	public double calcularArea() {
		double area=base*altura;
		return area;
			
	}
	public double calcularPerimetro() {
		double perimetro= 2*(base+altura);
		return perimetro;

}
}
package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c=new Cuadrado();
		Cuadrado p=new Cuadrado();
		
		double areaC;
		c.base=4;
		c.altura=4;
		areaC=c.calcularArea();
		System.out.println("Area de c:"+ areaC);
		
		double perimetroP;
		p.base=3;
		p.altura=3;
		perimetroP=p.calcularPerimetro();
		System.out.println("Perimetro de p:"+ perimetroP);

		

	}

}

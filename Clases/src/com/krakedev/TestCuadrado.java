package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c=new Cuadrado();
		Cuadrado p=new Cuadrado();
		
		double areaC;
		c.setBase(4);
		c.setAltura(4);
		areaC=c.calcularArea();
		System.out.println("Area de c:"+ areaC);
		
		double perimetroP;
		p.setBase(3);
		p.setAltura(3);
		perimetroP=p.calcularPerimetro();
		System.out.println("Perimetro de p:"+ perimetroP);

		

	}

}

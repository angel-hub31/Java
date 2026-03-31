package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectagulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p=new Rectangulo();
		Rectangulo p1=new Rectangulo(8,6);
		
		int areaR1;
		r1.setBase(10);
		r1.setAltura(5);
		areaR1=r1.calcularArea();
		System.out.println("Area de r1:"+ areaR1);
				
		int areaR2;
		r2.setBase(8);
		r2.setAltura(3);
		areaR2=r2.calcularArea();
		System.out.println("Area de r2:"+ areaR2);
		
		int  perimetroP;
		p.setBase(4);
		p.setAltura(2);
		perimetroP=p.calcularPerimetro();
		System.out.println("Perimetro de p:"+ perimetroP);
		
		int perimetroP1=p1.calcularPerimetro();
		System.out.println("Perimetro de p:"+ perimetroP1);
		
		
	}

}

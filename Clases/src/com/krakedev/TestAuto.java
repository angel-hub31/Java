package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		auto1.marca="nissan";
		auto1.anio=2025;
		auto1.precio=25000;
		
		System.out.println("Marca:" + auto1. marca );
		System.out.println("Anio:" + auto1. anio );
		System.out.println("Precio:" + auto1. precio );
		
		System.out.println("***************************************" );
		
		Auto auto2=new Auto();
		auto2.marca="ford";
		auto2.anio=2026;
		auto2.precio=50000;
		
		System.out.println("Marca:" + auto2. marca );
		System.out.println("Anio:" + auto2. anio );
		System.out.println("Precio:" + auto2. precio );
	

	}

}

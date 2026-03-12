package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		auto1.setMarca("nissan");
		auto1.setAnio(2025);
		auto1.setPrecio(25000);
		
		System.out.println("Marca:" + auto1.getMarca() );
		System.out.println("Anio:" + auto1.getAnio() );
		System.out.println("Precio:" + auto1.getPrecio ());
		
		System.out.println("***************************************" );
		
		Auto auto2=new Auto();
		auto2.setMarca("ford");
		auto2.setAnio(2026);
		auto2.setPrecio(50000);
		
		System.out.println("Marca:" + auto2.getMarca ());
		System.out.println("Anio:" + auto2.getAnio() );
		System.out.println("Precio:" + auto2.getPrecio() );
	

	}

}

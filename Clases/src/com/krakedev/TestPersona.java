package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// 1: declaro una variable llamada p de tipo persona
		Persona p=new Persona();
		Persona p2=new Persona();
	
		//2:instanciar un objeto Persona, referenciada
		//3:accedo a los atributos
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());
		//4:modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("--------------------");
		//5: accedo a los atributos
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());
		
		p2.setNombre("David");
		
		System.out.println("***********");
		System.out.println("p.Nombre:" + p.getNombre());
		System.out.println("p2.Nombre:" + p2.getNombre());

		
		
		

		


	}

}

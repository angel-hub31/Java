package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// 1: declaro una variable llamada p de tipo persona
		Persona p=new Persona();
		Persona p2=new Persona();
	
		//2:instanciar un objeto Persona, referenciada
		//3:accedo a los atributos
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);
		//4:modificar los atributos
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		System.out.println("--------------------");
		//5: accedo a los atributos
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);
		
		p2.nombre="David";
		
		System.out.println("***********");
		System.out.println("p.Nombre:" + p.nombre);
		System.out.println("p2.Nombre:" + p2.nombre);

		
		
		

		


	}

}

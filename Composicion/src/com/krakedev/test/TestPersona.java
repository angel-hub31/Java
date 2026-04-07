package com.krakedev.test;

import com.krakedev.compisicion.Direccion;
import com.krakedev.compisicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1= new Persona ();
		p1.setNombre("Rosario");
		p1.setApellido("Meneses");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av. siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1 =p1.getDireccion();
		
		System.out.println("nombre: " + nombre);
		System.out.println(d1.getCallePrincipal());
		p1.imprimir();
		
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av. de los shyris", "Eloy Alfaro","s/n");
		p2.setNombre("Angel");
		p2.setDireccion(d2);
		p2.setApellido("Morales");
		p2.imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new  Direccion("Av. amazonas", "Carrion","N24 606"));
		p3.setNombre("vivi");
		p3.setApellido("Gualapuro");
		p3.imprimir();
		System.out.println("FIN " );




	}

}

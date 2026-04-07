package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1= new Telefono(8,"movi","09912344123");		Telefono telf= new Telefono(10,"movi","09941234123");
		Telefono t2= new Telefono(30,"claro","09941896423");
		Telefono t3= new Telefono(50,"claro","09944790123");
		
		AdminTelefono at=new AdminTelefono();
		int totalMovi=at.contarMovi(t1, t2, t3);
		
		System.out.println("Total de telefonos movi: "+totalMovi);

		telf.imprimir();


	}

}

package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1= new Telefono(201,"claro","0934578612");
		Telefono t2= new Telefono(202,"movi","0875115215");
		Telefono t3= new Telefono(203,"claro","0925451215");
		Telefono t4= new Telefono(204,"claro","0789456125");
		
		AdminTelefono at=new AdminTelefono();
		int totalClaro=at.contarClaro(t1, t2, t3,t4);
		System.out.println("Total de telefonos claro: "+totalClaro);


		

	}

}

package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validar=new Validacion();
		
		boolean resultado=validar.validarMonto(100.5);
		
		System.out.println("El monto es valido " +  resultado);
		

	}

}

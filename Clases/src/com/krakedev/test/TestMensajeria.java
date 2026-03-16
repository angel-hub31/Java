package com.krakedev.test;

import com.krakedev.Mensajeria;
// ctrl + shif + O para importar
public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m;
		m=new Mensajeria();
		m.setTipoMensaje("Bienvenido");
		m.saludar();
		m.saludarAmigo("Pepe","Chavez" );
		m.mostrarResultado();
		
		
		String valorRecuperado=m.getTipoMensaje();
		System.out.println("El mensaje es:"+ valorRecuperado);

	}
	
	

}

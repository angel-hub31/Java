package com.krakedev;

public class Mensajeria {
	private String tipoMensaje;
	
	public String getTipoMensaje() {
		return tipoMensaje;
	}

	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	// "void" no retorna nada y no recibe nada
	public void saludar() {
		System.out.println("Hola Mundo");
		
	}
	
	public void saludarAmigo(String nombre,String apellido) {
		System.out.println("Hola " +nombre+ " " +apellido);
	}
	
	///funcion mostrar resultado
	
	public void mostrarResultado() {
		
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");

	}

}

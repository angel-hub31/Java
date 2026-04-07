package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		//validamos si la operadora es "movi" para activar el whatsapp
		if(telf.getOperadora().equals("movi")) {
			telf.setTieneWhatsapp(true);
		}
	}
	

}

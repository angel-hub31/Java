package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		//validamos si la operadora es "movi" para activar el whatsapp
		if(telf.getOperadora().equals("movi")) {
			telf.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono t1,Telefono t2,Telefono t3) {
	int contador=0;
	if(t1.getOperadora().equals("movi")) contador ++;
	if(t2.getOperadora().equals("movi")) contador ++;
	if(t3.getOperadora().equals("movi")) contador ++;
	return contador;
	}

}

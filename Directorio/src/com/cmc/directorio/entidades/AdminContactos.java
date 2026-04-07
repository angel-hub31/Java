package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
        if (c1.getPeso() > c2.getPeso()) {
            return c1;
        } else {
            return c2;
        }
    }

    public boolean compararOperadoras(Contacto c1, Contacto c2) {
        String op1 = c1.getTelefono().getOperadora();
        String op2 = c2.getTelefono().getOperadora();
        return op1.equals(op2);
    }

    public void activarUsuario(Contacto contacto) {
        if (contacto.getTelefono().isTieneWhatsapp()) {
            contacto.setActivo(true);
        }
    }
}

package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        Telefono telf = new Telefono(30, "claro", "0912345678");
        Contacto c = new Contacto("Pedro", "Vaca", telf, 70.0);

        AdminContactos admin = new AdminContactos();

        System.out.println("--- Antes de activar ---");
        c.imprimir();

        admin.activarUsuario(c);
        System.out.println();
        System.out.println("--- Después de intentar activar (sin WhatsApp) ---");
        c.imprimir();
        
        telf.setTieneWhatsapp(true);
        admin.activarUsuario(c);
        System.out.println();

        System.out.println("--- Después de activar WhatsApp y llamar al método ---");
        c.imprimir(); 
    }
}
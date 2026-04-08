package com.clearminds.test;

import com.clearminds.componentes.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestBuscarProductoNull {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("Papitas", 0.85, "KE34");
		maquina.cargarProducto(producto, "B1", 4);
		// estás intentando llamar al método .getNombre() sobre una variable que no hace
		// referencia a ningún objeto (es decir, es null).
		//Línea exacta del error: 16
		//Variable que produjo el error: prod
		Producto prod = maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());

	}

}

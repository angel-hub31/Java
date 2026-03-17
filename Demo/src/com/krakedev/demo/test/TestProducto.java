package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// instanciar un objetoProducto
		
		Producto p1=new Producto(20,"Laptop");
		
		//modificamos la descripcion y el peso
		p1.setDescripcion("Iphon 16 pro max");
		p1.setPeso(0.350);
		
		//mostramos los valores en pantalla
		
		System.out.println("Codigo: " + p1.getCodigo());
		System.out.println("Nombre: " +p1.getNombre());
		System.out.println("Descripcio: " +p1.getDescripcion());
		System.out.println("Peso: " +p1.getPeso() + "kg");



		

	}

}

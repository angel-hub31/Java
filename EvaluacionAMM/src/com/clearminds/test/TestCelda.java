package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		
			Celda celda=new Celda("A1");
			// El NullPointerException se produce en esta clase (TestCelda) en la línea 13.
	        // La variable que ocasiona el NullPointer es "producto" (obtenida mediante celda.getProducto()), 
	        // ya que actualmente tiene un valor de null al no haber sido inicializada con un objeto Producto.
			System.out.println(celda.getProducto().getNombre());
			
			System.out.println("CELDA:"+celda.getProducto());
			System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
			System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
			System.out.println("STOCK:"+celda.getStock());
			System.out.println("*************************************");
		}
	}



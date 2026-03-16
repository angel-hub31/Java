package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		productoA.setNombre("Pantalon");
		productoA.setDescripcion("Jean");
		productoA.setPrecio(20);
		productoA.setStockActual(55);

		System.out.println("Nombre:" + productoA.getNombre());
		System.out.println("Descripcion:" + productoA.getDescripcion());
		System.out.println("Precio:" + productoA.getPrecio());
		System.out.println("StockActual:" + productoA.getStockActual());

		System.out.println("*********************************");

		Producto productoB=new Producto();
		productoB.setNombre("Camiseta");
		productoB.setDescripcion("Playera");
		productoB.setPrecio(15);
		productoB.setStockActual(45);

		System.out.println("Nombre:" + productoB.getNombre());
		System.out.println("Descripcion:" + productoB.getDescripcion());
		System.out.println("Precio:" + productoB.getPrecio());
		System.out.println("StockActual:" + productoB.getStockActual());

		System.out.println("*********************************");

		Producto productoC=new Producto();
		productoC.setNombre("Zapato");
		productoC.setDescripcion("Deportivo");
		productoC.setPrecio(150);
		productoC.setStockActual(30);

		System.out.println("Nombre:" + productoC.getNombre());
		System.out.println("Descripcion:" + productoC.getDescripcion());
		System.out.println("Precio:" + productoC.getPrecio());
		System.out.println("StockActual:" + productoC.getStockActual());

		System.out.println("*********************************");
		
		Producto productoD=new Producto("Cama","2 plasas",450,20);
		System.out.println("Nombre:" + productoD.getNombre());
		System.out.println("Descripcion:" + productoD.getDescripcion());
		System.out.println("Precio:" + productoD.getPrecio());
		System.out.println("StockActual:" + productoD.getStockActual());

		


		

	}

}

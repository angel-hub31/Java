package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		productoA.nombre="Pantalon";
		productoA.descripcion="Jean";
		productoA.precio=20;
		productoA.stockActual=55;

		System.out.println("Nombre:" + productoA.nombre);
		System.out.println("Descripcion:" + productoA.descripcion);
		System.out.println("Precio:" + productoA.precio);
		System.out.println("StockActual:" + productoA.stockActual);

		System.out.println("*********************************");

		Producto productoB=new Producto();
		productoB.nombre="Camiseta";
		productoB.descripcion="Playera";
		productoB.precio=15;
		productoB.stockActual=45;

		System.out.println("Nombre:" + productoB.nombre);
		System.out.println("Descripcion:" + productoB.descripcion);
		System.out.println("Precio:" + productoB.precio);
		System.out.println("StockActual:" + productoB.stockActual);

		System.out.println("*********************************");

		Producto productoC=new Producto();
		productoC.nombre="Zapato";
		productoC.descripcion="Deportivo";
		productoC.precio=150;
		productoC.stockActual=30;

		System.out.println("Nombre:" + productoC.nombre);
		System.out.println("Descripcion:" + productoC.descripcion);
		System.out.println("Precio:" + productoC.precio);
		System.out.println("StockActual:" + productoC.stockActual);

		


		

	}

}

package com.clearminds.componentes;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1 = new Celda(c1);
		celda2 = new Celda(c2);
		celda3 = new Celda(c3);
		celda4 = new Celda(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:" + celda1.getCodigo());
		System.out.println("CELDA 2:" + celda2.getCodigo());
		System.out.println("CELDA 3:" + celda3.getCodigo());
		System.out.println("CELDA 4:" + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo))
			return celda1;
		if (celda2.getCodigo().equals(codigo))
			return celda2;
		if (celda3.getCodigo().equals(codigo))
			return celda3;
		if (celda4.getCodigo().equals(codigo))
			return celda4;
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			celdaEncontrada.ingresarProducto(producto, stock);
		} else {
			System.out.println("Celda no encontrada");
		}
	}

	public void mostrarProductos() {
		mostarDetalleCelda(celda1);
		mostarDetalleCelda(celda2);
		mostarDetalleCelda(celda3);
		mostarDetalleCelda(celda4);
		System.out.println("Saldo: " + saldo);
	}

	private void mostarDetalleCelda(Celda celda) {
		System.out.println("***********CELDA " + celda.getCodigo());
		System.out.println("Stock:" + celda.getStock());
		if (celda.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda.getProducto().getNombre());
			System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
			System.out.println("Código Producto:" + celda.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
	}

	// ✅ Método usado por TestBuscarProducto
	public Producto buscarCeldaProducto(String codigoCelda) {
		Celda c = buscarCelda(codigoCelda);
		if (c != null) {
			return c.getProducto();
		}
		return null;
	}

	// ✅ Método adicional para buscar celda por código de producto
	public Celda buscarCeldaPorProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		}
		if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		}
		if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		}
		if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto().getPrecio();
		}
		return 0;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			celda1.setStock(celda1.getStock() + cantidad);
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			celda2.setStock(celda2.getStock() + cantidad);
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			celda3.setStock(celda3.getStock() + cantidad);
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			celda4.setStock(celda4.getStock() + cantidad);
		}
	}

	public void vender(String codigoCelda) {
		Celda c = buscarCelda(codigoCelda);
		if (c != null && c.getProducto() != null && c.getStock() > 0) {
			c.setStock(c.getStock() - 1);
			this.saldo += c.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda c = buscarCelda(codigoCelda);
		if (c != null && c.getProducto() != null && c.getStock() > 0
				&& valorIngresado >= c.getProducto().getPrecio()) {

			c.setStock(c.getStock() - 1);
			double precio = c.getProducto().getPrecio();
			saldo += precio;
			return valorIngresado - precio;
		}
		return valorIngresado;
	}
}
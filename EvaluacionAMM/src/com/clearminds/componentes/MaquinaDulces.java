package com.clearminds.componentes;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	// constructor por defecto (vacio)
	public MaquinaDulces() {

	}

	// metodo configurar Maquina
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		this.celda1 = new Celda(cod1);
		this.celda2 = new Celda(cod2);
		this.celda3 = new Celda(cod3);
		this.celda4 = new Celda(cod4);

	}

	// metodo mostrar Configuracion
	// no recibe parametros, solo imprime los codigos de las 4 celdas
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:" + celda1.getCodigo());
		System.out.println("CELDA 2:" + celda2.getCodigo());
		System.out.println("CELDA 3:" + celda3.getCodigo());
		System.out.println("CELDA 4:" + celda4.getCodigo());

	}

	// metodo buscar celda
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

	// metodo cargarProducto
	public void cargarProducto(Producto producto, String codigoCelda, int stockInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, stockInicial);
		}

	}

	// no recibe parametros
	// metodo mostrarProducto
	public void mostrarProducto() {
		imprimirDetalleCelda(celda1);
		imprimirDetalleCelda(celda1);
		imprimirDetalleCelda(celda1);
		imprimirDetalleCelda(celda1);
		System.out.println("Saldo de la maquina:" + saldo);

	}

	private void imprimirDetalleCelda(Celda celda) {
		if (celda.getProducto() != null) {
			System.out.println("Celda: " + celda.getCodigo() + " Stock: " + celda.getStock() + " Producto: "
					+ celda.getProducto().getNombre() + " Precio: " + celda.getProducto().getPrecio());
		} else {
			System.out.println("Celda: " + celda.getCodigo() + " Sin Producto");
		}
	}

	// metodo buscarProductoEnCelda
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto();
		}
		return null;

	}

	// metodo consultar precio
	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}

	// metodo buscar celda producto
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto))
			return celda1;
		if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto))
			return celda2;
		if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto))
			return celda3;
		if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto))
			return celda4;
		return null;
	}
	//metodo incrementar Producto
	public void incrementarProductos(String codigoProducto, int items) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + items);
        }
    }
	//metodo vender
	public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            double precio = celda.getProducto().getPrecio();
            this.saldo += precio;
            mostrarProducto();
        }
    }
	// metodo vender con cambio
	public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            double precio = celda.getProducto().getPrecio();
            this.saldo += precio;
            return valorIngresado - precio;
        }
        return 0.0;
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

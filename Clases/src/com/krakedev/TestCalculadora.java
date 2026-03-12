package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;//creamos una variable calcu
		calcu=new Calculadora();
		
		int resultadoSuma;
		resultadoSuma=calcu.sumar(5, 8);
		System.out.println("Resultado:"+ resultadoSuma);
		
		int resultadoResta;
		resultadoResta=calcu.restar(10, 5);
		System.out.println("Resultado:"+ resultadoResta);
		
		double resultadoMultiplicacion;
		resultadoMultiplicacion=calcu.multiplicar(10, 5);
		System.out.println("Resultado:"+ resultadoMultiplicacion);
		
		double resultadoDividir;
		resultadoDividir=calcu.dividir(10,2);
		System.out.println("Resultado:"+resultadoDividir);
		
		double resultadoPromedio;
		resultadoPromedio=calcu.promediar(10,8,9);
		System.out.println("Resultado:"+resultadoPromedio);
		
		System.out.println("Valor 'resultado': " + calcu.getResultado());
        
        calcu.setResultado(100.0);
        System.out.println("Valor  " + calcu.getResultado());
		
		calcu.mostrarResultado();
		

	}
	
	
	

}

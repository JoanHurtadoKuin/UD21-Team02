package team2.Calculadora;

import java.util.Iterator;

public class Calculadora {
	
	private String moneda;
	private String monedaConvertir;
	private double valor;
	private double valorConvertido;
	
	public Calculadora() {
		
		this.moneda = "Dolar";
		this.monedaConvertir = "Euros";
		this.valor = 0.0;
		this.valorConvertido = 0.0;
	}
	
	
		
	public Calculadora(String moneda, String monedaConvertir, double valor, double valorConvertido) {
		this.moneda = moneda;
		this.monedaConvertir = monedaConvertir;
		this.valor = valor;
		this.valorConvertido = valorConvertido;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String[] valores() {
		String nombreMonedas[] = {"Dolar","Euro","Libra"};
		
		for (int i = 0; i < nombreMonedas.length; i++) {
			System.out.println(nombreMonedas[i]);
		}
		
		return nombreMonedas;
	}

	public double conversor() {
		
		switch (this.moneda) {
		case "Dolar":
			
			if(this.monedaConvertir.equals("Euros")){
				System.out.println((this.valor*0.95) + " Euros");
				return 0.0;
			}else if(this.monedaConvertir.equals("Libra")) {
				System.out.println((this.valor*13) + " Libras");
				return 0.0;
			}
			
			break;
			
		case "Euros":
			if(this.monedaConvertir.equals("Dolar")){
				System.out.println((this.valor*1.05) + " Dolar");
				return 0.0;
			}else if(this.monedaConvertir.equals("Libra")) {
				System.out.println((this.valor*13) + " Libras");
				return 0.0;
			}
			break;
			
		case "Libra":
			if(this.monedaConvertir.equals("Dolar")){
				System.out.println((this.valor*0.95) + " Dolar");
				return 0.0;
			}else if(this.monedaConvertir.equals("Euros")) {
				System.out.println((this.valor*13) + " Euros");
				return 0.0;
			}

		default:
			
			valorConvertido = 0.0;
		
		}
		return valorConvertido;
	
	}
	 

}

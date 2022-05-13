package team2.Calculadora.modelo;

import java.text.DecimalFormat;
import java.util.Iterator;

public class Calculadora {

	private String nombreMoneda;
	private String nombreMonedaConvertir;
	private double valorMoneda;
	private double valorMonedaConvertida;

	public Calculadora() {
		this.nombreMoneda = "Dolar";
		this.nombreMonedaConvertir = "Euros";
		this.valorMoneda = 0.0;
		this.valorMonedaConvertida = 0.0;

	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String moneda) {
		this.nombreMoneda = moneda;
	}

	public double getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(double valor) {
		this.valorMoneda = valor;
	}

	public String[] valoresMonedas() {
		String nombreMonedas[] = { "Dolar", "Euro", "Libra" };

		return nombreMonedas;
	}

	public String getNombreMonedaConvertir() {
		return nombreMonedaConvertir;
	}

	public void setNombreMonedaConvertir(String nombreMonedaConvertir) {
		this.nombreMonedaConvertir = nombreMonedaConvertir;
	}

	public double getValorMonedaConvertida() {
		return conversor();
	}

	public void setValorConvertido(double valorConvertido) {
		this.valorMonedaConvertida = valorConvertido;
	}

	private double conversor() {

		switch (this.nombreMoneda) {
		case "Dolar":

			if (this.nombreMonedaConvertir.equals("Euros")) {
				System.out.println((this.valorMoneda * 0.95) + " Euros");
				return 0.0;
			} else if (this.nombreMonedaConvertir.equals("Libra")) {
				System.out.println((this.valorMoneda * 13) + " Libras");
				return 0.0;
			}

			break;

		case "Euros":
			if (this.nombreMonedaConvertir.equals("Dolar")) {
				System.out.println((this.valorMoneda * 1.05) + " Dolar");
				return 0.0;
			} else if (this.nombreMonedaConvertir.equals("Libra")) {
				System.out.println((this.valorMoneda * 13) + " Libras");
				return 0.0;
			}
			break;

		case "Libra":
			if (this.nombreMonedaConvertir.equals("Dolar")) {
				System.out.println((this.valorMoneda * 0.95) + " Dolar");
				return 0.0;
			} else if (this.nombreMonedaConvertir.equals("Euros")) {
				System.out.println((this.valorMoneda * 13) + " Euros");
				return 0.0;
			}

		default:

			valorMonedaConvertida = 0.0;

		}
		return valorMonedaConvertida;

	}
	
	/*public String getStringMoneda() {
		
	this.valorMonedaString = df.format(this.valorMoneda);
	
	return valorMonedaString;
		
	}

	public void eliminarDigitoMoneda() {

		StringBuilder monedaString = new StringBuilder(this.getStringMoneda());
		monedaString.deleteCharAt(monedaString.length() - 1);
		this.valorMoneda = Double.parseDouble(monedaString.toString());

	}*/

	public void eliminarMoneda() {
		this.valorMoneda = 0.0;
	}

}

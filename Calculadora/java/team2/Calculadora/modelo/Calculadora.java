package team2.Calculadora.modelo;

import java.text.DecimalFormat;
import java.util.Iterator;
/**
 * 
 * java-full-stack-dev-u21 -  - Calculadora
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */
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

	public double conversor() {

		switch (this.nombreMoneda) {
		case "Dolar":

			if (this.nombreMonedaConvertir.equals("Euros")) {
				
				return this.valorMoneda * 0.95;
			} else if (this.nombreMonedaConvertir.equals("Libra")) {
		
				return this.valorMoneda * 0.82;
			}

			break;

		case "Euros":
			if (this.nombreMonedaConvertir.equals("Dolar")) {
				
				return this.valorMoneda * 1.04;
			} else if (this.nombreMonedaConvertir.equals("Libra")) {
				
				return this.valorMoneda * 0.85;
			}
			break;

		case "Libra":
			if (this.nombreMonedaConvertir.equals("Dolar")) {
				
				return this.valorMoneda * 1.23;
				
			} else if (this.nombreMonedaConvertir.equals("Euros")) {
				
				return this.valorMoneda * 1.18;
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

	public double eliminarMoneda() {
		this.valorMoneda = 0;
		
		return this.valorMoneda;
	}

}

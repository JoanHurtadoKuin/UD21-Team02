package team2.calculadora.modelo;

import java.text.DecimalFormat;
import java.util.Hashtable;

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

	private double valorMoneda;
	private double valorMonedaConvertida;
	private String conversion;
	private String monedaString;
	private String corvertidaString;
	private DecimalFormat formatoDecimal = new DecimalFormat("###.##");
	
	
	public Calculadora() {
		
	}
	/**
	 * @return the valorMoneda
	 */
	public double getValorMoneda() {
		return valorMoneda;
	}
	/**
	 * @param valorMoneda the valorMoneda to set
	 */
	public void setValorMoneda(double valorMoneda) {
		this.valorMoneda = valorMoneda;
	}
	/**
	 * @return the valorMonedaConvertida
	 */
	public double getValorMonedaConvertida() {
		return valorMonedaConvertida;
	}
	/**
	 * @param valorMonedaConvertida the valorMonedaConvertida to set
	 */
	public void setValorMonedaConvertida(double valorMonedaConvertida) {
		this.valorMonedaConvertida = valorMonedaConvertida;
	}

	public void covertirDolarEuro() {
		valorMonedaConvertida =  this.valorMoneda * 0.95;
	}

	public void covertirDolarLibra() {
		valorMonedaConvertida =  this.valorMoneda * 0.82;
	}
	
	public void covertirEuroLibra() {
		valorMonedaConvertida =  this.valorMoneda * 0.85;
	}
	
	public void covertirEuroDolar() {
		valorMonedaConvertida =  this.valorMoneda * 1.04;
	}

	public void covertirLibraEuro() {
		valorMonedaConvertida =  this.valorMoneda * 1.18;
	}

	public void covertirLibraDolar() {
		valorMonedaConvertida = this.valorMoneda * 1.23;
	}	
	
	public String[] nombreMonedas() {
		String nombreMonedas[] = { "Dolar", "Euro", "Libra" };

		return nombreMonedas;
	}
	
	/**
	 * @return the conversion
	 */
	public String getConversion() {
		return conversion;
	}
	/**
	 * @param conversion the conversion to set
	 */
	public void setConversion(String conversion) {
		this.conversion = conversion;
	}
	
	public void seleccionarConversion(String conversion) {
		
		switch (conversion) {
		case "DolarEuro":
			covertirDolarEuro();
			break;
		case "DolarLibra":
			covertirDolarLibra();
			break;
		case "EuroDolar":
			covertirEuroDolar();
			break;
		case "EuroLibra":
			covertirEuroLibra();
			break;
		case "LibraDolar":
			covertirLibraDolar();
			break;
		case "LibraEuro":
			covertirLibraEuro();
			break;
		default:
			valorMonedaConvertida  =  this.valorMoneda;
			break;
		}
	}
	/**
	 * @return the monedaString
	 */
	public String getMonedaString() {
		try {
			
			
			this.monedaString = String.valueOf(formatoDecimal.format(valorMoneda));
		} catch (Exception e) {
			
		}
		return monedaString;
	}
	/**
	 * @param monedaString the monedaString to set
	 */
	public void setMonedaString(String monedaString) {
		try {
			
			this.valorMoneda = Double.parseDouble(monedaString);
			
		} catch (Exception e) {
			
		}
		
		this.monedaString = monedaString;
	}
	/**
	 * @return the corvertidaString
	 */
	public String getCorvertidaString() {
		try {
			
			this.corvertidaString = String.valueOf(formatoDecimal.format(valorMonedaConvertida));
			
		} catch (Exception e) {
			
		}
		return corvertidaString;
	}
	/**
	 * @param corvertidaString the corvertidaString to set
	 */
	public void setCorvertidaString(String corvertidaString) {
		try {
			
			this.valorMonedaConvertida = Double.parseDouble(corvertidaString);
			
		} catch (Exception e) {
			
		}
		this.corvertidaString = corvertidaString;
	}
	
	
	
}

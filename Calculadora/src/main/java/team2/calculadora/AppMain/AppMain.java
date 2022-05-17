package team2.calculadora.AppMain;

import java.awt.EventQueue;



import team2.calculadora.controlador.CalculadoraControlador;
import team2.calculadora.modelo.Calculadora;
import team2.calculadora.vista.CalculadoraDivisasApp;
/**
 * 
 * java-full-stack-dev-u21 -  - AppMain
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */

public class AppMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {					
					
					Calculadora calculadoraModelo = new Calculadora();
					CalculadoraDivisasApp calculadoraVista = new CalculadoraDivisasApp();
					calculadoraVista.setVisible(true);
					CalculadoraControlador cc = new CalculadoraControlador(calculadoraModelo,calculadoraVista);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		

	}

}

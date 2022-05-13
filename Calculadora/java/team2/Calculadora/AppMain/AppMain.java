package team2.Calculadora.AppMain;

import java.awt.EventQueue;
import java.awt.Frame;

import team2.Calculadora.controlador.CalculadoraControlador;
import team2.Calculadora.modelo.Calculadora;
import team2.Calculadora.vista.CalculadoraDivisasApp;
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

package team2.Calculadora.AppMain;

import java.awt.EventQueue;
import java.awt.Frame;

import team2.Calculadora.controlador.CalculadoraControlador;
import team2.Calculadora.modelo.Calculadora;
import team2.Calculadora.vista.CalculadoraDivisasApp;

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

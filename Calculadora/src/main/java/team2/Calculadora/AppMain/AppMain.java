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
					CalculadoraDivisasApp frame = new CalculadoraDivisasApp();
					frame.setVisible(true);
					
					 Calculadora calculadoraModelo = new Calculadora();
					 CalculadoraControlador cc = new CalculadoraControlador(calculadoraModelo,frame);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		

	}

}

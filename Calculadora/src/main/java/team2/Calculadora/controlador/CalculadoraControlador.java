package team2.Calculadora.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import team2.Calculadora.modelo.Calculadora;
import team2.Calculadora.vista.CalculadoraDivisasApp;

public class CalculadoraControlador implements ActionListener{

	private Calculadora calculadoraModelo;
	private CalculadoraDivisasApp calculadoraVista;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(this.calculadoraVista.btnBorrar == e.getSource()) {
			System.out.println("hola");
		}
		
	}
	
	public CalculadoraControlador(Calculadora calculadoraModelo, CalculadoraDivisasApp calculadoraVista) {
		this.calculadoraModelo = calculadoraModelo;
		this.calculadoraVista = calculadoraVista;
		this.calculadoraVista.btnBorrar.addActionListener(this);
	}

	public Calculadora getCalculadoraModelo() {
		return calculadoraModelo;
	}

	public void setCalculadoraModelo(Calculadora calculadoraModelo) {
		this.calculadoraModelo = calculadoraModelo;
	}

	public CalculadoraDivisasApp getCalculadoraVista() {
		return calculadoraVista;
	}

	public void setCalculadoraVista(CalculadoraDivisasApp calculadoraVista) {
		this.calculadoraVista = calculadoraVista;
	}


	
	

}

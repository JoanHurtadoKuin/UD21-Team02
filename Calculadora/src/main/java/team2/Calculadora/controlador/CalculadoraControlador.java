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
		
		if(this.calculadoraVista.btnBorrar == e.getSource()) { //Ejemplo de boton de eliminar 1 digito
			System.out.println("hola"); //Aun no esta el metodo
		}
		//Faltan botones de numeros y en la clase calculadoraModelo llamar a los metodos  -> calculadora.conversor();
		
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

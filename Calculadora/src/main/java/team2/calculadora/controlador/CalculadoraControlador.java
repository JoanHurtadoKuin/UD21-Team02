package team2.calculadora.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;

import team2.calculadora.modelo.Calculadora;
import team2.calculadora.vista.CalculadoraDivisasApp;


/**
 * 
 * java-full-stack-dev-u21 -  - CalculadoraControlador
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */

public class CalculadoraControlador implements ActionListener {

	private Calculadora calculadoraModelo;
	private CalculadoraDivisasApp calculadoraVista;
	DecimalFormat formatoDecimal;
	private int decimales;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object componente = e.getSource();
		
		if (this.calculadoraVista.cmbMoneda1 == componente  || this.calculadoraVista.cmbMoneda2 == componente) { 
			
			this.calculadoraModelo.seleccionarConversion(this.calculadoraVista.cmbMoneda1.getSelectedItem().toString() + this.calculadoraVista.cmbMoneda2.getSelectedItem().toString());
			this.calculadoraVista.lblMoneda2.setText(this.calculadoraModelo.getCorvertidaString()); 
			
		}
		
		if (this.calculadoraVista.btnBorrar == componente) { 
			
			String textMoneda1 = this.calculadoraVista.lblMoneda1.getText();
			
			if (textMoneda1.length() > 1) {
				
				this.calculadoraVista.lblMoneda1.setText(textMoneda1.substring(0, textMoneda1.length() - 1));
				this.calculadoraModelo.setMonedaString(this.calculadoraVista.lblMoneda1.getText());
				this.calculadoraModelo.seleccionarConversion(this.calculadoraVista.cmbMoneda1.getSelectedItem().toString() + this.calculadoraVista.cmbMoneda2.getSelectedItem().toString());
				this.calculadoraVista.lblMoneda2.setText(this.calculadoraModelo.getCorvertidaString());
				
				if (decimales > 0) {
					
					decimales--;
					
				}
				
				
			} else {
				
				this.calculadoraVista.lblMoneda1.setText("0");
				this.calculadoraVista.lblMoneda2.setText("0");
				this.calculadoraVista.btnComa.setEnabled(true);
				
			}
			
	
		} else if (this.calculadoraVista.btnCe == componente) {
			
			this.calculadoraVista.lblMoneda1.setText("0");
			this.calculadoraVista.lblMoneda2.setText("0");
			this.calculadoraVista.btnComa.setEnabled(true);
			
		} else if (this.calculadoraVista.btn9 == componente) {
			
			clickBotones(this.calculadoraVista.btn9);
			
		} else if (this.calculadoraVista.btn8 == componente) {
			
			clickBotones(this.calculadoraVista.btn8);
			
			
		} else if (this.calculadoraVista.btn7 == componente) {
			
			clickBotones(this.calculadoraVista.btn7);
			
		} else if (this.calculadoraVista.btn6 == componente) {

			clickBotones(this.calculadoraVista.btn6);
			
			
		} else if (this.calculadoraVista.btn5 == componente) {
			
			clickBotones(this.calculadoraVista.btn5);
			
		} else if (this.calculadoraVista.btn4 == componente) {
			
			clickBotones(this.calculadoraVista.btn4);
			
		} else if (this.calculadoraVista.btn3 == componente) {
			
			clickBotones(this.calculadoraVista.btn3);
			
		} else if (this.calculadoraVista.btn2 == componente) {
			
			clickBotones(this.calculadoraVista.btn2);
			
		} else if (this.calculadoraVista.btn1 == componente) {
			
			clickBotones(this.calculadoraVista.btn1);
			
		} else if (this.calculadoraVista.btn0 == componente) {
			
			clickBotones(this.calculadoraVista.btn0);
			
		} else if (this.calculadoraVista.btnComa == componente) {
				
			this.calculadoraVista.btnComa.setEnabled(false);
				
		}
		

		
	}

	public CalculadoraControlador(Calculadora calculadoraModelo, CalculadoraDivisasApp calculadoraVista) {
		
		this.calculadoraModelo = calculadoraModelo;
		this.calculadoraVista = calculadoraVista;
		this.calculadoraModelo.setValorMoneda(0);
		
		String arrayMonedas[] = this.calculadoraModelo.nombreMonedas();
		

		this.calculadoraVista.btnBorrar.addActionListener(this);
		this.calculadoraVista.btnCe.addActionListener(this);
		this.calculadoraVista.btn9.addActionListener(this);
		this.calculadoraVista.btn8.addActionListener(this);
		this.calculadoraVista.btn7.addActionListener(this);
		this.calculadoraVista.btn6.addActionListener(this);
		this.calculadoraVista.btn5.addActionListener(this);
		this.calculadoraVista.btn4.addActionListener(this);
		this.calculadoraVista.btn3.addActionListener(this);
		this.calculadoraVista.btn2.addActionListener(this);
		this.calculadoraVista.btn1.addActionListener(this);
		this.calculadoraVista.btn0.addActionListener(this);
		this.calculadoraVista.btnComa.addActionListener(this);
		this.calculadoraVista.btnComa.addActionListener(this);
		
		//this.calculadoraVista.
		this.formatoDecimal = new DecimalFormat("###.##");
		//Rellenar ComboBox
		for (int i = 0; i < arrayMonedas.length; i++) {		
			this.calculadoraVista.cmbMoneda1.addItem(arrayMonedas[i]);
			this.calculadoraVista.cmbMoneda2.addItem(arrayMonedas[i]);		
		}
		
		
		this.calculadoraModelo.seleccionarConversion(this.calculadoraVista.cmbMoneda1.getSelectedItem().toString() + this.calculadoraVista.cmbMoneda2.getSelectedItem().toString());
		this.calculadoraVista.cmbMoneda1.addActionListener(this);
		this.calculadoraVista.cmbMoneda2.addActionListener(this);
		this.calculadoraVista.lblMoneda1.setText("0");
		this.calculadoraVista.lblMoneda2.setText("0");
		this.decimales = 0;
		
	}
	
	private void clickBotones(JButton botonNumero) {
		
		
		if (!this.calculadoraVista.btnComa.isEnabled()) {
			String textoDecimal = "";
			
			this.calculadoraModelo.setMonedaString(this.calculadoraVista.lblMoneda1.getText());
			this.calculadoraModelo.seleccionarConversion(this.calculadoraVista.cmbMoneda1.getSelectedItem().toString()
					+ this.calculadoraVista.cmbMoneda2.getSelectedItem().toString());
			
			if (decimales == 0) {
				
				textoDecimal = ".00";
				
				
			} else if (decimales == 1) {
				
				textoDecimal = this.calculadoraVista.lblMoneda1.getText() + "." + botonNumero.getText();
				decimales++;
				
			} else if (decimales == 2){
				
				textoDecimal = this.calculadoraVista.lblMoneda1.getText() + botonNumero.getText();
				decimales++;
			}
			
			this.calculadoraVista.lblMoneda1.setText(this.calculadoraModelo.getMonedaString() + textoDecimal);
			this.calculadoraVista.lblMoneda2.setText(this.calculadoraModelo.getCorvertidaString());
			
		} else {
			
			if (this.calculadoraVista.lblMoneda1.getText() == "0") {

				this.calculadoraVista.lblMoneda1.setText(botonNumero.getText());
				
			} else {

				this.calculadoraVista.lblMoneda1.setText(this.calculadoraVista.lblMoneda1.getText() + botonNumero.getText());
				this.calculadoraModelo.setMonedaString(this.calculadoraVista.lblMoneda1.getText());
				this.calculadoraModelo.seleccionarConversion(this.calculadoraVista.cmbMoneda1.getSelectedItem().toString()
								+ this.calculadoraVista.cmbMoneda2.getSelectedItem().toString());
				this.calculadoraVista.lblMoneda2.setText(this.calculadoraModelo.getCorvertidaString());

			}
			
		}
		
		
		
	}
	
}

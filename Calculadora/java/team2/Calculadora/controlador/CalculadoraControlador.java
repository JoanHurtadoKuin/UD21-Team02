package team2.Calculadora.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import team2.Calculadora.modelo.Calculadora;
import team2.Calculadora.vista.CalculadoraDivisasApp;

public class CalculadoraControlador implements ActionListener {

	private Calculadora calculadoraModelo;
	private CalculadoraDivisasApp calculadoraVista;
	private String valorMoneda;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.valorMoneda = this.calculadoraVista.lblMoneda1.getText();
		System.out.println(this.valorMoneda);

		if (this.calculadoraVista.btnBorrar == e.getSource()) { 
			System.out.println("hola"); // Aun no esta el metodo
		} else if (this.calculadoraVista.btnCe == e.getSource()) {
			
			System.out.println(this.calculadoraModelo.eliminarMoneda());
			this.calculadoraModelo.setValorMoneda(this.calculadoraModelo.eliminarMoneda());
			this.calculadoraVista.lblMoneda1.setText(this.calculadoraModelo.eliminarMoneda() + "");
			System.out.println("Eliminar");
			
		} else if (this.calculadoraVista.btn9 == e.getSource()) {
			
			this.valorMoneda += 9;
			this.calculadoraVista.lblMoneda1.setText(this.valorMoneda);
			this.calculadoraModelo.setValorMoneda(Double.parseDouble(this.valorMoneda));
			this.calculadoraVista.lblMoneda2.setText(this.calculadoraModelo.getValorMonedaConvertida() + "€");
			
		} else if (this.calculadoraVista.btn8 == e.getSource()) {
			this.valorMoneda += 8;
			this.calculadoraVista.lblMoneda1.setText(this.valorMoneda);
			this.calculadoraModelo.setValorMoneda(Double.parseDouble(this.valorMoneda));
			
			String monedaConvertida = this.calculadoraModelo.conversor() + "";
			System.out.println(monedaConvertida + " AAAA");
			System.out.println(" AAAA");
			this.calculadoraVista.lblMoneda2.setText(monedaConvertida);
		} else if (this.calculadoraVista.btn7 == e.getSource()) {

		} else if (this.calculadoraVista.btn6 == e.getSource()) {

		} else if (this.calculadoraVista.btn5 == e.getSource()) {

		} else if (this.calculadoraVista.btn4 == e.getSource()) {

		} else if (this.calculadoraVista.btn3 == e.getSource()) {

		} else if (this.calculadoraVista.btn2 == e.getSource()) {

		} else if (this.calculadoraVista.btn1 == e.getSource()) {

		} else if (this.calculadoraVista.btn0 == e.getSource()) {

		} else if (this.calculadoraVista.btnComa == e.getSource()) {

		}
		// Faltan botones de numeros y en la clase calculadoraModelo llamar a los
		// metodos -> calculadora.conversor();

	}

	public CalculadoraControlador(Calculadora calculadoraModelo, CalculadoraDivisasApp calculadoraVista) {
		
		this.calculadoraModelo = calculadoraModelo;
		this.calculadoraVista = calculadoraVista;
		
		String arrayMonedas[] = this.calculadoraModelo.valoresMonedas();
		

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
		
		//Rellenar ComboBox
		for (int i = 0; i < arrayMonedas.length; i++) {		
			this.calculadoraVista.cmbMoneda1.addItem(arrayMonedas[i]);
			this.calculadoraVista.cmbMoneda2.addItem(arrayMonedas[i]);		
		}
		
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

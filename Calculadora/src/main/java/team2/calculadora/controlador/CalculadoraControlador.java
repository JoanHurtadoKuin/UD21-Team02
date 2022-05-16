package team2.calculadora.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

<<<<<<< HEAD:Calculadora/src/main/java/team2/calculadora/controlador/CalculadoraControlador.java
import team2.calculadora.modelo.Calculadora;
import team2.calculadora.vista.CalculadoraDivisasApp;

=======
import team2.Calculadora.modelo.Calculadora;
import team2.Calculadora.vista.CalculadoraDivisasApp;
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
>>>>>>> 1febfa06b643aff7781420ee6731e539648f82e5:Calculadora/java/team2/Calculadora/controlador/CalculadoraControlador.java
public class CalculadoraControlador implements ActionListener {

	private Calculadora calculadoraModelo;
	private CalculadoraDivisasApp calculadoraVista;
	private String valorMoneda;
	DecimalFormat formatoDecimal;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.valorMoneda = this.calculadoraVista.lblMoneda1.getText();
		System.out.println(this.valorMoneda);
		if (!this.valorMoneda.isEmpty()) {
			
			this.calculadoraModelo.setValorMoneda(Double.valueOf(valorMoneda));
			
		}
		
		if (this.calculadoraVista.btnBorrar == e.getSource()) { 
			System.out.println("hola"); // Aun no esta el metodo
		} else if (this.calculadoraVista.btnCe == e.getSource()) {
			
			System.out.println(this.calculadoraModelo.eliminarMoneda());
			this.calculadoraModelo.setValorMoneda(this.calculadoraModelo.eliminarMoneda());
			this.calculadoraVista.lblMoneda1.setText(this.calculadoraModelo.eliminarMoneda() + "");
			
		} else if (this.calculadoraVista.btn9 == e.getSource()) {
			
			this.valorMoneda += 9;
			
		} else if (this.calculadoraVista.btn8 == e.getSource()) {
			
			this.valorMoneda += 8;
			
			
		} else if (this.calculadoraVista.btn7 == e.getSource()) {
			
			this.valorMoneda += 7;
			
		} else if (this.calculadoraVista.btn6 == e.getSource()) {

			this.valorMoneda += 6;
			
			
		} else if (this.calculadoraVista.btn5 == e.getSource()) {
			
			this.valorMoneda += 5;
			
		} else if (this.calculadoraVista.btn4 == e.getSource()) {
			
			this.valorMoneda += 4;
			
		} else if (this.calculadoraVista.btn3 == e.getSource()) {
			
			this.valorMoneda += 3;
			
		} else if (this.calculadoraVista.btn2 == e.getSource()) {
			
			this.valorMoneda += 2;
			
		} else if (this.calculadoraVista.btn1 == e.getSource()) {
			
			this.valorMoneda += 1;
			
		} else if (this.calculadoraVista.btn0 == e.getSource()) {
			
			this.valorMoneda += 0;
			
		} else if (this.calculadoraVista.btnComa == e.getSource()) {
			
			this.valorMoneda = formatoDecimal.format(this.valorMoneda);
			
		}
		
		if (!this.valorMoneda.isEmpty()) {
			
			this.calculadoraModelo.setValorMoneda(Double.parseDouble(this.valorMoneda));
		}
		
		this.calculadoraVista.lblMoneda1.setText(this.valorMoneda);
		this.calculadoraModelo.setNombreMoneda(this.valorMoneda);
		this.calculadoraVista.lblMoneda2.setText(String.valueOf(this.calculadoraModelo.getValorMonedaConvertida()));
		
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
		this.formatoDecimal = new DecimalFormat("###.##");
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

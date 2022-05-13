package team2.Calculadora.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
/**
 * 
 * java-full-stack-dev-u21 -  - CalculadoraDivisasApp
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */
public class CalculadoraDivisasApp extends JFrame {

	private JPanel contentPane; // DANIII
	public JButton btnBorrar; // Coge los Jbuttons y inicializalos aqui arriba en public
	public JButton btnCe;
	public JButton btn9;
	public JButton btn8;
	public JButton btn7;
	public JButton btn6;
	public JButton btn5;
	public JButton btn4;
	public JButton btn3;
	public JButton btn2;
	public JButton btn1;
	public JButton btn0;
	public JButton btnComa;
	public JLabel lblNewLabel;
	public JComboBox cmbMoneda1;
	public JComboBox cmbMoneda2;
	public JLabel lblMoneda1;
	public JLabel lblMoneda2;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CalculadoraDivisasApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(350, 10, 75, 75);
		contentPane.add(btnBorrar);

		btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCe.setBounds(275, 10, 75, 75);
		contentPane.add(btnCe);

		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.setBounds(350, 85, 75, 75);
		contentPane.add(btn9);

		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(275, 85, 75, 75);
		contentPane.add(btn8);

		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.setBounds(200, 85, 75, 75);
		contentPane.add(btn7);

		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(350, 160, 75, 75);
		contentPane.add(btn6);

		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(350, 235, 75, 75);
		contentPane.add(btn3);

		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(275, 160, 75, 75);
		contentPane.add(btn5);

		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(275, 235, 75, 75);
		contentPane.add(btn2);

		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(200, 160, 75, 75);
		contentPane.add(btn4);

		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(200, 235, 75, 75);
		contentPane.add(btn1);

		btnComa = new JButton(",");
		btnComa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnComa.setBounds(350, 310, 75, 75);
		contentPane.add(btnComa);

		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn0.setBounds(275, 310, 75, 75);
		contentPane.add(btn0);

		lblMoneda1 = new JLabel("");
		lblMoneda1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMoneda1.setBounds(10, 34, 167, 51);
		contentPane.add(lblMoneda1);

		lblMoneda2 = new JLabel("");
		lblMoneda2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMoneda2.setBounds(10, 184, 167, 51);
		contentPane.add(lblMoneda2);

		cmbMoneda1 = new JComboBox<String>();
		cmbMoneda1.setBounds(10, 85, 167, 22);
		contentPane.add(cmbMoneda1);

		cmbMoneda2 = new JComboBox<String>();
		cmbMoneda2.setBounds(10, 235, 167, 22);
		contentPane.add(cmbMoneda2);

		lblNewLabel = new JLabel("1 EURO = 1,0508 USD");
		lblNewLabel.setBounds(10, 341, 167, 22);
		contentPane.add(lblNewLabel);
	}
}

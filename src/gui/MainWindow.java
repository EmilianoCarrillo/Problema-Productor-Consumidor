package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.Color;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 551, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner n_consumos = new JSpinner();
		n_consumos.setBounds(19, 38, 166, 26);
		frame.getContentPane().add(n_consumos);
		
		JLabel lblNewLabel = new JLabel("No. artículos a consumir");
		lblNewLabel.setBounds(19, 17, 166, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNoArtculosA = new JLabel("No. artículos a producir");
		lblNoArtculosA.setBounds(19, 76, 166, 16);
		frame.getContentPane().add(lblNoArtculosA);
		
		JSpinner n_productos = new JSpinner();
		n_productos.setBounds(19, 97, 166, 26);
		frame.getContentPane().add(n_productos);
		
		JLabel lblTiempoDeProduccin = new JLabel("Tiempo de consumo");
		lblTiempoDeProduccin.setBounds(197, 17, 166, 16);
		frame.getContentPane().add(lblTiempoDeProduccin);
		
		JSpinner t_consumo = new JSpinner();
		t_consumo.setBounds(197, 38, 166, 26);
		frame.getContentPane().add(t_consumo);
		
		JLabel lblTiempoDeProduccin_1 = new JLabel("Tiempo de producción");
		lblTiempoDeProduccin_1.setBounds(197, 76, 166, 16);
		frame.getContentPane().add(lblTiempoDeProduccin_1);
		
		JSpinner t_produccion = new JSpinner();
		t_produccion.setBounds(197, 97, 166, 26);
		frame.getContentPane().add(t_produccion);
		
		JButton btn_iniciar = new JButton("Iniciar");
		btn_iniciar.setBounds(386, 29, 141, 47);
		frame.getContentPane().add(btn_iniciar);
		
		JButton btn_parar = new JButton("Parar");
		btn_parar.setBounds(386, 76, 141, 47);
		frame.getContentPane().add(btn_parar);
		
		Canvas canvas = new MyCanvas();
		canvas.setBackground(Color.white);
		canvas.setBounds(19, 152, 500, 410);
		frame.getContentPane().add(canvas);
	}
}

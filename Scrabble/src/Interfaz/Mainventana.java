package Interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import socketServer.Client;

public class Mainventana extends JFrame implements ActionListener{

	private Tablero tablero;
	public Mainventana() {
		
    	
    	
		setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		ImageIcon vent = new ImageIcon("src/Interfaz/images/ventana.png");
		ImageIcon icono = new ImageIcon("src/Interfaz/images/Icono.png");
		setIconImage(icono.getImage());

		JLabel ventana = new JLabel(vent);
		ventana.setBounds(0, 0, 600,600);
		add(ventana);
		
		
		setVisible(true);
		
		
		
		
		

		JButton butt = new JButton();
		butt.setText("Play");
        butt.setBounds(0, 600, 120, 70);
        add(butt);
        
        tablero = new Tablero();
        butt.addActionListener(this);}
        
		
		
        public void actionPerformed(ActionEvent e) {
        		this.setVisible(false);
                this.dispose();
                this.tablero.cargarFichas();
                this.tablero.cargarTablero();
                this.tablero.setVisible(true);
                Client cliente = Client.getInstance();
                cliente.start();
            }
        
        public Tablero getTablero() {
        	return this.tablero;
        }

    	public static void main(String args[]) {
    		new Mainventana();
    		
    	}
}

package Interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import socketServer.Client;

public class Mainventana extends JFrame implements ActionListener{
	/**

 * Esta clase se encarga de manejar la ventana que se vera durante el juego

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */

	private Tablero tablero;
	public Mainventana() {
		/**

 * Este metodo se encarga de definir las caracteristicas de la ventana

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
		
    	
    	
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
		/**

 * Este metodo se encarga de ejecutar las acciones

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
        		this.setVisible(false);
                this.dispose();
                this.tablero.cargarFichas();
                this.tablero.cargarTablero();
                this.tablero.setVisible(true);
                Client cliente = Client.getInstance();
                cliente.start();
            }
        
        public Tablero getTablero() {
		/**

 * Este metodo se encarga de retornar el tablero

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
        	return this.tablero;
        }

    	public static void main(String args[]) {
    		new Mainventana();
    		
    	}
}

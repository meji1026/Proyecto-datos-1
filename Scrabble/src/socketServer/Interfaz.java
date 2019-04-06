package socketServer;
import javax.swing.*;

import estructurasDeDatos.ListaEnlazadaSimple;
import palabras.Letra;

import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {

	private Client cliente;
	ListaEnlazadaSimple<Letra> lista;
	//se utiliza para crear botones(JButton)
	private JButton botonC;
	
	
	public Interfaz(Client client, ListaEnlazadaSimple<Letra> lista) {
		//indica que vamos a utilizar coordinadas para ubicar la interfaz en cierto punto 
		//y el null dice que no haga nada hasta que demos la instruccion
		this.cliente = client;
		this.lista = lista;
		setLayout(null);
	
		
		//se indica el texto que tendra la etiqueta
		
		
		botonC = new JButton("Enviar Palabra");
		botonC.setBounds(100, 200, 150, 30);
		add(botonC);
		//agrega action listener para que este a la espera de ejecutar algo al presionar el boton
		botonC.addActionListener(this);
		
	}
	
	
	//metodo que captura los eventos de action listener
	public void actionPerformed(ActionEvent e) {
		//getSource devuelve la fuente del evento, es decir devuelve la variable o el objeto que esta ejecuenta algun evento
		//por ejemplo devuelve el boton que se esta presionando para que se ejecute un evento especifico
		if(e.getSource() == botonC) {
			this.cliente.setLista(lista);
		}
	}
		
}
package socketServer;
import javax.swing.*;

import estructurasDeDatos.ListaEnlazadaSimple;
import palabras.Letra;

import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {

	private Client cliente;
	ListaEnlazadaSimple<Letra> lista;
	ListaEnlazadaSimple<Letra> lista2;
	//se utiliza para crear botones(JButton)
	private JButton boton1;
	private JButton boton2;
	
	public Interfaz(Client client, ListaEnlazadaSimple<Letra> lista , ListaEnlazadaSimple<Letra> lista2 ) {
		//indica que vamos a utilizar coordinadas para ubicar la interfaz en cierto punto 
		//y el null dice que no haga nada hasta que demos la instruccion
		this.cliente = client;
		this.lista = lista;
		this.lista2 = lista2;
		setLayout(null);
	
		
		//se indica el texto que tendra la etiqueta
		
		
		boton1 = new JButton("Enviar Palabra");
		boton1.setBounds(30, 200, 150, 30);
		add(boton1);
		//agrega action listener para que este a la espera de ejecutar algo al presionar el boton
		boton1.addActionListener(this);
		
		boton2 = new JButton("Enviar Palabra 2");
		boton2.setBounds(200, 200, 150, 30);
		add(boton2);
		//agrega action listener para que este a la espera de ejecutar algo al presionar el boton
		boton2.addActionListener(this);
		

	}
	
	
	//metodo que captura los eventos de action listener
	public void actionPerformed(ActionEvent e) {
		//getSource devuelve la fuente del evento, es decir devuelve la variable o el objeto que esta ejecuenta algun evento
		//por ejemplo devuelve el boton que se esta presionando para que se ejecute un evento especifico
		if(e.getSource() == boton1) {
			this.cliente.setLista(lista);
		}
		if(e.getSource() == boton2) {
			this.cliente.setLista(lista2);
		}	
	}
		
}
package Interfaz;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import estructurasDeDatos.ListaEnlazadaSimple;
import socketServer.Client;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

import Entidades.Ficha;
import Entidades.Jugador;

public class DragMouseAdapter extends MouseAdapter{
	
	private ListaEnlazadaSimple<Ficha> lista = new ListaEnlazadaSimple<Ficha>();
	Client cliente = Client.getInstance();
	
	public void mousePressed(MouseEvent e) {
		Jugador jugador = Jugador.getInstance();
		JComponent c = (JComponent) e.getSource();
		if(c.getName() == "button1") {
			
			
			
			System.out.println(jugador.palabra.getLen());
			cliente.setLista(jugador.palabra);
			jugador.enviar_palabra();

	}else {
		JLabel j = (JLabel) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.MOVE);
		//System.out.println(j.getText());
		Ficha auxFicha = new Ficha(j.getText());
		jugador.letra = auxFicha.getLetra();
		
		System.out.println(auxFicha.getLetra());
		//lista.addLast(auxFicha);
		}
		//System.out.println("SE IMPRIME LA LISTA");
		//lista.print();
		//System.out.println(A.getValor());
	}
	
	public ListaEnlazadaSimple<Ficha> getListaFichas(){
		return lista;
	}
	
	

	
	
}

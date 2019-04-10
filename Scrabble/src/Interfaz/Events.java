package Interfaz;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

import Entidades.Jugador;

public class Events implements MouseListener {
	public void mousePressed(MouseEvent e) {
		Jugador j = Jugador.getInstance();
		JComponent c = (JComponent) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.COPY);
		j.pos = c.getName();
		j.agregar_letra(j.letra, j.pos);
		
		
		System.out.println(c.getName());
		//System.out.println(A.getValor());
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
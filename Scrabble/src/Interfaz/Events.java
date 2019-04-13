package Interfaz;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

import Entidades.Ficha;
import Entidades.Jugador;

public class Events implements MouseListener {
	/**

 * Esta clase se encarga del majo de los eventos en el juego

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
	
	public void mousePressed(MouseEvent e) {
		/**

 * Este metodo se encarga de ver si el mouse esta presionado o no

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
		
		Jugador j = Jugador.getInstance();
	
		JComponent c = (JComponent) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.COPY);
		j.pos = c.getName();
		j.agregar_letra(j.letra, j.pos);
		j.palabra.addLast(new Ficha(j.letra,j.pos));
		j.letra="null";
		
		
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

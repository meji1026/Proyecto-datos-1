package Interfaz;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

public class DragMouseAdapter extends MouseAdapter{
	
	
	
	public void mousePressed(MouseEvent e) {
		JComponent c = (JComponent) e.getSource();
		JLabel j = (JLabel) e.getSource();
		System.out.println(j.getText());
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.MOVE);
		//System.out.println(A.getValor());
	}
	
	
	
	
	
}

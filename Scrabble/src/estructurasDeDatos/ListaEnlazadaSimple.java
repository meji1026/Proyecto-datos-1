package estructurasDeDatos;

import Entidades.Ficha;

public class ListaEnlazadaSimple <T> implements java.io.Serializable{
	/**

 * Esta clase se encarga de el manejo de la lista enlazada que representa la palabra

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
	
	private int len;
	private Nodo <T> first;

	public ListaEnlazadaSimple() {
		len = 0;
		setFirst(null);}

	public boolean isEmpty() {
		return this.getFirst() == null; }

	public int getLen() {
		return this.len;}

	public void addLast(T data) {
		/**

 * Este metodo se encarga de anadir una letra a la lista enlazada 

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
		Nodo <T> newNodo = new Nodo <T>();
		newNodo.setData(data);
		if(isEmpty()) {
			this.setFirst(newNodo);
			len += 1;}
		else {
			Nodo <T> aux = this.getFirst();
			while (aux.getNext()!= null) {
				aux = aux.getNext();}
			aux.setNext(newNodo);
			len+=1;

		}

	}
	
	
	public void deleteLast() {/**

 * Este metodo se encarga de eliminar un elemnto al final de la lista enlazada 

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
		Nodo<T> aux = new Nodo<T>();
		aux = getFirst();
		if(isEmpty() || len == 1 ) {
			setFirst(null);
		}
		else {
			while(aux.getNext().getNext()!=null){
				aux = aux.getNext();
			}
		aux.setNext(null);
		}
		len--;
	}
	
	public void print() {
		Nodo <T> aux = (Nodo<T>) this.getFirst();
		while (aux != null) {
			System.out.println(aux.getData());
			aux = aux.getNext();}
		
	}

	public Nodo <T> getFirst() {
		return first;
	}

	public void setFirst(Nodo <T> first) {
		this.first = first;
	}
}






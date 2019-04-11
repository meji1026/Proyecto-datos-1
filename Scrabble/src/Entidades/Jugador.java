package Entidades;

import estructurasDeDatos.ListaEnlazadaSimple;


public class Jugador{
	static Jugador j = new Jugador();
	public String letra = "";
	public String pos = "";
	
	public String[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}
	public ListaEnlazadaSimple<Ficha> getPalabra() {
		return palabra;
	}
	public void setPalabra(ListaEnlazadaSimple<Ficha> palabra) {
		this.palabra = palabra;
	}
	private Jugador() {
		
	}
	public static Jugador getInstance() {
		return j;
	}
	public String matriz[][] = new String[15][15];
	public  ListaEnlazadaSimple<Ficha> palabra = new ListaEnlazadaSimple<Ficha>();
	
	
	public void agregar_letra(String letra, String pos) {
		if(pos.length()==2) {
		j.matriz[Integer.parseInt(Character.toString(j.pos.charAt(0)))][Integer.parseInt(Character.toString(j.pos.charAt(1)))] = j.letra;
		}else if (pos.length()==3){
			j.matriz[Integer.parseInt(Character.toString(j.pos.charAt(0)))][Integer.parseInt(Character.toString(j.pos.charAt(1))+Character.toString(j.pos.charAt(2)))] = j.letra;
		}
		else if (pos.length()==4){
			j.matriz[Integer.parseInt(Character.toString(j.pos.charAt(0))+Character.toString(j.pos.charAt(1)))][Integer.parseInt(Character.toString(j.pos.charAt(2))+Character.toString(j.pos.charAt(3)))] = j.letra;
		}else if (pos.length()==5){
			j.matriz[Integer.parseInt(Character.toString(j.pos.charAt(0))+Character.toString(j.pos.charAt(1)))][Integer.parseInt(Character.toString(j.pos.charAt(2)))] = j.letra;
		}
	
		
		
		
	}
	public void enviar_palabra() {
		palabra.print();
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		j.palabra = new ListaEnlazadaSimple<Ficha>();
	}
}

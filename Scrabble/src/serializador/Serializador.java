package serializador;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Entidades.Ficha;
import estructurasDeDatos.ListaEnlazadaSimple;
import estructurasDeDatos.Nodo;
import socketServer.Server;


public class Serializador {
	static ObjectMapper mapper = new ObjectMapper();
	
	public static <T> String serializar( ListaEnlazadaSimple<T> Lista) throws IOException {
		Nodo <T> aux = Lista.getFirst();
		String json = "[";
		while (aux != null) {
			String jsonTemp = mapper.writerWithDefaultPrettyPrinter()
		            .writeValueAsString(aux.getData());
			
			aux = aux.getNext();
			json =json + jsonTemp;
		
				json = json+",";
			
			}
		json = json +"{}" +"]";
		
		

	return json;	
	
	}
	
	public static ArrayList<Ficha> deserializar(String json) throws JsonParseException, JsonMappingException, IOException {
		
		ArrayList<Ficha> objeto = mapper.readValue(json, new TypeReference<ArrayList<Ficha>>(){});
		
		return objeto;
		
		
	}
	
	public static String palabra(ArrayList<Ficha> palabra) {
		int contador = 0;
		String word = "";
		while(contador < palabra.size()-1) {
			
			if(palabra.get(contador).getValor() == 0) {
				System.out.println("Hola");
				String pos = palabra.get(contador).getPos();
				if(pos.length()==2) {
					word = word + Server.getMatriz()[Integer.parseInt(Character.toString(pos.charAt(0)))][Integer.parseInt(Character.toString(pos.charAt(1)))] ;
					}else if (pos.length()==3){
						word = word + Server.getMatriz()[Integer.parseInt(Character.toString(pos.charAt(0)))][Integer.parseInt(Character.toString(pos.charAt(1))+Character.toString(pos.charAt(2)))] ;
					}
					else if (pos.length()==4){
						word = word + Server.getMatriz()[Integer.parseInt(Character.toString(pos.charAt(0))+Character.toString(pos.charAt(1)))][Integer.parseInt(Character.toString(pos.charAt(2))+Character.toString(pos.charAt(3)))] ;
					}else if (pos.length()==5){
						word = word + Server.getMatriz()[Integer.parseInt(Character.toString(pos.charAt(0))+Character.toString(pos.charAt(1)))][Integer.parseInt(Character.toString(pos.charAt(2)))];
					}
				
	
			}else {
			word = word + palabra.get(contador).getLetra();
			}
			contador++;
		}
		return word;
			
		
	}
	
	
	public static int puntaje(ArrayList<Ficha> palabra) {
		int puntaje = 0;
		int contador = 0;
		while(contador < palabra.size()-1) {
			puntaje = puntaje + palabra.get(contador).getValor();
			contador++;
		}
		return puntaje;
	}
	


	
}

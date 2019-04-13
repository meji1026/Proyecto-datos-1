package socketServer;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

import Entidades.Ficha;
import Interfaz.Tablero;
import estructurasDeDatos.ListaEnlazadaSimple;
import serializador.Serializador;

 //clase cliente
public class Client  {
	/**
 * Esta clase controla los clientes del servidor
 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 
 * @version: 4/12/2019
 
 */
	private Client() {
		
	}

		private static Client cliente = new Client();
		//canal por donde el cliente recibe y envia informacion
		private Socket client;
		
		static Object matriz = new String[15][15];
		
		//numero de puerto en donde se realiza la conexion cliente-servidor
		private int port;
		
		//string que indica la direccion ip local
		private String ip;
		
		//buffered reader indica que variable puede contener string e int y entrada es la informacion que se va a recibir del servidor
		private DataInputStream entrada;
		
		// la salida es la informacion que se envia al servidor y en este caso se indicia que es un objeto
		private DataOutputStream salida;
		
		private ObjectInputStream entrada2;
		
		//variable de tipo properties que en este caso se utiliza como archivo.properties de configuracion
		private Properties properties;
		
		// tipo logger que sirve para imprimir los errores en consola y guardarlos en un archivo para gestionar los errores del programa
		
		
		private ClientThread hilo;
		
	//metodo que inicia el cliente
	/**
 * Este metodo inicia un nuevo cliente y lo conecta con el servidor
 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 
 * @version: 4/12/2019
 
 */
    public  void start()   { 
        try{ 
        	//variable que se encarga de leer archivos
			FileReader reader = new FileReader("C:\\Users\\abiga\\Desktop\\scrabble\\Scrabble\\resources\\ClientProperties.properties");
				
			//se instancia variable tipo propesties
			properties = new Properties();
				
			//carga a la variable properties el archivo leido por el lector(reader)
			properties.load(reader);
				
			//getProperty retorna el valor asignado a dicha variable en este caso server.ip = 192.168.0.115 entonces retorna "192.168.0.115"
			ip = properties.getProperty("server.ip");
				
			//obtiene el valor asignado de server.port en el archivos properties
			port = Integer.parseInt(properties.getProperty("server.port"));
				
			//se instancia el cliente y se le indica la ip y puerto de la conexion, basicamente es el canal por donde va a fluir la informacion
			client = new Socket(ip,port); 
			
			//guarda la inforacion recibida por el cliente en la variable entrada
			entrada = new DataInputStream (client.getInputStream());
		
			entrada2 = new ObjectInputStream(client.getInputStream());
			
			//crea el output por donde se envia la informacion del cliente hacia el servidor
			salida = new DataOutputStream (client.getOutputStream());
			
			//indica que si el cliente esta conectado inicie el hilo para la conexion con el server
			if(client.isConnected()) {
				//crea un hilo para manejar el cliente y lo inicia
				hilo = new ClientThread(client, entrada,entrada2, salida);
				hilo.start();
				
			}
   
        }
        catch(Exception e){ 
        	System.out.println(e.getMessage());
			
        } 
    }
    
    
    public void setLista(ListaEnlazadaSimple<Ficha> lista) {
    	this.hilo.setLista(lista);
    }
       


	public static Client getInstance() {
		
		return cliente;
	}
}

/**
 * Esta clase es un hilo encargado de la comunicación cliente-servidor
 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 
 * @version: 4/12/2019
 
 */

class ClientThread extends Thread{
	
	//canal por donde entra y sale la informacion
	private Socket client;
	
	//informacion que recibe del servidor
    private DataInputStream entrada;
    
    ////informacion que envia el servidor
    private DataOutputStream salida; 
    
    private ObjectInputStream entrada2;
    
    private Tablero tablero;
    
  //boolean que define si es el turno de este cliente
  		private boolean turno = false;
  		
  		//boolean que define si el cliente tiene alguna palabra(lista) asociada para que pueda ser enviada al servidor
  		private boolean palabra = false;
  		
  		//boolean que indica si ha terminado el juego
  		private boolean terminaJuego = false;
  		
  		//lista enlazada que contiene la palabra que sera enviada al servidor
  		private ListaEnlazadaSimple<Ficha> lista;
  		
    
	public ClientThread( Socket socket, DataInputStream entrada,ObjectInputStream entrada2, DataOutputStream salida) {
		this.client = socket;
	    this.entrada = entrada; 
	    this.salida = salida;
	    this.entrada2 = entrada2;
	}
	
	/**
 * Este metodo empieza a ejecutar el hilo para enviar y recibir información del servidor.
 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 
 * @version: 4/12/2019
 
 */
	
	 public  void run()   { 
	        try{
		            while (terminaJuego == false)  {
		            	if(turno == false && entrada.readUTF().equals("turno") == true) {
		            		System.out.println("Es el turno de este cliente");
		            		Client.matriz = (String [][])entrada2.readObject();
		            		tablero.pintar((String[][]) Client.matriz);
		            		this.turno=true;
		            	}
		            	//string que guarda el json que sera enviado
		            	
		            	String tosend;
		            	
		            	//esto se cumple cuando sea el turno del jugador y cuando el cliente tenga una lista(palabra) asociada
		                if(turno == true & palabra == true) { 
		                	
		                	//serializa la palabra que es una lista y la convierte en json 
		                	tosend = Serializador.serializar(lista);
		                	
		                	// envia el json(tosend) al servidor
		                	salida.writeUTF(tosend);
		                	
		                	
		                	//recive el string enviado por el servidor
		                	String received = entrada.readUTF();
		                	
		                	//imprime la informacion(received) enviada por el servidor
		                    System.out.println(received);
		                    
		                    //como ya se envio una palabra entonces el turno de este jugador es false
		                    this.turno = false;
		                    
		                    //se pone false ya que no tiene una palabra(lista) asignada
		                    this.palabra = false;
		                    
		                    //se pone true para que el cliente termine la conexion
		                    this.terminaJuego = true;
	
		                    
		                }
		                this.sleep(1000);
		            }
		            //cierra la entrada y salida de informacion, termina el hilo del cliente y envia "Exit" para finalizar la conexion con el servidor
		            salida.writeUTF("Exit");
		            this.entrada.close(); 
		            this.salida.close();
		            this.stop();
	        	
	            
	 
	        }
	        catch(Exception e){ 
	        	System.out.println(e.getMessage());
	        }
	        
	        
	    }
	 
	 
	 public void setLista(ListaEnlazadaSimple<Ficha> lista2) {
	    	this.lista = lista2;
	    	this.palabra = true;
	    }
}

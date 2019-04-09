package socketServer;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

import Interfaz.Tablero;
import estructurasDeDatos.ListaEnlazadaSimple;
import palabras.Letra;
import serializador.Serializador;

 //clase cliente
public class Client  {

		
		//canal por donde el cliente recibe y envia informacion
		private Socket client;
		
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
		private ServerLogger logger;
		
		public ClientThread hilo;
		
	//metodo que inicia el cliente
    public  void start()   { 
        try{ 
        	//variable que se encarga de leer archivos
			FileReader reader = new FileReader("C:\\Users\\mario\\Desktop\\datos\\ScrabbleGit\\Scrabble\\resources\\ClientProperties.properties");
				
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
			logger = new ServerLogger(2); 
        } 
    }
    
    
    public void setLista(ListaEnlazadaSimple <Letra> lista) {
    	this.hilo.setLista(lista);
    }
       
    //metodo main para probar el cliente
    public static void main(String args[]) {
    	
    	ListaEnlazadaSimple <Letra> l = new ListaEnlazadaSimple<Letra>();
		l.addLast(new Letra("S"));
		l.addLast(new Letra("C"));
		l.addLast(new Letra("R"));
		l.addLast(new Letra("A"));
		l.addLast(new Letra("B"));
		l.addLast(new Letra("B"));
		l.addLast(new Letra("L"));
		l.addLast(new Letra("E"));
		
		
		ListaEnlazadaSimple <Letra> l2 = new ListaEnlazadaSimple<Letra>();
		l2.addLast(new Letra("A"));
		l2.addLast(new Letra("N"));
		l2.addLast(new Letra("I"));
		l2.addLast(new Letra("M"));
		l2.addLast(new Letra("A"));
		l2.addLast(new Letra("L"));
		
		
    	Client cliente = new Client();
    	
    	Interfaz interfaz = new Interfaz(cliente,l,l2);
		//se indica la coordenadas donde estara ubicado el objeto, su ancho y su altura
		interfaz.setBounds(0,0,400,400);
		//hace que sea visible en pantalla
		interfaz.setVisible(true);
		//indica que la interfaz va a estar en el centro de la pantalla sin importar las coordenas inidicadas anteriormente
		interfaz.setLocationRelativeTo(null);
		//al indicar false indica que no se puede modificar el tamano de la interfaz una vez creada
		interfaz.setResizable(false);
    	
    	cliente.start();    	
    }
}


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
  		private boolean turno = true;
  		
  		//boolean que define si el cliente tiene alguna palabra(lista) asociada para que pueda ser enviada al servidor
  		private boolean palabra = false;
  		
  		//boolean que indica si ha terminado el juego
  		private boolean terminaJuego = false;
  		
  		//lista enlazada que contiene la palabra que sera enviada al servidor
  		private ListaEnlazadaSimple <Letra> lista;
  		
  		//boolean que indica si el cliente ya recibio las letras del servidor
  		private boolean letras = false;

    
	public ClientThread( Socket socket, DataInputStream entrada,ObjectInputStream entrada2, DataOutputStream salida) {
		this.client = socket;
	    this.entrada = entrada; 
	    this.salida = salida;
	    this.entrada2 = entrada2;
	}
	
	 public  void run()   { 
	        try{
	        	//indica que si el cliente no ha recibido las letras del servidor aun no puede enviar palabras
	        	if(letras == false) {
	        		this.tablero = (Tablero) entrada2.readObject();
	        		tablero.setVisible(true);
	        		this.letras = true;
	        	}
				
	        	if(letras==true){
		            while (terminaJuego == false)  {
		            	
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
	            
	 
	        }
	        catch(Exception e){ 
	        	System.out.println(e.getMessage());
	        }
	        
	        
	    }
	 
	 
	 public void setLista(ListaEnlazadaSimple <Letra> lista) {
	    	this.lista = lista;
	    	this.palabra = true;
	    }
}
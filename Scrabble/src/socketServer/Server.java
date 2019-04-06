package socketServer;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import palabras.Letra;
import palabras.validacion;
import serializador.Serializador;

  
//clase servidor
public class Server {
	
		//es el servidor
		private ServerSocket server;
		
		//socket es como el canal en donde se envia y se reciba la informacion
		private Socket socket;
		
		//numero que indica el puerto en donde se realiza la conexion
		private int port = 9998;
		
		//la salida de tipo printstream(objeto que se puede imprimir) es la informacion que envia el servidor al cliente
		private DataOutputStream salida;
		
		//indica que la entrada es el input del canal de la informacion, es decir es lo que recibe el servidor y en este caso es un objeto
		private DataInputStream  entrada;
		
		// tipo logger que sirve para imprimir los errores en consola y guardarlos en un archivo para gestionar los errores del programa
		private ServerLogger logger;
		
    public void start(){ 
        try {
       
        	//se crea el servidor
			server = new ServerSocket(port);
			 
        while (true) { 
        	
        		//se crea el canal por donde se envia y se recibe la informacion
        		socket = new Socket();
                
        		//se pone a escuchar al servidor 
                socket = server.accept(); 
                 
                //indica que se ha conectado un nuevo cliente
                System.out.println("Un nuevo cliente se ha conectado : " + socket);
                System.out.println();
                  
                //es la informacion que recibe el servidor del cliente
                entrada = new DataInputStream(socket.getInputStream()); 
                
                //informacion que envia el servidor al cliente
                salida = new DataOutputStream(socket.getOutputStream()); 
  
                //hilo que se encarga de la conexcion servidor-cliente
                Thread hilo = new ClientHandler(socket, entrada, salida); 
  
                //se inicia el hilo
                hilo.start();      
            }  
        }
 
        catch (Exception e){  
            System.out.println(e.getMessage());
			logger = new ServerLogger(1); 
        }
    } 
    
   //main para probar el servidor
	public static void main(String args[]) {
		Server server = new Server();
		server.start();
	}
	
}

//clase hilo que maneja la conexion
class ClientHandler extends Thread  { 
	
	//informacion que recibe el servidor
    private DataInputStream entrada;
    
    ////informacion que envia el servidor
    private DataOutputStream salida; 
    
    //canal por donde se envia y se recibe la informacion
    private Socket socket; 
      
  
    // Constructor 
    public ClientHandler(Socket socket, DataInputStream entrada, DataOutputStream salida)  
    { 
        this.socket = socket; 
        this.entrada = entrada; 
        this.salida = salida; 
    } 
  
    @Override
    //metodo run() que inicia el hilo
    public void run()  { 
    	//string en donde se guarda al informacion que recibe el servidor
        String received;
        
        //string en donde se guarda la palabra recibida del cliente
        String word;
        
        //guarda el puntaje de la palabra recibida del cliente
        int puntaje;
        
        //guarda el json en un arraylist al ser deserializado
        ArrayList<Letra> listWord;
        
        //string que guarda la informacion que sera enviada al cliente
        String toreturn;
        
        //logger para regiistrar errores
        ServerLogger logger;
        
        //ciclo que maneja la logica de la informacion recibida y enviada
		while (true)  { 
            try {
            	
                //lee y guarda la informacion enviada por el cliente que en este caso es un json
                received = entrada.readUTF();
                
                //condicion que cierra la conexion entre servidor-cliente
                if(received.equals("Exit")) 
                {  
                	//indica que el cliente ha cerrado la conexion
                    System.out.println("Client " + this.socket + " ha enviado EXIT..."); 
                                       
                    //cierra el canal de informacion
                    this.socket.close(); 
                    
                    //indica que la conexion con el cliente se ha cerrado
                    System.out.println("Conexion cerrada"); 
                    break; 
                }
                
                //deseraliza el json recibido  y lo guarda en listWord como un arraylist
                listWord = Serializador.deserializar(received);
                
                //obtiene la palabra guarda en el arraylist de listword
                word = Serializador.palabra(listWord);
                
                //obtiene el int guardado en el arraylist de listword
                puntaje = Serializador.puntaje(listWord);
                
                //print en pantalla que indica que se va a mostrar el json recibido
                System.out.println("EL JSON RECIBIDO ES:");
                System.out.println();
                
                //imprime el json recibido
                System.out.println(received);
                System.out.println();
                
                //print en pantalla que indica que se va a mostrar la palabra
                System.out.println("AL DESEREALIZAR EL JSON SE OBTIENE LA SIGUIENTE PALABRA:");
                System.out.println("");
                
                //imprimen la palaba obtenida al deserealizar el json recibido
                System.out.println(word);
                System.out.println();
                
                //verifica si la palabra recibida del cliente se encuentra en el diccionario de palabras
                if(validacion.validarPalabra(word)==true) {
                	toreturn = "La palabra enviada es valida y tiene un puntaje de: " + puntaje;
                	salida.writeUTF(toreturn);
                }
                
                //verifica si la palabra recibida del cliente se encuentra en el diccionario de palabras
                if(validacion.validarPalabra(word)==false) {
                	toreturn = "La palabra enviada es invalida";
                	salida.writeUTF(toreturn);
                }
            }    
            catch (IOException e) { 
            	System.out.println(e.getMessage());
    			logger = new ServerLogger(3); 
            } 
        } 
		
        try{ 
            //cierra la entrada y la salida de informacion
            this.entrada.close(); 
            this.salida.close(); 
              
        }
        catch(IOException e){ 
        	System.out.println(e.getMessage());
			logger = new ServerLogger(3); 
        } 
    } 
}

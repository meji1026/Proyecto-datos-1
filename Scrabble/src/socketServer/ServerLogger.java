package socketServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerLogger {
	
	public ServerLogger(int id) {
		if(id == 1) {
			final  Logger logger = LogManager.getLogger(ServerLogger.class);
			logger.error("Algo fallo en el servidor");
		}
		else if(id == 2) {
			final  Logger logger = LogManager.getLogger(ServerLogger.class);
			logger.error("Algo fallo en el cliente");
		}
		else if(id == 3) {
			final  Logger logger = LogManager.getLogger(ServerLogger.class);
			logger.error("Algo fallo en ClientHandler");
		}
	}
	

}

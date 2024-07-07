import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;


import com.sun.net.httpserver.HttpServer;

public class Httpdemo {
	public static void main(String[] args) {
		try {
			//IP + port
		InetSocketAddress address = new InetSocketAddress("localhost",8090);
			HttpServer httpServer = HttpServer.create(address,0);
			//additional config and context handler
			httpServer.setExecutor(Executors.newFixedThreadPool(4));
			//method, path
			httpServer.createContext("/hello",new HelloHandler());
			//start the server, making it ready to accept incoming connections
			httpServer.start();
			System.out.println("Server started on port 9090");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package current.thread.executor6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifeCycleWebServer {
	
	private final ExecutorService exec = Executors.newFixedThreadPool(100);
	
	public void start() throws IOException{
		ServerSocket socket = new ServerSocket(80);
		while(!exec.isShutdown()){
			final Socket connection = socket.accept();
			exec.execute(new Runnable() {
				@Override
				public void run() {
					handleRequest(connection);
				}
			});
		}
	} 
	
	public void stop(){
		exec.shutdown();
	}
	
	void handleRequest(Socket connection){
		
	}
}

package spike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Starting...");		
		System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
		
		ApplicationContext context = new FileSystemXmlApplicationContext("WebContent\\WEB-INF\\web_server.xml");

	}
	
}

package by.novosadov.networking;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Server implements Runnable{
	static private ServerSocket server;
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;

	@Override
	public void run() {
		try {			
			server = new ServerSocket(5678, 10);
			while(true) {
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("Вы прислали: " + (String)input.readObject());									
			}
		} 
		catch (HeadlessException e) {} 
		catch (ClassNotFoundException e) {}
		catch (UnknownHostException e) {} 
		catch (IOException e) {}
	}

}

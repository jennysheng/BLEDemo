package org.bluetooth.bledemo;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
* Created by jenny on 2016-05-19.
*/
public class TCPIP_server implements Runnable {


	private final int port = 8000;
	int data;
	DataOutputStream out;
	Socket mySocket = null;
	final String ip="192.168.0.12";
	final String ipp="194.47.41.113";
	SendData a=null;
	//ServerSocket mySocket=null;





	public void run() {
		//Get the accepted socket object
		try {
			//Socket mySocket = null;
			//Create a server socket object and bind it to a port
			//ServerSocket socServer = new ServerSocket(port);
			 mySocket=new Socket("194.47.32.225",port);


				//Infinite loop will listen for client requests to connect
				while (true) {
					//mySocket = socServer.accept();
					a=new SendData(mySocket);
					new Thread(a).start();

				}



		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void endConnection(){
		if(mySocket!=null){
			try {
				a.endOutputStream();
				mySocket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


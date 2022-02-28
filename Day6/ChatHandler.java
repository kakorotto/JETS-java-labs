import java.net.*;
import java.io.*;
import java.util.*;
public class ChatHandler extends Thread
{
	DataInputStream dis;
	PrintStream ps;
	static Vector<ChatHandler> clientsVector = new Vector<ChatHandler>();
public ChatHandler(Socket cs)
{
	try{
	dis = new DataInputStream(cs.getInputStream());
	ps = new PrintStream(cs.getOutputStream());
}catch(IOException e){e.printStackTrace();};
	clientsVector.add(this);
	start();
}

public void run() {
    while(true) {
      try {
        String str = dis.readLine();
        sendMessageToAll(str);
      } catch(IOException ex) {
        System.out.println("logged Out");
stop();
      } 
    }
    }
void sendMessageToAll(String msg)
{
for(ChatHandler ch : clientsVector)
{
ch.ps.println(msg);
}
}
}




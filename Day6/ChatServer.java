import java.io.*;
import java.net.*;

public class ChatServer
{
ServerSocket serverSocket;
public ChatServer()
{
try{
serverSocket = new ServerSocket(5005);
}catch (IOException e) {e.printStackTrace();};
while(true)
{
try{
	Socket s = serverSocket.accept();
	new ChatHandler(s);
}catch (IOException e) {e.printStackTrace();};

}
}

public static void main(String[] args)
{
new ChatServer();
}
}

import java.net.*;
import java.io.*;
public class Server
{
public static void main(String [] args)
{
try{
ServerSocket sock= new ServerSocket(6013);
while(true)
{
Socket Client= sock.accept();
PrintWriter pout= new
PrintWriter(Client.getOutputStream(), true);

pout.println(new java.util.Date().toString());

Client.close();
}
}
catch(IOException ioe)
{
System.err.println(ioe);
}
}
}

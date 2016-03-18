import java.net.*;
import java.io.*;
public class DateServer
{
public static void main(String[] args) // main is a function and everbody can access thus public
{
try
{
// class starts with capital letter
Socket sock= new Socket("127.0.0.1",6013);

InputStream in= sock.getInputStream(); // method
BufferedReader bin= new BufferedReader(new InputStreamReader(in));// short hand technique

String line; //line is instance of object, string is class
while((line= bin.readLine()) !=null)
System.out.println(line);

sock.close();
}
catch(IOException ioe)
{
System.err.println(ioe);
}
}
}

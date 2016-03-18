import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class CalculatorServer 
{
    public static void main(String[] args) throws IOException
    {
        final int PORT_NUM = 12345;
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        Thread thread = null;
        CalculatorService service = null;
        try
        {
            serverSocket = new ServerSocket(PORT_NUM);
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        System.out.println("Waiting for clients to connect...");
        while(true)
        {
            try
            {
                clientSocket = serverSocket.accept();
                System.out.println("Client connects...");
                service = new CalculatorService((clientSocket));
                thread = new Thread(service);
                thread.start();
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
}

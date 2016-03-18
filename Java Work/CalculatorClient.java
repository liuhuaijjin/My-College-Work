import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.PrintWriter;
public class CalculatorClient
      {
           static Scanner kbd;
           static String command;
           public static void main (String [] args) throws IOException
                 {
                    final int PORT_NUM = 12345;
                    Socket socket = new Socket ("localhost", PORT_NUM);
                    InputStream istream = socket.getInputStream ();
                    OutputStream ostream = socket.getOutputStream ();
                    PrintWriter out = new PrintWriter (ostream);
                    Scanner in = new Scanner (istream);
                    kbd = new Scanner (System.in);
                    command = "";
                    String response = "";
                    while (!command.equalsIgnoreCase ("quit"))
                         {
							 System.out.print ("Enter 2 BigInteger separated by space ");
                             command = kbd.nextLine ();
                             out.println (command);
                             out.flush ();
                             if (in.hasNext ())
                                  {
                                    response = in.nextLine ();
                                    if (response.equalsIgnoreCase ("Bye!"))
                                      {
										  System.out.println (response);
                                          System.exit (0);
                                      }
                                    else
                                      System.out.println (response);
                                  }
                         }
                 }
      }

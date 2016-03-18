import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;
import java.net.ServerSocket;
import java.math.BigInteger;
public class CalculatorService implements Runnable
      {
		  InputStream is;
		  OutputStream os;
		  Scanner in;
		  PrintWriter out;
		  ServerSocket ss;
		  Socket s;
		  String request = "", response = "";
		  CalculatorService (Socket fromServer)
		    {
				s = fromServer;
			}
		  public void run ()
		        {
				try{
					try
					    {
					      is = s.getInputStream ();
					      os = s.getOutputStream ();
					      in = new Scanner (is);
					      out = new PrintWriter (os);
					      calculate ();
					     }
					 finally {s.close ();}
				 }
			   catch (IOException ioe) {ioe.printStackTrace ();}
				}
	    public void calculate ()
	          {
				  while (in.hasNextLine ())
				      {
						  request = in.nextLine ();
						  if (request.equalsIgnoreCase ("quit"))
						    {
								response = "Bye";
								out.println (response);
								out.flush ();
								return;
							}
					      else
					        {
								String pieces [] = request.split ("[ ]+");
								if (pieces.length != 2)
								   {
									   response = "Bad command...redo";
									   out.println (response);
									   out.flush ();
									   break;
								   }
								BigInteger a,b,c,d,e;
a = new BigInteger(pieces[0]);
b = new BigInteger(pieces[1]);
c = a.add(b);
d = a.subtract(b);
e = a.multiply(b);
		
					response = "" + "sum : " + c.toString() + " difference : " + d.toString() + " product : " + e.toString();
								out.println (response);
								out.flush ();

							}

					  }
			  }
      }

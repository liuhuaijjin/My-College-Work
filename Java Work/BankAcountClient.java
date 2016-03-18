mport java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class BankAccountClient
{
    static Scanner kbd;
    static String command;
    private String Title; //: Prof/Dr/Mr/Mrs/Ms
    private String firstName;
    private String lastName;
    private char Gender; //: M/F
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    priavte String emailID;
    private double initialSavingsBalance;
    private String AccountNumber;
    private int ATMCardNumber;
   
    public BankAccountClient()
    {
      Scanner input = new Scanner(System.in);\
      System.out.println("Enter Title");
      Title = new input.nextLine();
      System.out.println("\n Enter firstName");
      firstName = new input.nextLine();
      System.out.println("\n Enter lastName");
      lastName = new input.nextLine();
      System.out.println("\n Enter Gender");
      Gender = new input.nextChar();
      System.out.println("\n nEnter yearOfBirth");
      yearOfBirth = new input.nextInt();
      System.out.println("\n Enter monthOfBirth");
      monthOfBirth = new input.nextInt();
      System.out.println("\n Enter dayOfBirth");
      dayOfBirth = new input.nextInt();
      System.out.println("\n Enter emailID");
      emailID = new input.nextLine();
      System.out.println("\n Enter initialSavingBalance");
      initialSavingBalance = new input.nextDouble();
     
      //System.out.println("\n Enter AccountNumber");
      //AccountNumber = new input.nextLine();
      //System.out.println("\n Enter ATMCardNumber");
      //ATMCardNumber = new input.nextInt();
    }
    
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
            System.out.print ("Enter command \"get\" to desiplay result and \"quit\" to quit ");
            command = kbd.nextLine ();
            if(command.equalsIgnoreCase("
get"))
                out.println(arr);
            else
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

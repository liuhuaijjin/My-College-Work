import java.io.*;
import java.util.*;
public class Quotes
{
    public static void main(String [] args)
    {
        File file = new File("/home/user/Desktop/Goog/uuuu/Quotations.txt");
        if(!file.exists() || !file.isFile())
        {
            System.out.println("File does not exist");
        }
        
        long size = file.length();
        System.out.println("Filesize in bytes: " + size);
        
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("File Last Modified: " + date);
        
        String strParentDirectory = file.getParent();
        System.out.println("Parent directory is : " + strParentDirectory);
      
      
        String curDir = System.getProperty("user.dir");
        System.out.println("You currently working in :" + curDir);
      
      
      
        String[] children = file.list();
        if (children == null) 
        {
             System.out.println( "Either dir does not exist or is not a directory");
        }
	    else 
	    {
             for (int i=0; i< children.length; i++) 
             {
                  String filename = children[i];
                  System.out.println(filename);
             }
        }
      
        int count = 0;
        try 
      {
         BufferedReader in1 = new BufferedReader (new FileReader("Quotations.txt"));
         String str1 = null;
         while ((str1 = in1.readLine()) != null) 
         {
            for(int i = 0; i < str1.length(); i++)
            {
            	if (str1.charAt(i) == '|')
            		count++;
            }
         }
         System.out.println("Number of | in file is: " + count);
      }
         
      catch (IOException e) 
      {
      
      }
      
      
      try 
      {
         BufferedReader in2 = new BufferedReader (new FileReader("Quotations.txt"));
         File f = new File("Edited.txt");
      	 f.createNewFile();
      	 FileWriter writer = new FileWriter(f);
         String str2 = new String("");
         while ((str2 = in2.readLine()) != null) 
         {
         	str2 = str2.replace('|','\n');
            writer.write(str2 + "\n");
         }
      }
      catch (IOException e) 
      {
         
      }   
   }
}

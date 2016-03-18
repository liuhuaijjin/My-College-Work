import java.util.*;
public class Ass
{
   public static void main(String [] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String str = scan.nextLine();
       String word[] = str.split(" ");
       int length = word.length;
       int i;
       for(i=1; i < length ; i=i+2)
       {
           System.out.println(word[i] +"  ");
       }
       for(i=0; i < length ; i=i+2)
       {
           System.out.println("  "+ word[i] + "  ");
       }
   }
}

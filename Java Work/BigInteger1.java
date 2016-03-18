import java.math.BigInteger;
public class BigInteger1 
{
  public static void main(String[] args) 
  {
  BigInteger a = new BigInteger ("1");
  BigInteger b = new BigInteger ("1");
  BigInteger c=new BigInteger ("1");
  for(int i=1;i<=100;i++)
  
  {c =c.multiply(new BigInteger(i + "")); 
    }
  System.out.println("Result is  ==> " + c );
  }
}

import java.math.BigInteger;
public class twoprog 
{
  public static void main(String[] args) 
  {
  BigInteger a = new BigInteger ("1");
  BigInteger b = new BigInteger ("1");
  BigInteger c=new BigInteger ("1");
  for(int i=1;i<=4444;i++)
  
  {c =c.multiply(new BigInteger("4444")); 
    }
     BigInteger result = new BigInteger ("1");
     BigInteger i = new BigInteger ("1");
     for(i=c;i.compareTo(BigInteger.TEN) > 0;)
     {i=i.divide(new BigInteger ("10"));
     result=result.add(new BigInteger ("1"));
     }
     
  System.out.println("Result is  ==> " + result );
  }
}

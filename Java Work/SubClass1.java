public class SubClass1 extends SuperClass
{
 private static int a,b;
 
 public SubClass1()
 {
  a=b=0;
 }
 public SubClass1(int x,int y)
 {
  a=x;
  b=y;
 }
 public static int addTwo (int x, int y)
 {
  return x+y;
 }
 public static int addTwo (SubClass1 a, int b) 
 {
  return a.a+a.b+b;
 }
 public static int addTwo (int a, SubClass1 b)
 {
  return a+b.a+b.b;
 }
 /*public int addTwo (SubClass1 a, SubClass1 b)
 {
  return a.a+a.b+b.a+b.b;
 }
*/
 public SubClass1 addTwo (SubClass1 a, SubClass1 b) 
 {
  SubClass1 tmp= new SubClass1();
  tmp.a=a.a+b.a;
  tmp.b=a.b+b.b;
return tmp;
 }
 public static void main(String args[])
 {
  SubClass1 obj = new SubClass1();
int a
  System.out.println(obj);
  
 }


 
}


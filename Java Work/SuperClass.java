public class SuperClass
{
   private int a,b;
   public int c,d;
   protected int e,f;
  
  public SuperClass()
 {
   a=b=c=d=e=f=0;
 }
  public SuperClass(int x)
 {
   a=x;
   b=c=d=e=f=0;
 }
 public SuperClass(int x,int y)
 {
  a=x;
  b=y;
  c=d=e=f=0;
 }
 public SuperClass(int x,int y,int z)
 {
   a=x;
   b=y;
   c=z;
   d=e=f=0; 
 }
public SuperClass(int x,int y,int z,int l)
{
 a=x;
 b=y;
 c=z;
 d=l;
 e=f=0;
}
public SuperClass(int x,int y,int z,int l,int m)
{
  a=x;
  b=y;
  c=z;
  d=l;
  e=m;
  f=0;
}
public SuperClass(int x,int y,int z,int l,int m,int n)
{
  a=x;
  b=y;
  c=z;
  d=l;
  e=m;
  f=n;
 }
 
 public int getValueA()
  {
   return a;
  }

  public void setValueA(int x)
  { 
   a=x;
  }
  
  public int getValueB()
  {
   return b;
  }
  
  public void setValueB(int y)
  {
   b=y;
  }   
public void setValueC(int y)
  {
   c=y;
  }   

public void setValueD(int y)
  {
   d=y;
  }   

public void setValueF(int y)
  {
   f=y;
  }   

public void setValueE(int y)
  {
   e=y;
  }   



 public static int addTwo(int x,int y)
 {
  return x+y;
 }
 public static int addTwo(SuperClass a,int b)
{
 return a.a+a.b+a.c+a.d+a.e+a.f+b;
}
 public static int addTwo(int a,SuperClass b)
{
  return a+b.a+b.b+b.c+b.d+b.e+b.f;
}
public static int addTwo(SuperClass a,SuperClass b)
{
  return a.a+a.b+a.c+a.d+a.e+a.f+b.a+b.b+b.c+b.d+b.e+b.f;
}

 public SuperClass addTwo(SuperClass a,SuperClass b)
{
 SuperClass C = new SuperClass();
 C.a=a.a+b.a;
 C.b=a.b+b.b;
 C.c=a.c+b.c;
 C.d=a.d+b.d;
 C.e=a.e+b.e;
 C.f=a.f+b.f;
 return C; 
 
}
 public SuperClass addTwo(SuperClass a)
{
 SuperClass C= new SuperClass();
 C.a=a.a+this.a;
 C.b=a.b+this.b;
 C.c=a.c+this.c;
 C.d=a.d+this.d;
 C.e=a.e+this.e;
 return C;
}

public String toString()
  {
   return "a=" + this.a + "b=" + this.b + "c=" + this.c + "d=" + this.d + "e=" + this.e + "f=" + this.f;
  }


  public static void main(String args[])
 {

SuperClass obj= new SuperClass();
SuperClass obj1= new SuperClass(1);
SuperClass obj2= new SuperClass(1,2);
SuperClass obj3= new SuperClass(1,2,3);
SuperClass obj4= new SuperClass(1,2,3,4);
SuperClass obj5= new SuperClass(1,2,3,4,5);
SuperClass obj6= new SuperClass(1,2,3,4,5,6);
int h =addTwo(1,2);
int i=obj1.addTwo(obj2,2);
int j=obj1.addTwo(4,obj4);
SuperClass My=obj1.addTwo(obj5,obj6);
SuperClass My1=obj1.addTwo(obj6);
  obj.getValueA();
   System.out.println(obj);
   
   
 }


}
 

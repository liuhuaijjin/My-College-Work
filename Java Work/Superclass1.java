public class Superclass
{
private int a,b;
public int c,d;
protected int e,f;
public int getA() { return a;} 
public int getB() { return b;}
public void setA(int x) { a=x;}
public void setB(int x) { b=x;}
public void setC(int x) { c=x;}
public void setD(int x) { d=x;}
public void setE(int x) { e=x;}
public void setF(int x) { f=x;}

public Superclass()
{
a=1;
b=2;
}

public Superclass(int x)
{
a=x;
}
public Superclass(int x,int y)
{
a=b=c=x;
d=e=f=x-y;
}

public Superclass(int x,int y,int z)
{
a=b=x;
b=c=y;
d=e=f=z;
}

public Superclass(int x,int y,int z,int m)
{
a=b=x;
c=d=y;
e=f=z;
}

public Superclass(int x,int y,int z,int m,int n)
{
a=x;
b=c=y;
d=z;
e=m;
f=n;
}

public Superclass(int x,int y,int z,int m,int n,int o)
{
a=x;
b=y;
c=z;
d=m;
e=n;
f=o;
}

public static int addTwo(int a,int b)
{
return a+b;
}

public static int addTwo(Superclass a,int b )
{
 return a.a+a.b+b;
}

public static int addTwo(int a,Superclass b )
{
 return a+b.a+b.b;
}

public int addTwo(Superclass a,Superclass b)
{
return a.a+a.b+b.a+b.b;
}

public Superclass addTwo (Superclass a) 
{
int f=a.a+a.b+this.a+this.b;
return new Superclass(f);
}

public String toString()
{
return "a="+this.a+"b="+this.b+"c="+this.c+"d="+this.d+"e="+this.e+"f="+this.f;
}

public static void main(String [] args)
{
Superclass x=new Superclass();
Superclass y=new Superclass();
Superclass z=new Superclass(1);
Superclass q=new Superclass(1,2);
Superclass w=new Superclass(1,2,3);
Superclass r=new Superclass(1,2,3,4);
Superclass t=new Superclass(1,2,3,4,5);
Superclass u=new Superclass(1,2,3,4,5,6);
System.out.println(addTwo(3,4));
System.out.println(addTwo(z,4));
System.out.println(addTwo(1,z));
int i=y.addTwo(z,w);
System.out.println(i);
System.out.println(x.addTwo(z,q));
}

}

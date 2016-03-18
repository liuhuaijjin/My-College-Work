public class triangle
{
private double sideAB, sideBC, sideCA;
private double angleA, angleB, angleC;
private double area;
private double perimeter;
public boolean istriangle(double x,double y,double z)
{
return x+y>z && y+z>x && z+x>y;
}
public triangle(double side)
{
sideAB=sideBC=sideCA=side;
angleA=getangle(sideBC,sideCA, sideAB);
angleB=getangle(sideCA,sideAB, sideBC);
angleC=getangle(sideAB,sideBC, sideCA);
area=getarea(sideAB,sideBC,sideCA);
perimeter=getperimeter(sideAB,sideBC, sideCA);
}
public triangle(double side1, double side2, double side3)
{
if(istriangle(side1,side2,side3))
{
sideAB=side1;
sideBC=side2;
sideCA=side3;
angleA=getangle(sideBC,sideCA, sideAB);
angleB=getangle(sideCA,sideAB, sideBC);
angleC=getangle(sideAB,sideBC, sideCA);
area=getarea(sideAB,sideBC,sideCA);
perimeter=getperimeter(sideAB,sideBC, sideCA);
}
}
public double getangle(double x,double y,double z)
{
return Math.toDegrees(Math.acos((y*y+z*z-x*x)/(2*y*z)));
}
public double getperimeter(double x, double y, double z)
{
return(x+y+z);
}
public double getarea(double x, double y, double z)
{
double s=((getperimeter(x,y,z))/2);
return (Math.sqrt(s*(s-x)*(s-y)*(s-z)));
}
public String toString()
{
return "Triangle created \n" + "sideAB =" + sideAB + "\n" +
"sideBC =" + sideBC + "\n" +
"sideCA =" + sideCA + "\n" +
"angleA =" + angleA + "\n" +
"angleB =" + angleB + "\n" +
"angleC =" + angleC + "\n" +
"perimeter=" + perimeter + "\n" +
"area=" + area + "\n";
}
public triangle addtwo(triangle a,triangle b)
{
double area=a.area+b.area;
double side=Math.sqrt((4*area)/(Math.sqrt(3)));
return new triangle(side);
}
public static void main(String[] args)
{
triangle a = new triangle(3,4,5);
triangle b = new triangle(4,5,6);
triangle c = new triangle(1,2,3);
System.out.println(a);
System.out.println(b);
System.out.println(b.addtwo(a,b));
}
}

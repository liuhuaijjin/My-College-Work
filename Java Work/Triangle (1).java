
public class Triangle{

 double sideAB,sideBC,sideCA;
 double angleA,angleB,angleC;
 double perimeter,area;

 public Triangle()
  {
   sideAB = sideBC = sideCA = 10;
   angleA = angleB = angleC = 60;
   getAngle(sideAB,sideBC,sideCA);    
   getArea(sideAB,sideBC,sideCA);
   getPerimeter(sideAB,sideBC,sideCA);
  }



public Triangle(double ab,double bc)
{double ca;
if(ab>bc)
ca=ab;
else
ca=bc;

if(checkTriangle(ab,bc,ca)){
                       sideAB = ab;
                       sideBC = bc;
                       sideCA = ca;
                      }
   else System.out.println("the triangle cannot exist therefore created default triangle");   
  }
public Triangle(double ab,double bc,double ca)
  {
   this();
   if(checkTriangle(ab,bc,ca)){
                       sideAB = ab;
                       sideBC = bc;
                       sideCA = ca;
   getAngle(sideAB,sideBC,sideCA);    
   getArea(sideAB,sideBC,sideCA);
   getPerimeter(sideAB,sideBC,sideCA);
                      }
   else System.out.println("the triangle cannot exist therefore created default triangle");   
  
  }

  
  public boolean checkTriangle(double a,double b,double c)
  { 
    if(a+b <= c) return false;
    if(b+c <= a) return false;
    if(a+c <= b) return false;
    return true;
  }

 public void getArea(double ab,double bc, double ca)
  {
   double s;
   s = (double)(ab+bc+ca)/2;
   area = Math.sqrt( s * ( s - ab ) * ( s - bc ) * ( s - ca ));
  }
  
  public void getAngle(double ab,double bc, double ca)
  {angleA=Math.toDegrees(Math.acos(((ab*ab)+(ca*ca)-(bc*bc))/2*ab*ca));
  angleB=Math.toDegrees(Math.acos(((ab*ab)+(bc*bc)-(ca*ca))/2*ab*bc));
  angleC=Math.toDegrees(Math.acos(((bc*bc)+(ca*ca)-(ab*ab))/2*bc*ca));
  }
  
public Triangle Addtwo(Triangle A,Triangle B)
{
double area = A.area + B.area;
double side = Math.sqrt(4*area/(Math.sqrt(3)));
return new Triangle (side,side,side);
}



public void getPerimeter(double ab,double bc,double ca)
{
perimeter = ab+bc+ca;
}


 public void displayVal()
 { if(checkTriangle(sideAB,sideBC,sideCA))
  { System.out.println("Perimeter="+perimeter+" "+"\n"+"Area="+area+" Angle A="+angleA);
  }
  }
  
public static void main(String args[])
{
 Triangle tri = new Triangle(11,7,16);
 Triangle tri4 = new Triangle();
 Triangle tri2 = new Triangle(11,7);
 Triangle tri1 = new Triangle(11,7,16);
 Triangle tri3=tri.Addtwo(tri,tri1);
 tri.displayVal();


 
}

                     }

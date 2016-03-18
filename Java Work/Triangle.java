public class Triangle
{
 private double sideAB, sideBC, sideCA;
 private double angleA, angleB, angleC;
 private double area, perimeter;

 public Triangle ()
 {
  sideAB=sideBC=sideCA=10.0;
  
  func();
  
 }


 public void func()
{
angleA=getAngle(sideBC, sideCA, sideAB);
  angleB=getAngle(sideCA, sideAB, sideBC);
  angleC=getAngle(sideAB, sideBC, sideCA);

 area=getArea(sideAB, sideBC, sideCA);

  perimeter=getPerimeter(sideAB, sideBC, sideCA);
}

//one side given
public Triangle(double sidex)
{
 sideAB=sideBC=sideCA=sidex;
 func();
}

//two sides given
public Triangle(double sidex, double sidey)
{
 sideAB=sidex;
 sideBC=sidey;
 sideCA=sidex>sidey ? sidex : sidey;
 
 func();

}
 

//three sides given
public Triangle(double sidex, double sidey, double sidez)
{
 sideAB=sidex;
 sideBC=sidey;
 sideCA=sidez;

 func();

}



public double getAngle(double x, double y, double z)
{
 return Math.toDegrees(Math.acos((y*y+z*z-x*x)/(2*y*z)));
}

public double getPerimeter(double x, double y, double z)
{
 return (x+y+z);
}

public double getArea(double x, double y, double z)
{
 double s= getPerimeter(x,y,z)/2.0;
 return Math.sqrt(s*(s-x)*(s-y)*(s-z));
}

public static void main(String [] args)
{
 Triangle t=new Triangle(20);
 System.out.println("Perimeter is :" +t.perimeter+ "Area is :" +t.area+ "Angle1 is: " +t.angleA+ "Angle2 is :" +t.angleB+ "Angle3 is : " +t.angleC);
}

}


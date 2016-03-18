public class MyTriangle extends GeometricalShape
      {
		  private double side1, side2, side3;
		  public MyTriangle (double side1, double side2, double side3)
		        {
					super ();
					this.side1 = side1;
					this.side2 = side2;
					this.side3 = side3;
					area = getArea ();
					perimeter = getPerimeter ();
				}
		  public MyTriangle (java.util.Date date, boolean isFilled, double side1, double side2, double side3)
		        {
					super (date, isFilled);
					this.side1 = side1;
					this.side2 = side2;
					this.side3 = side3;
					area = getArea ();
					perimeter = getPerimeter ();
				}
		  public double getArea ()
		        {
					if (isTriangle ())
					   {
					      double s = (side1 + side2 + side3) / 2;
					      return Math.sqrt (s * (s - side1) * (s - side2) * (s - side3));
				       }
					else
					   return - 1.0;
				}
		  public double getPerimeter ()
		        {
					if (isTriangle ())
					   return (side1 + side2 + side3);
					else
					   return - 1.0;
				}
		  public boolean isTriangle ()
		       {
				   return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
			   }

      }

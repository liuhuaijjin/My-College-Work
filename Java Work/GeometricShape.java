abstract public class GeometricalShape
      {
		  private boolean isFilled;
		  protected double area;
		  protected double perimeter;
		  private java.util.Date dateCreated;
		  private String color = "white";
		  abstract public double getArea ();
		  abstract public double getPerimeter ();
		  protected GeometricalShape () {}
		  protected GeometricalShape (java.util.Date date, boolean isFilled)
		        {
					dateCreated = date;
					this.isFilled = isFilled;
				}
		  public boolean isFilled () {return isFilled;}
		  public void setFilled (boolean filled)
		        {
					isFilled = filled;
				}
		  public java.util.Date getDateCreated ()
		        {
					return dateCreated;
				}
		  public void setDateCreated (java.util.Date date)
		        {
					dateCreated = date;
				}
		  public String getColor ()
		        {
					return color;
				}
	      public void setColor (String color)
	            {
					this.color = color;
				}
		  public void display (GeometricalShape gs)
		        {
					System.out.println ("area = " + gs.getArea () + ", perimeter = " + gs.getPerimeter () + ", date created = " + gs.dateCreated + ", filled ? " + gs.isFilled + ", color is: " + gs.color);
				}
      }

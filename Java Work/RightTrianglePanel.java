import javax.swing.*;
import java.awt.*;
public class RightTrianglePanel extends JPanel
	        {
	  		   int [] xCoords;
	  		   int [] yCoords;
	             public RightTrianglePanel ()
	                   {
  			       xCoords = new int []{60, 100, 140, 140, 100, 60, 20, 20};
	                       yCoords = new int []{20, 20, 60, 100, 140, 140, 100, 60};
	  				 }
	             public void paintComponent (Graphics g)
	                   {
	                       super.paintComponent (g);
	                       g.setColor(Color.blue);
	                       g.drawLine (150,150,150,300); 
 			       g.drawLine (150,150,300,300); 
			       g.drawLine (150,300,300,300); 
			       g.drawString("A",140,140);
			       g.drawString("C",140,310);
		         g.drawString("B",310,310);
			       g.drawOval(119,119,212,212);
	                   }
      }

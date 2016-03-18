import javax.swing.*;
import java.awt.*;

public class ClockFramePanel extends JPanel{
	private int face;
	private JPanel CFP1;


	public ClockFramePanel(){
		face = 200;
	             
    	CFP1 = new JPanel ();
    	CFP1.setBackground (Color.cyan);
	}
	
	public void paintComponent (Graphics g)
	{
	    super.paintComponent (g);
	    g.setColor (Color.blue);
		g.fillRect (100, 100, 500, 500);
		
	    g.setColor (Color.red);
	    g.fillOval (face, face, 200, 200); //FACE

		g.setColor (Color.black);
	    g.drawLine (face + 100, face + 100, face + 150, face + 100);
	    g.drawLine (face + 100, face + 24, face + 100, face + 100);
	    
	    g.drawString ("1", face + 145, face + 23);
	    g.drawString ("2", face + 175, face + 60);
	    g.drawString ("3", face + 185, face + 105);
	    g.drawString ("4", face + 170, face + 144);
	    g.drawString ("5", face + 145, face + 177);
	    g.drawString ("6", face + 95, face + 190);
	    g.drawString ("7", face + 45, face + 177);
	    g.drawString ("8", face + 25, face + 144);
	    g.drawString ("9", face + 5, face + 105);
	    g.drawString ("10", face + 22, face + 63);
	    g.drawString ("11", face + 47, face + 27);
	    g.drawString ("12", face + 94, face + 15);
	    
	 }
}

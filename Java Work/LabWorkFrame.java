import javax.swing.*;
import java.awt.*;

public class LabWorkFrame extends JFrame
      {
		  JFrame labWorkFrame;
		  Toolkit tk;
		  Dimension dm;
		  int screenWidth, screenHeight;
		  LabWorkPanel labWorkPanel;
		  public LabWorkFrame ()
		        {
					labWorkFrame = new JFrame ();
					tk = labWorkFrame.getToolkit ();
					dm = tk.getScreenSize ();
					screenWidth = dm.width;
					screenHeight = dm.height;
					labWorkFrame.setSize (screenWidth, screenHeight);
					labWorkFrame.setTitle ("Draw Grid");
					labWorkFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
					labWorkFrame.setLayout (null);
					labWorkPanel = new LabWorkPanel ();
					labWorkPanel.setBounds (100, 100, 500, 500);
					labWorkFrame.add (labWorkPanel);
					labWorkFrame.setVisible (true);
			   }
	     public static void main (String [] args)
	           {
				   System.out.println (new java.util.Date ());
				   SwingUtilities.invokeLater (new Runnable () {public void run () {new LabWorkFrame ();}});
			   }
      }

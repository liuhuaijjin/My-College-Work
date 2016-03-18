import javax.swing.*;
import java.awt.*;

public class ClockFrame extends JFrame{

JFrame clockFrame;
Toolkit tk;
Dimension dm;
int screenWidth, screenHeight;
ClockFramePanel CFP;

public ClockFrame(){
	clockFrame = new JFrame();
	tk = clockFrame.getToolkit ();
	dm = tk.getScreenSize ();
	screenWidth = dm.width;
	screenHeight = dm.height;
	clockFrame.setSize (screenWidth, screenHeight);
	clockFrame.setTitle ("Clock Frame");
	clockFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	clockFrame.setLayout (null);
	CFP = new ClockFramePanel ();
	CFP.setBounds (100, 100, 500, 500);
	clockFrame.add (CFP);
	clockFrame.setVisible (true);
}

public static void main (String [] args)
	{
	     SwingUtilities.invokeLater (new Runnable () {public void run () {new ClockFrame ();}});
	}


}

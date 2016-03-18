import javax.swing.*;
import java.awt.*;
public class RightTriangleFrame extends JFrame
{
 JFrame rightTriangleFrame;
 Toolkit tk;
 Dimension dm;
 int screenWidth, screenHeight;
 RightTrianglePanel rightTrianglePanel;
 public RightTriangleFrame ()
  {
          rightTriangleFrame = new JFrame ();
          tk = rightTriangleFrame.getToolkit ();
          dm = tk.getScreenSize ();
	  screenWidth = dm.width;
	  screenHeight = dm.height;
	  rightTriangleFrame.setSize (screenWidth, screenHeight);
	  rightTriangleFrame.setTitle ("Right Angeled Triangle");
	  rightTriangleFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	  rightTriangleFrame.setLayout (null);
	  rightTrianglePanel = new RightTrianglePanel ();
	  rightTrianglePanel.setBounds (100, 100, 500, 500);
	  rightTriangleFrame.add (rightTrianglePanel);
	  rightTriangleFrame.setVisible (true);
  }
  public static void main (String [] args)
   {
   SwingUtilities.invokeLater (new Runnable () {public void run () {new RightTriangleFrame ();}});
   }
}

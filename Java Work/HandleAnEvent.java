import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HandleAnEvent
      {
		  private JFrame jf;
		  private JTextField op1, op2, result;
		  private JLabel equalsSign;
		  private JButton a, s, m, d;
		  public HandleAnEvent ()
		     {
				 jf = new JFrame ();
				 //jf.setSize (300, 400);
				 Toolkit tk = jf.getToolkit ();
				 Dimension screenSize = tk.getScreenSize ();
				 int width = screenSize.width;
				 int height = screenSize.height;
				 jf.setSize (width, height);
				 jf.setTitle ("Simple Calculator");
				 jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				 op1 = new JTextField (5);
				 op2 = new JTextField (5);
				 result = new JTextField (5);
				 equalsSign = new JLabel ("=");
				 a = new JButton ("+");
				 a.addActionListener (new MyActionListener ());
				 s = new JButton ("-");
				 s.addActionListener (new MyActionListener ());
				 m = new JButton ("*");
				 m.addActionListener (new MyActionListener ());
				 d = new JButton ("/");
				 d.addActionListener (new MyActionListener ());
				 jf.setLayout (new FlowLayout ());
				 jf.add (op1);
				 jf.add (a);
				 jf.add (s);
				 jf.add (m);
				 jf.add (d);
				 jf.add (op2);
				 jf.add (equalsSign);
				 jf.add (result);
				 jf.setVisible (true);

			 }
		private class MyActionListener implements ActionListener
		   {
			   public void actionPerformed (ActionEvent e)
			         {
						 if (e.getSource ().equals (a))
						    result.setText((Double.parseDouble (op1.getText ()) + Double.parseDouble (op2.getText ())) + "");
						 else
						 if (e.getSource ().equals (s))
						    result.setText((Double.parseDouble (op1.getText ()) - Double.parseDouble (op2.getText ())) + "");
                         else
						 if (e.getSource ().equals (m))
						    result.setText((Double.parseDouble (op1.getText ()) * Double.parseDouble (op2.getText ())) + "");
                         else
						 if (e.getSource ().equals (d))
						    result.setText((Double.parseDouble (op1.getText ()) / Double.parseDouble (op2.getText ())) + "");

					 }
		   }
           public static void main (String [] args)
              {
				  SwingUtilities.invokeLater (

				  new Runnable (){public void run ()
				  {new HandleAnEvent ();}}
			  );
			  }
      }

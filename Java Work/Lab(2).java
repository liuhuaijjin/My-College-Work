import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Lab
{
		  private JFrame jf;
		  private JPanel jp1,jp2;
		  private JTextField jtf;
		  private JButton jb;
		  private ArrayList<Integer> a;
		  public Lab ()
		  {
				 jf = new JFrame ();
				 jp1 = new JPanel ();
				 jp2 = new JPanel ();
				 a = new ArrayList<Integer>();
				 Toolkit tk = jf.getToolkit ();
				 Dimension screenSize = tk.getScreenSize ();
				 int width = screenSize.width;
				 int height = screenSize.height;
				 jf.setSize (width, height);
				 jf.setTitle ("Pie Chart");
				 jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				 
				 jtf = new JTextField (7);
				 jp1.add(jtf);
				 
				 jb = new JButton ("Add");
				 jb.addActionListener (new MyActionListener ());
				 jp1.add(jb);
				 
				 jf.setLayout (new GridLayout(2,1));
				 jp1.setLayout (new FlowLayout());
				 
				 jf.add (jp1);
				 jf.add (jp2);
				 
				 jp1.setVisible (true);
				 jp2.setVisible(true);
				 jf.setVisible (true);
				 

		}
		private class MyActionListener implements ActionListener
		{
			   public void actionPerformed (ActionEvent e)
			   {
					if (e.getSource ().equals (jb))
					{
						int b = Integer.parseInt (jtf.getText());
						if (b > 0)
						{
							a.add(b);
						}
						else
						{
							//PieChart chart = new PieChart();
							Random r=new Random();
							for (Integer n : a) 
							{
								Color color = new Color (r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
   							//chart.addBar(color, n);
   						}
   						//jp2.add();//chart
							//jp2.setVisible (true);
						}
						jtf.setText ("");
					}
				}
		}
		public static void main (String [] args)
      		{
			SwingUtilities.invokeLater (new Runnable (){public void run (){new Lab ();}});
		}
}
		

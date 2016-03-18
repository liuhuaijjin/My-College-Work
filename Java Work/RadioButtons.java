//===begins here

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButtons
{
	private JFrame jf;
	private JRadioButton s, m, l,el;
	private ButtonGroup bg;
	private JLabel lbl;
	public RadioButtons ()
	{
	jf = new JFrame ();
	jf.setSize (500, 600);
	jf.setTitle ("Radio Buttons");
	jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	jf.setLocationRelativeTo (null);
	jf.setLayout (new FlowLayout ());
	lbl = new JLabel ("Pick one: ");
	jf.add (lbl);
	s = new JRadioButton ("Small");
	s.addActionListener (new RBActionListener ());
	jf.add (s);
	m = new JRadioButton ("Medium");
	m.addActionListener (new RBActionListener ());
	jf.add (m);
	l = new JRadioButton ("Large");
	l.addActionListener (new RBActionListener ());
	jf.add (l);
	el = new JRadioButton (" Extra Large");
	el.addActionListener (new RBActionListener ());
	jf.add (el);
	bg = new ButtonGroup ();
	bg.add (s);
	bg.add (m);
	bg.add (l);
	bg.add (el);

	jf.setVisible (true);
	}
private class RBActionListener implements ActionListener
{
	public void actionPerformed (ActionEvent e)
	{
	if (e.getSource ().equals (s))
	lbl.setText ("Small was chosen...");
	else
	if (e.getSource ().equals (m))
	lbl.setText ("Medium was chosen...");
	else
	if (e.getSource ().equals (l))
	lbl.setText ("Large was chosen...");
  	else 
        lbl.setText("Extra Large was chosen");
	}
}
public static void main (String [] args)
	{
	new RadioButtons ();
	}


}

 

//===ends here

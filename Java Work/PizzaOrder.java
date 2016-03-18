import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PizzaOrder
{
    int c=0;
    private JFrame jf;
    private JRadioButton s, m, l, x;
    private ButtonGroup bg;
    private JLabel lbl;
    private JCheckBox mushrooms, greenPeppers, redPeppers, greenOlives, blackOlives, pineapple, onions, extraCheese;
    private JLabel pickSome, mushroomsLbl, greenPeppersLbl, redPeppersLbl, greenOlivesLbl, blackOlivesLbl, pineappleLbl, onionsLbl, extraCheeseLbl;
    private JButton ComputeCost;
    private JTextField output;
    public PizzaOrder ()
    {
        jf = new JFrame (); 
        jf.setSize (500, 600);
        jf.setTitle ("Pizza Order");
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
        x = new JRadioButton ("Extra Large");
        x.addActionListener (new RBActionListener ());
        jf.add(x);
        bg = new ButtonGroup ();
        bg.add (s);
        bg.add (m);
        bg.add (l);
        bg.add (x);
        jf.setLayout (new FlowLayout ());
        pickSome = new JLabel ("Pick some: ");
        jf.add (pickSome);
        mushrooms = new JCheckBox ("Mushrooms");
        mushrooms.addItemListener (new CBItemListener ());
        jf.add (mushrooms);
        greenPeppers = new JCheckBox ("Green Peppers");
        greenPeppers.addItemListener (new CBItemListener ());
        jf.add (greenPeppers);
        redPeppers = new JCheckBox ("Red Peppers");
        redPeppers.addItemListener (new CBItemListener ());
        jf.add (redPeppers);
        greenOlives = new JCheckBox ("Green Olives");
        greenOlives.addItemListener (new CBItemListener ());
        jf.add (greenOlives);
        blackOlives = new JCheckBox ("Black Olives");
        blackOlives.addItemListener (new CBItemListener ());
        jf.add (blackOlives);
        pineapple = new JCheckBox ("Pineapple");
        pineapple.addItemListener (new CBItemListener ());
        jf.add (pineapple);
        onions = new JCheckBox ("Onions");
        onions.addItemListener (new CBItemListener ());
        jf.add (onions);
        extraCheese = new JCheckBox ("Extra Cheese");
        extraCheese.addItemListener (new CBItemListener ());
        jf.add (extraCheese);
        jf.add (mushroomsLbl = new JLabel (""));
        jf.add (greenPeppersLbl = new JLabel (""));
        jf.add (redPeppersLbl = new JLabel (""));
        jf.add (greenOlivesLbl = new JLabel (""));
        jf.add (blackOlivesLbl= new JLabel (""));
        jf.add (pineappleLbl = new JLabel (""));
        jf.add (onionsLbl = new JLabel (""));
        jf.add (extraCheeseLbl = new JLabel (""));
        ComputeCost = new JButton ("Compute Cost");
        ComputeCost.addActionListener( new MyActionListener ());
        jf.add (ComputeCost);
        output = new JTextField(7);
        jf.add(output);
        jf.setVisible (true);
    }
    private class RBActionListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource ().equals (s))
            lbl.setText ("Small was chosen. Cost is Rs 600.");
            else
            if (e.getSource ().equals (m))
            lbl.setText ("Medium was chosen. Cost is Rs 900.");
            else
            if (e.getSource ().equals (l))
            lbl.setText ("Large was chosen. Cost is Rs 1200.");
            else
            if (e.getSource ().equals (x))
            lbl.setText ("Extra Large was chosen. Cost is Rs 1500.");
        }
    }
    private class CBItemListener implements ItemListener
    {
        public void itemStateChanged (ItemEvent e)
        {
            if (mushrooms.isSelected ())
                mushroomsLbl.setText ("Extra mushrooms selected.");
            if (!(mushrooms.isSelected ()))
                mushroomsLbl.setText ("");
            if (greenPeppers.isSelected ())
                greenPeppersLbl.setText ("Extra green peppers selected.");
            if (!(greenPeppers.isSelected ()))
                greenPeppersLbl.setText ("");
            if (redPeppers.isSelected ())
                redPeppersLbl.setText ("Extra red peppers selected.");
            if (!(redPeppers.isSelected ()))
                redPeppersLbl.setText ("");
            if (greenOlives.isSelected ())
                greenOlivesLbl.setText ("Extra green olives selected.");
            if (!(greenOlives.isSelected ()))
                greenOlivesLbl.setText ("");
            if (blackOlives.isSelected ())
                blackOlivesLbl.setText ("Extra black olives selected.");
            if (!(blackOlives.isSelected ()))
                blackOlivesLbl.setText ("");
            if (pineapple.isSelected ())
                pineappleLbl.setText ("Extra pineapple selected.");
            if (!(pineapple.isSelected ()))
                pineappleLbl.setText ("");
            if (onions.isSelected ())
                onionsLbl.setText ("Extra onions selected.");
            if (!(onions.isSelected ()))
                onionsLbl.setText ("");
            if (extraCheese.isSelected ())
                extraCheeseLbl.setText ("Extra cheese selected.");
            if (!(extraCheese.isSelected ()))
                extraCheeseLbl.setText ("");
        }
    }
    private class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {   c=0;
            if(e.getSource().equals(ComputeCost))
            {
                if(s.isSelected())
                    lbl.setText("You have selected a small pizza.");
                else
                if(m.isSelected())
                    lbl.setText("You have selected a medium pizza.");
                else
                if(l.isSelected())
                    lbl.setText("You have selected a large pizza.");
                else
                if(x.isSelected())
                    lbl.setText("You have selected an extra large pizza.");
                if (mushrooms.isSelected ())
                    {   mushroomsLbl.setText ("With extra mushrooms");
                        c++;
                    }
                if (greenPeppers.isSelected ())
                    {   greenPeppersLbl.setText ("With extra green peppers.");
                        c++;
                    }
                if (redPeppers.isSelected ())
                    {   redPeppersLbl.setText ("With extra red peppers.");
                        c++;
                    }
                if (greenOlives.isSelected ())
                    {   greenOlivesLbl.setText ("With extra green olives.");
                        c++;
                    }
                if (blackOlives.isSelected ())
                    {   blackOlivesLbl.setText ("With extra black olives.");
                        c++;
                    }
                if (pineapple.isSelected ())
                    {   pineappleLbl.setText ("With extra pineapple.");
                        c++;
                    }
                if (onions.isSelected ())
                    {   onionsLbl.setText ("With extra onions.");
                        c++;
                    }
                if (extraCheese.isSelected ())
                    {   extraCheeseLbl.setText ("With extra cheese.");
                        c++;
                    }
                if(s.isSelected())
                {
                output.setText((600 + c*99) + "");
                }
                if(m.isSelected())
                {
                output.setText((900 + c*151) + "");
                }
                if(l.isSelected())
                {
                output.setText((1200 + c*199) + "");
                }
                if(x.isSelected())
                {
                output.setText((1500 + c*251) + "");
                }
            }
        }
    }
    public static void main (String [] args)
    {
         new PizzaOrder();
    }
}

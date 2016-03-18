

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckBoxes
{
private JFrame jf;
private JCheckBox mushrooms, greenPeppers, redPeppers, greenOlives, blackOlives, pineapple, onions, extraCheese;
private JLabel pickSome, mushroomsLbl, greenPeppersLbl, redPeppersLbl, greenOlivesLbl, blackOlivesLbl, pineappleLbl, onionsLbl, extraCheeseLbl;
public CheckBoxes ()
{
jf = new JFrame ();
jf.setSize (500, 600);
jf.setTitle ("Check Boxes");
jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
jf.setLocationRelativeTo (null);
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
jf.setVisible (true);
}
int state1=0;int state2=0;int state3=0;int state4=0;int state5=0;int state6=0;int state7=0;int state8=0;
private class CBItemListener implements ItemListener
{
public void itemStateChanged (ItemEvent e)
{

if (mushrooms.isSelected ())
{mushroomsLbl.setText ("Extra mushrooms selected.");
state1=1;
}
if (!mushrooms.isSelected () && state1==1)
mushroomsLbl.setText ("Extra mushrooms cleared.");


if (greenPeppers.isSelected ())
{greenPeppersLbl.setText ("Extra green peppers selected.");
state2=1;
}
if (!greenPeppers.isSelected () && state2==1)
greenPeppersLbl.setText ("Extra green peppers cleared.");


if (redPeppers.isSelected ())
{redPeppersLbl.setText ("Extra red peppers selected.");
state3=1;
}
if (!redPeppers.isSelected () && state3==1)
redPeppersLbl.setText ("Extra red peppers cleared.");


if (greenOlives.isSelected ())
{greenOlivesLbl.setText ("Extra green olives selected.");
state4=1;
}
if (!greenOlives.isSelected () && state4==1)
greenOlivesLbl.setText ("Extra green olives cleared.");



if (blackOlives.isSelected ())
{blackOlivesLbl.setText ("Extra black olives selected.");
state5=1;
}
if (!blackOlives.isSelected () && state5==1)
blackOlivesLbl.setText ("Extra black olives cleared.");


if (pineapple.isSelected ())
{pineappleLbl.setText ("Extra pineapple selected.");
state6=1;
}
if (!pineapple.isSelected () && state6==1)
pineappleLbl.setText ("Extra pineapple cleared.");



if (onions.isSelected ())
{onionsLbl.setText ("Extra onions selected.");
state7=1;
}
if (!onions.isSelected () && state7==1)
onionsLbl.setText ("Extra onions cleared.");



if (extraCheese.isSelected ())
{extraCheeseLbl.setText ("Extra cheese selected.");
state8=1;
}
if (!extraCheese.isSelected () && state8==1)
extraCheeseLbl.setText ("Extra cheese cleared.");

}
}


public static void main (String [] args)
{
new CheckBoxes ();
}

}



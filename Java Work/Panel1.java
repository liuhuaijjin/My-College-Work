import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.util.* ;
import java.lang.String ;
import java.io.* ;

public class Panel1 extends JPanel
{ 
     private JTextArea txt ;
     private JButton click ;
     private JLabel label ;
     int[] a ;
     public Panel1()
    { 
        txt=   new JTextArea();
        click =new JButton("Enter");
        label=new JLabel("Enter a number");
        click.setBounds(250,50,90,40);
        txt.setPreferredSize(new Dimension(400, 100));
        

         //setColor(new Color.YELLOW);
        
        click.addActionListener(new MyActionListener());
        add(label);
        add(txt);
        add(click);
        
        setSize(500,500);
        setVisible(true);
        
        
    }
        
        



   private class MyActionListener implements ActionListener
	{ 
  	  public void actionPerformed(ActionEvent e)
  	  {    
  	  		int num1=0,i=0;
  	  		
  	  		try{
  	  		 if(e.getSource()==click)
  	  		  {
  	  		    num1=Integer.parseInt(txt.getText());
  	  		    if(num1>0)
  	  		  	  a[i++]=num1 ;
  	  		    else
  	  		     System.out.println("negetive no");
  	  		   }
  	  	  }catch(Exception s)
  	  	  {System.out.println("error");}
  	  		 
  	  		 
  	  		
            
     }
 }
 }



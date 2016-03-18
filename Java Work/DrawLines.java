import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class DrawLines extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        int height = getHeight();
        int width = getWidth();

        for(int i = 0;i<=400;i+=10)
        {
            g.drawLine(i,0,i,height);       
        }
        for(int i = 0;i<=400;i+=10)
        {
            g.drawLine(0,i,width,i);       
        }
        g.setColor(Color.RED);
        g.drawLine(0,156,245,0);   
    }
    public static void main(String [] args)
    {
    	
    }
}

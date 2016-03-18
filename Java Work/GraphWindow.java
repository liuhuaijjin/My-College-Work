import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphWindow extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        double max=16;
        double min=0;
        double x[]= {-4,-3,-2,-1,0,1,2,3,4};
        double y[]={16,9,4,1,0,1,4,9,16};

        Graphics2D g2=(Graphics2D)g;
        setBackground(Color.WHITE);
        g2.translate(getWidth()/2,getHeight()/2);
        g2.scale(5.0, 5.0);
        g2.draw( new Line2D.Double(-4*100,0,4*100,0));
        g2.draw( new Line2D.Double(0,min*100,0,-max*100));
        for(int i=0;i<x.length;i++){
            if(i+1<x.length){
            g2.setColor(Color.RED);
            g2.draw(new Line2D.Double(x[i], -y[i], x[i+1], -y[i+1]));
            }
            else{
                break;
            }
        }
        }
        
        public static void main(String [] args)
        {
        	
        }
        }

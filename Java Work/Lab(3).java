import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Lab extends JFrame
{
    private JFrame jf;
    boolean flag = false;
    private JTextField jtf;
    private JButton insert;
    private JPanel p1, p2;
    private ArrayList<Integer> al;
    public Lab()
    {
        super("Pie Chart");
        al = new ArrayList<Integer>();
        Toolkit tk = getToolkit ();
        Dimension screen = tk.getScreenSize ();
        int screenWidth = screen.width;
        int screenHeight = screen.height;
        setSize(screenWidth,screenHeight);
        setLayout(new GridLayout());
        p1 = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p1);
        jtf = new JTextField(10);
        jtf.setBounds(5,5,100,50);
        p1.add(jtf);
        insert = new JButton("Add");
        p1.add(insert);
        setVisible(true);
        insert.addActionListener(new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                String s = jtf.getText();
                if(Integer.parseInt(s)>0){
                    al.add(Integer.parseInt(s));
                    jtf.setText("");
                    }
                else
                    {
                        flag = true;
                    }
              }
        });
    }
    public static void main(String [] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
              public void run()
              {
                Lab q2 = new Lab();
              }
        });
       
    }
public void paint(Graphics g) 
{ 
     super.paint(g);
    if(flag==true){
    Rectangle area = p1.getBounds(); 
     double total = 0.0D;
      for (int i = 0; i < al.size(); i++) {
         total += al.get(i);
      }
      double curValue = 0.0D;
      double startAngle = 0;
      for (int i = 0; i < al.size(); i++) {
            int red =(int) (Math.random()*256);
int green = (int)(Math.random()*256);
int blue = (int)(Math.random()*256);
Color randomColor = new Color(red, green, blue);
         startAngle = (curValue * 360 / total);
         double arcAngle = (al.get(i) * 360 / total);
         g.setColor(randomColor);
         g.fillArc(100, 100, 300, 300, (int)startAngle, (int)arcAngle);
         curValue += al.get(i);
      }
}  
} 
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class PieChart
{
    JFrame frame;
    JPanel panel1;
    PieChartPanel panel2;
    JTextField textField;
    JButton button;
    ArrayList<Integer> arrayList;
    public PieChart ()
    {
        frame = new JFrame("Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(400, 800);
        
        arrayList = new ArrayList<Integer>();
        
        panel1 = new JPanel();
        textField = new JTextField(5);
        button = new JButton("Enter");
        
        button.addActionListener(new PieChartActionListener());
        
        panel1.add(textField);
        panel1.add(button);
        
        
        
        frame.add(panel1);
        
        frame.setVisible(true);
        
    }
    
    public void drawPieChart ()
    {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(2, 1));
        jf.setSize(400, 800);
        panel2 = new PieChartPanel(arrayList);
        jf.add(panel2);
        jf.setVisible(true);
        
    }
    
    private class PieChartActionListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
        
            String text = textField.getText();
            if (text.length() == 0) {
                return ;
            }
            int x = Integer.parseInt (text);
            if (x > 0) {
                System.out.println("Entered " + x);
                arrayList.add(x);
                System.out.println(arrayList.toString());
            } else {
                drawPieChart();
            }
        }
    }
    
    public static void main (String args[])
    {
    
        SwingUtilities.invokeLater (new Runnable () {public void run () {new PieChart ();}});
    }
}

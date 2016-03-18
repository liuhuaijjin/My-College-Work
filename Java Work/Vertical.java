import java.awt.*;
import javax.swing.*;
  
public class Vertical {
    public static void main(String[] args) {
        JPanel p = new JPanel();
        p.add(new JButton("one"));
        p.add(createHorizontalSeparator());
        p.add(new JButton("two"));
        p.add(createVerticalSeparator());
        p.add(new JButton("three"));
  
        final JFrame f = new JFrame("Vertical");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(p);
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }
  
    static JComponent createVerticalSeparator() {
        JSeparator x = new JSeparator(SwingConstants.VERTICAL);
        x.setPreferredSize(new Dimension(3,50));
        return x;
    }
  
    static JComponent createHorizontalSeparator() {
        JSeparator x = new JSeparator(SwingConstants.HORIZONTAL);
        x.setPreferredSize(new Dimension(50,3));
        return x;
    }
}

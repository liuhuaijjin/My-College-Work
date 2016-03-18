import java.awt.* ;
import java.util.* ;

import java.awt.event.*;
import javax.swing.*;


public class AssignmentGraphics
{
    private JFrame jf ;
    private JPanel p1 ,p2 ;
    private int[] k={2,5,7,9,11};
   
    
    
    public AssignmentGraphics()
    {
        jf=new JFrame();
        p1=new Panel1();
        p2=new Panel2(k);
         jf.getContentPane().add(new Panel2(k));
        Toolkit tk =jf.getToolkit();
        Dimension screenSize= tk.getScreenSize();  
        int height =screenSize.height ;
        int width=screenSize.width ;
        jf.setSize(width ,height);
        jf.setTitle("Assignment -Bar Graphs!");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // jf.add(p1);
       // jf.add(p2);
        jf.setLayout(new BorderLayout());
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
         splitPane.setLeftComponent(p1);
         splitPane.setRightComponent(p2);
         jf.add(splitPane, BorderLayout.CENTER);
          
         
        
        jf.setVisible(true);
        
        
       
    }


    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new AssignmentGraphics();
            }
        });
    }
}


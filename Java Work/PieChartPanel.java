import javax.swing.*;
import java.awt.*;
import java.util.*;
public class PieChartPanel extends JPanel
{
    ArrayList<Integer> integerList;
    
    public PieChartPanel (ArrayList <Integer> arrayList)
    {
        this.integerList = arrayList;
        System.out.println("PieChartPanel created");
    }
    
    public int getStartAngle (int x, int sum) {
        return (x * 360)  / sum;
    }
    public int sum(ArrayList <Integer> arrayList)
    {
        int sum = 0;
        for (Integer i : arrayList) {
            sum = sum + i;
        }
        return sum;
    }
    
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        System.out.println("Drawing Pie Chart!");
        int sum = sum(this.integerList);
        int startAngle = 0;
        int arcAngle = 0;
        int j = 0;
        for (Integer i : this.integerList) {
            arcAngle = getStartAngle(i, sum);
            if (j % 3 == 0 ) {
                g.setColor(Color.BLACK);
            } else if (j % 3 == 1 ){
                g.setColor(Color.YELLOW);
            } else {
                g.setColor(Color.RED);
            }
            g.fillArc(200, 200, 100, 100, startAngle, arcAngle);
            startAngle = startAngle + arcAngle;
            
            j = j+1;
        }
    }
}


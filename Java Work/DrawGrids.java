 import java.awt.*;
    import java.awt.event.*;
import java.awt.geom.Line2D;

    class Grids extends Canvas {
      int width, height, rows, columns;

      Grids(int w, int h, int r, int c) {
      setSize(width = w, height = h);
      rows = r;
      columns = c;
      }
      public void paint(Graphics g) {
Graphics2D g2 = (Graphics2D) g;

                
      int k;
      width = getSize().width;
      height = getSize().height;

      int htOfRow = 5;
      for (k = 0; k < rows; k++)
{if (k==rows/2)
{g.drawLine(0, k * htOfRow , width, k * htOfRow );
g.drawLine(0, k * htOfRow , width, k * htOfRow );
g.drawLine(0, k * htOfRow , width, k * htOfRow );
  }
else
      g.drawLine(0, k * htOfRow , width, k * htOfRow );
}
      int wdOfRow = 5;
      for (k = 0; k < columns; k++)
{if (k==columns/2)
{ g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
 g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
 g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
  }
else
      g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
      
}
 g.drawLine(400,-1582/5,800,3182/5);

}
    }
    public class DrawGrids extends Frame {
      DrawGrids(String title, int w, int h, int rows, int columns) {
      setTitle(title);
setSize(800,800);
      Grids grid = new Grids(w, h, h/5, w/5);
      add(grid);
    }
    public static void main(String[] args) {
      new DrawGrids("Draw Grids", 800, 800, 10, 10).setVisible(true);
      }
    }

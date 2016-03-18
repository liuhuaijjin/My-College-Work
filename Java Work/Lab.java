import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Lab
{
		  private JFrame jf;
		  private JPanel jp1,jp2;
		  private JTextField jtf;
		  private JButton jb;
		  private ArrayList<Integer> a;
		  public Lab ()
		  {
				 jf = new JFrame ();
				 jp1 = new JPanel ();
				 jp2 = new JPanel ();
				 a = new ArrayList<Integer>();
				 Toolkit tk = jf.getToolkit ();
				 Dimension screenSize = tk.getScreenSize ();
				 int width = screenSize.width;
				 int height = screenSize.height;
				 jf.setSize (width, height);
                               jf.setTitle ("Pie Chart");
				 jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				 
				 jtf = new JTextField (7);
				 jp1.add(jtf);
				 
				 jb = new JButton ("Add");
				 jb.addActionListener (new MyActionListener ());
				 jp1.add(jb);
				 
				 jf.setLayout (new GridLayout(2,1));
				 jp1.setLayout (new FlowLayout());
				 
				 jf.add (jp1);
				 jf.add (jp2);
				 
				 jp1.setVisible (true);
				 jp2.setVisible(false);
				 jf.setVisible (true);
				 

		}
		
private class MyActionListener implements ActionListener
		{
			   public void actionPerformed (ActionEvent e)
			   {
					if (e.getSource ().equals (jb))
					{
						int b = Integer.parseInt (jtf.getText());
						if (b > 0)
						{
							a.add(b);
						}
						else
						{

                                                      Pie chart = new PieChart();
							Random r=new Random();
							for (Integer n : a) 
							{
								Color color = new Color (r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt    (256));
   							chart.addpie(color, n);
   						          }
   						 jp2.add(chart);
							jp2.setVisible (true);
						}
						jtf.setText ("");
					}
				}
		}
}

        public void drawPie( Graphics g) {

         double floatVal[] = { 0.0, 0.0, 0.0, 0.0, 0.0 } ;
         double totVal = 0.0;
         Font font ;

            /** create 2D by casting g to Graphics2D */
         Graphics2D g2d = ( Graphics2D ) g;

         totVal   = (double) intField1 + intField2
                  + intField3 + intField4  + intField5  ;
         floatVal[0] = (double) (intField1 / totVal);
         floatVal[1] = (double) (intField2 / totVal);
         floatVal[2] = (double) (intField3 / totVal);
         floatVal[3] = (double) (intField4 / totVal);
         floatVal[4] = (double) (intField5 / totVal);

         sysPrint("paintComponent() 2: The value of intField1 is " + intField1 +
                      "\nintField2 is " + intField2  +
                      "\nintField3 is " + intField3  +
                      "\nintField4 is " + intField4  +
                      "\nintField5 is " + intField5 ) ;

         Arrays.sort (floatVal);



            /** draw 2D pie-shaped arc in white */
         g2d.setPaint( Color.white );
         g2d.setStroke( new BasicStroke( 6.0f ) );
         g2d.fillArc( 50, 80, 300, 300, 0,  (int) ( floatVal[ 4 ] * 360 ) );
         g2d.fillRect( 440, 80, 40, 20 )  ;
         g.setFont(  new Font( "", Font.BOLD + Font.ITALIC, 18 ) );
         g2d.setPaint( Color.black );
         g.drawString("- " +
                  (java.lang.Math.round( floatVal[ 4 ] * 100.0 ))   +
                     " %",  490, 95);


         g2d.setPaint( Color.green );
         g2d.fillArc( 50, 80, 300, 300, (int) ( floatVal[ 4 ] * 360 ),
                          ( int )( floatVal[ 3 ] * 360 ) );
         g2d.fillRect( 440, 120, 40, 20 )  ;
         g.setFont( new Font( "", Font.BOLD + Font.ITALIC, 18 ) );
         g2d.setPaint( Color.black );
         g.drawString("- " + ( java.lang.Math.round( floatVal[ 3 ]  * 100))
                        + " %",  490, 135);

         g2d.setPaint( Color.blue );
         g2d.fillArc( 50, 80, 300, 300,
                  (int)(floatVal[ 4 ] * 360) +
                     (int)( floatVal[ 3 ] * 360 ) ,
                        (int)(floatVal[ 2 ] * 360 ) );
         g2d.fillRect( 440, 160, 40, 20 )  ;
         g.setFont( new Font( "", Font.BOLD + Font.ITALIC, 18 ) );
         g2d.setPaint( Color.black );
         g.drawString("- " + ( java.lang.Math.round( floatVal[ 2 ]  * 100)) + " %",
                       490, 175);

         g2d.setPaint( Color.black );
         g2d.fillArc( 50, 80, 300, 300,
                  (int)(floatVal[ 4 ] * 360) +
                     (int)( floatVal[ 3 ] * 360 ) +
                        (int)( floatVal[ 2 ] * 360) ,
                           (int) (floatVal[ 1 ] * 360 ) + 2 ) ;
         g2d.fillRect( 440, 190, 40, 20 )  ;
         g.setFont(
                    new Font( "", Font.BOLD + Font.ITALIC, 18 ) );
         g2d.setPaint( Color.black );
         g.drawString("- " + ( java.lang.Math.round( floatVal[ 1 ]  * 100)) + " %",
                       490, 205);

         g2d.setPaint( Color.red );
         g2d.fillArc( 50, 80, 300, 300,
                  (int)(floatVal[ 4 ] * 360) +
                     (int)( floatVal[ 3 ] * 360 ) +
                        (int)( floatVal[ 2 ] * 360) +
                           (int)( floatVal[ 1 ] * 360) ,
                              (int) (floatVal[ 0 ] * 360 ) + 2 ) ;
         g2d.fillRect( 440, 220, 40, 20 )  ;
         g.setFont(
                    new Font( "", Font.BOLD + Font.ITALIC, 18 ) );
         g2d.setPaint( Color.black );
         g.drawString("- " + ( java.lang.Math.round( floatVal[ 0 ]  * 100)) + " %",
                       490, 235);

         g2d.setStroke( new BasicStroke( 1.0f ) );
         g.drawArc( 50, 80, 300, 300, 0, 360 );

         notInitPass = true ;
      }
 public static void main( String args[] )
   {
      int width = 790, height = 550;

      // create window in which applet will execute
      JFrame appMain =
         new JFrame( "Pie Chart" );

      /** create one applet instance */
      final PieChart_II appPie = new PieChart_II();
      appPie.setWidth( width );
      appPie.setHeight( height );
      appPie.setFrameRef( appMain ) ;
      /** call applet's init and start methods */
      appPie.init();
      appPie.start();

      /** attach applet to center of window */
      appMain.getContentPane().add( appPie );


      appMain.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               appPie.sysExit( 0 );
            }
         }
      );

      /** set the window's size */
      appMain.setSize( appPie.width, appPie.height );

      /**
       * showing the window causes all GUI components
       * attached to the window to be painted
       */

      appMain.show();
   }


   /** ********************************************************
    *  subclass of JPanel to allow drawing in a separate area
    ***********************************************************/
   public class ChartPanel extends JPanel  {
      private PieChart_II pcII ;

      /** **************************************************
       * The ChartPanel( PieChart_II pc_II ) method is a constructor for the
       * ChartPanel class.
       ****************************************************/
      public ChartPanel( PieChart_II pc_II ) {

         pc_II.sysPrint("ChartPanel() 1: Entered. ") ;
         pcII = pc_II ;

      }


      public void paintComponent( Graphics g )  {

         super.paintComponent( g );

         sysPrint("paintComponent() 1: Entered. The value of notInitPass is " + notInitPass ) ;

         if ( notInitPass ) {

            switch ( butChoice ) {
               case 0:
                  drawPie( g )  ;
               break ;
               
            }
         }
      }
   }



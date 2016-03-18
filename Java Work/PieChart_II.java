import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.print.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane ;


/** ***************************************************************
 *  class PieChart is used to create a simple pie chart based on
 *  user data input.
 **************************************************************** */
public class PieChart_II extends JApplet implements ActionListener {
   private JFrame app ;
   private Font         font;
   private JPanel buttonPanel, textPanel ;
   private JTextField text1, text2, text3, text4, text5 ;
   private Container c ;
   private int width = 500, height = 400;
   private int butChoice = -1  ;
   private int intField1 , intField2 , intField3 , intField4 , intField5 ;
   private int chgField1 = -1, chgField2 = -1 , chgField3 = -1 , chgField4 = -1 ,
                     chgField5 = -1 ;
   private JLabel label1;
   private JButton pieButton , barButton , helpButton , aboutButton ,
                           clearButton ,  exitButton ;
   private ChartPanel myChart ;
   private boolean debug = true , fieldNull , fieldNot_A_Digit , notInitPass = false;
   private String strField1 = "-1", strField2 = "-1", strField3 = "-1",
                       strField4 = "-1",  strField5 = "-1" ;

   /** ********************************************************
    * Initialization method init() calls the following methods:
    * 1- setupPanels() - creates the JPanels
    * 2- setupText() - creates lables and entry fields
    * 3- setupButtons() - creates push buttons
    *
    * In addition, it obtains the context for which to anchor
    * the JPanels and add the GUI.
    **********************************************************/
   public void init()   {

      setupPanels() ;

      setupText() ;

      setupButtons();

      c = getContentPane();

      c.add( textPanel,  BorderLayout.NORTH );
      c.add( buttonPanel, BorderLayout.SOUTH );
      c.add( myChart, BorderLayout.CENTER );
   }

   /**  ****************************************************
    *  The setupPanels() method is used to create the JPanels
    *  and JLabels used in this application/applet.
    ********************************************************/
   public void setupPanels() {
      textPanel   = new JPanel();
      textPanel.setLayout(  new GridLayout( 1, 8 ) );

      buttonPanel = new JPanel();

      myChart = new ChartPanel( this );

   }

   /**  ****************************************************
    * The setupText() method allocates and sets up the entry
    * text fields used to gather user input.
    ********************************************************/
   public void setupText() {

      label1      = new JLabel("Enter 5 numbers.");

      text1       = new JTextField(5);
      text2       = new JTextField(5);
      text3       = new JTextField(5);
      text4       = new JTextField(5);
      text5       = new JTextField(5);

      textPanel.add( label1 );
      textPanel.add( text1  );
      textPanel.add( text2  );
      textPanel.add( text3  );
      textPanel.add( text4  );
      textPanel.add( text5  );

   }

   /**  ****************************************************
    * The setupButtons() method allocates and sets up the
    * JButtons.
    ********************************************************/
   public void setupButtons() {
      pieButton    = new JButton( "Create Pie Chart" ) ;
     

      buttonPanel.add( pieButton ) ;
   

      pieButton.addActionListener( this ) ;
   
   }

   /**  ****************************************************
    * Set the width of frame to 600 if w less than 0
    ***************************************************** */
   public void setWidth( int w )
      { width = ( w >= 0 ? w : 600 ); }

   /** ****************************************************
    * Set the height to 600 if h less than 0
    ***************************************************** */
   public void setHeight( int h )
      { height = ( h >= 0 ? h : 400 ); }

   /** ****************************************************
    * Set the current value of the frame reference
    ***************************************************** */
   public void setFrameRef( JFrame appM )
      { app = appM ; }

   /**   ******************************************************
    * The checkFields() method ensures that the data is not null
    ***********************************************************/
   public boolean checkFields( ) {
      boolean checkedOK = false;

     sysPrint ( "checkFields() 1: Starting checkFields() method." ) ;
      strField1  = text1.getText()  ;
      strField2  = text2.getText()  ;
    strField3  = text3.getText()  ;
     strField4  = text4.getText()  ;
      strField5  = text5.getText()  ;


      if ( strField1.equals("") ||
               strField2.equals("") ||
               strField3.equals("") ||
               strField4.equals("") ||
               strField5.equals("") ) {

         JOptionPane.showMessageDialog(null,
                    "At least one of the entry fieds is null/blank.",
                    "Fields Cannot be Null", JOptionPane.INFORMATION_MESSAGE) ;
         fieldNull = true;
      }
      else if( !checkDigit()  ) {

         intField1 = Integer.parseInt( strField1 );
         intField2 = Integer.parseInt( strField2 );
         intField3 = Integer.parseInt( strField3 );
        intField4 = Integer.parseInt( strField4 );
         intField5 = Integer.parseInt( strField5 );

         fieldNot_A_Digit = true;
      }
      else
         repaint() ;
         checkedOK = true;

      return  checkedOK ;
   }

   /** ****************************************************
    * checkDigit()
    * This method checks to ensure that the data entered
    * in the text fields are all digits. The field is parsed
    * character by character to ensure each is a digit.
    ***************************************************** */
   public boolean  checkDigit( ) {

       int strLength = 0 , ii = 0 ;
       boolean isDig = true;
       String str , whichfield = "", strArray[] = { strField1 , strField2 ,
                           strField3 ,  strField4 , strField5 } ;

       for ( ii = 0; ii < 5 && isDig ; ii++) {
          String strVal = strArray[ ii ] ;
          strLength = strVal.length();
          sysPrint( "The value being checked is " + strVal +
                     " and the value of ii is " + ii + " and the length is " + strLength ) ;

          for (int iii = 0; iii < strLength; iii++) {
             if (!Character.isDigit( strVal.charAt(iii) ) ) {
                isDig = false;

                switch ( ii ) {
                   case 0:
                      whichfield = "first" ;
                   break ;
                   case 1:
                      whichfield = "second" ;
                   break ;
                   case 2:
                      whichfield = "third" ;
                   break ;
                   case 3:
                      whichfield = "fourth" ;
                   break ;
                   case 4:
                      whichfield = "fifth" ;
                   break ;
                }

                JOptionPane.showMessageDialog(null,
                    "The number entered in the " + whichfield + " entry field is not a whole number." +
                    "\nPlease enter only whole numbers e.g. 55.",
                    "Fields Must ne Contain a number", JOptionPane.INFORMATION_MESSAGE) ;
                break;
             }
          }
       }

       intField1 = Integer.parseInt( strField1  ) ;
       intField2 = Integer.parseInt( strField2  ) ;
       intField3 = Integer.parseInt( strField3  ) ;
       intField4 = Integer.parseInt( strField4  ) ;
       intField5 = Integer.parseInt( strField5  ) ;

       return isDig;
   }

   /** **************************************************
    *  The checkFieldsChange() method checks if data in
    *  the text fields has changed since the last check.
    ****************************************************/
   public void checkFieldsChange( ActionEvent e ) {

       sysPrint ( "checkFieldsChange() 1: Starting checkFieldsChange() method." ) ;

       sysPrint ( "checkFieldsChange() 2: intField1 =s " + intField1 + " chgField1 =s " + chgField1 +
                   "\nintField2 =s " + intField2 + " chgField2 =s " + chgField2 +
                   "\nintField3 =s " + intField3 + " chgField3 =s " + chgField3 +
                   "\nintField4 =s " + intField4 + " chgField4 =s " + chgField4 +
                   "\nintField5 =s " + intField5 + " chgField5 =s " + chgField5   ) ;

       if ( !(intField1 == chgField1 ) ||
                  !(intField2 == chgField2 )  ||
                  !(intField3 == chgField3 ) ||
                  !(intField4 == chgField4 ) ||
                  !(intField5 == chgField5 ) ) {

          sysPrint ( "checkFieldsChange() 3: In checkFieldsChange() method." ) ;

          getTextValues() ;

          chgField1  = intField1 ;
          chgField2  = intField2 ;
          chgField3  = intField3 ;
          chgField4  = intField4 ;
          chgField5  = intField5 ;
       }

       return;
   }

   /**  **************************************************
    * The getTextValues() method retrieves data from the
    * text entry fields.
    ****************************************************/
   public void getTextValues() {

      sysPrint ( "getTextValues() 1: Starting getTextValues() method." ) ;

      intField1 = Integer.parseInt( strField1  = text1.getText()  ) ;
      intField2 = Integer.parseInt( strField2  = text2.getText()  ) ;
      intField3 = Integer.parseInt( strField3  = text3.getText()  ) ;
      intField4 = Integer.parseInt( strField4  = text4.getText()  ) ;
      intField5 = Integer.parseInt( strField5  = text5.getText()  ) ;

      repaint() ;

      return;
   }


   /** **************************************************
    *  actionPerformed() is the event handler that responds
    *  to the events caused by pressing the buttons. The events
    *  caused by pressing the push buttons are:
    *  1- Exit button causes the application to exit
    *  2- The Pie Button causes the application t0 gather the
    *     data the user entered to create a Pie Chart.
    ****************************************************/
   public void actionPerformed( ActionEvent e )  {

      if ( e.getSource() == exitButton ) {
            sysPrint ( "actionPerformed() 1: The exit button was pressed." ) ;
            System.exit( 0 );
      }
      else if ( e.getSource() == pieButton ) {
         sysPrint( "actionPerformed() 2: The create Pie Chart button was pressed." ) ;
         notInitPass = true ;
         sysPrint( "actionPerformed() 3: The value of notInitPass is " + notInitPass ) ;
         if ( checkFields( ) ) {
            butChoice = 0 ;
            repaint() ;
         }
      }
      else if ( e.getSource() == barButton ) {
         sysPrint( "actionPerformed() 4: The create Bar Chart button was pressed." ) ;
         notInitPass = true ;
         sysPrint( "actionPerformed() 5: The value of notInitPass is " + notInitPass ) ;
         if ( checkFields( ) ) {
            butChoice = 1 ;
            app.setTitle( "Bar Chart" );
            repaint() ;
         }
      }
      else if ( e.getSource() == helpButton ) {
         sysPrint( "actionPerformed() 6: The help button was pressed." ) ;
         File hd = new File("..//PieChart_II_Help.html");

         Runtime rt = Runtime.getRuntime();
         String[] callAndArgs = { "c:\\Program Files\\Internet Explorer\\IEXPLORE.exe" ,
                         "" + hd.getAbsolutePath() };


         butChoice = 2 ;
         try {
            Process child = rt.exec(callAndArgs) ;
            child.waitFor();
            sysPrint ("Process exit code is: " +
                                 child.exitValue());
         }
         catch(IOException e2) {
            sysPrint(
                  "IOException starting process!");
         }
         catch(InterruptedException e3) {
            sysPrint( "Interrupted waiting for process!" ) ;
         }
      }
      else if ( e.getSource() == aboutButton ) {
         sysPrint( "actionPerformed() 7: The about button was pressed." ) ;
         Runtime rt = Runtime.getRuntime();
         String[] callAndArgs = { "c:\\Program Files\\Internet Explorer\\IEXPLORE.exe" ,
                           "http://www.sumtotalz.com/TotalAppsWorks/index.html" };

         butChoice = 3 ;
         try {
            Process child = rt.exec(callAndArgs) ;
            child.waitFor();
            sysPrint ("Process exit code is: " +
                                 child.exitValue());
         }
         catch(IOException e2) {
            sysPrint(
                  "IOException starting process!");
         }
         catch(InterruptedException e3) {
            sysPrint( "Interrupted waiting for process!" ) ;
         }
      }
      else if ( e.getSource() == clearButton ) {
         sysPrint( "actionPerformed() 8: The clear button was pressed." ) ;
         butChoice = 4 ;
         text1.setText("")  ;
         text2.setText("")  ;
         text3.setText("")  ;
         text4.setText("")  ;
         text5.setText("")  ;

         repaint() ;
      }
   }

   /** ***********************************************************
    * The sysExit() method is called in response to a close
    * application event.
    ************************************************************* */
   public void sysExit( int ext ) {
      System.exit( ext ) ;
   }

   /** **************************************************
    * drawPie uses the user input to draw the pie chart
    ****************************************************/

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

   
   /** ****************************************************
    * sysPrint() is used to print out debugging messages.
    ***************************************************** */
   public void sysPrint( String str ) {
      if( debug )
         System.out.println( str ) ;
   }

   /** ********************************************************************
    *  main(String args[] ) : this is the entry point for this application
    *                         that Java calls when starting this program
    *                         execution when it runs as an application.
    *********************************************************************/
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

      /** ******************************************************
       *  paintComponent() is called when a paint operation is
       *                   required by the subclass MyPanel which
       *                   extends the JPanel class. The method
       *                   writes the help instructions on the
       *                   initial pass. It then does determines
       *                   a) - If any of the fields were null, which
       *                        will generate a fieldNull error.
       *                   b) - If any of the fields are not a digit,
       *                        which will generate a fieldNot_A_Digit
       *                        error.
       *
       *                   If steps a) and b) do not generate an error,
       *                   the code determines which button was pressed.
       *                   If currentChoice equals
       *
       *                   0- The pie chart button was pressed.
       *                   1- The bar chart button was pressed.
       *                   2- The help button was pressed.
       *                   3- The about button was pressed.
       *                   4- The clear button was pressed.
       *                   5- The exit button are not processed by this
       *                      paintcomponent because nothing needs to
       *                      be printed on the JPanel.
       ********************************************************/
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
}

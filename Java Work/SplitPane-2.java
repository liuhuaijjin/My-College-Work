import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

public class SplitPane extends 	JFrame
{
	private		JSplitPane	splitPaneV;
	private		JSplitPane	splitPaneH;
	private		JPanel		panel1;
	private		JPanel		panel2;
    private JButton Save;
    private JTextArea tf;
    private ArrayList<String> arrayObject;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();


	public SplitPane()
	{
		setTitle( "Assignment" );
		setBackground( Color.gray );

		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create the panels
		createPanel1();
		createPanel2();


		// Create a splitter pane
		splitPaneV = new JSplitPane( JSplitPane.VERTICAL_SPLIT );
		topPanel.add( splitPaneV, BorderLayout.CENTER );

		/*splitPaneH = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT );
		splitPaneH.setLeftComponent( panel1 );
		splitPaneH.setRightComponent( panel2 );*/

		splitPaneV.setLeftComponent( panel1 );
		splitPaneV.setRightComponent( panel2 );
}

	public void createPanel1()
	{
		panel1 = new JPanel();
		panel1.setLayout( new BorderLayout() );
		panel1.setPreferredSize( new Dimension( 250, 250 ) );
		tf = new JTextArea();
		panel1.add(tf ,BorderLayout.CENTER);
		Save = new JButton("Save");
		panel1.add( Save, BorderLayout.SOUTH);
		arrayObject= new ArrayList<String>();
		Save.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {Savetolist();}});


	}

	public void createPanel2()
	{
		panel2 = new JPanel();
		panel2.setLayout( new BorderLayout() );
		panel2.add( new JLabel( "BarChart" ), BorderLayout.NORTH );
	}

public void Savetolist()
{
	String add_item_to_array = tf.getText().trim();
    arrayObject.add(add_item_to_array);
    for(int i = 0; i < arrayObject.size(); i++) {
	   numbers.add(Integer.parseInt(arrayObject.get(i)));
}
    for (int j = 0; j < numbers.size(); j++) {
		    int value = numbers.get(j);
	    System.out.println("Element: " + value);
}


}

	public static void main( String args[] )
	{
		// Create an instance of the test application
		SplitPane mainFrame	= new SplitPane();
		mainFrame.pack();
		mainFrame.setVisible( true );
	}
}

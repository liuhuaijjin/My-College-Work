 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Graphs2 extends JFrame implements ChangeListener {

   int a, b, c, d;
   int Xleft = -5;
   int Xright = 5;
   int Ytop = 5;  // The y-value entries can be up to 250-100=150.
   int Ybottom = -5;

	private JTextField aTextField, bTextField, cTextField, dTextField;

	private JPanel panel;
	private JSlider aSlider ,bSlider, cSlider, dSlider;
	private int height = 200, width = 200;

	public static void main(String[] args) {

		Graphs2 frame = new Graphs2();
		frame.setSize(320, 350);
		frame.createGUI();
		frame.setVisible(true);

	}

	private void createGUI() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());

		aSlider = new JSlider(-5, 5);
		aSlider.addChangeListener(this);
		window.add(aSlider);

		aTextField = new JTextField(4);
		window.add(aTextField);

		bSlider = new JSlider(-5, 5);
		bSlider.addChangeListener(this);
		window.add(bSlider);

		bTextField = new JTextField(4);
		window.add(bTextField);

		cSlider = new JSlider(-5, 5);
		cSlider.addChangeListener(this);
		window.add(cSlider);

		cTextField = new JTextField(4);
		window.add(cTextField);

		dSlider = new JSlider(-5, 5);
		dSlider.addChangeListener(this);
		window.add(dSlider);

		dTextField = new JTextField(4);
		window.add(dTextField);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width, height));
		panel.setBackground(Color.lightGray);
		window.add(panel);
	}

	public void stateChanged(ChangeEvent e) {

		a = aSlider.getValue();
		b = bSlider.getValue();
		c = cSlider.getValue();
		d = dSlider.getValue();


	   aTextField.setText("a = " + Integer.toString(a));
	   bTextField.setText("b = " + Integer.toString(b));
	   cTextField.setText("c = " + Integer.toString(c));
	   dTextField.setText("d = " + Integer.toString(d));

		draw();
		draw2();
	}

	private void draw() {

		Graphics paper = panel.getGraphics();
		paper.setColor(Color.white);
		paper.fillRect(0, 0, width, height);
		double x, y, nextX, nextY;
		int xPixel1, yPixel1, nextXPixel1, nextYPixel1;
		paper.setColor(Color.black);

		for(xPixel1 = 0; xPixel1 <= width; xPixel1++ ) {

			x = scaleX(xPixel1);
			y = theFunction(x);
			yPixel1 = scaleY(y);
			nextXPixel1 = xPixel1 + 1;
			nextX = scaleX(nextXPixel1);
			nextY = theFunction(nextX);
			nextYPixel1 = scaleY(nextY);
			paper.drawLine(xPixel1, yPixel1, nextXPixel1, nextYPixel1);

		}
		
	}

	private void draw2() {

		Graphics paper = panel.getGraphics();
		paper.setColor(Color.white);
		paper.fillRect(0, 0, width, height);
		double x1, y1, nextX1, nextY1;
		int xPixel1, yPixel1, nextXPixel1, nextYPixel1;
		paper.setColor(Color.red);

		for(xPixel1 = 0; xPixel1 <= width; xPixel1++ ) {

			x1 = scaleX(xPixel1);
			y1 = theFunction1(x1);
			yPixel1 = scaleY(y1);
			nextXPixel1 = xPixel1 + 1;
			nextX1 = scaleX(nextXPixel1);
			nextY1 = theFunction(nextX1);
			nextYPixel1 = scaleY(nextY1);
			paper.drawLine(xPixel1, yPixel1, nextXPixel1, nextYPixel1);

		}

	}

	public void drawAxes (Graphics g)
   {
		g.drawLine(Xleft, Ytop, Xleft, Ybottom);
		g.drawLine(Xleft, Ybottom, Xright, Ybottom);

   }



	private double theFunction(double x) {

		return a * x - b;

	}

	private double theFunction1(double x1) {

		return a * x1 - b;

	}

	private double scaleX(int xPixel) {

		double xStart = -5, xEnd = 5;
		double xScale = width / (xEnd - xStart);
		return (xPixel - (width / 2)) / xScale;

	}

	private int scaleY(double y) {

		double yStart = -5, yEnd = 5;
		int pixelCoord;
		double yScale = height / (yEnd - yStart);
		pixelCoord = (int) (-y * yScale) + (int) (height / 2);
		return pixelCoord;
	}
}

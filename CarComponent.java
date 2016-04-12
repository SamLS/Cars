import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
   @author Samantha Sturges
   		Added private global variables.
   		Added constructor.
   		Added translate method.
*/
public class CarComponent extends JComponent
{
	private int xLeft;
	private int yTop;

	/**
		Constructs a car and places it at x and  y coordinates in a frame.
		@param x the x coordinate.
		@param y the y coordinate.
	*/
	public CarComponent(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Car car1 = new Car(xLeft, yTop);

		car1.draw(g2);
   }

	/**
		Moves the car by xAdd and yAdd pixels.
		@param xAdd the number of pixels to move on the x coordinate.
		@param yAdd the number of pixels to move on the y coordinate.
	*/
   public void translate(int xAdd, int yAdd)
   {
	   xLeft = xLeft + xAdd;
	   yTop = yTop + yAdd;
   }
}

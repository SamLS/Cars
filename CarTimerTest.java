import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
	Tests the CarComponent and Car classes with an inner class Mover.
	Moves the car by a pixel every 100 milliseconds (10 times a second).
	@author Samantha Sturges
		Modified previous classes TimerTest2 and CarViewer.
*/
public class CarTimerTest
{
	public static void main(String[] args)
	{
		int carX = 0;
		int carY = 150;

		JFrame frame = new JFrame();

		frame.setSize(400, 400);
		frame.setTitle("Moving car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CarComponent component = new CarComponent(carX, carY);
		frame.add(component);

		frame.setVisible(true);

		class Mover implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				component.translate(1, 0); //Calls the method to move the car by one pixel.
				component.repaint(); //Calls the method repaint to draw the car with its new position.
			}
		}

		ActionListener listener = new Mover();

		final int DELAY = 100; // Milliseconds between timer ticks
		Timer t = new Timer(DELAY, listener);
		t.start();

		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
   }
}
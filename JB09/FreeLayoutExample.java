import java.awt.*;
import javax.swing.*;
public class FreeLayoutExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FreeLayoutExample");
		Container c = frame.getContentPane();
		c.setLayout(null);
		JButton Jbt1, Jbt2;
		Jbt1 = new JButton("Button1");
		Jbt1.setSize(100, 50);
		Jbt1.setLocation(50, 50);
		c.add(Jbt1);
		Jbt2 = new JButton("Button2");
		Jbt2.setSize(150, 100);
		Jbt2.setLocation(150, 150);
		c.add(Jbt2);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
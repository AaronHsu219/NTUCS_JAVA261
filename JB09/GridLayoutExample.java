import java.awt.*;
import javax.swing.*;
public class GridLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("GridLayoutExample");
		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(4, 5, 10, 20));
		//�s�@JButton���s����
		for (int i = 1; i <= 20; i++)
		{
			c.add(new JButton("���s" + i));
		}
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
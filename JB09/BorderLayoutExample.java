import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("BorderLayoutExample");
		Container c = frame.getContentPane();

		//�������Z��15�A�������Z��10

		c.setLayout(new BorderLayout(15, 10));
		//�s�@JButton���s����
		c.add(new JButton("�_(North)"), BorderLayout.NORTH);
		c.add(new JButton("��(West)"), BorderLayout.WEST);
		c.add(new JButton("��(Center)"), BorderLayout.CENTER);
		c.add(new JButton("�F(East)"), BorderLayout.EAST);
		c.add(new JButton("�n(South)"), BorderLayout.SOUTH);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
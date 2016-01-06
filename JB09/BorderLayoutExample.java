import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("BorderLayoutExample");
		Container c = frame.getContentPane();

		//水平間距為15，垂直間距為10

		c.setLayout(new BorderLayout(15, 10));
		//製作JButton按鈕元件
		c.add(new JButton("北(North)"), BorderLayout.NORTH);
		c.add(new JButton("西(West)"), BorderLayout.WEST);
		c.add(new JButton("中(Center)"), BorderLayout.CENTER);
		c.add(new JButton("東(East)"), BorderLayout.EAST);
		c.add(new JButton("南(South)"), BorderLayout.SOUTH);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
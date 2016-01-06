import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FlowLayoutExample");
		Container c = frame.getContentPane();
		FlowLayout fl= new FlowLayout(FlowLayout.CENTER);
		c.setLayout(fl);
		//製作JButton按鈕元件
		for (int i = 1; i <= 10; i++)
		{
			c.add(new JButton("button" + i));
		}
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
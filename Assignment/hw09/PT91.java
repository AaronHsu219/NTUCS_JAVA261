import java.awt.*;
import javax.swing.*;

public class PT91 {
	public static void main(String[] args)
	{
		JFrame frm = new JFrame("This is a Swing test!");
		Container c = frm.getContentPane();
		c.setLayout(null);

		JLabel Jlb1;
		Jlb1 = new JLabel("Label1");
		Jlb1.setSize(100, 40);
		Jlb1.setLocation(20, 20);
		c.add(Jlb1);

		JButton Jbt1;
		Jbt1 = new JButton("Button1");
		Jbt1.setSize(100, 40);
		Jbt1.setLocation(20, 60);
		c.add(Jbt1);

		frm.setSize(300, 200);
		frm.setLocation(250, 250);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
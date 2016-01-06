import java.awt.*;
import javax.swing.*;
public class JButtonExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JButtonExample");
		Container c = frame.getContentPane();
		c.setLayout(null);

		JButton bt= new JButton("按我！按我！");
		//JLabel bt= new JLabel("按我！按我！");

		bt.setSize(150, 100);
		bt.setLocation(50, 50);
		bt.setToolTipText("當滑鼠在我身上時，會看到的訊息！");
		bt.setForeground(Color.red);
		bt.setBackground(Color.yellow);
		bt.setEnabled(true);
		c.add(bt);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
import java.awt.*;
import javax.swing.*;
public class JButtonExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JButtonExample");
		Container c = frame.getContentPane();
		c.setLayout(null);

		JButton bt= new JButton("���ڡI���ڡI");
		//JLabel bt= new JLabel("���ڡI���ڡI");

		bt.setSize(150, 100);
		bt.setLocation(50, 50);
		bt.setToolTipText("��ƹ��b�ڨ��W�ɡA�|�ݨ쪺�T���I");
		bt.setForeground(Color.red);
		bt.setBackground(Color.yellow);
		bt.setEnabled(true);
		c.add(bt);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
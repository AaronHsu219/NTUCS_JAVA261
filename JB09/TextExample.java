import javax.swing.*;
import java.awt.*;
public class TextExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Text Example");
		Container c=frame.getContentPane();
		c.setLayout(null);

		// JLabel元件
		JLabel lb1=new JLabel("標籤文字!(JLabel)");
		lb1.setForeground(Color.cyan);
		lb1.setSize(240,40);
		lb1.setLocation(10,20);
		//lb1.setText = "been changed!";
		c.add(lb1);

		// JTextField元件
		JTextField tx1=new JTextField("JTextField");
		tx1.setForeground(Color.black);
		tx1.setSize(200,40);
		tx1.setLocation(10,70);
		c.add(tx1);

		// JPasswordField元件
		JPasswordField ps1=new JPasswordField("JPassword");
		ps1.setForeground(Color.black);
		ps1.setSize(200,40);
		ps1.setLocation(250,70);
		c.add(ps1);

		// JTextArea元件
		JTextArea ta1=new JTextArea("JTextArea");
		ta1.setForeground(Color.black);
		ta1.setSize(200,100);
		ta1.setLocation(10,120);
		c.add(ta1);
		frame.setSize(500,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
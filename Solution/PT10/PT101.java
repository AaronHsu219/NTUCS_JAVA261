import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PT101 implements ActionListener
{
	private JButton cp1;
	private JLabel cp2;
	private int count = 0;
	public PT101()
	{
		//int count = 0;
		JFrame frame = new JFrame("PT101");
		Container c = frame.getContentPane();
		c.setLayout(null);

		cp1 = new JButton("按我 按我");
		cp1.setSize(100,50);
		cp1.setLocation(100,50);
		cp1.addActionListener(this);
		c.add(cp1);
		cp2 = new JLabel();
		cp2.setSize(150,50);
		cp2.setLocation(100,150);
		c.add(cp2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setVisible(true);
	}
	//事件處理方法
	public void actionPerformed(ActionEvent e)
	{
		//int count = 0;
		if(e.getSource()==cp1)
		{
			cp2.setText("按鈕被按了 "+ ++count +" 次");
		}
	}
	public static void main(String[] args)
	{
		new PT101();
	}
}
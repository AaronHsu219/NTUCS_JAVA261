import java.awt.*;
import javax.swing.*;
public class BoxLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("BoxLayoutExample");
		Container c = frame.getContentPane();
		Box h1 = Box.createHorizontalBox();// 建立一個水平盒子
		Box v1 = Box.createVerticalBox();// 建立一個垂直盒子
		Box v2 = Box.createVerticalBox();// 建立一個垂直盒子
		Box v3 = Box.createVerticalBox();// 建立一個垂直盒子
		for (int i = 0; i < 5; i++)
		{
			v1.add(new JButton("G1"));
			v1.add(Box.createVerticalStrut(10));// 加入中間間隔
		}
		h1.add(v1);// 將垂直盒子加進水平盒子中
		for (int i = 0; i < 3; i++)
		{
			v2.add(new JButton("G2"));
			v2.add(Box.createVerticalStrut(30));// 加入中間間隔
		}
		h1.add(v2);// 將垂直盒子加進水平盒子中
		for (int i = 0; i < 4; i++)
		{
			v3.add(new JButton("G3"));
			v3.add(Box.createVerticalStrut(10));// 加入中間間隔
		}
		h1.add(v3);// 將垂直盒子加進水平盒子中
		c.add(h1);// 將水平盒子加進視窗容器中
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
import java.awt.*;
import javax.swing.*;
public class StringExample extends JFrame
{
	private String str= "這是一個JAVA 字串！";
	public static void main(String[] args)
	{
		new StringExample();
	}
	public StringExample()
	{
		super("String Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫paint() 方法
	public void paint(Graphics g)
	{
		g.setFont(new Font("標楷體", Font.BOLD, 20));
		g.drawString(str, 10, 50);
		g.setFont(new Font("新細明體", Font.BOLD+Font.ITALIC, 30));
		g.setColor(Color.red);
		g.drawString(str, 10, 100);
	}
}
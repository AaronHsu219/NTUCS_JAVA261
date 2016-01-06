import java.awt.*;
import javax.swing.*;
public class Oval extends JFrame
{
	public static void main(String[] args)
	{
		new Oval();
	}
	public Oval()
	{
		super("Oval Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫paint() 方法
	public void paint(Graphics g)
	{
		// 空心圓
		g.drawOval(50, 50, 60, 60);
		// 實心圓(橢圓)
		g.fillOval(150, 50, 100, 60);
	}
}
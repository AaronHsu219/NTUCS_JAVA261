import java.awt.*;
import javax.swing.*;
public class Rectangle extends JFrame
{
	public static void main(String[] args)
	{
		new Rectangle();
	}
	public Rectangle()
	{
		super("Rectangle Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫paint() 方法
	public void paint(Graphics g)
	{
		// 一般矩形
		g.drawRect(10, 50, 80, 60);
		g.fillRect(150, 50, 80, 60);
		// 3D矩形
		g.setColor(new Color(255, 255, 0));
		g.draw3DRect(10, 120, 80, 60, true);
		g.fill3DRect(150, 120, 80, 60, false);
		// 圓角矩形
		g.setColor(new Color(0, 0, 255));
		g.drawRoundRect(10, 200, 80, 60, 30, 10);
		g.fillRoundRect(150, 200, 80, 60, 50, 50);
	}
}
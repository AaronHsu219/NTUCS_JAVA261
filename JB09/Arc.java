import java.awt.*;
import javax.swing.*;
public class Arc extends JFrame
{
	public static void main(String[] args)
	{
		new Arc();
	}
	public Arc()
	{
		super("Arc Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫paint() 方法
	public void paint(Graphics g)
	{
		// 0角度開始的100度弧線
		g.drawArc(50, 50, 60, 60, 0, 100);
		// 0角度開始的200度弧線跟300度弧線
		g.drawArc(150, 50, 60, 60, 0, 200);
		g.drawArc(250, 50, 60, 60, 0, 300);
		// 90角度開始的100度弧線
		g.drawArc(350, 50, 60, 60, 90, 100);
		// 0角度開始的100度扇形
		g.fillArc(50, 200, 60, 60, 0, 100);
		// 120角度開始的180度扇形
		g.fillArc(150, 200, 60, 60, 120, 180);
	}
}
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
	// �мgpaint() ��k
	public void paint(Graphics g)
	{
		// �Ť߶�
		g.drawOval(50, 50, 60, 60);
		// ��߶�(���)
		g.fillOval(150, 50, 100, 60);
	}
}
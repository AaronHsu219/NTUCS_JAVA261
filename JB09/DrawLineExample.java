import java.awt.*;
import javax.swing.*;
public class DrawLineExample extends JFrame
{
	public static void main(String[] args)
	{
		new DrawLineExample();
	}
	public DrawLineExample()
	{
		super("DrawLineExample");
		setSize(400, 300);
		setVisible(true);
		setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// �мgpaint() ��k
	public void paint(Graphics g)
	{
		// �Q��drawLine�e�@���Ŧ⪺�׽u
		g.setColor(Color.blue);
		g.drawLine(50, 50, 100, 100);
		// �Q��drawPolyline�e�@�����⪺�u�q
		int[] x = {35, 70, 100};
		int[] y = {75, 85, 150};
		g.setColor(Color.red);
		g.drawPolyline(x, y, x.length);
	}
}
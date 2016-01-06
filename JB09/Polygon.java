import java.awt.*;
import javax.swing.*;
public class Polygon extends JFrame
{
	private int[] x1 = {10, 60, 75, 40, 80, 40};
	private int[] y1 = {50, 40, 95, 125, 65, 60};
	private int[] x2 = {110, 160, 175, 190};
	private int[] y2 = {100, 140, 195, 140};
	public static void main(String[] args)
	{
		new Polygon();
	}
	public Polygon()
	{
		super("Polygon Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// ÂÐ¼gpaint() ¤èªk
	public void paint(Graphics g)
	{
		g.drawPolygon(x1, y1, x1.length);
		g.fillPolygon(x2, y2, x2.length);
	}
}
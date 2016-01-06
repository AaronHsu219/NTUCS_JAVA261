import java.awt.*;
import javax.swing.*;

public class HW9 extends JFrame
{
	// ��l��
	private int[] x1 = {150, 170, 130, 150};
	private int[] y1 = {130, 175, 175, 130};

	public static void main(String[] args)
	{
		new HW9();
	}
	public HW9()
	{
		super("HW9");
		setSize(310, 310);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// �мg paint() ��k
	public void paint(Graphics g)
	{
		// �y
		g.setColor(new Color(255, 235, 205));
		g.fillOval(65, 50, 175, 200);

		// ����
		g.setColor(new Color(255, 255, 255));
		g.fillOval(100, 105, 30, 30);
		g.fillOval(175, 105, 30, 30);
		g.setColor(new Color(0, 0, 0));
		g.fillOval(110, 110, 18, 18);
		g.fillOval(185, 110, 18, 18);

		// ��l
		g.setColor(new Color(244, 164, 96));
		g.fillPolygon(x1, y1, x1.length);

		// �L��
		g.setColor(new Color(0, 0, 0));
		g.fillArc(120, 170, 60, 60, 180, 180);
		g.setColor(new Color(255, 0, 0));
		g.fillOval(135, 210, 30, 20);

		// �զ�
		g.setColor(new Color(255, 235, 205));
		g.fillArc(50, 110, 45, 60, 90, 180);
		g.fillArc(210, 110, 45, 60, 270, 180);
		g.setColor(new Color(0, 0, 0));
		g.drawArc(60, 120, 25, 40, 90, 180);
		g.drawArc(220, 120, 25, 40, 270, 180);

	}
}

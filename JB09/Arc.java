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
	// �мgpaint() ��k
	public void paint(Graphics g)
	{
		// 0���׶}�l��100�ש��u
		g.drawArc(50, 50, 60, 60, 0, 100);
		// 0���׶}�l��200�ש��u��300�ש��u
		g.drawArc(150, 50, 60, 60, 0, 200);
		g.drawArc(250, 50, 60, 60, 0, 300);
		// 90���׶}�l��100�ש��u
		g.drawArc(350, 50, 60, 60, 90, 100);
		// 0���׶}�l��100�׮���
		g.fillArc(50, 200, 60, 60, 0, 100);
		// 120���׶}�l��180�׮���
		g.fillArc(150, 200, 60, 60, 120, 180);
	}
}
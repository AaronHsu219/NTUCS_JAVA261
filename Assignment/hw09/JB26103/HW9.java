import java.awt.*;
import javax.swing.*;

public class HW9 extends JFrame {

	private int[] x2 = {265, 335, 300};
	private int[] y2 = {345, 345, 265};

	public static void main(String[] args)
	{
		new HW9();
	}

	public HW9()
	{
		super("HW9");

		setSize(600, 600);
		setVisible(true);
		setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		// Head
		g.setColor(new Color(255, 218, 185));
		g.fillOval(145, 140, 300, 340);

		// Mouth
		g.setColor(new Color(0, 0, 0));
		g.fillArc(240, 320, 120, 120, 0, -180);

		// Tongue
		g.setColor(new Color(255, 48, 48));
		g.fillOval(280, 400, 50, 40);

		// Nose
		g.setColor(new Color(244, 164, 96));		
		g.fillPolygon(x2, y2, x2.length);

		// Eyes
		// outter
		g.setColor(new Color(255, 255, 255));
		g.fillOval(200, 200, 60, 60);
		g.fillOval(330, 200, 60, 60);

		// innter		
		g.setColor(new Color(0, 0, 0));
		g.fillOval(220, 210, 40, 40);
		g.fillOval(350, 210, 40, 40);

		// Ears
		// left
		g.setColor(new Color(255, 218, 185));
		g.fillArc(110, 250, 110, 110, 90, 180);
		g.setColor(new Color(0, 0, 0));
		g.drawArc(130, 270, 70, 70, 100, 160);

		// right
		g.setColor(new Color(255, 218, 185));
		g.fillArc(370, 250, 110, 110, 90, -180);
		g.setColor(new Color(0, 0, 0));
		g.drawArc(390, 270, 70, 70, 80, -160);

	}
}
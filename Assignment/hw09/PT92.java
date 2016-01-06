import java.awt.*;
import javax.swing.*;

public class PT92 extends JFrame {
	public static void main(String[] args)
	{
		new PT92();
	}

	public PT92()
	{
		super("PT92");

		setSize(500, 250);
		setVisible(true);
		setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		g.setFont(new Font("微軟正黑體", Font.BOLD, 20));

		g.drawString("台大 Logo", 50, 200);

		Image img = Toolkit.getDefaultToolkit().getImage("ntu.jpg");

		g.drawImage(img, 50, 50, this);
	}
}
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
		g.setFont(new Font("�L�n������", Font.BOLD, 20));

		g.drawString("�x�j Logo", 50, 200);

		Image img = Toolkit.getDefaultToolkit().getImage("ntu.jpg");

		g.drawImage(img, 50, 50, this);
	}
}
import java.awt.*;
import javax.swing.*;
class ImageExample extends JFrame
{
	public static void main(String[] args)
	{
		new ImageExample();
	}
	public ImageExample()
	{
		super("drawImageExample");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// �мgpaint() ��k
	public void paint(Graphics g)
	{
		// Ū�J�v��
		Image img= Toolkit.getDefaultToolkit().getImage("ntu.png");
		g.drawImage(img, 50, 50, this);
		g.drawImage(img, 50, 200, this);
	}
}
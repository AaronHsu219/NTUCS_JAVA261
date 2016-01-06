import java.awt.*;
import javax.swing.*;
class ImageSizeExample extends JFrame
{
	public static void main(String[] args)
	{
		new ImageSizeExample();
	}
	public ImageSizeExample()
	{
		super("ImageSizeExample");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫paint() 方法
	public void paint(Graphics g)
	{
		// 讀入影像
		Image img= Toolkit.getDefaultToolkit().getImage("snoopy.png");
		// 原圖225 * 300
		g.drawImage(img, 50, 50, this);
		// 縮圖100 * 150
		g.drawImage(img, 300, 50, 100, 150, this);
	}
}
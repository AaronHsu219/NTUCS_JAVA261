import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PT102 extends JFrame implements MouseMotionListener
{
	int px, py, px2, py2;

	public static void main(String[] args)
	{
		new PT102();
	}

	public PT102()
	{
		super("PT102");
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);

		addMouseMotionListener(this);

		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//移動滑鼠指標
	public void mouseMoved(MouseEvent e)
	{
		//取得滑鼠座標位置
		px = e.getX();
		py = e.getY();
	}

	//拖移滑鼠指標
	public void mouseDragged(MouseEvent e)
	{
		px2 = e.getX();
		py2 = e.getY();
		Graphics g = getGraphics();

		//設定線條顏色
		g.setColor(Color.red);

		//畫線條
		g.drawLine(px, py, px2, py2);
		//g.fillOval(px, py, 10, 10);

		px = px2;
		py = py2;
	}
}
import java.awt.*;
import javax.swing.*;
public class StringExample extends JFrame
{
	private String str= "�o�O�@��JAVA �r��I";
	public static void main(String[] args)
	{
		new StringExample();
	}
	public StringExample()
	{
		super("String Example");
		setSize(500, 400);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// �мgpaint() ��k
	public void paint(Graphics g)
	{
		g.setFont(new Font("�з���", Font.BOLD, 20));
		g.drawString(str, 10, 50);
		g.setFont(new Font("�s�ө���", Font.BOLD+Font.ITALIC, 30));
		g.setColor(Color.red);
		g.drawString(str, 10, 100);
	}
}
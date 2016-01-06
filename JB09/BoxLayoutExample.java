import java.awt.*;
import javax.swing.*;
public class BoxLayoutExample{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("BoxLayoutExample");
		Container c = frame.getContentPane();
		Box h1 = Box.createHorizontalBox();// �إߤ@�Ӥ������l
		Box v1 = Box.createVerticalBox();// �إߤ@�ӫ������l
		Box v2 = Box.createVerticalBox();// �إߤ@�ӫ������l
		Box v3 = Box.createVerticalBox();// �إߤ@�ӫ������l
		for (int i = 0; i < 5; i++)
		{
			v1.add(new JButton("G1"));
			v1.add(Box.createVerticalStrut(10));// �[�J�������j
		}
		h1.add(v1);// �N�������l�[�i�������l��
		for (int i = 0; i < 3; i++)
		{
			v2.add(new JButton("G2"));
			v2.add(Box.createVerticalStrut(30));// �[�J�������j
		}
		h1.add(v2);// �N�������l�[�i�������l��
		for (int i = 0; i < 4; i++)
		{
			v3.add(new JButton("G3"));
			v3.add(Box.createVerticalStrut(10));// �[�J�������j
		}
		h1.add(v3);// �N�������l�[�i�������l��
		c.add(h1);// �N�������l�[�i�����e����
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
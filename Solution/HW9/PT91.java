/*
 *�����{���m�� PT91.java
 *�ЧQ�Υ���@�� Layout�A�P�ɧ��r���ҩM���s��ؤ���ƦC�b�䤤�A
 *�ëإߦb�@�� Swing ��������
 **/

// �����{���O�ѰO import AWT �P Swing ��ӥD�n�M��
// �䤤 Swing �M��O��b javax �M�󤤡I
import javax.swing.*;
import java.awt.*;

public class PT91
{
	public static void main(String[] args)
	{
		// �إߤ@��  jFrame (Swing �D�n��������)
		// �غc�l�������W��
		JFrame frame = new JFrame("PT91");

		// ���o�ӵ������󪺮e������A�]���Ҧ�����һݩ�m�b�e����
		Container c=frame.getContentPane();

		// �]�w���� layout�A���ɨϥ� null ��ܦۭq�j�p�Φ�m
		c.setLayout(null);

		// �s�@�@�� JLabel ���Ҥ��� lb
		JLabel lb = new JLabel("���Ҥ���");

		// �w�q�j�p���e 240�B�� 40 (���Ҭ� pixel)
		lb.setSize(240,40);

		// �w�q��m�X�{�b�������� X �b 10�BY �b 20 ���a��
		lb.setLocation(10,20);

		// �N�w�q�n�� lb ���e����
		c.add(lb);

		// �s�@ JButton ���s���� jbt
		JButton jbt = new JButton("���s����");

		// �w�q�j�p���e 100�B�� 40
		jbt.setSize(100,40);

		// �w�q�X�{��m�b�������� X �b 10�BY �b 70 ���a��
		jbt.setLocation(10,70);

		// �N�w�q�n�� jbt ���e����
		c.add(jbt);

		// �w�q�����j�p�� 300*200 pixel
		frame.setSize(300,200);

		// �������X�{�b�e����
		frame.setVisible(true);

		// �]�w���������ɦP�ɵ��� JVM �u�@
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

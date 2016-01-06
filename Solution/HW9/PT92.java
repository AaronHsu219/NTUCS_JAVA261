/*
 *ø�Ͻm�� PT92.java
 *�ЧQ�Q�� Image ����b�e���Wø�s�@�ӹϤ��A�P�ɦb�U��ϥ� Font ����ø�s�@�ӻ�����r
 */

import java.awt.*;
import javax.swing.*;

// �D���O�~�Ӧ� JFrame ���O�A���D�{�������ܦ��@�ӵ�������
public class PT92 extends JFrame
{

	public static void main(String[] args)
	{
		// �b main() ���N�D���O����ƥX��
		new PT92();
	}

	// �غc�l���]�w�n�����������ݩ�
	public PT92()
	{
		// �I�s super() �غc�l (�Y Jframe ���غc�l)�A�N�������D�g�J Jframe ��
		super("PT102");

		// �]�w�j�p�B�i���סB�I���C��P�������������ݩ�
		setSize(500, 250);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// �мg paint() ��k
	public void paint(Graphics g)
	{
		// �]�w�r��B�r���˦��P�r�Ťj�p
		g.setFont(new Font("�L�n������", Font.BOLD, 20));

		// �e�X�Ӧr��X�Ӧb 50, 200 ����m
		g.drawString("�x�j Logo", 50, 200);

		// Ū�J�v�� - �ϥ� Toolkit.getDefaultToolkit().getImage() ���o�v���ӷ�
		Image img = Toolkit.getDefaultToolkit().getImage("ntu.jpg");

		// �N�v��ø�s�b�e���� 50,50 ���a��
		g.drawImage(img, 50, 50, this);
	}
}

/*
 ***********************************************************************
 *��y�m�� PT82.java
 ***********************************************************************
 *InputStreamReader �g�@�ӵ{���i�H���O�߰ݨϥΪ̥L���G
 *�W�r
 *�~��
 *�ʧO
 *��J����A�N���G�L�b�e���G
 *Hi "�W�r" "(����/�p�j)" �A�n�A�A���~ "�~��" ��
 ***********************************************************************
 */

import java.io.*;

class PT82
{
	// �Y���ϥΨҥ~�B�z�A�L�k�q�L�sĶ�A���d�Ҩϥ� throws �覡�N�ҥ~��X
	public static void main(String[] args) throws IOException
	{
		// �w���w�q�����ϥΪ̿�J�Ϊ��ܼƦ�}
		String name;
		int age;
		String gender;

		// �ϥ� InputStreamReader ���O�A�����ϥΪ���L��J����T
		InputStreamReader ir = new InputStreamReader(System.in);

		// �A�ϥ� BufferedReader ���O�N�ϥΪ���L��J����T��m�b�w�İϤ�
		BufferedReader br = new BufferedReader(ir);

		// �߰ݨϥΪ̩m�W�A�A�N�ϥΪ̿�J����T�s�� name (String) �ܼƤ�
		System.out.print("�п�J�m�W�G");
		name = br.readLine();

		// �߰ݨϥΪ̦~�֡A�A�N�ϥΪ̿�J����T�s�� age (int) �ܼƤ�
		System.out.print("�п�J�~�֡G");
		age = Integer.parseInt(br.readLine());

		// �߰ݨϥΪ̩ʧO�A���]��J�i�ର M �� F�A�s�i gender (String) �ܼƤ�
		System.out.print("�п�J�ʧO (M/F)�G");
		gender = br.readLine();

		// �t�~�B�z gender �ܼơA�N M �ন���͡AF �ন�p�j
		// �D�����I
		String sex = (gender.equals("M")) ? "����" : "�p�j";

		// �̫�N���G��X
		System.out.println("Hi "+ name +" "+ sex +" �A�n�A�A���~ "+ age +" ��");

	}
}
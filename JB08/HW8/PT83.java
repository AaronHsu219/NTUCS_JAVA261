/*
 ***********************************************************************
 *�ɮ׿�X�J�m�� PT83.java
 ***********************************************************************
 *���w�Y��ǥͪ������p�U�G
 *�m�W�Gname�A�r�ꫬ�A�A�Ȭ��uAlex�v
 *�ƾǦ��Z�GmathRecord�Aint���A�A�Ȭ��u95�v
 *��妨�Z�GchnRecord�Aint���A�A�Ȭ��u90�v
 *�^�妨�Z�GengRecord�Aint���A�A�Ȭ��u94�v
 *�Ыغc��y����out�A�ñN�ӵ��O���g�J�urecord.txt�v�ɮפ��A
 *�A�N�urecord.txt�v�ɮת����eŪ�X�A����ܦb�ù��W
 ***********************************************************************
 */

import java.io.*;

class PT83
{
	// �O�o�n�}���ɳ��o�� checked exception ���B�z
	public static void main(String[] args) throws IOException
	{
		// �w�q�n�g�J�����
		String name = "Alex";
		int mathRecord = 95;
		int chnRecord = 90;
		int engRecord = 94;

		/*String name = "Bill";
		int mathRecord = 70;
		int chnRecord = 80;
		int engRecord = 90;*/

		// �Q�� FileOutputStream �}�Ҥ@���ɮצ�y record.txt
		FileOutputStream fos = new FileOutputStream("record.txt");

		// �A�Q�� DataOutputStream �B�z�ɮצ�y������� (�H�줸�����)
		DataOutputStream dos = new DataOutputStream(fos);

		// �w�q�n�g�J�ɮפ������
		String writeTo = name + "\t" + mathRecord + "\t" + chnRecord + "\t" + engRecord;

		// �Q�� write() ��k�g�J�ɮסA���]�� dos �O�줸��y
		// �]���b���O�o�ϥ� getBytes() ��k��r����줸 (�Ĥ���)
		dos.write(writeTo.getBytes());

		dos.close();
		fos.close();

		System.out.println("�g�J�����I");

		// �P�g�J�����A�� FileInputStream / DataInputStream �B�zŪ�J���ɮ�
		FileInputStream fis = new FileInputStream("record.txt");
		DataInputStream dis = new DataInputStream(fis);

		// �NŪ�J�� dis �s�J�Y�@�Ӧ줸�}�C��
		byte[] data = new byte[dis.available()];

		// readFully ����k�i�H�@���N�ɮפ��e����Ū�J
		// �]�i�ϥ� while(i = dis.read() != -1) ���j���Ū�J
		dis.readFully(data);

		dis.close();
		fis.close();

		// �N��ƦL�X�A�L�X�ɧ�줸�}�C��^ String ��K�ˬd
		System.out.println(new String(data));
	}
}
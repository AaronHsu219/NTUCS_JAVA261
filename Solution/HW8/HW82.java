/*
 ***********************************************************************
 *�s�ڧQ���p��{�� HW82.java
 ***********************************************************************
 *���w���H�U����ƫ��A�G
 *String name;		//�x�s�m�W�����
 *float premium;	//�N��Ȧ�s�ڪ��������B
 *float iRate;		//�N��Ȧ檺�s�ڧQ�v
 *�г]�p�@�ӵ{���A�ϥΪ̥i�H����L�̦���J�W�z����ơA��J������A
 *�A�N��J�����e��ܦb�ù��W�A�è̿�J�������M�Q�v�A�A�p��@�~���s�ڧQ��
 ***********************************************************************
 */

// �ϥ� burrfered reader �O�o import java.io �M��
import java.io.*;

class HW82
{
	// �D�{�����ϥ� BufferedReader �ɥ����n�� exception �B�z
	public static void main(String[] args) throws IOException
	{
		// �ǳƧڭ̭n������ƪ��ܼƪŶ�
		String name;	//�x�s�m�W�����
		float premium;	//�N��Ȧ�s�ڪ��������B
		float rate;		//�N��Ȧ檺�s�ڧQ�v

		// �ǳƤ@�Ӭ����̫�Q�����ܼ�
		float result;

		// �� BufferedReader �����ϥΪ̿�J�����
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.print("�п�J�s��m�W�G");
		name = br.readLine();

		// �����ơB�Q�v�O float ���A�A�]���ݥ� Float.parseFloat() �ন float
		System.out.print("�п�J�������B�G");
		premium = Float.parseFloat(br.readLine());

		System.out.print("�п�J�s�ڧQ�v%�G");
		rate = Float.parseFloat(br.readLine());

		System.out.println("�s�ڧQ�������G���� * �s�ڧQ�v%�G");

		// �ϥΪ̿�J���Q�v���]�O %�A�h�ݱN�ϥΪ̪���J���H 100 �o���ڤp��
		result = premium * (rate / 100);
		System.out.println(name + "�A���Q���O�G" + result);
		System.out.println("�����[�Q���`�@�O�G" + (premium + result));

	}
}
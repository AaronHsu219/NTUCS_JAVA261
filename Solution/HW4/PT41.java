/***********************************************************
 * �@���}�C�ާ@�m�� (pt41.java)
 *�мg�@�� JAVA �{���A��U�����Ʀr�̧Ǧs��b�@�Ӿ�ư}�C���A
 *�èϥΥ���@�ذj��N�Ҧ��ȥ[�`�_�ӡG
 *13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349
 *���T���׬O 952
***********************************************************/

public class PT41
{
	public static void main(String[] args)
	{
		// ��l�Ƥ@�ӥ[�`�� int �ܼơA�Ȭ� 0
		int total = 0;

		// �w�q int �}�C sum
		int[] sum = {13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349};

		// �]�@�Ӱj��A�N sum �}�C�q 0 �� sum.length
		for (int i = 0; i < sum.length; i++)
		{
			// �N sum[i] ���X�[�`�� total �`�X�ܼƤ�
			total += sum[i];
		}

		// �j����槹�� total �Y���`�X�A�N����X
		System.out.print("�`�X�O�G" + total);
	}
}
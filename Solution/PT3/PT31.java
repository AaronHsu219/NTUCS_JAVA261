/**************************************************
 * �h������ԭz�ާ@�m�� (pt31.java)
 * ��A/�p���嫬��b�{�������@�� char ���O�ܼƤ��G
 * �� char blood = 'A';
 * �M��ϥ� switch-case �P�_�A/�p�O����嫬
**************************************************/

public class PT31
{
	public static void main(String[] args)
	{
		char blood = 'X';

		switch (blood)
		{
			case 65:
				System.out.print("�A���嫬�O A ��");
				break;
			case 'B':
				System.out.print("�A���嫬�O B ��");
				break;
			case 79:
				System.out.print("�A���嫬�O O ��");
				break;
			default:
				System.out.print("�A���嫬�O AB ���Ψ�L");
		}
	}
}
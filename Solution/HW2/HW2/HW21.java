/************************************************************************************
 * �p��T���έ��n (HW21.java)
 * �����G(�� * ��) / 2
 * �г]�p�@�ӵ{���A�i�H��J�T���Ϊ��u���v�M�u���v�A
 * �����L�p��X�ӤT���Ϊ����n
 ***********************************************************************************/

public class HW21
{
	public static void main(String[] args)
	{
		// �w�q����ܼƨӦs��ϥΪ̿�J�����P��
		int width, height;

		// �w�q�@���ܼƨӦs��̫��X�����n
		double answer;

		// ��ϥΪ̿�J���Ĥ@�ӭ� args[0] �ন integer ����ܼƤ�
		width = Integer.parseInt(args[0]);

		// ��ϥΪ̿�J���ĤG�ӭ� args[1] �ন integer ����ܼƤ�
		height = Integer.parseInt(args[1]);

		// �p�⭱�n
		// �����G(�� * ��) / 2
		answer = (double)(width * height) / 2;

		// ��X���G
		System.out.println("���G" + width);
		System.out.println("���G" + height);
		System.out.println("���n�G" + answer);
	}
}
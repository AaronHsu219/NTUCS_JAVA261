/**************************************************************
 * ��ƧP�_�{�� (HW32.java)
 * �г]�p�@�ӵ{���i�H�����J�@�Ӥp��100���Ʀr�A
 * �çP�_�ӼƦr�O�_����ơC
 * �Y�O��ƫh�L�X "pass"�A�_�h�L�X "fail"
 * ��Ʃw�q�G���F�����M 1 �H�~�èS�������L�]�l�C
 * �Ҧp 2�A3�A5�A7 �O��ơA4�A6�A8�A9 �h�_
**************************************************************/

public class HW32
{
	public static void main(String[] args)
	{
		// �s��ϥΪ̿�J�Ʀr���ܼ�
		int input;
		input = Integer.parseInt(args[0]);

		// �@�}�l�����w�ϥΪ̿�J���Ʀr�����
		boolean result = true;

		// �Y��J�Ȥ��� 0 ~ 100 ���A�h����P�_
		if (input <= 100 && input > 0)
		{

			// ����Ƥ@�w�i�H�Q 1 ���ѡA�]���j��q 2 �}�l����A�]�� input - 1 ����
			// �ҡG�ϥΪ̿�J 30 �h�j��q 2~29�F��J 73 �h�j��q 2~72
			for (int i = 2; i < input; i++)
			{
				// �N�C�� i ���X�P input �� mod �B�@�A2~n-1������@�ӥi�H�� input �㰣�h�O���
				if (input % i == 0)
				{
					// �Y�Q i ��ơA�T�w������ơA�N result �]�� false�A�ä���j�� (�]���w�T�w���)
					System.out.println(input + "%" + i + "=" + (input % i));
					result = false;
					break;
				}
			}
			if (result)
			{
				System.out.println("�A��J�� "+ input +" �O���");
			}//
			else
			{
				System.out.println("�A��J�� "+ input +" ���O���");
			}
		}
		else
		{
			System.out.println("�п�J�@�� 1~100 �������Ʀr�C");
		}
	}
}
/**************************************************
 * ���Z�έp�{�� (pt43.java)
 * �]�p�@�ӵ{���i�H�G
 * �x�s10�Ӿǥͪ��ƾǦ��Z
 * �N���Z�Ѥj�ܤp�L�X
 * �p��X�u�ή�v�P�u���ή�v���H��
**************************************************/

import java.util.*;

public class PT43
{
	public static void main(String[] args)
	{
		//  �H�N�w�q�@�Ӥ@���}�C math ��ܥ��Z���ƾǦ��Z
		int[] math = {50, 65, 80, 48, 35, 93, 57, 90, 86, 77};

		// �s��ή�H�ƪ��ܼ� pass
		int pass = 0;

		// �Q�� Arrays.sort ���u��N math �Ƨ�
		Arrays.sort(math);

		System.out.println("�Ƨǫ�G");

		// �w�]�ƧǬO�Ѥp��j�A�]���]�@�ӤϦV�j��A�N�}�C�Ѥj��p��X
		for (int i = math.length - 1; i >= 0; i--)
		{
			System.out.print(math[i]);
			if (i != 0)
			{
				System.out.print(", ");
			}
			else
			{
				System.out.println();
			}

			// �Y�ή� (�j�� 60 ��)�A�h�N pass �[ 1
			if (math[i] >= 60)
			{
				++pass;
			}
		}

		System.out.println("�ή檺���G" + pass + "�H");
		System.out.println("���ή檺���G" + (math.length - pass) + "�H");

	}
}//
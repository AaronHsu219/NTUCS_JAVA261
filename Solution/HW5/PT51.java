/*******************************************************************************
 * �j�p�g�ഫ�{���GPT51.java
 * �]�p�@�ӵ{���G
 * ��N��J���^��r��r�����j�g�������ର�p�g�B�p�g�����ର�j�g�C
 * �Ҧp�G
 * ��J���r�ꬰ�GHello_Java
 * ��X���r�ꬰ�GhELLO_jAVA
*******************************************************************************/

public class PT51
{
	public static void main (String args[])
	{
		// �N�ϥΪ̿�J���r���ন char array
		//char[] strToChar = args[0].toCharArray();

		// �αN�ϥΪ̿�J���r���ন byte array
		byte[] strToChar = args[0].getBytes();

		System.out.println("��l�r��G" + args[0]);

		System.out.print("�ഫ����G");

		// �N�ഫ�����}�C����j��
		for (int i = 0; i < strToChar.length; i++)
		{
			// �ˬd�C�Ӥ���
			// �Y���� 65 ~ 90 �h���j�g (65 + 25 = 90)
			if(strToChar[i] >= 65 && strToChar[i] <= 90)
			{
				// �j�g�r����p�g +32 (65 + 32 = 97)
				strToChar[i] += 32;
			}

			// �Y���� 97 ~ 122 �h���p�g (97 + 25 = 122)
			else if(strToChar[i] >= 97 && strToChar[i] <= 122)
			{
				// �p�g�r����j�g -32 (97 - 32 = 65)
				strToChar[i] -= 32;
			}

			// �ëD�W�C��ӰϬq�h���O�^��r��
			else
			{
				// �D�^��
			}

			// �ഫ�����X�ɻݱj���ഫ���O�� (char)
			System.out.print((char)strToChar[i]);
		}

	}
}//
/**************************************************************
 * �[�K�{���GPT52.java
 * �]�p�@�ӥ[�K�{��
 * �ӵ{������N�w���U�^��r���Ǵ����U�@�Ӧr�����Ǫ��r��
 * �Ҧp�G��Ja�A��Xb
 * �ഫ������A�A�N�r��ϦV��X
 * �Ҧp�G��J�uHello�v�|�o��uIfmmp�v�A�ϦV���X���upmmfI �v
**************************************************************/

public class PT52
{
	public static void main(String[] args)
	{
		System.out.println("��J���G" + args[0]);
		// �����@�˱N�ϥΪ̿�J���r���ഫ�� char array
		char[] strToChar = args[0].toCharArray();
		//byte[] strToChar = args[0].getBytes();

		// �N�C�Ӧr�����X + 1 (�ܦ��U�@�Ӧr�A��J A �o�� B)
		for (int i = 0; i < strToChar.length; i++)
		{
			strToChar[i] += 1;
			//strToChar[i] = strToChar[i] + 1;
		}

		// �N�ഫ�����r���}�C��^�r��
		String charToString = new String(strToChar);

		// �N�r��A��^ StringBuffer
		StringBuffer encoded = new StringBuffer(charToString);

		// �Q�� StringBuffer ���󤤪� reverse() ��k��V
		encoded.reverse();

		// �̫��X���G
		System.out.println("�[�K��G" + encoded);

	}
}
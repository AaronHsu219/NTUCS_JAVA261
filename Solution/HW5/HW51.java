 /**************************************************************
 * �ѱK�{���GHW51.java
 * �]�p�@�ӯ�N PT52.java ���{���[�K�L���r��ѱK�^��l�r�ꪺ�ѱK�{��
**************************************************************/

class HW51
{
	public static void main(String[] args)
	{
		System.out.println("��J���G" + args[0]);

		// �����@�˱N�ϥΪ̿�J���r���ഫ�� char array
		byte[] strToChar = args[0].getBytes();

		// �N�C�Ӧr�����X - 1 (�ܦ��e�@�Ӧr�A��J B �o�� A)
		for (int i = 0; i < strToChar.length; i++)
		{
			strToChar[i]--;
		}

		// �N�ഫ�����r���}�C��^�r��
		String charToString = new String(strToChar);

		// �N�r��A��^ StringBuffer
		StringBuffer encoded = new StringBuffer(charToString);

		// �Q�� StringBuffer ���󤤪� reverse() ��k��V
		encoded.reverse();

		// �̫��X���G
		System.out.println("�ѱK��G" + encoded);
	}
}
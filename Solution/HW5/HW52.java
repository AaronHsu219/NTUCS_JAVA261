/**************************************************************
 * ���Һ��}�{���GHW52.java
 * �ХΥ��W��ܪk�]�p�@�ӥi�H���ҬO�_���u����}���{��
 * ���}���W�h�G
 * �@�w�O http:// �}�Y
 * �ܤ֦��@�� . (dot)�B�̫�@�� . �᭱���u�ର�^��r��
 * �̫�@�� . �e���ܤ֦��@�Ӧr��
 * �ҡGhttp://google.com�Bhttp://tw.yahoo.com�Bhttp://www.ntu.edu.tw
**************************************************************/

public class HW52
{
	public static void main(String[] args)
	{
		// ���o�ϥΪ̿�J���r��
		String input = args[0];
		System.out.println("�A��J���O:" + input);

		// �����Ghttp://.+\\.[a-zA-Z]+
		// http:// �}�Y
		// �̫�@�� . (\\.) ��O�^��r�� [a-zA-Z]+ �@�өΦh��
		if (input.matches("http://.+\\.[a-zA-Z]+"))
		{
			System.out.print("�A��J���O���}�I");
		}
		else
		{
			System.out.print("�A��J�����O���}�I");
		}
	}
}
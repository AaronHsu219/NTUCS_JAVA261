/****************************************************************
 * �q�ܸ��X�榡���ҡGPT53.java
 * �ϥΥ��W��ܪk�g�@�ӯ����ҬO�_�ŦX�q�ܸ��X (�t��ʹq��) ���{��
 * ������X�G0912345678 / 0912-345-678
 * �@�븹�X�G(02)23939889 / 02-2393-9889
 * �q�ܸ��X�W�h�G
 * �̤֤j��6�Ӹ��X
 * �̦h�O�H
 * �u�� 0~9�B( )�B- �P�ť�
****************************************************************/

public class PT53
{
	public static void main(String[] args)
	{

		/*
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println("args[2] = " + args[2]);
		System.exit(0);
		*/

		String input = "";

		for (int i = 0; i < args.length; i++)
		{
			input += " " + args[i];
		}
		input = input.trim();

		System.out.println("input: " + input);
		//System.exit(0);

		if (input.matches("[\\(\\)0-9\\- ]{6,}"))
		{
			System.out.print("�A��J���O�q�ܸ��X�I");
		}
		else
		{
			System.out.print("�A��J�����O�q�ܸ��X�I");
		}
	}

}
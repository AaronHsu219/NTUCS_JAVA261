/**************************************************************
 * �i���Ƨǵ{���GHW53.java
 * �мg�@�ӵ{�����ϥΪ̥i�H�Φۤv��J���Ʀr���Ƨ�
 * �Υ��W��ܪk�ˬd�ϥΪ̿�J���O�_�O�Ʀr
 * �ÿ�X�Ƨǫ᪺���G
**************************************************************/

// ���D�ϥ� Arrays �u��ƧǡA�]�� import java.util.*;
import java.util.*;

public class HW53
{
	public static void main(String[] args)
	{
		/*
		Arrays.sort(args);
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
		}
		System.exit(0);
		*/

		System.out.println("�Ƨǫe���G");

		// �N�ϥΪ̿�J�����e�ন int �}�C
		int[] strToInt = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
			// ���B�ϥΦۭq��� toInt() ���ഫ�r�����
			strToInt[i] = toInt(args[i]);
		}
		System.out.println();

		// �N int �}�C�Ƨ� (�ϥ� Arrays.sort ��k)//
		Arrays.sort(strToInt);

		//System.out.println(strToInt);

		// ��X�Ƨǵ��G
		System.out.println("�Ƨǫᬰ�G");
		for (int i = 0; i < strToInt.length; i++)
		{
			System.out.print(strToInt[i] + " ");
		}
	}

	public static int toInt(String input)
	{
		// �ˬd�ϥΪ̿�J���O�_���Ʀr
		if (input.matches("[0-9]+"))
		{
			// �Y�O�Ʀr�A�h�ন int ���A��^��
			return Integer.parseInt(input);
		}
		// �Y���O�Ʀr
		else
		{
			// �h�^�� 0
			return 0;
		}
	}
}
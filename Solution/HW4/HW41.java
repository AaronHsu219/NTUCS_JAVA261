/*******************************************************************************
 * �P�_�����O�_�b�}�C���GHW41.java
 * �ЧQ�ΰ}�C�x�s�H�U�����G�W�١Aapple�Bgrape�Btomato�Bbanana�Borange
 * �M��]�p�@�ӵ{���i�ѨϥΪ̿�J�@�Ӧr��A�çP�_�Ӧr��O�_�s�b��}�C��
*******************************************************************************/

// ���D�ϥ� Arrays ���O���j�M�P�ƧǡA�]���� import java.util.*
import java.util.*;

public class HW41
{
	public static void main(String[] args)
	{
		// �إߤ��G�}�C
		String[] fruit = {"apple", "grape", "tomato", "banana", "orange"};

		// �ϥ� boolean �ܼƦs��̫�O�_�䪺��
		boolean flag = false;

		// �ѩ󰵤G���j�M���G�A���ϥ� Arrays.sort() �ӱƧ�
		Arrays.sort(fruit);

		// �G���j�M�Y�����|�^�� >= 0 ���ȡA�]���b���ϥΤT���B��l�����S����쪺�P�_
		flag = (Arrays.binarySearch(fruit, args[0]) >= 0) ? true : false;

		if (flag == true)
		{
			System.out.println("���F�I"+ args[0] +"�b�}�C���I");
		}
		else
		{
			System.out.println("�䤣��...");
		}
	}
}
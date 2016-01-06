/*******************************************************************************
 * ��l�C���GHW43.java
 * �{���H���̧��Y�X3����l�A����ؤ������i��G
 * a. �T����l�I�Ƴ��@�ˡA���Y��
 * b. �T����l��n�q�p�ƨ�j�A�Ҧp 135�B246�A���G��
 * ��L���p�N���´f�U
*******************************************************************************/

import java.util.*;

public class HW43
{
	public static void main(String[] args)
	{
		// �ǳƨ�ӱ`�Ʀs���l�����V�έӼ�
		final int howManyDice = 3;			// 3 ����l
		final int howManyEdge = 6;			// �C����l�� 6 ��

		System.out.println("�A�Y�X���I�Ƥ��O�O�G");

		// �ǳƤ@�Ӱ}�C�Ӧs���l�Y�X�᪺���L n �ӻ�l�N�� n �ӪŶ�
		int[] dice = new int[howManyDice];

		// �}�l�Y��l
		for (int i = 0; i < howManyDice; i++)
		{
			// �� Math.random() �H�����@�Ӥ��� 0~1 ���p�� * �H��l���V�A�[ 1
			dice[i] = (int) (Math.floor(Math.random() * howManyEdge) + 1);
			System.out.println(dice[i]);
		}

		// �I�s checkEqual() ��ơA�T�{�O�_�C�ӻ�l���I�Ƴ��ۦP
		if (checkEqual(dice) == true)
		{
			System.out.println("�z�I���ߧA�I"+ howManyDice +"�ӻ�l���I�ƥ����@�ˡI���Y���F�I");
		}

		// �Y�C�ӻ�l���I�ƨS�����M�ۦP����
		else
		{
			// �ǳƤ@�ӼȦs�ΰ}�C sortedDice
			int[] sortedDice;

			// �N�ثe����l�Y�X�����G�ƻs�@����Ȧs�}�C sortedDice ��
			sortedDice = dice.clone();

			// �ƧǼȦs�}�C sortedDice (�Ѥp��j)
			Arrays.sort(sortedDice);

			// �Y�ƧǹL���}�C�����e�P�Ƨǫe����n�ۦP�A�N��쥻�N��n�Y�X�F���l (�Ѥp��j)
			// �ĥ� Arrays.equals() ��k�A����Ƨǫe�᪺�}�C�O�_�ۦP
			if (Arrays.equals(dice, sortedDice) == true)
			{
				// �ۦP�N���l�O�Ѥp��j���A���G��
				System.out.println("����٤����I�Y�X�F���l�I���G���F�I");
			}
			else
			{
				System.out.println("���´f�U...�U�����|��n�I");
			}
		}

	}

	// �T�{�Ҧ���l�����G�O�_����n�ۦP
	public static boolean checkEqual(int[] array)
	{
		// �@�}�l��l�{���O����n�ۦP
		boolean returnValue = true;

		// �H array[0] �����I�A��L��l���� array[0] �ۤ��
		for (int i = 1; i < array.length; i++)
		{
			// �Y���@����l�� array[0] ���P���ܴN�^�� false
			if (array[0] != array[i])
			{
				returnValue = false;
				break;
			}
		}

		return returnValue;
	}
}
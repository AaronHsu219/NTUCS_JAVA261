/*******************************************************************************
 * ���Z�έp�{�� v2�GHW42.java
 * ���w�Y�Z��5��ǥ͡A�C��ǥͦU��3����ءA�ЧQ�ΤG���}�C���覡�x�s�ǥͪ��U�즨�Z�A
 * �ñN�C��ǥͪ��U�즨�Z�B�������Z�C�L�X��
*******************************************************************************/

public class HW42
{
	public static void main(String[] args)
	{
		// �H������ 5 ��ǥ͡B�U�� 3 ���Ҫ����Z
		int[][] student = {{81,75,90}, {65,78,91}, {84,98,73}, {65,75,82}, {42,54,35}};

		// �ǳ� 5 �ӪŶ��� 5 ��ǥͦs��p��᪺�`��
		//int[] total = new int[student.length];
		int[] total = {0, 0, 0, 0, 0};

		// ���� for �j�� i�A�N student �}�C�Ĥ@���]�@�� i �|�O 0~4 (�Ĥ@��)
		for (int i = 0; i < student.length; i++)
		{
			System.out.println("��" + (i+1) + "��ǥͪ����Z�G");

			// ���� for �j�� j�A�N 5 �Ӿǥͪ� 3 �즨�Z���O�[�`�_�ө�� total[i] ���Aj �|�O 0 ~ 2
			for (int j = 0; j < student[i].length; j++)
			{
				System.out.println(student[i][j]);

				// total[0] = student[0][0] + student[0][1] + student[0][2];
				// total[1] = student[1][0] + student[1][1] + student[1][2];
				// �H������
				total[i] += student[i][j];
			}

			// �`��
			System.out.println("�`���O�G" + total[i]);

			// �����K�O total[i] / 3
			System.out.println("�����O�G" + (double)(total[i] / 3));

		}
	}
}
/***********************************************************
 * �G���}�C�ާ@�m�� (pt42.java)
 * �мg�@�� JAVA �{���ӭp��U�C�G���}�C�Ҧ��������`�M�G
 * {{1,7,15},{9,3,4},{6,8,13},{11,5,2},{10,7,9}}
 * ���T���׬O 110
***********************************************************/

public class PT42
{
	public static void main(String[] args)
	{
		// demo �[�`�L�{���һݭn���ܼƤ� total ���s���`�M���ܼ�
		int i = 0, total = 0;

		// �w�q�D�ؤ��һݪ��G���}�C
		int[][] sum = {{1,7,15},{9,3,4},{6,8,13},{11,5,2},{10,7,9}};

		// foreach �j��A�Ĥ@���� sum �o�ӤG���}�C���� array �o�Ӥ@���}�C
		for(int[] array : sum)
		{
			// foreach �j��A�ĤG���� array �o�Ӥ@���}�C�����ܼ� num
			for (int num : array)
			{
				System.out.println("��"+ ++i +"�����e�ȬO: " + num);
				System.out.println("total �ثe�O: " + total);
				total += num;
				System.out.println("total + " + num + " ���ܦ�: " + total);
			}
		}

		System.out.print("�`�M�O�G" + total);
	}
}
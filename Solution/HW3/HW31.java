/**************************************************************
 * �ұo�|�p��{�� (HW31.java)
 * �г]�p�@�ӵ{���i�H�p��ұo�|�A
 * �����G���J30�U�����|�v��6%�A�W�L30�U���������A�|�v13%
 * �Ҧp�G���J��40�U���A�hú3�U1�a�����|��
**************************************************************/

public class HW31
{
	public static void main(String[] args)
	{
		// �ǳƤ@���ܼƨӳB�z�ϥΪ̶ǤJ���Ѽ� (�~���J)
		int income;
		income = Integer.parseInt(args[0]);

		// 30 �U�����e��
		int threshold = 300000;

		// 30 �U�H�����|�v 1
		double tax_rate1 = 0.06;

		// �W�L 30 �U���|�v 2
		double tax_rate2 = 0.13;

		// �̫�nú�檺�`�|�B
		double tax;

		System.out.println("�~���J���G" + income + "��");

		// �Y�ϥΪ̪��~���J�b 30 �U (���e��) �H��
		if (income <= threshold)
		{
			// �h�u�n�N�~���J * �|�v 1 �N�Oú�|�`�B
			tax = income * tax_rate1;
		}

		// �Y�W�L 30 �U�����e��
		else
		{
			// �h 30 �U�����������H�|�v 1
			tax = threshold * tax_rate1;

			// �N�W�L 30 �U���������H�|�v 2
			income -= threshold;
			tax += income * tax_rate2;
		}

		System.out.println("���~�nú���|���G" + tax + "��");
	}
}
/**************************************************************
 * ����ɦV�{���m�ߡGPT61.java
 * �Q�Ϋغc�l���[���A�g�@�ӵ{�����̭������O�i�H���O�ѡG
 * �r��غc�l�B��ƫغc�l�B�B�I�ƫغc�l
 * �T�ثغc�l�إߡA�ä��O�b�{�����L�X�G
 * �o�O�Ѧr��غc�l�إߪ�����B�o�O�Ѿ�ƫغc�l�إߪ�����B�o�O�ѯB�I�ƫغc�l�إߪ�����
**************************************************************/

public class PT61
{
	public static void main(String[] args)
	{
		// ���^�� TestObj (�ϥξ�ưѼ�)
		TestObj obj1 = new TestObj(1);

		// ���^�� TestObj (�ϥίB�I�ưѼ�)
		TestObj obj2 = new TestObj(1.0);

		// ���^�� TestObj (�ϥΦr��Ѽ�)
		TestObj obj3 = new TestObj("�r��");
	}
}

// TestObj ���O
class TestObj
{
	// ������ưѼƪ��غc�l
	public TestObj(int n)
	{
		System.out.println("��ƫ��A�غc�l");
	}

	// �����B�I�ưѼƪ��غc�l
	public TestObj(double n)
	{
		System.out.println("�B�I�ƫ��A�غc�l");
	}

	// �����r��Ѽƪ��غc�l
	public TestObj(String n)
	{
		System.out.println("�r�ꫬ�A�غc�l");
	}
}
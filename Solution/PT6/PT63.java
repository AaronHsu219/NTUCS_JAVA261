/*********************************************************
 * �~�Ӫ��m�ߡGPT63.java
*********************************************************/

class PT63
{
	public static void main(String[] args)
	{
		Toyota t = new Toyota();	// ������ץШT��
		Honda h = new Honda();		// ����ƥ��ШT��
		Nissan n = new Nissan();	// ����Ƥ鲣�T��

		t.drive();					// ��樫
		t.rally();					// �F�y�樫
		h.rearWD();					// ����ǰ�
		n.fourWD();					// �|���ǰ�
	}
}

// �����O - �T��
class Car
{
	public String color;		// +����
	public String door;			// +������
	public String license;		// +���P���X
	public void drive()			// +��樫()
	{
		System.out.println("�樫��");
	}
}

// �l���O - �ץШT��
class Toyota extends Car
{
	// +�F�y�樫()
	public void rally()
	{
		System.out.println("�F�y�樫");
	}
}

// �l���O - ���ШT��
class Honda extends Car
{
	// +����ǰ�()
	public void rearWD()
	{
		System.out.println("����ǰ�");
	}
}

// �l���O - �鲣�T��
class Nissan extends Car
{
	// +�|���ǰ�()
	public void fourWD()
	{
		System.out.println("�|���ǰ�");
	}
}
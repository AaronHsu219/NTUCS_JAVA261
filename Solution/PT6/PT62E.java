/*********************************************************
 * �h�ε{���m�ߡGPT62.java (²����)
 * �]�p�@�����O�uFindArea�v�A�̭��w�q�@�Ӥ�k area()
 * �Ψӭp��U�C�T�اΪ������n�G
 * ��έ��n�G3.14 * r * r�Ar�N��b�| (int)
 * �x�έ��n�G�� * �e (int, int)
 * ��έ��n�G(�W�� + �U��) * �� / 2 (int, int, int)
*********************************************************/

public class PT62E
{
	public static void main(String[] args)
	{
		FindArea f = new FindArea();

		f.area(10);
		f.area(10, 20);
		f.area(10, 20, 30);
	}
}

class FindArea
{
	double ans;

	void area(int r)
	{
		ans = r * r * 3.14;
		System.out.println("��έ��n�O�G" + ans);
	}

	void area(int width, int height)
	{
		ans = width * height;
		System.out.println("�x�έ��n�O�G" + ans);
	}

	void area(int upper, int bottom, int height)
	{
		ans = (upper + bottom) * height / 2;
		System.out.println("��έ��n�O�G" + ans);
	}
}
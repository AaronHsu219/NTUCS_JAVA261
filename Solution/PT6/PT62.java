/*********************************************************
 * �h�ε{���m�ߡGPT62.java
 * �]�p�@�����O�uFindArea�v�A�̭��w�q�@�Ӥ�k area()
 * �Ψӭp��U�C�T�اΪ������n�G
 * ��έ��n�G3.14 * r * r�Ar�N��b�| (int)
 * �x�έ��n�G�� * �e (int, int)
 * ��έ��n�G(�W�� + �U��) * �� / 2 (int, int, int)
*********************************************************/
//
public class PT62
{
	public static void main(String[] args)
	{
		// �w�q�@�� double �ܼƨӦs��̫�p�⪺���n���G
		double result = 0.0;
		// �w�q�@�Ӧr���ܼƨө�p�⪺�O���@�عϫ�
		String typename = "";

		// ����� FindArea ���O
		FindArea obj = new FindArea();

		// ���ۧ�ϥΪ̶Ƕi�Ӫ� args �ѼƱq String �ন int
		int[] input = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
			input[i] = Integer.parseInt(args[i]);
		}

		// �p�G�Ѽƥu���@��
		if (args.length == 1)
		{
			// �p���έ��n
			result = obj.area(input[0]);
			typename = "���";
		}

		// �p�G�ѼƦ����
		else if (args.length == 2)
		{
			// �p��x�έ��n
			result = obj.area(input[0], input[1]);
			typename = "�x��";
		}

		// �p�G�ѼƦ��T��
		else if (args.length == 3)
		{
			// �p���έ��n
			result = obj.area(input[0], input[1], input[2]);
			typename = "���";
		}

		System.out.println(typename + "���n�O�G" + result);
	}

}

// �p�⭱�n���O FindArea
class FindArea
{
	// ���q�`�Ƹ�Ʀ��� pi (��P�v)
	final double pi = 3.14;

	// ��ϥΪ̶ǤJ�@�Ӿ�ưѼƮ�
	public double area(int radius)
	{
		// �p��ꭱ�n�A�����G�b�| * �b�| * pi
		return (radius * radius * pi);
	}

	// ��ϥΪ̶ǤJ��Ӿ�ưѼƮ�
	public double area(int width, int height)
	{
		// �p��x�����n�A�����G�� * �e
		return (width * height);
	}

	// ��ϥΪ̶ǤJ�T�Ӿ�ưѼƮ�
	public double area(int upper, int bottom, int height)
	{
		// �p��諬���n�G�����G(�W�� + �U��) * �� / 2
		return (((upper + bottom) * height ) / 2);
	}
}
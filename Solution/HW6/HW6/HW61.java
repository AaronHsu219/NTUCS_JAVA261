/*********************************************************
 * �q�Ʀr�{���GHW61.java
 * �]�p�@�Ӳq�Ʀr�����O(Guess)
 * �éw�q�@��private��Ʀ��� int answer �s�񥿽T�ѵ�
 * �P�ɳ]�p�غc�l�H�����H�U���n�D�G
 * �w�]�غc�l�G�ϥΡuMath.random( )�v��k�A��l����
 * ���ץ��ݤp��ε���100�A�j��άO����1
 * �A�]�p�H�U����k�G
 * Public String judge(int answer)
 * //�P�_�q���Ʀr�O�_���T�A�p�G���T�A�Ǧ^�u����F�v
 * //�p�G�q���Ʀr�Ӥp�A�Ǧ^�u�Ӥp�F�v
 * //�p�G�q���Ʀr�Ӥj�A�Ǧ^�u�Ӥj�F�v
 * public int getAnswer( )		//�Ǧ^����
*********************************************************/
public class HW61
{
	public static void main(String[] args)
	{
		// �s��ϥΪ̿�J���ܼ�
		int input = Integer.parseInt(args[0]);

		// ����� Guess ���O�������� g
		Guess g = new Guess();

		// �N�ϥΪ̿�J����ƶǤJ g.judge ��������G
		System.out.println(g.judge(input));

		// �^�ǥ��T���ר�D�{��
		System.out.println("���׬O�G" + g.getAnswer());
	}
}

// �q�Ʀr���O
class Guess
{
	// private ��Ʀ��� answer �t�d�s�񵪮�
	private int answer;

	// �غc�l��l�Ƥ@���H�����פ��� 1~100
	Guess()
	{
		this.answer = (int)(Math.random()*100 + 1);
	}

	// judge ��k����ϥΪ̿�J���Ʀr�򥿽T����
	// �P�_�q���Ʀr�O�_���T�A�p�G���T�A�Ǧ^�u����F�v
	// �p�G�q���Ʀr�Ӥp�A�Ǧ^�u�Ӥp�F�v
	// �p�G�q���Ʀr�Ӥj�A�Ǧ^�u�Ӥj�F�v
	public String judge(int answer)
	{
		if (this.answer > answer)
		{
			return "�Ӥp�F�I";
		}
		else if (this.answer < answer)
		{
			return "�Ӥj�F�I";
		}
		else
		{
			return "����F�I";
		}
	}

	//�Ǧ^����
	public int getAnswer()
	{
		return this.answer;
	}
}
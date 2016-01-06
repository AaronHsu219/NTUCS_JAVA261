import java.io.*;

public class HW83
{
	public static void main(String[] args) throws IOException
	{
		// �ϥ� InputStreamReader ���O�A�����ϥΪ���L��J����T
		InputStreamReader ir = new InputStreamReader(System.in);

		// �A�ϥ� BufferedReader ���O�N�ϥΪ���L��J����T��m�b�w�İϤ�
		BufferedReader br = new BufferedReader(ir);

		// ����� Guess ���O�������� g
		Guess g = new Guess();

		System.out.print("�п�J�@�� 1~100 �������Ʀr�a!");
		
		while (true) {
			int input = Integer.parseInt(br.readLine());

			// �N�ϥΪ̿�J����ƶǤJ g.judge ��������G
			System.out.println(g.judge(input));

			if (g.judge(input) == "����F�I") 
				break;
		}
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
			return "�Ӥp�F�I\n�A�դ@���a�I";
		}
		else if (this.answer < answer)
		{
			return "�Ӥj�F�I\n�A�դ@���a�I";
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
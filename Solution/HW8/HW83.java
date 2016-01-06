/*
 ***********************************************************************
 *�q�Ʀr�{�� v2 HW83.java
 ***********************************************************************
 *�Ч�i HW61.java���q�Ʀr�{���C
 *�HBufferedReader����k���ϥΪ̥i�H�@���q�A����q�勵�T���׬���
 ***********************************************************************
 */
import java.io.*;

public class HW83
{
	public static void main(String[] args) throws IOException
	{
		// �D�{��������� Guess() ���O
		Guess g = new Guess();

		// �� BufferedReader �����ϥΪ̿�J�����
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.println("�п�J�@�� 1~100 �������Ʀr�a�I");
//
		// ����@�ӵL�a�j��A�u���b�q�쥿�T���׮ɤ~�����j��
		while(true)
		{
			// answer �Ψӱ����ϥΪ̿�J�����e
			int answer = Integer.parseInt(br.readLine());

			// �p�G�ϥΪ̿�J���Ʀr�򥿽T���פ��P�A�h��X�u�Ӥp�F�I�v�Ρu�Ӥj�F�I�v
			if (answer != g.getAnswer())
			{
				System.out.println(g.judge(answer));
			}
			// �p�G�ۦP�A�h��X�u����F�I�v�å� break ���}�j��
			else
			{
				System.out.println("����F�I");
				break;
			}

			// �p�G�j���ٻݭn�~��]�A�N��X�u�A�դ@����I�v�ШϥΪ̦A���s�@��
			System.out.println("�A�դ@���a�I");
		}

	}
}

// �q�Ʀr���O
class Guess
{
	// �p������ int answer ���Ӧs�񥿽T����
	private int answer;

	// �b�غc�l���H�����ͤ@�� 1~100 ��������ƭ�
	Guess()
	{
		this.answer = (int)(Math.random() * 100 + 1);
	}

	// judge ��k�|�^�ǨϥΪ̬O�_�@�����T
	public String judge(int answer)
	{
		// �p�G�ϥΪ̿�J�� answer �񥿽T���� this.answer �p���ܴN���Ӥp�F
		if (this.answer > answer)
		{
			return "�Ӥp�F�I";
		}
		// �p�G�ϥΪ̿�J�� answer �񥿽T���� this.answer �j���ܴN���Ӥj�F
		else if (this.answer < answer)
		{
			return "�Ӥj�F�I";
		}
		// �p�G���񥿽T���פp�B�]���񥦤j�A�N�O����F
		else
		{
			return "����F�I";
		}
	}

	// getAnswer() �|�^�ǥ��T���׭ȵ��D�{��
	public int getAnswer()
	{
		return this.answer;
	}
}
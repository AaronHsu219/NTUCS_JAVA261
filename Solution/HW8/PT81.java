/*
 ***********************************************************************
 *�ҥ~�m�� PT81.java
 ***********************************************************************
 *�]�p�@�ӵ{���b����ɻݭn��J�@�Ӿ�ƼƭȡC
 *�ЦҼ{�i�ಣ�ͪ��ҥ~���p�A�Ҧp�G����J�ƭȡA�ƭȮ榡�����T�����ΡC
 *�p�G�ҥ~���͡A�Шϥ�throw ���覡������X�ҥ~�A����ܬ����T���C
 *�p�G�S���ҥ~���͡A�ЧQ�θӼƭȭp�⥿��Ϊ����n�C
 ***********************************************************************
 */
//
public class PT81
{
	public static void main(String[] args)
	{
		int input, answer;

		// �Y�ϥΪ̨S����J����Ѽ�
		if (args.length == 0)
		{
			// �ҥ~�B�z - �ۦ�w�q���ҥ~
			try
			{
				// �إߤ@�Ӧۭq���ΦW�ҥ~�A���~�T�����u�S����J�Ʀr�I�v
				throw new Exception("�S����J�Ʀr�I");
			}
			// �ɮ��ۦ�w�q�����ΦW�ҥ~
			catch(Exception e)
			{
				// �ñN���~�T���C�L�X��
				System.out.println(e.toString());
			}
		}

		// �Y�ϥΪ̦���J�Ѽ�
		else
		{
			// �ҥ~�B�z - �૬�O�_���~
			try
			{
				// �i��o�X���ҥ~ - NumberFormatException
				// ��]�G�N�r�� args[0] �ন Integer �L�{���A
				// �Y�ϥΪ̿�J�� args[0] �쥻�N���O�Ʀr�A�p���^��r
				input = Integer.parseInt(args[0]);

				// �Y�W�@��S���o�ͨҥ~�A�h�b���~��N input ������o���n
				answer = input * input;
				System.out.println("����έ��n���G" + answer);
			}
			// �Y�ҥ~�o�͡A�h�ɮ� NumberFormatException
			catch(NumberFormatException e)
			{
				System.out.println("�Ʀr�榡�ҥ~�I" + e.getMessage());
			}
			// �Y�o�ͨ�L�ҥ~�A�h�ᵹ�������O�B�z
			catch(Exception e)
			{
				System.out.println("��L�w���H�~�����~�I" + e.getMessage());
			}
		}
	}
}//
/************************************************************************************
 * ���ƭp��{�� (HW22.java)�G
 * �г]�p�@�ӵ{���i�ѨϥΪ̿�J�G�u���v�B�u�ƾǡv�B�u�^��v�A�T�즨�Z�A
 * �����L�p��X�L���`���H�Υ�������
 ************************************************************************************/

public class HW22
{
	public static void main(String[] args)
	{
		// �ǳƥ|�Ӿ���ܼƨӦs��u���v�B�u�ƾǡv�B�u�^��v�A�T�즨�Z�P�`��
		int chn, math, eng, total;

		// �ǳƤ@�ӯB�I���ܼƨӦs�񥭧��� (�|���p��)
		double avg;

		// �N�ϥΪ̿�J�� args[0] �ন��Ʒ���妨�Z
		chn = Integer.parseInt(args[0]);

		// �N�ϥΪ̿�J�� args[1] �ন��Ʒ��ƾǦ��Z
		math = Integer.parseInt(args[1]);

		// �N�ϥΪ̿�J�� args[2] �ন��Ʒ��^�妨�Z
		eng = Integer.parseInt(args[2]);

		// �`���p��A�N���B�ƾǡB�^��T����ƥ[�`�_��
		total = chn + math + eng;

		// ���H 3 ����s�� avg ������
		avg = (double)total / 3;

		// ��X���G
		System.out.println("���G" + chn);
		System.out.println("�ƾǡG" + math);
		System.out.println("�^��G" + eng);
		System.out.println("�`���G" + total);
		System.out.println("�����G" + avg);
	}
}
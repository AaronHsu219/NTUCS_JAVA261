import java.io.*;

public class HW82 {
	public static void main(String[] args) throws IOException {

		String name; 		//�x�s�m�W�����
		float premium; 	//�N��Ȧ�s�ڪ��������B
		float iRate; 		//�N��Ȧ檺�s�ڧQ�v
		float interest;
		float total;

		// �ϥ� InputStreamReader ���O�A�����ϥΪ���L��J����T
		InputStreamReader ir = new InputStreamReader(System.in);

		// �A�ϥ� BufferedReader ���O�N�ϥΪ���L��J����T��m�b�w�İϤ�
		BufferedReader br = new BufferedReader(ir);

		// �߰ݨϥΪ̩m�W�A�A�N�ϥΪ̿�J����T�s�� name (String) �ܼƤ�
		System.out.print("�п�J�m�W�G");
		name = br.readLine();

		// �߰ݨϥΪ̦~�֡A�A�N�ϥΪ̿�J����T�s�� age (int) �ܼƤ�
		System.out.print("�п�J�����G");
		premium = Float.parseFloat(br.readLine());

		// �߰ݨϥΪ̩ʧO�A���]��J�i�ର M �� F�A�s�i gender (String) �ܼƤ�
		System.out.print("�п�J�Q�v�G");
		iRate = Float.parseFloat(br.readLine());

		interest = premium * iRate;

		total = premium + interest;

		System.out.println("Hi "+ name +" �A�n");
		System.out.println("�z�������O "+ premium + " ����");
		System.out.println("�Q�v�O "+ iRate);
		System.out.println("�@�~���Q���O "+ interest + " ��");
		System.out.println("�����[�Q���O "+ total + " ��");
	}
}
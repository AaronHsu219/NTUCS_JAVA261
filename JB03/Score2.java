public class Score2 {
	public static void main (String[] args) {
		int score = 85;//���w�ǥͤ��Ƭ�85��
		if (score >= 90 & score <= 100) {
			System.out.println("���ƬO�G" + score + " �A���Ŭ�A");
		} else if (score >= 80){
			System.out.println("���ƬO�G" + score + " �A���Ŭ�B");
		} else if (score >= 70) {
			System.out.println("���ƬO�G" + score + " �A���Ŭ�C");
		} else if (score >= 60) {
			System.out.println("���ƬO�G" + score + " �A���Ŭ�D");
		} else {
			System.out.println("���ƬO�G" + score + " �A���Ŭ�E");
		}
		System.out.println("�{�����槹��!!!");
	}
}
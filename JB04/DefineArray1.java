public class DefineArray1 {
	public static void main(String[] args){
		int[] math_score= new int[3];
		int i;

		math_score[0] = 85;
		math_score[1] = 95;
		math_score[2] = 90;

		System.out.println("�T��ǥͪ����Z���O���G");
		for (i = 0; i < 3; i++)
		{
			System.out.println("��" + (i+1) + "��ǥͪ����Z�O�G" + math_score[i]);
		}
	}
}
public class MultiArray{
	public static void main(String[] args){
		int[][] score = new int[5][3];	//�ŧi�@�ӤG���}�C
		int i, j;

		for (i = 0; i <= 4; i++){
			score[i][0] = i + 1;	//��l�ƲĤ@��A�ǥͮy�������e
		}

		score[0][1] = 76;
		score[0][2] = 80;
		score[1][1] = 88;
		score[1][2] = 92;
		score[2][1] = 90;
		score[2][2] = 94;
		score[3][1] = 100;
		score[3][2] = 98;
		score[4][1] = 68;
		score[4][2] = 70;

		System.out.println("�G���}�C�����e��");

		for(i = 0; i <= 4; i++) {
			for (j = 0; j <= 2; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
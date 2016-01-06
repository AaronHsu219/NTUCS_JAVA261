public class MultiArray{
	public static void main(String[] args){
		int[][] score = new int[5][3];	//宣告一個二維陣列
		int i, j;

		for (i = 0; i <= 4; i++){
			score[i][0] = i + 1;	//初始化第一欄，學生座號的內容
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

		System.out.println("二維陣列的內容為");

		for(i = 0; i <= 4; i++) {
			for (j = 0; j <= 2; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
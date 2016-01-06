/*******************************************************************************
 * 成績統計程式 v2：HW42.java
 * 假定某班有5位學生，每位學生各修3門科目，請利用二維陣列的方式儲存學生的各科成績，
 * 並將每位學生的各科成績、平均成績列印出來
*******************************************************************************/

public class HW42
{
	public static void main(String[] args)
	{
		// 隨機產生 5 位學生、各修 3 門課的成績
		int[][] student = {{81,75,90}, {65,78,91}, {84,98,73}, {65,75,82}, {42,54,35}};

		// 準備 5 個空間給 5 位學生存放計算後的總分
		//int[] total = new int[student.length];
		int[] total = {0, 0, 0, 0, 0};

		// 執行 for 迴圈 i，將 student 陣列第一維跑一次 i 會是 0~4 (第一維)
		for (int i = 0; i < student.length; i++)
		{
			System.out.println("第" + (i+1) + "位學生的成績：");

			// 執行 for 迴圈 j，將 5 個學生的 3 科成績分別加總起來放到 total[i] 中，j 會是 0 ~ 2
			for (int j = 0; j < student[i].length; j++)
			{
				System.out.println(student[i][j]);

				// total[0] = student[0][0] + student[0][1] + student[0][2];
				// total[1] = student[1][0] + student[1][1] + student[1][2];
				// 以此類推
				total[i] += student[i][j];
			}

			// 總分
			System.out.println("總分是：" + total[i]);

			// 平均便是 total[i] / 3
			System.out.println("平均是：" + (double)(total[i] / 3));

		}
	}
}
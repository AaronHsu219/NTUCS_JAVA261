/************************************************************************************
 * 計算三角形面積 (HW21.java)
 * 公式：(底 * 高) / 2
 * 請設計一個程式，可以輸入三角形的「底」和「高」，
 * 並幫他計算出該三角形的面積
 ***********************************************************************************/

public class HW21
{
	public static void main(String[] args)
	{
		// 定義兩個變數來存放使用者輸入的底與高
		int width, height;

		// 定義一個變數來存放最後算出的面積
		double answer;

		// 把使用者輸入的第一個值 args[0] 轉成 integer 放到變數中
		width = Integer.parseInt(args[0]);

		// 把使用者輸入的第二個值 args[1] 轉成 integer 放到變數中
		height = Integer.parseInt(args[1]);

		// 計算面積
		// 公式：(底 * 高) / 2
		answer = (double)(width * height) / 2;

		// 輸出結果
		System.out.println("底：" + width);
		System.out.println("高：" + height);
		System.out.println("面積：" + answer);
	}
}
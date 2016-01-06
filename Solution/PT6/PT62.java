/*********************************************************
 * 多形程式練習：PT62.java
 * 設計一個類別「FindArea」，裡面定義一個方法 area()
 * 用來計算下列三種形狀的面積：
 * 圓形面積：3.14 * r * r，r代表半徑 (int)
 * 矩形面積：長 * 寬 (int, int)
 * 梯形面積：(上底 + 下底) * 高 / 2 (int, int, int)
*********************************************************/
//
public class PT62
{
	public static void main(String[] args)
	{
		// 定義一個 double 變數來存放最後計算的面積結果
		double result = 0.0;
		// 定義一個字串變數來放計算的是哪一種圖型
		String typename = "";

		// 實體化 FindArea 類別
		FindArea obj = new FindArea();

		// 接著把使用者傳進來的 args 參數從 String 轉成 int
		int[] input = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
			input[i] = Integer.parseInt(args[i]);
		}

		// 如果參數只有一個
		if (args.length == 1)
		{
			// 計算圓形面積
			result = obj.area(input[0]);
			typename = "圓形";
		}

		// 如果參數有兩個
		else if (args.length == 2)
		{
			// 計算矩形面積
			result = obj.area(input[0], input[1]);
			typename = "矩形";
		}

		// 如果參數有三個
		else if (args.length == 3)
		{
			// 計算梯形面積
			result = obj.area(input[0], input[1], input[2]);
			typename = "梯形";
		}

		System.out.println(typename + "面積是：" + result);
	}

}

// 計算面積類別 FindArea
class FindArea
{
	// 應義常數資料成員 pi (圓周率)
	final double pi = 3.14;

	// 當使用者傳入一個整數參數時
	public double area(int radius)
	{
		// 計算圓面積，公式：半徑 * 半徑 * pi
		return (radius * radius * pi);
	}

	// 當使用者傳入兩個整數參數時
	public double area(int width, int height)
	{
		// 計算矩型面積，公式：長 * 寬
		return (width * height);
	}

	// 當使用者傳入三個整數參數時
	public double area(int upper, int bottom, int height)
	{
		// 計算梯型面積：公式：(上底 + 下底) * 高 / 2
		return (((upper + bottom) * height ) / 2);
	}
}
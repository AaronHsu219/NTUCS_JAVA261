/*********************************************************
 * 多形程式練習：PT62.java (簡易版)
 * 設計一個類別「FindArea」，裡面定義一個方法 area()
 * 用來計算下列三種形狀的面積：
 * 圓形面積：3.14 * r * r，r代表半徑 (int)
 * 矩形面積：長 * 寬 (int, int)
 * 梯形面積：(上底 + 下底) * 高 / 2 (int, int, int)
*********************************************************/

public class PT62E
{
	public static void main(String[] args)
	{
		FindArea f = new FindArea();

		f.area(10);
		f.area(10, 20);
		f.area(10, 20, 30);
	}
}

class FindArea
{
	double ans;

	void area(int r)
	{
		ans = r * r * 3.14;
		System.out.println("圓形面積是：" + ans);
	}

	void area(int width, int height)
	{
		ans = width * height;
		System.out.println("矩形面積是：" + ans);
	}

	void area(int upper, int bottom, int height)
	{
		ans = (upper + bottom) * height / 2;
		System.out.println("梯形面積是：" + ans);
	}
}
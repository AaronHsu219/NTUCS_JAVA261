/*********************************************************
 * 繼承的練習：PT63.java
*********************************************************/

class PT63
{
	public static void main(String[] args)
	{
		Toyota t = new Toyota();	// 實體化豐田汽車
		Honda h = new Honda();		// 實體化本田汽車
		Nissan n = new Nissan();	// 實體化日產汽車

		t.drive();					// 能行走
		t.rally();					// 沙灘行走
		h.rearWD();					// 後輪傳動
		n.fourWD();					// 四輪傳動
	}
}

// 父類別 - 汽車
class Car
{
	public String color;		// +車色
	public String door;			// +車門數
	public String license;		// +車牌號碼
	public void drive()			// +能行走()
	{
		System.out.println("行走中");
	}
}

// 子類別 - 豐田汽車
class Toyota extends Car
{
	// +沙灘行走()
	public void rally()
	{
		System.out.println("沙灘行走");
	}
}

// 子類別 - 本田汽車
class Honda extends Car
{
	// +後輪傳動()
	public void rearWD()
	{
		System.out.println("後輪傳動");
	}
}

// 子類別 - 日產汽車
class Nissan extends Car
{
	// +四輪傳動()
	public void fourWD()
	{
		System.out.println("四輪傳動");
	}
}
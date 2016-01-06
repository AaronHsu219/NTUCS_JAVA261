class Inheritance2 {
	public static void main(String[] args) {
		CalArea a1 = new CalArea();
		System.out.println("父類別高度是： " + a1.height + "， 父類別寬度是： " + a1.width);

		CalRecArea a2 = new CalRecArea();
		System.out.println("子類別高度是： " + a2.height + "， 子類別寬度是： " + a2.width);
		System.out.println("子類別名稱是： " + a2.name);

		CalArea a3 = new CalRecArea();
		System.out.println("父類別高度是： " + a3.height + "， 父類別寬度是： " + a3.width);
		//System.out.println("父類別的名稱是： " + a3.name);

		CalRecArea a4 = (CalRecArea)a3;
		System.out.println("子類別高度是： " + a4.height + "， 子類別寬度是： " + a4.width);
		System.out.println("子類別的名稱是： " + a4.name);
	}
}

class CalArea{
	public int width = 10; 			//設定長度
	public int height = 10; 		//設定寬度
	//public String name = "父類別";
}

class CalRecArea extends CalArea{
	public int width = 20; 			//設定長度
	public int height = 20; 		//設定寬度
	public String name = "矩形";
}
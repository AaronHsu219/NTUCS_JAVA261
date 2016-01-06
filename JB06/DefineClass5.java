class DefineClass5 {
	public static void main(String[] args)
	{
		Vehicle newCar1 = new Vehicle(); 		//實體化一個類別
		System.out.println("newCar1 車子有" + newCar1.getWheel() + "個輪子");
	}
}

class Vehicle{ 													//定義的類別
	private int wheel; 										//定義一個實體變數
	public Vehicle(){ 										//類別的建構子
		wheel = 4;
	}
	public int getWheel() { 							//定義方法，傳回wheel的值
		return wheel;
	}
	public void setWheel(int n) { 				//定義方法，設定wheel的值
		if (n <= 10) {
			wheel = n;
		} else {
			wheel = 2;
		}
	}
}
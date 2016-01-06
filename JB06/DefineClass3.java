class DefineClass3 {
	public static void main(String[] args){
		Vehicle newCar1 = new Vehicle(); 	//實體化一個類別

		newCar1.setWheel(6); 							//設定wheel的值

		System.out.println("newCar1 車子有 " + newCar1.getWheel() + " 個輪子");
	}
}

class Vehicle { 												//定義的類別
	int wheel; 													//定義一個實體變數
	public int getWheel() { 						//定義方法，傳回wheel的值
		return wheel;
	}
	public void setWheel(int n) { 			//定義方法，設定wheel的值
		if (n <= 10) {
			wheel = n;
		} else {
			wheel = 2;
		}
	}
}
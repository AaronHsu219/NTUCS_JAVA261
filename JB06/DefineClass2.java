public class DefineClass2 {
	public static void main(String[] args) {
		Vehicle newCar1 = new Vehicle(); 	//實體化一個類別
		Vehicle newCar2 = new Vehicle(); 	//再實體化一個類別
		Vehicle rCar; 										//只是一個參考

		rCar = newCar1; 									//rCar指向newCar1

		newCar1.wheel = 4; 								//指定實體變數的值
		newCar2.wheel = 8;
		rCar.wheel = 6; 									//現在， newCar1 的值也會更改
		System.out.println("newCar1 車子有" + newCar1.wheel +" 個輪子");
		System.out.println("newCar2 車子有" + newCar2.wheel +" 個輪子");		
	}
}

class Vehicle {
	int wheel; //定義一個實體變數
}
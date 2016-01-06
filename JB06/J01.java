public class DefineClass1 {
	public static void main(String[] args){

		Vehicle newCar = new Vehicle(); //實體化的一個類別

		newCar.wheel = 4; 		//指定實體變數的值
		System.out.println("車子有 "+ newCar.wheel + "個輪子");
	}
}

class Vehicle { 					//定義的類別
	int wheel; 							//定義一個實體變數
}
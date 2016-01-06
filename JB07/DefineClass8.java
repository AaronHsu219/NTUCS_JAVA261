class DefineClass8 {
	public static void main (String[ ] args) {
		Car newCar1 = new Car ( ) ; //實體化一個類別
			newCar1 = null ; //釋放newCar1
	}
}

class Vehicle { //定義的類別
	private int wheel ; // 定義一個實體變數
}

class Car{ //定義新的類別
	Vehicle tmpVehicle;
Car ( ) {
	tmpVehicle = new Vehicle ( );
}

protected void finalize ( ) {
	tmpVehicle = null ; //釋放tmpVehicle
	System.out.println ("資源已釋放") ;
}
}
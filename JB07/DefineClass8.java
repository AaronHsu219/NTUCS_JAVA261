class DefineClass8 {
	public static void main (String[ ] args) {
		Car newCar1 = new Car ( ) ; //����Ƥ@�����O
			newCar1 = null ; //����newCar1
	}
}

class Vehicle { //�w�q�����O
	private int wheel ; // �w�q�@�ӹ����ܼ�
}

class Car{ //�w�q�s�����O
	Vehicle tmpVehicle;
Car ( ) {
	tmpVehicle = new Vehicle ( );
}

protected void finalize ( ) {
	tmpVehicle = null ; //����tmpVehicle
	System.out.println ("�귽�w����") ;
}
}
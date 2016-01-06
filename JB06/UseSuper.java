class UseSuper {
	public static void main(String args[]) {
		Car c = new Car(4);
		c.printData();
	}
}

class Vehicle{
	protected int wheel;

	public Vehicle(){
		this.wheel = 4;
	}

	public Vehicle(int wheel){
		this.wheel = wheel;
	}

	public void printData(){
		System.out.println("���l�����l�� " + wheel + " ��");
	}
}

class Car extends Vehicle{
	protected int wheel;

	public Car(int wheel){
		super(6);
		this.wheel = wheel;
	}

	public void printData(){
		System.out.println("�l���O���A���l�����l�� " + this.wheel + " ��");
		System.out.println("�����O���A���l�����l�� " + super.wheel + " ��");
		super.printData();
	}
}
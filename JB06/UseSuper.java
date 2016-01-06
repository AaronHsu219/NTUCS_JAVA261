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
		System.out.println("車子的輪子有 " + wheel + " 個");
	}
}

class Car extends Vehicle{
	protected int wheel;

	public Car(int wheel){
		super(6);
		this.wheel = wheel;
	}

	public void printData(){
		System.out.println("子類別中，車子的輪子有 " + this.wheel + " 個");
		System.out.println("父類別中，車子的輪子有 " + super.wheel + " 個");
		super.printData();
	}
}
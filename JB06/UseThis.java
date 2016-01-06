class UseThis {
	public static void main(String args[]) {
		Car c = new Car(4);
		c.printData();
	}
}

class Car {
	protected int wheel;
	protected String name;

	public Car(int wheel){
		this("Honda"); 							//呼叫另一個建構子
		this.wheel = wheel;
	}

	public Car(String name){
		this.name = name;
	}

	public void printData(){
		System.out.println("車子的輪子有 " + wheel + " 個");
		System.out.println("車子的名字是： " + name);
	}
}
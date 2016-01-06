class Shadowing {
	public static void main (String[] args) {
		Car c = new Car(4);
		System.out.println("車的輪子有 "+ c.wheel + " 個");
	}
}

class Car {
	public int wheel;
	Car(int wheel) {
		//wheel = wheel;
		this.wheel = wheel;
	}
}
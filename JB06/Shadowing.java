class Shadowing {
	public static void main (String[] args) {
		Car c = new Car(4);
		System.out.println("�������l�� "+ c.wheel + " ��");
	}
}

class Car {
	public int wheel;
	Car(int wheel) {
		//wheel = wheel;
		this.wheel = wheel;
	}
}
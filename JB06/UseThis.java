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
		this("Honda"); 							//�I�s�t�@�ӫغc�l
		this.wheel = wheel;
	}

	public Car(String name){
		this.name = name;
	}

	public void printData(){
		System.out.println("���l�����l�� " + wheel + " ��");
		System.out.println("���l���W�r�O�G " + name);
	}
}
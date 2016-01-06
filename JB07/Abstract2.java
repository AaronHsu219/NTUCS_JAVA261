class Abstract2 {
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}

abstract class Animal {
	public int leg;
	abstract void showLeg();
}

class Dog extends Animal{
	public void showLeg(){
		System.out.println("實作了「 showLeg()」 方法");
	}
}
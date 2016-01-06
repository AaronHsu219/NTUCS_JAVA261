
class Abstract1
{
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}

abstract class Animal {
	public int leg;

	Animal(){
		leg = 10;
	}
}

class Dog extends Animal{
	Dog() {
		System.out.println("父類別的leg的值為： " + super.leg);
	}
}
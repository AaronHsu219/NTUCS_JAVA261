
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
		System.out.println("�����O��leg���Ȭ��G " + super.leg);
	}
}
class Inheritance3 {
	public static void main(String args[]) {
		A a = new A();
		System.out.println("A���󪺭Ȭ��G " + a.getNumber());

		B b = new B();
		System.out.println("B���󪺭Ȭ��G " + b.getNumber());

		A a1 = new B();
		System.out.println("A1 ���󪺭Ȭ��G " + a1.getNumber());

		B b1 = (B)a1;
		System.out.println("B1 ���󪺭Ȭ��G " + b1.getNumber());
	}
}

class A {
	public int getNumber() {
		return 1;
	}
}

class B extends A {
	public int getNumber() {
		return 2;
	}
}
interface InterfaceA {
	public void whichMethod() ;
}

class A implements InterfaceA {
	public void whichMethod() {
		System.out.println("A���O������k");
	}
}

class B extends A implements InterfaceA {
	public void whichMethod() {
		System.out.println("B���O������k");
	}
}

public class Interface3 {
	public static void main(String[] args) {
		A a = new A() ;
		a.whichMethod() ;

		B b = new B() ;
		b.whichMethod() ;

		A a1 = new B() ;
		a1.whichMethod() ;

		InterfaceA il = new A() ;
		il.whichMethod() ;

		InterfaceA i2 = new B() ;
		i2.whichMethod() ;
	}
}
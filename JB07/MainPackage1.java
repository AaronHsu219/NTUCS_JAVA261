package mypackage;

public class MainPackage1 {
	public MainPackage1(){
		System.out.println("別的套件可以引用的類別");
	}
	public void goodMethod() {
		System.out.println("別的套件可以引用的方法");
	}

	void badMethod() {
		System.out.println("別的套件不可以引用的方法");
	}
}

class BadClass1 {
	BadClass1(){
		System.out.println("別的套件不可以引用的類別");
	}
}
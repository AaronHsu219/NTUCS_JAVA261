package mypackage;

public class MainPackage1 {
	public MainPackage1(){
		System.out.println("�O���M��i�H�ޥΪ����O");
	}
	public void goodMethod() {
		System.out.println("�O���M��i�H�ޥΪ���k");
	}

	void badMethod() {
		System.out.println("�O���M�󤣥i�H�ޥΪ���k");
	}
}

class BadClass1 {
	BadClass1(){
		System.out.println("�O���M�󤣥i�H�ޥΪ����O");
	}
}
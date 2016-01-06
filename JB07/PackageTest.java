package mypackage;

class PackageTest{
	public static void main(String[] args){
		B b = new B() ;
	}
}

class A{
	A(){
		System.out.println("A類別初始化");
	}
}

class B{
	B(){
		System.out.println("B類別初始化");
	}
}
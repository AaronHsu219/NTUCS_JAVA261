import mypackage.*;

public class UsePackage1 {
	public static void main(String[] args){
		MainPackage1 m1 = new MainPackage1();
		m1.goodMethod();
		m1.badMethod(); //編譯無法通過

		BadClass1 b1 = new BadClass1(); //編譯無法通過
	}
}
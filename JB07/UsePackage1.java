import mypackage.*;

public class UsePackage1 {
	public static void main(String[] args){
		MainPackage1 m1 = new MainPackage1();
		m1.goodMethod();
		m1.badMethod(); //�sĶ�L�k�q�L

		BadClass1 b1 = new BadClass1(); //�sĶ�L�k�q�L
	}
}
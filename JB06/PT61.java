public class PT61 {
	public static void main(String[] args) {
		TestObj obj1 = new TestObj(1);
		TestObj obj2 = new TestObj(1.0);
		TestObj obj3 = new TestObj("字串");
	}
}

class TestObj {
	public TestObj(int n) {
		System.out.println("這是由整數建構子建立的物件");
	};
	
	public TestObj(double n) {
		System.out.println("這是由浮點數建構子建立的物件");
	};
	
	public TestObj(String n) {
		System.out.println("這是由字串建構子建立的物件");
	};
}
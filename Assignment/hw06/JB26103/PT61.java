public class PT61 {
	public static void main(String[] args) {
		TestObj obj1 = new TestObj(1);
		TestObj obj2 = new TestObj(1.0);
		TestObj obj3 = new TestObj("�r��");
	}
}

class TestObj {
	public TestObj(int n) {
		System.out.println("�o�O�Ѿ�ƫغc�l�إߪ�����");
	};
	
	public TestObj(double n) {
		System.out.println("�o�O�ѯB�I�ƫغc�l�إߪ�����");
	};
	
	public TestObj(String n) {
		System.out.println("�o�O�Ѧr��غc�l�إߪ�����");
	};
}
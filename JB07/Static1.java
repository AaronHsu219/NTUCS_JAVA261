class Static1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "HONDA";
		c1.wheel = 4;

		Car c2 = new Car();
		c2.name = "TOYOTA";
		c2.wheel = 6;

		System.out.println("c1 �����l�A�W�٬��G " + c1.name + "�A ���l���G " + c1.wheel);
		System.out.println("c2�����l�A�W�٬��G " + c2.name + "�A ���l���G " + c2.wheel);

	}

	class Car {
		static public String name; //�ŧi�@��static��Ʀ���
		public int wheel;
	}
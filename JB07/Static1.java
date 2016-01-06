class Static1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "HONDA";
		c1.wheel = 4;

		Car c2 = new Car();
		c2.name = "TOYOTA";
		c2.wheel = 6;

		System.out.println("c1 的車子，名稱為： " + c1.name + "， 輪子有： " + c1.wheel);
		System.out.println("c2的車子，名稱為： " + c2.name + "， 輪子有： " + c2.wheel);

	}

	class Car {
		static public String name; //宣告一個static資料成員
		public int wheel;
	}
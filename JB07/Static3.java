class Static3 {
	static String name = "Alex";
	int age;

	public void printData(){ //宣告非static函式
		System.out.println("名字是： " + name);
		System.out.println("年齡是： " + age);
	}

	public static void main(String[] args) {
		Static3 s = new Static3();
		s.age = 30;
		s.printData();
	}
}
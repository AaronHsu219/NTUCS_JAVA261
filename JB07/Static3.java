class Static3 {
	static String name = "Alex";
	int age;

	public void printData(){ //�ŧi�Dstatic�禡
		System.out.println("�W�r�O�G " + name);
		System.out.println("�~�֬O�G " + age);
	}

	public static void main(String[] args) {
		Static3 s = new Static3();
		s.age = 30;
		s.printData();
	}
}
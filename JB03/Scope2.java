public class Scope2 {
	static int v1 = 0;

	public static void method1() {
		int v2 = 0;
	}

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 10;
		int v3 = 0;

		System.out.println("v1 = " + v1);
	}
}
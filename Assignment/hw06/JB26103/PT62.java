public class PT62 {
	public static void main(String[] args) {
		FindArea f = new FindArea();

		System.out.println(f.area(5));
		System.out.println(f.area(5,8));
		System.out.println(f.area(5, 8, 3));

	} 
}

class FindArea {
	public double area(int r){
		System.out.print("�O��ΡA���n�O");
		return r * r * 3.14;
	}

	public int area(int a, int b){
		System.out.print("�O�x�ΡA���n�O");
		return a * b;
	}

	public double area(int a, int b, int c){
		System.out.print("�O�T���ΡA���n�O");
		return (a + b) * c / 2;
	}

}
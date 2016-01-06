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
		System.out.print("是圓形，面積是");
		return r * r * 3.14;
	}

	public int area(int a, int b){
		System.out.print("是矩形，面積是");
		return a * b;
	}

	public double area(int a, int b, int c){
		System.out.print("是三角形，面積是");
		return (a + b) * c / 2;
	}

}
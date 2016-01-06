public class HW21 {
	public static void main(String[] args) {
		double height;
		double bottom;
		double area;

		height = Double.parseDouble(args[0]);
		bottom = Double.parseDouble(args[1]);

		area = (height * bottom)/2;

		System.out.println("The height is: " + args[0]);
		System.out.println("The bottom is: " + args[1]);
		System.out.println("The area of the triangle is: " + area);
	}
}
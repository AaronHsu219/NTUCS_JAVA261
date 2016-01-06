public class HW22 {
	public static void main(String[] args) {
		double Cht;
		double Math;
		double Eng;
		double Total;
		double Average;

		Cht = Double.parseDouble(args[0]);
		Math = Double.parseDouble(args[1]);
		Eng = Double.parseDouble(args[2]);

		Total = Cht + Math + Eng;
		Average = Total/3;

		System.out.println("The Chinese grade is: " + args[0]);
		System.out.println("The Math grade is: " + args[1]);
		System.out.println("The Englihs grade is: " + args[2]);
		System.out.println("The Total grade is: " + Total);
		System.out.println("The Average grade is: " + Average);
	}
}
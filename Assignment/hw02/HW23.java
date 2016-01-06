public class HW23 {
	public static void main(String[] args) {
		double milage;
		double fee;

		milage = Double.parseDouble(args[0]);

		if (milage < 1000) {
			fee = 80;
		}
		else
		{
			fee = 80 + 10 * Math.floor((milage - 1000)/300);
		}

		System.out.println("The milage is: " + args[0] + " km");
		System.out.println("The taxi fee is: " + fee + " dollars");
	}
}
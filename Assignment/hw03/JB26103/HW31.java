public class HW31 {
	public static void main(String[] args) {

		double income;
		double tax;

		income = Double.parseDouble(args[0]);

		if (income < 300000) {
			tax = income * 0.06;
		}
		else if (income < 400000)
		{
			tax = income * 0.13;
		}
		else
		{
			tax = 31000;
		}

		System.out.println("Your income is " + income + " dollars.");
		System.out.println("Your tax is " + tax + " dollars.");

	}
}
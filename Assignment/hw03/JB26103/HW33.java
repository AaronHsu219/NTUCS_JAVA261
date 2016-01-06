public class HW33 {
	public static void main(String[] args) {

	int num;
	num = Integer.parseInt(args[0]);

	if (num == 1) {
		System.out.println("The " + num + "st number of fibonacci number is " + fib(num));			
	}
	else if (num == 2) {
		System.out.println("The " + num + "nd number of fibonacci number is " + fib(num));		
	}
	else
	{
		System.out.println("The " + num + "th number of fibonacci number is " + fib(num));		
	}

	}

	static int fib(int n) {
	if (n == 1 || n == 0)
		return (n == 1) ? 1 : 0;
	else
		return fib(n - 1) + fib(n - 2);
	}

}
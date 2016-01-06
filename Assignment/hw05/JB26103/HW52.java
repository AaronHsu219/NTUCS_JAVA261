public class HW52 {
	public static void main(String[] args) {

		String input = "";

		for (int i = 0; i < args.length; i++) {
			input += " " + args[i];
		}

		input = input.trim();

		System.out.println("input: " + input);

		if (input.matches("^(http|https)?://(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$"))
		{
			System.out.print("你輸入的是真實網址!");
		}
		else
		{
			System.out.print("你輸入的不是真實網址!");
		}
	}
}

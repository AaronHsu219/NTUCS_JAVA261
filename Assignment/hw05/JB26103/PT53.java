public class PT53 {
	public static void main(String[] args) {
		
		String input = "";
		for (int i = 0; i < args.length; i++) {
			input += " " + args[i];
		}
		input = input.trim();

		System.out.println("input: " + input);

		if (input.matches("[\\(\\)0-9\\- ]{6,}")) 
		{
			System.out.print("�A��J���O�q�ܸ��X!");
		}
		else
		{
			System.out.print("�A��J�����O�q�ܸ��X!");	
		}
	}
}
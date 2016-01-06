public class pt31 {
	public static void main(String[] args) {

		char blood = 'A';

		switch (blood)
		{
			case 65:
				System.out.println("Your blood type is A.");
				break;
			case 'B':
				System.out.println("Your blood type is B.");
				break;
			case 'O':
				System.out.println("Your blood type is O.");
				break;
			case 'X':
				System.out.println("Your blood type is AB.");
				break;
			default:
		}
	}
}
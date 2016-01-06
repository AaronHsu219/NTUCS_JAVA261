public class Switch2 {
	public static void main (String[] args) {
		int i = 0, j = 0;
		switch(i)
		{
			case 0:
				j += 0;
				break;
			case 2:
				j += 2;
				break;
			case 4:
				j += 4;
				break;
			default:
				j += 6;
		}
		System.out.println("程式執行後，j = " + j);
	}
}
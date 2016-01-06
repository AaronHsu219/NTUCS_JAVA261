public class PT52 {
	public static void main(String[] args) {

		System.out.println("¿é¤J¬°¡G" + args[0]);

		char[] strToChar = args[0].toCharArray();

		for (int i = 0;i < strToChar.length ;  i++)
		{
			strToChar[i] += 1;
		}

		String charToString = new String(strToChar);

		StringBuffer encoded = new StringBuffer(charToString);

		encoded.reverse();

		System.out.println("Encoded: " + encoded);
	}
}

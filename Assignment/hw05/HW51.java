public class HW51 {
	public static void main(String[] args) {

		System.out.println("¿é¤J¬°:" + args[0]);

		char[] strToChar = args[0].toCharArray();

		String newStr = new String(args[0]);
		char[] strToChar2 = newStr.toCharArray();

		// This function is to encode the input string
		encode(strToChar);

		// This function is to decode the input string
		decode(strToChar2);
	}

	public static void encode(char[] str) {
		for (int i = 0;i < str.length ;  i++)
		{
			str[i] += 1;
		}

		String charToString = new String(str);

		StringBuffer encoded = new StringBuffer(charToString);

		encoded.reverse();

		System.out.println("Encoded: " + encoded);
	}

	public static void decode(char[] str) {
		for (int i = 0;i < str.length ;  i++)
		{
			str[i] -= 1;
		}

		String charToString = new String(str);
		StringBuffer decoded = new StringBuffer(charToString);

		decoded.reverse();

		System.out.println("Decoded: " + decoded);

	}
}
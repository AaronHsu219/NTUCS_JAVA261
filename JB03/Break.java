public class Break {
	public static void main (String[] args) {

		int i = 1, j = 5;

		do {

			if(i > j) {
				break;
			}

			j--;
			i++;

		} while (i < 100);

		System.out.println("�{�������Ai = " +i+" �Aj = "+j);
	}
}
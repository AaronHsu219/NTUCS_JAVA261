public class Continue {
	public static void main (String[] args) {

		int i = 1, j = 5;

		do {
			
			if(i < j) {

				j--;

				System.out.println("�{������ɡAi = " + i + " �Aj = " + j);
				
				continue;
			}

			i++;

		} while (i < 5);

		System.out.println("�{�������Ai = " + i +" �Aj = " + j);
	}
}
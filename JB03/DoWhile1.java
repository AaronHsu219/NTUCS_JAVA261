public class DoWhile1 {
	public static void main (String[] args) {
		int i = 1, sum = 0;

		do {
			sum = sum + i;
			i++;//�j�鱱���ܼƭȪ��W�[
		} while (i <= 10);

		System.out.println("�����Gi = " + i + " �Asum = " + sum);
	}
}
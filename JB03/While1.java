public class While1 {
	public static void main (String[] args) {

		int i = 1, sum = 0;

		while (i <= 10){
			sum = sum + i;
			i++;	//�j�鱱���ܼƭȪ��W�[
		}
		System.out.println("�����Gi = " + i + " �Asum = " + sum);
	}
}
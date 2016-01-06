public class For1 {
	public static void main (String[] args) {

		int i, sum = 0;//需要先初始化sum

		for (i = 1; i <= 10; i++) {//注意執行後，i的值
			sum = sum + i;//重複執行的敘述
		}

		System.out.println("執行後：i = " + i + " ，sum = " + sum);
	}
}
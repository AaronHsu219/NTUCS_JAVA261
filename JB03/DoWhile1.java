public class DoWhile1 {
	public static void main (String[] args) {
		int i = 1, sum = 0;

		do {
			sum = sum + i;
			i++;//迴圈控制變數值的增加
		} while (i <= 10);

		System.out.println("執行後：i = " + i + " ，sum = " + sum);
	}
}
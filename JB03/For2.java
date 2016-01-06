public class For2 {
	public static void main (String[] args) {
		int i = 0;//需要先初始化i的值
//i+=2
		for (; i<10; ) {//迴圈敘述中省略了變數初始設定的區塊
			System.out.println("執行時：i = " + i);//觀察i值的變化
		}

		System.out.println("執行後：i = " + i);
	}
}
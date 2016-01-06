import java.util.*;

public class pt43 {
	public static void main(String[] args) {
		int[] math = {50, 65, 80, 48, 35, 93, 57, 90, 86, 77};
		
		showArray(math);//顯示陣列的內容
		Arrays.sort(math);//將array做遞增排序
		showArray(math);//再顯示陣列的內容

		int count = 0;

		for (int element : math) {
			if (element >= 60) {
				count ++;
			}
		}

		int count_fail = math.length - count;

		System.out.println(count + " student passed the exam.");
		System.out.println(count_fail + " student failed the exam.");

	}

		//顯示陣列內容的函式
	static void showArray(int[] array){
		System.out.print("陣列的內容是：");
		// for (int i = 0; i < array.length; i++){
		for (int i = array.length - 1; i >= 0; i--){
			System.out.print(array[i] + " ");
			}

		System.out.println("\n=====================");
	}
}
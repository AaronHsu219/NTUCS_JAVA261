import java.util.*;

public class pt43 {
	public static void main(String[] args) {
		int[] math = {50, 65, 80, 48, 35, 93, 57, 90, 86, 77};
		
		showArray(math);//��ܰ}�C�����e
		Arrays.sort(math);//�Narray�����W�Ƨ�
		showArray(math);//�A��ܰ}�C�����e

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

		//��ܰ}�C���e���禡
	static void showArray(int[] array){
		System.out.print("�}�C�����e�O�G");
		// for (int i = 0; i < array.length; i++){
		for (int i = array.length - 1; i >= 0; i--){
			System.out.print(array[i] + " ");
			}

		System.out.println("\n=====================");
	}
}
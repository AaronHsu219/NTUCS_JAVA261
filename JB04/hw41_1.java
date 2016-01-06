import java.util.*;
public class hw41_1 {
	public static void main(String[] args)
	{
		String[][] fruit = {
			{"apple","1"},
			{"grape","2"},
			{"tomato","3"},
			{"banana","4"},
			{"orange","5"}
		};

		for (int j = 0; j < fruit.length; j++){//重新顯示目前陣列的內容
			System.out.println(fruit[j] + " ");
		}

		// Get fruit
		String myfruit;
		myfruit = args[0];

		Arrays.sort(fruit);
		int at = -1;
		at = Arrays.binarySearch(fruit, myfruit);

		if (at >= 0) {
			System.out.println("Found " + myfruit + "!");
		} else {
			System.out.println("Can't find " + myfruit + "!");
		}
 }
}
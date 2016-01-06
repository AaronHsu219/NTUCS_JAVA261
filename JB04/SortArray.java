import java.util.*;
public class SortArray{
	public static void main(String[] args) {

		int sort[] = {3, 5, 1, 8, 9, 7, 4};

		//顯示陣列的內容
		showArray(sort);

		//不使用Arrays.sort()來排序陣列的內容
		//採用氣泡排序法的設計邏輯，由小排到大
		int temp;

		for (int i= 0; i< sort.length-1; i++){
			for (int j=i+1; j < sort.length; j++){
				if (sort[i] > sort[j]){//改成「<」就是由大排到小了
					temp = sort[i];//以下三行產生資料互換的結果
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}

		showArray(sort);//顯示陣列的內容

		//使用Arrays.sort()來排序陣列的內容
		int sort1[] = {3, 5, 1, 8, 9, 7, 4};//重新定義一個相同的陣列
		showArray(sort1);//顯示陣列的內容
		Arrays.sort(sort1);//將array做遞增排序
		showArray(sort1);//再顯示陣列的內容
	}
	//顯示陣列內容的函式
	static void showArray(int[] array){
		System.out.print("陣列的內容是：");

		for (int i= 0; i< array.length; i++){
			System.out.print(array[i] + " ");
			}

		System.out.println("\n=====================");
	}
}
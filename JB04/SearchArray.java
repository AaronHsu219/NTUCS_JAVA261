import java.util.*;
public class SearchArray
{
	public static void main(String[] args)
	{
		char[] SearchArray= {'A', 'C', 'X', 'W', 'E', 'B'};
		for (int j = 0; j < SearchArray.length; j++){//重新顯示目前陣列的內容
			System.out.print(SearchArray[j] + " ");
		}
		System.out.println();
		//如果要搜尋「C」是否在陣列中
		//不用Arrays.binarySearch作法
		boolean flag = false;
		int i;
		for (i=0; i< SearchArray.length; i++){
			if (SearchArray[i] == 'C'){
				flag = true;
				break;
			}
		}
		if (flag){
			System.out.println("C是在陣列中的第" + (i+1) + " 個位置");
		} else {
			System.out.println("C在陣列中找不到");
		}
		//使用Arrays類別中的binarySearch作法
		Arrays.sort(SearchArray);//將SearchArray做遞增排序
		for (int j = 0; j < SearchArray.length; j++){//重新顯示目前陣列的內容
			System.out.print(SearchArray[j] + " ");
		}
		System.out.println();
		int at = Arrays.binarySearch(SearchArray, 'C');
		System.out.println("C是在陣列中的第" + (at+1) + " 個位置");
	}
}
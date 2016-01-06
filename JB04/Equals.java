import java.util.*;
public class Equals
{
	public static void main(String[] args)
	{
		char[] Array1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		char[] Array2 = {'A', 'B', 'C', 'D', 'E'};
		char[] Array3 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Array1和Array2的內容相同嗎" + (Array1 == Array2));
		System.out.println("Array1和Array3的內容相同嗎" + (Array1 == Array3));

		System.out.println("===================================");
		//如果要判斷兩個陣列的內容是否相同
		//不用Arrays類別的作法
		boolean flag = true;
		if (Array1.length != Array3.length){
			flag = false;
		} else {
			for (int i = 0; i < Array1.length; i++){
				if (Array1[i] != Array3[i]){
					flag = false;
					break;
				}
			}
		}
		if (flag){
			System.out.println("Array1和Array3的內容完全相同");
		} else {
			System.out.println("Array1和Array3的內容不完全相同");
		}

		System.out.println("===================================");
		//如果要判斷兩個陣列的內容是否相同
		//使用Arrays類別中euqals的作法
		flag = Arrays.equals(Array1, Array3);
		if (flag){
			System.out.println("Array1和Array3的內容完全相同");
		} else {
			System.out.println("Array1和Array3的內容不完全相同");
		}
	}
}
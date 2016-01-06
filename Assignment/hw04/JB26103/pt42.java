public class pt42 {
	public static void main(String[] args) {
		int[][] num = {
			{1,7,15},
			{9,3,4},
			{6,8,13},
			{11,5,2},
			{10,7,9}
		};

		int sum = 0;

		for(int[] firstArray : num)//取得第一維陣列的元素
		{
			for(int element : firstArray)//取得第二維陣列的元素
			{
				System.out.print(element + "\t");
				sum += element;
			}
			System.out.println();
		}

		System.out.println("The summation of these numbers is " + sum);
	}
}
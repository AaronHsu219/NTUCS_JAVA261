public class ArrayCopy{
	public static void main(String[] args){
		int[] FirstArray= {1, 2, 3, 4, 5, 6};//宣告一個int陣列，並初始化
		int[] SecondArray= new int[4];//宣告一個int陣列，但未初始化
		int i;

		System.arraycopy(FirstArray, 2, SecondArray, 1, 2);//實際複製FirstArray的內容
		System.out.println("SecondArray的內容為：");
		for(i = 0; i < SecondArray.length; i++) {
			System.out.println(SecondArray[i]);
		}
	}
}
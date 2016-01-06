public class AssignObject{
	public static void main(String[] args){
		int[] FirstArray= {1, 2, 3, 4};//宣告一個int陣列，並初始化
		int[] SecondArray;//宣告一個int陣列，但未初始化
		int i;

		SecondArray= FirstArray;
		System.out.print("最開始FirstArray的內容為：");
		PrintArray(FirstArray);
		System.out.print("最開始SecondArray的內容為：");
		PrintArray(SecondArray);
		FirstArray[2] = 100;//重新指定FirstArray第3個元系的值為100
		System.out.print("改變後FirstArray的內容為：");
		PrintArray(FirstArray);
		System.out.print("改變後SecondArray的內容為：");
		PrintArray(SecondArray);
	}

	static void PrintArray(int[] ArrayName){
		int i;
		for(i = 0; i < ArrayName.length; i++){
			System.out.print(" " + ArrayName[i] + " ");
		}
		System.out.println();
	}
}
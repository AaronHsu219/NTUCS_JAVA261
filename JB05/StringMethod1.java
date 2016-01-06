public class StringMethod1 {
	public static void main(String[] args) {
		String str= "字串的操作ABc";//宣告String物件，並指定內容
		int i;
		int slength= str.length();
		System.out.println("str字串的長度為：" + slength);
		char[] tmpChar= str.toCharArray();//將str轉換為char陣列
		System.out.print("tmpChar陣列的內容為：");
		for (i = 0; i < tmpChar.length; i++){
			System.out.print(tmpChar[i]);
		}
		System.out.println();
		byte[] tmpByte= str.getBytes();//將str轉換為byte陣列
		System.out.print("tmpByter陣列的內容為：");
		for (i = 0; i < tmpByte.length; i++){
			System.out.print(tmpByte[i] + " ");//注意到每個中文字佔兩個byte
		}
		System.out.println();
		String tmpLower= str.toLowerCase();//將字串中的英文字轉為小寫
		System.out.println("英文字轉為小寫後的內容：" + tmpLower);
		String tmpUpper= str.toUpperCase();//將字串中的英文字轉為大寫
		System.out.println("英文字轉為大寫後的內容：" + tmpUpper);
	}
}
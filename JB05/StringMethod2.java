public class StringMethod2 {
	public static void main(String[] args) {
		String str= "字串的操作ABc，字串方法的使用";//宣告String物件，並指定內容
		int i;
		System.out.println("str字串的內容是：" + str);
		i = 2;//設定index的值為2
		char find = str.charAt(i);//找出第三個字
		System.out.println("str字串的第三個字為：" + find);
		String findStr= "字串";//設定需要搜尋的字串內容
		i = str.indexOf(findStr);//找尋「字串」的位置
		System.out.println("「字串」在str中的第一個出現的位置是：" + i);
		i = str.lastIndexOf(findStr);//找尋「字串」最後出現的位置
		System.out.println("「字串」在str中的最後一個出現的位置是：" + i);
		findStr= "Java";//重新設定字串的內容
		i = str.indexOf(findStr);//找尋「Java」的位置，這次找不到
		System.out.println("「Java」在str中的第一個出現的位置是：" + i);
	}
}
public class BuildString{
	public static void main(String[] args) {

		//使用字串常數建立字串
		String str1 = new String("第一個字串");
		System.out.println(str1);

		//使用字元陣列建立字串
		char[] c = {'第', '二' , '個', '字', '串'};
		String str2 = new String(c);
		System.out.println(str2);

		//將字串常數指定給字串物件
		String str3 = "第三個字串";
		System.out.println(str3);
	}
}
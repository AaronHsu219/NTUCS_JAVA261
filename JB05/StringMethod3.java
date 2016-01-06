public class StringMethod3 {
	public static void main(String[] args){
		String str= " 枯藤，老樹，昏鴉，";//宣告String物件，並指定內容
		String resultStr;
		System.out.println("str字串的內容是：" + str);
		resultStr= str.trim();//將原字串前後的空白刪除
		System.out.println("====將字串的前後空白清除=======");
		System.out.println(" 新字串的內容是：" + resultStr+ "\n");
		String addStr= "小橋，流水，人家";
		System.out.println("====將原字串再連接新的字串=======");
		resultStr= resultStr.concat(addStr);//再連接一組字串
		System.out.println("連接後，字串的內容是：" + resultStr+ "\n");
		System.out.println("====取出原字串第4個字開始的內容=======");
		String tmpStr= resultStr.substring(3);//取出第4個字(含)之後的所有內容
		System.out.println("取出後，新字串的內容是：" + tmpStr+ "\n");
		System.out.println("====取出原字串第4，5個字的內容=======");
		tmpStr= resultStr.substring(3, 5);//取出第4~5位置個字(含)之後的所有內容
		System.out.println("取出後，新字串的內容是：" + tmpStr+ "\n");
		System.out.println("====將字串中的「，」取代為「。」=======");
		tmpStr= resultStr.replace("，", "。");
		System.out.println("取代後，新字串的內容是：" + tmpStr+ "\n");
		String[] splitStr;
		System.out.println("====在原字串中的「。」位置，分成字串陣列=======");
		splitStr= tmpStr.split("。");
		int i;
		for(i = 0; i < splitStr.length; i++){
			System.out.println(splitStr[i]);
		}
	}
}
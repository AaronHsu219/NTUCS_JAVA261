public publicclass CheckPersonalID
{
	public static void main(String[] args)
	{
		booleancheck = false;
		String input = args[0];
		if (input.matches("[a-zA-Z]{1}[0-9]{9}")) {
			check = checkPID(input);
		}
		if (check) { System.out.println("身份證字號正確！"); }
		else { System.out.println("身份證字號錯誤！請檢查看看！"); }
	}
	public static booleancheckPID(String input)
	{
		// 第一個字母對應的數字表
		int[] num= {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33};
		// 把第一個字母轉成大寫
		String inputToUpper= input.toUpperCase();
		byte[] idToByte= inputToUpper.getBytes();
		int[] idToCount= new int[idToByte.length+ 1];
		// 處理第一個字
		intfirstChar= num[idToByte[0] -65]; // 取出第一個字母對應的數字
		idToCount[0] = (int)Math.floor(firstChar/ 10); // 第一個字母的第一個數字
		idToCount[1] = (firstChar% 10); // 第一個字母的第二個數字
		// 第一個數字開始及以後的數字
		for (inti =1; i < idToByte.length; i++) {
			idToCount[i+1] = (idToByte[i] -48);
		}
		// 開始計算總和
		inttotal = idToCount[0];
		for (inti = 1; i < idToCount.length-1; i++) {
			total += (idToCount[i] * (10 -i));
		}
		// 決定回傳值
		if (idToCount[idToCount.length-1] == 0 && (total % 10) == 0) { return true; } // 最後一碼為0 且total % 10 也為0
		else { return (idToCount[idToCount.length-1] == (10 -(total % 10))) ? true : false; } // 最後一碼不為0 時要用10 –total % 10
	}
}
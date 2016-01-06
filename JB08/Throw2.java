class MyExceptionextends Exception{
	private intvalue;
	MyException(int value){
		this.value= value;
	}
	public String toString(){
		String s ="本程式執行無效\n" +
			"錯誤代碼為" + value + " \n" +
			"請將此代碼告知管理人員\n";
		return s;
	}
}

public static void tryToCalculates(int x, int y){
	if (y == 0){
		try{
			throw new MyException(0);
		} catch(MyExceptione){
			System.out.println(e.toString());
		}
	} else {
		System.out.println("結果為: " + x / y);
	}
}

public class Throw2{
	public static void main (String[] args) {
		tryToCalculates(10, 0);
		tryToCalculates(10, 2);
	}
}
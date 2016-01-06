public class Throws2 {
	public static void main(String[] args){
		// tryToAccess();
		try{
			tryToAccess();
		} catch(IOException e) {}

		System.out.println("程式執行結束");
	}


	public static void tryToAccess() throws IOException{
		System.out.println("嘗試使用Method");
	}

	// public static void tryToAccess() {
	// 	throws IOException{
	// 		System.out.println("嘗試使用Method");
	// 	}
	// }
}
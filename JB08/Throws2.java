public class Throws2 {
	public static void main(String[] args){
		// tryToAccess();
		try{
			tryToAccess();
		} catch(IOException e) {}

		System.out.println("�{�����浲��");
	}


	public static void tryToAccess() throws IOException{
		System.out.println("���ըϥ�Method");
	}

	// public static void tryToAccess() {
	// 	throws IOException{
	// 		System.out.println("���ըϥ�Method");
	// 	}
	// }
}
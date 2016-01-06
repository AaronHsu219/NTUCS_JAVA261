public class Try1 {
	public static void main (String[] args){
		int i;

		String showName[] = {"Alex","Ivy","Fanny"};

		try{
			for (i=0; i<4; i++){
				System.out.println(showName[i]);
			}
		// } catch (ArrayIndexOutOfBoundsException e){
		// 	System.out.println(e.toString());
		// 	System.out.println("陣列索引超範圍");
		} catch (Exception e){
			System.out.println("其餘的錯誤" + e.getMessage());
		}
		System.out.println("程式執行結束");
	}
}
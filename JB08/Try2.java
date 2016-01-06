public class Try2 {
	public static void main(String[] args){
		int i, j, result;

		i = 100;
		j = 0;

		try{
			result = i / j;
		} catch (ArithmeticException e){
			System.out.println("除數不得為零");
		} catch (Exception e){
			System.out.println("其餘的錯誤");
		} finally {
			System.out.println("執行finally區段");
		}
		System.out.println("程式執行結束");
	}
}
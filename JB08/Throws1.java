public class Throws1 {
	public static void main(String[] args){
		int a = 10, b = 0;
		double result = 0;
		try{
			result = calculate(a, b);
		} catch (ArithmeticException e){
			System.out.println("除數不得為零");
		} catch (Exception e){
			System.out.println("其他的例外");
		}
		System.out.println("result的值為：" + result);
		System.out.println("程式執行結束");
	}

	public static double calculate(int i, int j) throws ArithmeticException{
		return i/j;
	}
}
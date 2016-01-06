public class Throw1{
	public static void main(String[] args) {
		tryToCalculate(10, 0);
		tryToCalculate(10, 2);
	}

	public static void tryToCalculate(int x, int y) {
		if (y == 0) {
			try{
				throw new Exception("Divided by Zero!!!");
			}catch (Exception e){
				System.out.println(e.toString());
			}
		} else {
			System.out.println("The Result is : " + x / y);
		}
	}
}
public class Throws1 {
	public static void main(String[] args){
		int a = 10, b = 0;
		double result = 0;
		try{
			result = calculate(a, b);
		} catch (ArithmeticException e){
			System.out.println("���Ƥ��o���s");
		} catch (Exception e){
			System.out.println("��L���ҥ~");
		}
		System.out.println("result���Ȭ��G" + result);
		System.out.println("�{�����浲��");
	}

	public static double calculate(int i, int j) throws ArithmeticException{
		return i/j;
	}
}
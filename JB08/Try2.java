public class Try2 {
	public static void main(String[] args){
		int i, j, result;

		i = 100;
		j = 0;

		try{
			result = i / j;
		} catch (ArithmeticException e){
			System.out.println("���Ƥ��o���s");
		} catch (Exception e){
			System.out.println("��l�����~");
		} finally {
			System.out.println("����finally�Ϭq");
		}
		System.out.println("�{�����浲��");
	}
}
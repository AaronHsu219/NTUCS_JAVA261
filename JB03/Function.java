public class Function {
	public static void main (String []args) {
		double result;

		System.out.println("�p��ꭱ�n��Java�{��------");

		result = CArea(2); //�I�s�禡�A�öǤJ�b�|��2

		System.out.println("�ꪺ���n�O�G" + result);
	}

	static double CArea(int r){
		double a;

		System.out.println("�ꪺ�b�|�O�G" + r);
		a = 3.14 * r * r;
		return a;
	}

}
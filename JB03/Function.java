public class Function {
	public static void main (String []args) {
		double result;

		System.out.println("計算圓面積的Java程式------");

		result = CArea(2); //呼叫函式，並傳入半徑為2

		System.out.println("圓的面積是：" + result);
	}

	static double CArea(int r){
		double a;

		System.out.println("圓的半徑是：" + r);
		a = 3.14 * r * r;
		return a;
	}

}
public class Convert1
{
	public static void main(String[] args)
	{
		intsalary = 25000;//定義整數變數，代表月薪;
		float tax = 0.06F;//定義變數，代表稅率為6%
		double amount;//繳稅總額

		amount = salary * 12 * tax;
		System.out.println( "繳稅的總額為："+ amount );
	}
}
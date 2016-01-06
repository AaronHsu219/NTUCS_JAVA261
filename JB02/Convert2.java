public class Convert2
{
	public static void main(String[] args)
	{
		intamount, salary = 12000;//設定「總額」變數為「int」型別
		double tax = 0.06;//設定「稅額」為6%

		amount = (int) (salary * 12 * tax);//進行Explicit Casting
		System.out.println( "繳稅的總額為："+ amount );
	}
}
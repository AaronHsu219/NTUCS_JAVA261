public class Convert3
{
	public static void main(String[] args)
	{
		short value1 = 3000;//設定「short」變數，值為「3000」
		short value2 = 3000;
		short value3;

		value3 = value1 * value2 / 3000;//進行Implicit Casting
		System.out.println( "計算結果為："+ value3 );
	}
}
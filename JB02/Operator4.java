public class Operator4
{
	public static void main(String[] args)
	{
		intx = 2, y = 1;
		inta = 2, b = 1;

		//判斷「&」和「&&」的不同
		System.out.println( "(x>3) & (y++>0)的執行結果為"+ ((x>3) & (y++>0)) );
		System.out.println( "執行後，x = " + x + " y = " + y );
		System.out.println( "(a>3) && (b++>0)的執行結果為"+ ((a>3) && (b++>0)) );
		System.out.println( "執行後，a = " + a + " b = " + b);

		//判斷「|」和「||」的不同
		System.out.println( "---------------------------------" );
		intx1 = 2, y1 = 1;
		inta1 = 2, b1 = 1;
		System.out.println( "(x1<3) | (y1++>0)的執行結果為"+ ((x1<3) | (y1++>0)) );
		System.out.println( "執行後，x1 = " + x1 + " y1 = " + y1 );
		System.out.println( "(a1<3) || (b1++>0)的執行結果為"+ ((a1<3) || (b1++>0)) );
		System.out.println( "執行後，a1 = " + a1 + " b1 = " + b1);
	}
}
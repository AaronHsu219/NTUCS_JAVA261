public class Operator3
{
	public static void main(String[] args)
	{
		intx = 2, y = 1, z = 3;

		//x > 2為false，y > 0為true，「&」運算後變成false
		System.out.println( "( x > 2 ) & ( y > 0 )的執行結果為"+ (( x > 2 ) & ( y > 0 )));

		//x > y為true，y > z為false，「|」運算後變成true
		System.out.println( "( x > y ) | ( y > z )的執行結果為"+ (( x > y ) | ( y > z )));

		//x > y為true，「!」運算後變成false
		System.out.println( "!( x > y )的執行結果為"+ ( !( x > y )));

		//x > y為true，y > z為false，「^」運算後變成true
		System.out.println( "( x > y ) ^ ( y > z )的執行結果為"+ (( x > y ) ^ ( y > z )));
	}
}
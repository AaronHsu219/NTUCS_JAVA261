public class Nest {
	public static void main (String[] args) {

		int x = 10, y = 20, z = 30;
		boolean a, b;

		a = x > y;
		b = z > y;

		if( a )
		{
			System.out.println( "a的值為「true」" );
		}
		else if ( a && b )
		{
			System.out.println( "a&&b的值為「true」" );
		}
		else
		{
			if ( !b )
			{
				System.out.println( "not b" );
			}
			else
			{
				System.out.println( "ELSE" );
			}
		}
	}
}
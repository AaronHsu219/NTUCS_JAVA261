public class Nest {
	public static void main (String[] args) {

		int x = 10, y = 20, z = 30;
		boolean a, b;

		a = x > y;
		b = z > y;

		if( a )
		{
			System.out.println( "a���Ȭ��utrue�v" );
		}
		else if ( a && b )
		{
			System.out.println( "a&&b���Ȭ��utrue�v" );
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
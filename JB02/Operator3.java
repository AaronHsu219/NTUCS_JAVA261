public class Operator3
{
	public static void main(String[] args)
	{
		intx = 2, y = 1, z = 3;

		//x > 2��false�Ay > 0��true�A�u&�v�B����ܦ�false
		System.out.println( "( x > 2 ) & ( y > 0 )�����浲�G��"+ (( x > 2 ) & ( y > 0 )));

		//x > y��true�Ay > z��false�A�u|�v�B����ܦ�true
		System.out.println( "( x > y ) | ( y > z )�����浲�G��"+ (( x > y ) | ( y > z )));

		//x > y��true�A�u!�v�B����ܦ�false
		System.out.println( "!( x > y )�����浲�G��"+ ( !( x > y )));

		//x > y��true�Ay > z��false�A�u^�v�B����ܦ�true
		System.out.println( "( x > y ) ^ ( y > z )�����浲�G��"+ (( x > y ) ^ ( y > z )));
	}
}
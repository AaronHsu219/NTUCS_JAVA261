public class Operator4
{
	public static void main(String[] args)
	{
		intx = 2, y = 1;
		inta = 2, b = 1;

		//�P�_�u&�v�M�u&&�v�����P
		System.out.println( "(x>3) & (y++>0)�����浲�G��"+ ((x>3) & (y++>0)) );
		System.out.println( "�����Ax = " + x + " y = " + y );
		System.out.println( "(a>3) && (b++>0)�����浲�G��"+ ((a>3) && (b++>0)) );
		System.out.println( "�����Aa = " + a + " b = " + b);

		//�P�_�u|�v�M�u||�v�����P
		System.out.println( "---------------------------------" );
		intx1 = 2, y1 = 1;
		inta1 = 2, b1 = 1;
		System.out.println( "(x1<3) | (y1++>0)�����浲�G��"+ ((x1<3) | (y1++>0)) );
		System.out.println( "�����Ax1 = " + x1 + " y1 = " + y1 );
		System.out.println( "(a1<3) || (b1++>0)�����浲�G��"+ ((a1<3) || (b1++>0)) );
		System.out.println( "�����Aa1 = " + a1 + " b1 = " + b1);
	}
}
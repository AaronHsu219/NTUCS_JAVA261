public class Convert2
{
	public static void main(String[] args)
	{
		intamount, salary = 12000;//�]�w�u�`�B�v�ܼƬ��uint�v���O
		double tax = 0.06;//�]�w�u�|�B�v��6%

		amount = (int) (salary * 12 * tax);//�i��Explicit Casting
		System.out.println( "ú�|���`�B���G"+ amount );
	}
}
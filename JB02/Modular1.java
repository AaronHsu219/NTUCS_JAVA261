public class Modular1
{
	public static void main(String[] args)
	{
		byte value1 = 127;//設定「byte」變數
		byte value2;

		//127+1後已超過Byte所能容納的範圍了
		value2 = (byte) (value1 + 1);
		System.out.println( "計算結果為："+ value2 );
	}
}
 /*
 ***********************************************************************
 *�w�s�t�νm�� HW81.java
 ***********************************************************************
 *���]���@�Ӯw�s�t�ΡA�b�s�f���O���B�z�譱�A�w�s���p��i��|����ҥ~���A�G
 *�@�جO�w�s�ƶq�p��0(NegativeStockException)
 *�t�@�جO�ݭn���X���f�~�ƶq�j��w�s�q(ShortStockExctpion)
 *�г]�p�W�z��Өҥ~���O�A�èϥ�throw�Ӵ��ըҥ~�C
 ***********************************************************************
 */
import java.io.*;

public class HW81
{
	public static void main(String[] args)
	{
		// �ǳƨ���ܼƨӦs��w�s�P�ݨD�q
		int stocks = 0;
		int required = 0;

		// �� BufferedReader �����ϥΪ̿�J�����
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		try
		{
			// �Ĥ@�ӰѼƷ��w�s�q
			System.out.print("�п�J�w�s�q�G");
			stocks = Integer.parseInt(br.readLine());

			// �ĤG�ӰѼƷ��ݨD�q
			System.out.print("�п�J�ݨD�q�G");
			required = Integer.parseInt(br.readLine());
		}

		// BufferedReader ���i��y���� IOException (br.readLine())
		catch(IOException e)
		{
			System.out.println("IO�ҥ~�I" + e.getMessage());
		}
		// Integer.parseInt ���i��y���� NumberFormatException
		catch(NumberFormatException e)
		{
			System.out.println("�Ʀr�榡�ҥ~�I" + e.getMessage());
		}
		// �Y�o�ͨ�L�ҥ~�A�h�ᵹ�������O�B�z
		catch(Exception e)
		{
			System.out.println("��L�w���H�~�����~�I" + e.getMessage());
		}

		// ��w�s�q�p��0�A�h��X�ۭq�ҥ~���O - NegativeStockException
		if (stocks < 0)
		{
			try
			{
				throw new NegativeStockException(stocks);
			}
			catch (NegativeStockException e)
			{
				System.out.println(e.toString());
			}
		}
		// ��ݨD�q�j��w�s�q�A�h��X�ۭq�ҥ~���O - ShortStockException
		else if(required > stocks)
		{
			try
			{
				throw new ShortStockException(required, stocks);
			}
			catch (ShortStockException e)
			{
				System.out.println(e.toString());
			}
		}
		// �Y�W�z���ҥ~���S���o�͡A�h���榨�\
		else
		{
			System.out.println("���榨�\�A�ݨD�q("+ required +")�A�w�s�q("+ stocks +")");
		}
	}
}

// �ۭq�ҥ~���O - ��w�s�ƶq�p��0
class NegativeStockException extends Exception
{
	private int stocks;

	NegativeStockException(int stocks)
	{
		this.stocks = stocks;
	}

	public String toString()
	{
		String s="�w�s�q���o�p��0�A�A���w�s�q��" + stocks;
		return s;
	}
}

// �ۭq�ҥ~���O - ���X���f�~�ƶq�j��w�s�q
class ShortStockException extends Exception
{
	private int required;
	private int stocks;

	ShortStockException (int required, int stocks)
	{
		this.required = required;
		this.stocks = stocks;
	}

	public String toString()
	{
		String s="�w�s�q("+ stocks +")�p��A�Ҵ��X���ݨD�q("+ required +")";
		return s;
	}
}
 /*
 ***********************************************************************
 *庫存系統練習 HW81.java
 ***********************************************************************
 *假設有一個庫存系統，在存貨類別的處理方面，庫存的計算可能會有兩例外狀態：
 *一種是庫存數量小於0(NegativeStockException)
 *另一種是需要提出的貨品數量大於庫存量(ShortStockExctpion)
 *請設計上述兩個例外類別，並使用throw來測試例外。
 ***********************************************************************
 */
import java.io.*;

public class HW81
{
	public static void main(String[] args)
	{
		// 準備兩個變數來存放庫存與需求量
		int stocks = 0;
		int required = 0;

		// 用 BufferedReader 接收使用者輸入的資料
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		try
		{
			// 第一個參數當做庫存量
			System.out.print("請輸入庫存量：");
			stocks = Integer.parseInt(br.readLine());

			// 第二個參數當做需求量
			System.out.print("請輸入需求量：");
			required = Integer.parseInt(br.readLine());
		}

		// BufferedReader 中可能造成的 IOException (br.readLine())
		catch(IOException e)
		{
			System.out.println("IO例外！" + e.getMessage());
		}
		// Integer.parseInt 中可能造成的 NumberFormatException
		catch(NumberFormatException e)
		{
			System.out.println("數字格式例外！" + e.getMessage());
		}
		// 若發生其他例外，則丟給父親類別處理
		catch(Exception e)
		{
			System.out.println("其他預期以外的錯誤！" + e.getMessage());
		}

		// 當庫存量小於0，則丟出自訂例外類別 - NegativeStockException
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
		// 當需求量大於庫存量，則丟出自訂例外類別 - ShortStockException
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
		// 若上述的例外都沒有發生，則執行成功
		else
		{
			System.out.println("執行成功，需求量("+ required +")，庫存量("+ stocks +")");
		}
	}
}

// 自訂例外類別 - 當庫存數量小於0
class NegativeStockException extends Exception
{
	private int stocks;

	NegativeStockException(int stocks)
	{
		this.stocks = stocks;
	}

	public String toString()
	{
		String s="庫存量不得小於0，你的庫存量為" + stocks;
		return s;
	}
}

// 自訂例外類別 - 提出的貨品數量大於庫存量
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
		String s="庫存量("+ stocks +")小於你所提出的需求量("+ required +")";
		return s;
	}
}
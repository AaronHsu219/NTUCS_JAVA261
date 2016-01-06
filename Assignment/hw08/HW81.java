import java.io.*;

public class HW81 {
	public static void main(String[] args) throws IOException {

		// int stock;
		// int sell;

		// 使用 InputStreamReader 類別，接收使用者鍵盤輸入的資訊
		InputStreamReader ir = new InputStreamReader(System.in);

		// 再使用 BufferedReader 類別將使用者鍵盤輸入的資訊放置在緩衝區中
		BufferedReader br = new BufferedReader(ir);

		System.out.print("請輸入庫存量:");
		int stock = Integer.parseInt(br.readLine());

		System.out.print("請輸入需求量:");
		int sell = Integer.parseInt(br.readLine());

		// checkInput(stock, sell);

		if (stock < 0) {
			try {
				throw new NegativeStockException(0);
			} catch (NegativeStockException e) {
				System.out.println(e.toString());
			}
		} else if (stock < sell) {
			try {
				throw new ShortStockExctpion(0);
			} catch (ShortStockExctpion e) {
				System.out.println(e.toString());
			}
		} else {
			System.out.println("Input OK!");
		}
	}
}

class NegativeStockException extends Exception {
	private int value;
	NegativeStockException (int value){
		this.value = value;
	}
	public String toString(){
		String s = "庫存數量不得小於0!";
		return s;
	}
}

class ShortStockExctpion extends Exception {
	private int value;
	ShortStockExctpion (int value){
		this.value = value;
	}
	public String toString(){
		String s = "需要提出的貨品數量不得大於庫存量!";
		return s;
	}
}
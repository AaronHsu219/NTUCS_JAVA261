import java.io.*;

public class HW82 {
	public static void main(String[] args) throws IOException {

		String name; 		//儲存姓名的資料
		float premium; 	//代表銀行存款的本金數額
		float iRate; 		//代表銀行的存款利率
		float interest;
		float total;

		// 使用 InputStreamReader 類別，接收使用者鍵盤輸入的資訊
		InputStreamReader ir = new InputStreamReader(System.in);

		// 再使用 BufferedReader 類別將使用者鍵盤輸入的資訊放置在緩衝區中
		BufferedReader br = new BufferedReader(ir);

		// 詢問使用者姓名，再將使用者輸入的資訊存到 name (String) 變數中
		System.out.print("請輸入姓名：");
		name = br.readLine();

		// 詢問使用者年齡，再將使用者輸入的資訊存到 age (int) 變數中
		System.out.print("請輸入本金：");
		premium = Float.parseFloat(br.readLine());

		// 詢問使用者性別，假設輸入可能為 M 或 F，存進 gender (String) 變數中
		System.out.print("請輸入利率：");
		iRate = Float.parseFloat(br.readLine());

		interest = premium * iRate;

		total = premium + interest;

		System.out.println("Hi "+ name +" 你好");
		System.out.println("您的本金是 "+ premium + " 元整");
		System.out.println("利率是 "+ iRate);
		System.out.println("一年的利息是 "+ interest + " 元");
		System.out.println("本金加利息是 "+ total + " 元");
	}
}
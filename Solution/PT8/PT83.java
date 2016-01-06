/*
 ***********************************************************************
 *檔案輸出入練習 PT83.java
 ***********************************************************************
 *假定某位學生的紀錄如下：
 *姓名：name，字串型態，值為「Alex」
 *數學成績：mathRecord，int型態，值為「95」
 *國文成績：chnRecord，int型態，值為「90」
 *英文成績：engRecord，int型態，值為「94」
 *請建構串流物件out，並將該筆記錄寫入「record.txt」檔案中，
 *再將「record.txt」檔案的內容讀出，並顯示在螢幕上
 ***********************************************************************
 */

import java.io.*;

class PT83
{
	// 記得要開關檔都得做 checked exception 的處理
	public static void main(String[] args) throws IOException
	{
		// 定義要寫入的資料
		String name = "Alex";
		int mathRecord = 95;
		int chnRecord = 90;
		int engRecord = 94;

		/*String name = "Bill";
		int mathRecord = 70;
		int chnRecord = 80;
		int engRecord = 90;*/

		// 利用 FileOutputStream 開啟一個檔案串流 record.txt
		FileOutputStream fos = new FileOutputStream("record.txt");

		// 再利用 DataOutputStream 處理檔案串流中的資料 (以位元為單位)
		DataOutputStream dos = new DataOutputStream(fos);

		// 定義要寫入檔案內的資料
		String writeTo = name + "\t" + mathRecord + "\t" + chnRecord + "\t" + engRecord;

		// 利用 write() 方法寫入檔案，但因為 dos 是位元串流
		// 因此在此記得使用 getBytes() 方法把字串轉位元 (第五章)
		dos.write(writeTo.getBytes());

		dos.close();
		fos.close();

		System.out.println("寫入完成！");

		// 同寫入部份，用 FileInputStream / DataInputStream 處理讀入的檔案
		FileInputStream fis = new FileInputStream("record.txt");
		DataInputStream dis = new DataInputStream(fis);

		// 將讀入的 dis 存入某一個位元陣列中
		byte[] data = new byte[dis.available()];

		// readFully 的方法可以一次將檔案內容全部讀入
		// 也可使用 while(i = dis.read() != -1) 的迴圈來讀入
		dis.readFully(data);

		dis.close();
		fis.close();

		// 將資料印出，印出時把位元陣列轉回 String 方便檢查
		System.out.println(new String(data));
	}
}
/*
 *繪圖練習 PT92.java
 *請利利用 Image 元件在畫布上繪製一個圖片，同時在下方使用 Font 元件繪製一個說明文字
 */

import java.awt.*;
import javax.swing.*;

// 主類別繼承自 JFrame 類別，讓主程式直接變成一個視窗元件
public class PT92 extends JFrame
{

	public static void main(String[] args)
	{
		// 在 main() 中將主類別實體化出來
		new PT92();
	}

	// 建構子中設定好視窗的相關屬性
	public PT92()
	{
		// 呼叫 super() 建構子 (即 Jframe 的建構子)，將視窗標題寫入 Jframe 中
		super("PT102");

		// 設定大小、可見度、背景顏色與關閉視窗的基本屬性
		setSize(500, 250);
		setVisible(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 覆寫 paint() 方法
	public void paint(Graphics g)
	{
		// 設定字體、字型樣式與字級大小
		g.setFont(new Font("微軟正黑體", Font.BOLD, 20));

		// 畫出該字體出來在 50, 200 的位置
		g.drawString("台大 Logo", 50, 200);

		// 讀入影像 - 使用 Toolkit.getDefaultToolkit().getImage() 取得影像來源
		Image img = Toolkit.getDefaultToolkit().getImage("ntu.jpg");

		// 將影像繪製在容器中 50,50 的地方
		g.drawImage(img, 50, 50, this);
	}
}

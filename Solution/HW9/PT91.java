/*
 *視窗程式練習 PT91.java
 *請利用任何一種 Layout，同時把文字標籤和按鈕兩種元件排列在其中，
 *並建立在一個 Swing 視窗之中
 **/

// 視窗程式別忘記 import AWT 與 Swing 兩個主要套件
// 其中 Swing 套件是放在 javax 套件中！
import javax.swing.*;
import java.awt.*;

public class PT91
{
	public static void main(String[] args)
	{
		// 建立一個  jFrame (Swing 主要視窗元件)
		// 建構子為視窗名稱
		JFrame frame = new JFrame("PT91");

		// 取得該視窗元件的容器元件，因為所有元件皆需放置在容器中
		Container c=frame.getContentPane();

		// 設定視窗 layout，此時使用 null 表示自訂大小及位置
		c.setLayout(null);

		// 製作一個 JLabel 標籤元件 lb
		JLabel lb = new JLabel("標籤元件");

		// 定義大小為寬 240、高 40 (單位皆為 pixel)
		lb.setSize(240,40);

		// 定義位置出現在視窗中的 X 軸 10、Y 軸 20 的地方
		lb.setLocation(10,20);

		// 將定義好的 lb 放到容器中
		c.add(lb);

		// 製作 JButton 按鈕元件 jbt
		JButton jbt = new JButton("按鈕元件");

		// 定義大小為寬 100、高 40
		jbt.setSize(100,40);

		// 定義出現位置在視窗中的 X 軸 10、Y 軸 70 的地方
		jbt.setLocation(10,70);

		// 將定義好的 jbt 放到容器中
		c.add(jbt);

		// 定義視窗大小為 300*200 pixel
		frame.setSize(300,200);

		// 讓視窗出現在畫面中
		frame.setVisible(true);

		// 設定關閉視窗時同時結束 JVM 工作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

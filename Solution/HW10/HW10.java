/*
***********************************************************************
 *進階版的塗鴉板 6HW10.java
 ***********************************************************************
 *具有功具選單：
 *至少三種筆刷顏色 (例：紅綠藍)、關閉視窗的按鈕
 *具有右鍵選單：
 *可設定背景顏色至少兩種 (例：黑白)、可清除目前的畫筆筆跡
 *按下關閉按鈕時會確認是否要關閉程式
 **/

// 需要的套件：swing、AWT、awt 的子套件 event (事件處理)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 主類別直接繼承 JFrame 讓自己成為一個視窗類別
// 實作 ActionListener 對應 actionPerformed() 方法處理 JButton 的 trigger
// 實作 MouseMotionListener 對應 mouseMoved() 與 mouseDragged 方法來處理塗鴉功能
public class HW10 extends JFrame implements ActionListener, MouseMotionListener
{
	// 把所需要的資料結構準備好
	private Container c;								// 整個視窗容器
	private JPopupMenu pm;								// 右鍵出現的彈出選單
	private JMenuItem mi1, mi2, mi3;					// 右鍵選單中可點選的項目
	private JToolBar jtb;								// 上方工具列選單
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, exit;	// 上方工具列選單中的筆刷色彩按鈕
	//private JButton[] bt = new JButton[7];

	private int px, py, px2, py2;						// px,py 繪圖起始點座標；px2,py2 繪圖結束點座標
	private int cr, cg, cb;								// 把 RGB 做成變數方便更換筆刷色彩
	private Graphics g;									// 繪圖類別 Graphics

	// 主類別建構子
	public HW10()
	{
		// 由於繼承 JFrame 類別，呼叫父類別建構子等同執行 JFrame() 建構子，即設定視窗標題
		super("HW10");
		// 取得 JFrame 容器物件
		c = getContentPane();
		// 將背景畫布設定為白色
		c.setBackground(Color.white);
		// 將主類別 (整個視窗) 加入 addMouseMotionListener 讓它可以被傾聽滑鼠移動、拖曳事件
		addMouseMotionListener(this);

		// 開始製作上方工具列選單
		jtb = new JToolBar();
		// 加入黃色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt1 = new JButton("黃筆");
		bt1.addActionListener(this);
		jtb.add(bt1);

		// 加入綠色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt2 = new JButton("綠筆");
		bt2.addActionListener(this);
		jtb.add(bt2);

		// 加入紅色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt3 = new JButton("紅筆");
		bt3.addActionListener(this);
		jtb.add(bt3);

		// 加入藍色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt4 = new JButton("藍筆");
		bt4.addActionListener(this);
		jtb.add(bt4);

		// 加入黑色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt5 = new JButton("黑筆");
		bt5.addActionListener(this);
		jtb.add(bt5);

		// 加入白色筆刷、並將它加入事件傾聽中，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		bt6 = new JButton("白筆");
		bt6.addActionListener(this);
		jtb.add(bt6);

		// 加入關閉視窗按鈕，當使用者點下時可觸發 actionPerformed() 事件，做完後加到上方工具列選單中
		exit = new JButton("關閉");
		exit.addActionListener(this);
		jtb.add(exit);

		// 將整個上方工具列選單加到容器中
		c.setLayout(new BorderLayout());
		c.add(jtb, BorderLayout.NORTH);

		// 開始製作右鍵彈出選單 ================================================
		pm = new JPopupMenu();

		// 加入第一個選項 (但非物件，所以無法加入傾聽事件)
		pm.add("選擇背景顏色：");
		// 加入一個分隔線
		pm.addSeparator();

		// 開始加入可被傾聽的物件，首先是將背景變白色的選項，加完後把物件加入事件傾聽中
		mi1 = new JMenuItem("白色");
		mi1.addActionListener(this);
		pm.add(mi1);

		// 再加入可被傾聽的物件，將背景變黑色的選項，加完後把物件加入事件傾聽中
		pm.add(mi2 = new JMenuItem("黑色"));
		mi2.addActionListener(this);

		// 再加入一個分隔線
		pm.addSeparator();

		// 加入最後可被傾聽的物件，將畫面清除重畫的選項，加完後把物件加入事件傾聽中
		pm.add(mi3 = new JMenuItem("清除重畫"));
		mi3.addActionListener(this);

		// ==============================================================================================
		// 右鍵選單的傾聽事件是當滑鼠按下右鍵的時候
		// 但實作 MouseListener 介面的話需實作五個方法，在此只需要其中一個，因此使用 MouseAdapter
		// 此處是直接建立一個匿名類別，讓它繼承 MouseAdapter，再改寫匿名類別中的 mouseClicked() 方法
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				// 在 mouseClicked() 事件中判斷，若使用者按下的是右鍵 (isMetaDown())
				if (e.isMetaDown())
				{
					// 若是右鍵則使用 JPopupMenu 中的 show 方法把選單顯示出來
					// e.getComponent() 讓選單出現在呼叫它的元件中
					// 以本例來說是出現在 Container 中，出現的位置是滑鼠的座標旁，因此用 getX() 與 getY() 取得座標
					pm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}

	// 實作 actionPerformed 方法
	public void actionPerformed(ActionEvent e)
	{
		// 若使用者按下的是 bt1 (黃筆) 則將 RGB 設為黃色
		if (e.getSource() == bt1)
		{
			cr = 255;
			cg = 255;
			cb = 0;
		}

		// 若使用者按下的是 bt2 (綠筆) 則將 RGB 設為綠色
		else if(e.getSource() == bt2)
		{
			cr = 0;
			cg = 255;
			cb = 0;
		}

		// 若使用者按下的是 bt3 (紅筆) 則將 RGB 設為紅色
		else if(e.getSource() == bt3)
		{
			cr = 255;
			cg = 0;
			cb = 0;
		}

		// 若使用者按下的是 bt4 (藍筆) 則將 RGB 設為藍色
		else if (e.getSource() == bt4)
		{
			cr = 0;
			cg = 0;
			cb = 255;
		}

		// 若使用者按下的是 bt5 (黑筆) 則將 RGB 設為黑色
		else if(e.getSource() == bt5)
		{
			cr = 0;
			cg = 0;
			cb = 0;
		}

		// 若使用者按下的是 bt6 (白筆) 則將 RGB 設為白色
		else if(e.getSource() == bt6)
		{
			cr = 255;
			cg = 255;
			cb = 255;
		}

		// 若使用者按下的是關閉視窗鈕
		else if(e.getSource() == exit)
		{
			// 跳出「是否確定離開程式？」的對話框
			if (JOptionPane.showConfirmDialog(c, "是否確定離開程式？", "確認離開", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			{
				// 若使用者點選確定離開，則顯示「謝謝你的使用！」的對話框，並結束 JVM 執行
				JOptionPane.showMessageDialog(c, "謝謝你的使用！", "確認離開", JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
		}

		// 若使用者按下的是右鍵選單中的白色背景，則將 Container 背景變白色
		else if(e.getSource() == mi1)
		{
			c.setBackground(Color.white);
		}

		// 若使用者按下的是右鍵選單中的黑色背景，則將 Container 背景變黑色
		else if(e.getSource() == mi2)
		{
			c.setBackground(Color.black);
		}

		// 若使用者按下的是右鍵選單中的清除重畫，則將 Container repaint()
		else if(e.getSource() == mi3)
		{
			repaint();
		}

	}

	//移動滑鼠指標
	public void mouseMoved(MouseEvent e)
	{
		//取得滑鼠的起點座標位置
		px = e.getX();
		py = e.getY();
	}

	//拖移滑鼠指標
	public void mouseDragged(MouseEvent e)
	{
		// 取得滑鼠的結束座標位置
		px2 = e.getX();
		py2 = e.getY();

		// 若使用者並非按下右鍵 (因右鍵事件已分配給右鍵選單)
		if (!e.isMetaDown())
		{
			// 取得 Graphics 物件來繪圖
			g = getGraphics();

			//設定線條顏色，看看 RGB 三個變數中的顏色分別為多少
			g.setColor(new Color(cr, cg, cb));

			//畫線條，從 px,py 畫到 px2,py2
			g.drawLine(px, py, px2, py2);

			// 畫完後把滑鼠的起點座標位置設為現在停留的位置
			px = px2;
			py = py2;
		}
	}

	// 主類別中的主程式
	public static void main(String[] args)
	{
		// 將主類別實體化出來
		HW10 win = new HW10();

		// 設定視窗大小
		win.setSize(400, 300);

		// 讓視窗出現在畫面中
		win.setVisible(true);

		// 把預設的關閉視窗鈕功能取消 (JFrame.DO_NOTHING_ON_CLOSE)
		win.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
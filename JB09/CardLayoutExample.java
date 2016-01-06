import java.awt.*;
import javax.swing.*;
public class CardLayoutExample{
	public static void main(String[] args)
	{
		String[] card = {"Allan", "Bill", "Cindy"};
		JFrame frame = new JFrame("CardLayoutExample");
		Container c = frame.getContentPane();
		CardLayout clayout= new CardLayout(25, 25);
		c.setLayout(clayout);

		//製作JButton按鈕元件
		for (int i = 0; i < card.length; i++)
		{
			c.add(new JButton(card[i]));
		}
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true)
		{
			try{Thread.sleep(1500);}
			catch(InterruptedException e){}
			clayout.next(c);
		}
	}
}
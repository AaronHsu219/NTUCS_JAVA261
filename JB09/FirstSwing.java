import java.awt.*;
import javax.swing.*;

public class FirstSwing{
	public static void main(String[] args)
	{
		JFrame frm = new JFrame("This is a Swing test!");
		frm.setSize(300, 200);
		frm.setLocation(250, 250);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
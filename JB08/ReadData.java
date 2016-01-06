import java.io.*;

public class ReadData{
	public static void main(String[] args) {
		try
		{
			FileInputStream fs= new FileInputStream("Employee.txt");
			ObjectInputStream in = new ObjectInputStream(fs);

			Employee[] s = (Employee[] )in.readObject();

			for(int i = 0 ; i < s.length; i++) {
				System.out.println(s[i].getName());
				System.out.println(s[i].getID());
				System.out.println(s[i].getSalary());
			}
			in.close();
			fs.close();
		}
		catch (Exception e)
		{
			System.out.println( e.toString());
		}
	}
}
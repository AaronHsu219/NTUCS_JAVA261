import java.io.*;

public class WriteData{
	public static void main(String[] args) {
		
		Employee[] s = new Employee[2];

		s[0] = new Employee("Alex" ,"001" , 32000.f);
		System.out.println(s[0].getName());
		System.out.println(s[0].getID());
		System.out.println(s[0].getSalary());

		s[1] = new Employee("Ivy","002", 43000.f);
		System.out.println(s[1].getName());
		System.out.println(s[1].getID());
		System.out.println(s[1].getSalary());

		try
		{
			FileOutputStream fs= new FileOutputStream("Employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fs);
			out.writeObject(s);
			out.close();
			fs.close();
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
}
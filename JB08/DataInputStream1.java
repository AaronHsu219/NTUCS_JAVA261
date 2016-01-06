import java.io.*;
class DataInputStream1
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis= new FileInputStream("file1.txt");
		DataInputStream dis = new DataInputStream(fis);
		int i;

		while((i = dis.read()) != -1)
		{
			System.out.print((char) i);
		}

		dis.close();
		fis.close();
	}
}
import java.io.*;

public class FileWriter1 {
	public static void main (String[] args) throws IOException{
		File f = new File("file3.txt");
		FileWriter fw= new FileWriter(f);

		String str= "Java is easy to learn.\n";

		fw.write(str);
		fw.close();
	}
}
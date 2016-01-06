import java.io.*;

public class FileReader1 {
	public static void main (String[] args) throws IOException{
		File f = new File("file1.txt");
		FileReader fr= new FileReader(f);
		int i;

		while((i = fr.read())!=-1) {
			System.out.print((char) i);
		}
		fr.close();
	}
}
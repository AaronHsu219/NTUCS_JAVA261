import java.io.*;

public class DataOutputStream1 {
	public static void main (String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file2.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		byte[] c = {'J', 'a', 'v', 'a'};
		dos.write( c);

		fos.close();
		dos.close();
	}
}
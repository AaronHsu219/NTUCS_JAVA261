import java.io.*;

public class InputStreamReader2 {
	public static void main(String[] args){

		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);

		float salary;

		try{
			System.out.print("�п�J���~�G");
			salary = Float.parseFloat(br.readLine());
			System.out.print("�A���~�~�O�G" + salary * 12);
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}
}
import java.io.*;

public classInputStreamReader2 {
	public static void main(String[] args){
		InputStreamReaderir= new InputStreamReader(System.in);
		BufferedReaderbr= new BufferedReader(ir);
		float salary;

		try{
			System.out.print("�п�J���~�G");
			salary = Float.parseFloat(br.readLine());
			System.out.print("�A���~�~�O�G"+salary*12);
		} catch (IOExceptione) {
			System.out.println(e.toString());
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}
}
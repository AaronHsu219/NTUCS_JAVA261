import java.io.*;

public class PT82 {
	public static void main(String[] args){

		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);

		String name;
		int age;
		String gender;

		float salary;

		try{
			// System.out.print("�п�J���~�G");
			// salary = Float.parseFloat(br.readLine());
			// System.out.print("�A���~�~�O�G" + salary * 12);

			System.out.print("�п�J�m�W�G");
			name = br.readLine();

			System.out.print("�п�J�~�֡G");
			age = Integer.parseInt(br.readLine());

			System.out.print("�п�J�ʧO(M/F)�G");
			gender = br.readLine();
			String sex = (gender.equals("M")) ? "����":"�p�j";

			System.out.println("Hi " + name + " " + sex + "�A�n�A�A���~�~��" + age + "��");

		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

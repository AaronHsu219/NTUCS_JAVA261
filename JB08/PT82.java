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
			// System.out.print("請輸入月薪：");
			// salary = Float.parseFloat(br.readLine());
			// System.out.print("你的年薪是：" + salary * 12);

			System.out.print("請輸入姓名：");
			name = br.readLine();

			System.out.print("請輸入年齡：");
			age = Integer.parseInt(br.readLine());

			System.out.print("請輸入性別(M/F)：");
			gender = br.readLine();
			String sex = (gender.equals("M")) ? "先生":"小姐";

			System.out.println("Hi " + name + " " + sex + "你好，你今年年齡" + age + "歲");

		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

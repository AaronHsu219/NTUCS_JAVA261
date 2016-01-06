public class HW32 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(args[0]);

		Boolean flag;
		flag = true;

 		if (num > 1) {
 			for (int i = 2; i < num; i++) {
 				if (num % i == 0) {
 					flag = false;
 					break;
 				}
 			}
 		}
 		else {
 			flag = false;
 		}	

		if (flag == true) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}
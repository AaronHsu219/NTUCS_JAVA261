public class hw43 { 
	public static void main (String []args) {

		int i, result;
		int[] rlt = new int[3];

		System.out.println("�}�l�Y��l------");

		for (i = 0; i < 3; i++){
			result = getPoint();
			int N = i + 1;
			System.out.println("��" + N + " ����l���I�ƬO�G" + result);
			rlt[i] = result;
		}

		System.out.println("��l���Y����----");

		if (rlt[0] == rlt [1] && rlt[1] == rlt[2]) {
			System.out.println("���Y��!");
		} else if (rlt[0] <= rlt [1] && rlt[1] <= rlt[2]) {
			System.out.println("���G��!");
		} else {
			System.out.println("�A���A�y!");
		}
	}
	
	static int getPoint(){
		int a = (int) (Math.floor(Math.random()*6) + 1);
		return a;
	}
}
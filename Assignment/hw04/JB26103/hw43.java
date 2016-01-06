public class hw43 { 
	public static void main (String []args) {

		int i, result;
		int[] rlt = new int[3];

		System.out.println("開始擲骰子------");

		for (i = 0; i < 3; i++){
			result = getPoint();
			int N = i + 1;
			System.out.println("第" + N + " 顆骰子的點數是：" + result);
			rlt[i] = result;
		}

		System.out.println("骰子投擲完畢----");

		if (rlt[0] == rlt [1] && rlt[1] == rlt[2]) {
			System.out.println("中頭獎!");
		} else if (rlt[0] <= rlt [1] && rlt[1] <= rlt[2]) {
			System.out.println("中二獎!");
		} else {
			System.out.println("再接再勵!");
		}
	}
	
	static int getPoint(){
		int a = (int) (Math.floor(Math.random()*6) + 1);
		return a;
	}
}
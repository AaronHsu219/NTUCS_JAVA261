public class RandomFloor{
	public static void main (String []args) {
		int i, result;
		System.out.println("開始擲骰子------");
		for (i = 1; i <= 4; i++){
			result = getPoint();
			System.out.println("第" + i+ " 顆骰子的點數是：" + result);
		}
		System.out.println("骰子投擲完畢----");
	}
	static int getPoint(){
		int a = (int) (Math.floor(Math.random()*6) + 1);
		return a;
	}
}
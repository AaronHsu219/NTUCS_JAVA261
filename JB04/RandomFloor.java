public class RandomFloor{
	public static void main (String []args) {
		int i, result;
		System.out.println("�}�l�Y��l------");
		for (i = 1; i <= 4; i++){
			result = getPoint();
			System.out.println("��" + i+ " ����l���I�ƬO�G" + result);
		}
		System.out.println("��l���Y����----");
	}
	static int getPoint(){
		int a = (int) (Math.floor(Math.random()*6) + 1);
		return a;
	}
}
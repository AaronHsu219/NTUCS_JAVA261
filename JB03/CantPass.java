public class CantPass{
	public static void main (String[] args) {
		int score = 50;
		if (score >= 60)
		{
			System.out.println("成績為：" + score + " ，及格"); //成立
		}
		else
		{
			System.out.println("成績為：" + score + " ，不及格");//不成立
		}
		System.out.println("程式執行完成");
	}
}
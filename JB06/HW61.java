public class HW61 {
	public static void main(String[] args) {
		Guess gs = new Guess();
		System.out.println("使用者猜的是：" + args[0]);
		System.out.println(gs.judge(Integer.parseInt(args[0])));
		System.out.println("答案是：" + Integer.toString(gs.getAnswer()));
	}
}

class Guess {
	private int answer;

	Guess()	{
		answer = (int)(Math.random()*100) + 1;		
	}

	public String judge(int answer) {		
		if (answer == this.answer)
		{
			return("答對了!");		//判斷猜的數字是否正確，如果正確，傳回「答對了」
		}
		else if (answer < this.answer)
		{
			return("太小了!");		//如果猜的數字太小，傳回「太小了」
		}
		else
		{
			return("太大了!");		//如果猜的數字太大，傳回「太大了」
		}		
	}

	public int getAnswer() {
		return answer;
	}
	
}
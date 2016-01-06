public class HW61 {
	public static void main(String[] args) {
		Guess gs = new Guess();
		System.out.println("�ϥΪ̲q���O�G" + args[0]);
		System.out.println(gs.judge(Integer.parseInt(args[0])));
		System.out.println("���׬O�G" + Integer.toString(gs.getAnswer()));
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
			return("����F!");		//�P�_�q���Ʀr�O�_���T�A�p�G���T�A�Ǧ^�u����F�v
		}
		else if (answer < this.answer)
		{
			return("�Ӥp�F!");		//�p�G�q���Ʀr�Ӥp�A�Ǧ^�u�Ӥp�F�v
		}
		else
		{
			return("�Ӥj�F!");		//�p�G�q���Ʀr�Ӥj�A�Ǧ^�u�Ӥj�F�v
		}		
	}

	public int getAnswer() {
		return answer;
	}
	
}
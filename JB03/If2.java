public class If2 {
	public static void main (String[] args) {
		int i = 10;
		int j = i++;
		if ((i>++j) && (i++ ==j))
		{
			i +=j;
		}
		System.out.println("�����Gi = " + i + " �Aj = " + j);
	}
}
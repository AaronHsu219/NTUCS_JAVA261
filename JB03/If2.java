public class If2 {
	public static void main (String[] args) {
		int i = 10;
		int j = i++;
		if ((i>++j) && (i++ ==j))
		{
			i +=j;
		}
		System.out.println("°õ¦æ«á¡Gi = " + i + " ¡Aj = " + j);
	}
}
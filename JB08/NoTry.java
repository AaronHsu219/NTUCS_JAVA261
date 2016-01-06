public class NoTry{
	public static void main (String[] args) {
		int i;

		String showName[] = {
			"Alex",
			"Ivy",
			"Fanny"
		};

		for (i=0; i<4; i++) {
			System.out.println("第" + i + "個名字是:" + showName[i] );
		}

		System.out.println("程式執行結束");
	}
}
class Final1 {
	public static void main(String[] args) {
		final Animal a = new Animal();
		a.leg = 10; //可以改變物件變數的資料內容
		System.out.println("動物的腳有 " + a.leg + " 隻");
		a.leg = 20; //可以改變物件變數的資料內容
		System.out.println("動物的腳有 " + a.leg + " 隻");

		Animal b = new Animal();
		//a = b; //不可以改變物件變數，這行會產生編譯時的錯誤
	}
}

class Animal {
	public int leg;
}
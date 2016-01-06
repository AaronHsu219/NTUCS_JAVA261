interface IA {
	public String name = "A";
	public void act();
}
interface IB {
	public String name = "B";
	public void act();
}
interface IC {
	public String name = "C";
	public void act();
}
interface All extends IA, IB, IC {
	//public String name = "All";
}
class C implements All {
	public void act() {
		System.out.println("I am act()!");
	}
}
public class MultiInterface {
	public static void main(String[] args) {
		C c = new C();
		c.act();
		System.out.print(c.name);
	}
}
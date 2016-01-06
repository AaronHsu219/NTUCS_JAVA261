interface Actions
{
	public String name = "Some Actions";
	public void canFly ( ) ;
	public void canRun ( ) ;
}

class Bird implements Actions {
	public String name = "Bird" ;
	public void canFly() {
		System.out.println("Bird is flying…") ;
	}

	public void canRun(){ }
}

class Airplane implements Actions {
	public String name = "Airplane" ;
	public int price =100 ;
	public void canFly() {
		System.out.println ("Airplane is flying…") ;
	}

	public void canRun(){};
}

public class Interface1 {
	public static void main(String[] args) {
		Bird b = new Bird() ;
		b.canFly() ;
		System.out.println (b.name);

		Actions a = new Airplane();
		a.canFly() ;
		System.out.println(a.name);
		//System.out.println (a.price) ; //這行會產生 錯誤
	}
}




interface Action1 {
	public void canRun ( ) ;
}

interface Action2 {
	public void canFly ( ) ;
}

interface Action3 {
	public void canSwim ( ) ;
}

interface AllAction extends Action1 , Action2 , Action3 {}

abstract class SuperAnimal implements AllAction{}

class SuperDuck extends SuperAnimal{
	public void canRun ( ) {
		System.out.println ("�ڥi�H�]") ;
	}
	public void canFly ( ) {
		System.out.println ("�ڥi�H��") ;
	}
	public void canSwim ( ) {
		System.out.println ("�ڥi�H��") ;
	}
}

public class Interface2{
	public static void main (String [ ] args) {
		AllAction d = new SuperDuck ( ) ;
		d.canRun ( ) ;
		d.canFly ( ) ;
		d.canSwim ( ) ;
	}
}


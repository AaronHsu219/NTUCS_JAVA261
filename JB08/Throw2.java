class MyExceptionextends Exception{
	private intvalue;
	MyException(int value){
		this.value= value;
	}
	public String toString(){
		String s ="���{������L��\n" +
			"���~�N�X��" + value + " \n" +
			"�бN���N�X�i���޲z�H��\n";
		return s;
	}
}

public static void tryToCalculates(int x, int y){
	if (y == 0){
		try{
			throw new MyException(0);
		} catch(MyExceptione){
			System.out.println(e.toString());
		}
	} else {
		System.out.println("���G��: " + x / y);
	}
}

public class Throw2{
	public static void main (String[] args) {
		tryToCalculates(10, 0);
		tryToCalculates(10, 2);
	}
}
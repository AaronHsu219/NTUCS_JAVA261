class Overload {
	public static void main(String[] args)
	{
		Calculate addValue = new Calculate();

		System.out.println("傳入兩個整數，相加後為： " + addValue.add(5, 3));
		System.out.println("傳入三個整數，相加後為： " + addValue.add(5, 3, 8));
		System.out.println("傳入兩個double，相加後為： " + addValue.add(4.0D, 2.0D));
	}
}

class Calculate{
	public int add(int a, int b){
		return (a + b);
	}

	public int add(int a, int b, int c){
		return (a + b + c);
	}

	public double add(double a, double b){
		return (a + b);
	}
}
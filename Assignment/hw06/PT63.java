public class PT63 {
	public static void main(String[] args) {
		Car car1 = new Car();						System.out.println();
		Toyota car2 = new Toyota();			System.out.println();
		Honda car3 = new Honda();				System.out.println();
		Nissan car4 = new Nissan();
	}
}

class Car {
  private int color;
  private int numDoors;
  private int plateNum;

  Car() {
  	System.out.println("I am a car!");
		canRun();		
  }

  public void canRun() {
  	System.out.println("I can run!");
  }
}

class Toyota extends Car {

	Toyota() {
  	System.out.println("I am also a Toyota!");
		canRunOnBeach();
  }

  public void canRunOnBeach() {
  	System.out.println("I can run on the beach!");
  }
}

class Honda extends Car {

  Honda() {
  	System.out.println("I am also a Honda!");
		rearWheelDrive();
  }

  public void rearWheelDrive() {
  	System.out.println("I run with rear wheel drive!");
  }
}

class Nissan extends Car {

  Nissan() {
  	System.out.println("I am also a Nissan!");
		fourWheelDrive();
  }

  public void fourWheelDrive() {
  	System.out.println("I run with four wheel drive!");
  }
}
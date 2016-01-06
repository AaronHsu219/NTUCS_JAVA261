public class PT63 {
	public static void main(String[] args) {
		Car car1 = new Car(); 				
		car1.announce();							System.out.println();

		Toyota car2 = new Toyota(); 	
		car2.announce();							System.out.println();

		Honda car3 = new Honda(); 		
		car3.announce();						  System.out.println();

		Nissan car4 = new Nissan(); 	
		car4.announce();
	}
}

class Car {
  public int color;
  public int numDoors;
  public int plateNum;

  public void canRun() { 
  	System.out.println("I can run!");
  }

  public void announce() {
  	System.out.println("I am a car!");
		canRun();
  }

}

class Toyota extends Car {

  public void canRunOnBeach() {   	
  	System.out.println("I can run on the beach!");
  }

  public void announce() {
  	System.out.println("I am Toyota!");
  	canRun();
		canRunOnBeach();
  }

}

class Honda extends Car {

  public void rearWheelDrive() { 
  	System.out.println("I run with rear wheel drive!");
  }

  public void announce() {
  	System.out.println("I am Honda!");
  	canRun();
		rearWheelDrive();
  }  
}

class Nissan extends Car {

  public void fourWheelDrive() { 
  	System.out.println("I run with four wheel drive!");
  }

  public void announce() {
  	System.out.println("I am Nissan!");
  	canRun();
		fourWheelDrive();
  }  
}
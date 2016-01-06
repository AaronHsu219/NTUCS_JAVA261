import java.io.*;

public class Employee implements Serializable{
	private String name;
	private String ID;
	private float salary;

	Employee(String name , String ID , float salary) {
		this.name = name;
		this.ID = ID;
		this.salary= salary;
	}
	public String getName(){
		return name;
	}
	public String getID() {
		return ID;
	}
	public float getSalary() {
		return salary;
	}
}
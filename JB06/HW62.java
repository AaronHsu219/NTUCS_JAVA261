public class HW62 {
	public static void main(String[] args) {
		Personal p1 = new Personal();
		Personal p2 = new Personal();
		Personal p3 = new Personal();

		System.out.println("p1: Personal():");
		p1.printData();

		p2.setData("Bill");
		System.out.println("p2: Personal(\"Bill\"):");
		p2.printData();

		System.out.println("p3: Personal(\"Cinkdy\", false, 20, \"12345678\"):");
		p3.setData("Cinkdy", false, 20, "12345678");
		p3.printData();
	}
}

class Personal {

	private String name;
	private boolean gender;
	private int age;
	private String id;

	Personal() {
		name = "null";
		gender = false;
		age = 0;
		id = "null";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setData(String name) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public void setData(String name, boolean gender, int age, String id) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public boolean getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getID() {
		return id;
	}

	public void printData() {
		System.out.println("name = " + this.getName());
		System.out.println("gender = " + this.getGender());
		System.out.println("age = " + this.getAge());
		System.out.println("id = " + this.getID());
		System.out.println();
	}
}
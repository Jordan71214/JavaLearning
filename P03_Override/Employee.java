package P03_Override;

public class Employee {
	String name;
	int age;
	int salary;

	public void introduce() {
		System.out.println("Hello I'm Employee!!!");
	}

	public void showInfo() {
		System.out.printf("I'm: %s, I'm %d years old, My salary is : %d.\n", this.name, this.age, this.salary);
	}
}

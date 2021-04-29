package Extend02;

public class ParttimeEmployee extends Employee {

	// 既然父Class 都做好了 那我們只需要做父Class沒有的東西就可以拉
	public void takeBreak() {
		System.out.println("I'm gonna taking a break");
	}

	ParttimeEmployee() {}

	ParttimeEmployee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

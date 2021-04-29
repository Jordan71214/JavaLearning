package P02_Extend;

public class RagularEmployee extends Employee {

	// 既然父Class 都做好了 那我們只需要做父Class沒有的東西就可以拉
	public void startOvertiming() {
		System.out.println("Let's get start now until i'm sleep");
	}

	RagularEmployee() {}

	RagularEmployee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}

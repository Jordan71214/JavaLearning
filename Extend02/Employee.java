package Extend02;

public class Employee {
	// 既然正職員工跟兼職員工都是員工 那我們用員工把他們相似的東西都包起來 這樣方便多了
	// 實作一個父Class
	// 把所有員工相似的東西包起來
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

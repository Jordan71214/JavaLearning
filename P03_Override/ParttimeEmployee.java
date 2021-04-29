package P03_Override;

public class ParttimeEmployee extends Employee {

	// 既然父Class 都做好了 那我們只需要做父Class沒有的東西就可以拉
	public void takeBreak() {
		System.out.println("I'm gonna taking a break");
	}

	ParttimeEmployee() {
	}

	ParttimeEmployee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// 這邊使用override覆寫 來蓋住父Class的introduce()方法
	// 注意 override 注重的是方法名稱跟參數要一致 就是 introduce() 要完全相同 不然就是新的方法了
	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("Hello I'm ParttimeEmployee!!!");
	}
}

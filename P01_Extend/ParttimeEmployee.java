package P01_Extend;

public class ParttimeEmployee {
	// 一般兼職的員工
	// 這邊給他姓名, 年齡, 薪資
	String name;
	int age;
	int salary;

	// 這邊給這個Class一個空的 『建構式』 建構式的意思是 在創建物件 new ParttimeEmployee()
	// 這邊要注意 new ParttimeEmployee() 這邊()裡面的參數 這邊()裡面沒有任何參數 所以是一個空的建構式
	ParttimeEmployee() {}

	/*
	 * 這邊的建構式 ParttimeEmployee(String name, int age, int salary) 意思是：
	 * 
	 * 參數的放置方法為 (參數型態 參數名稱) 在創造物件 new ParttimeEmployee("張三", 18, 20000)
	 * 這邊傳進去的三個參數分別是
	 * 
	 * "張三" 18 20000
	 * 
	 * 需要注意的是 第一個參數 "張三" 必須是String 因為在建構式當中 我們已經用String去接收了 反之 第二個18必須是int
	 * 第三個20000必須是int
	 * 
	 * 參數名稱是在這個方法之中 用來呼叫他的
	 */
	ParttimeEmployee(String name, int age, int salary) {
		// 這邊因為參數 跟這個物件的成員名稱相同 故使用this.成員來區分這是要呼叫成員本身 還是呼叫參數的名稱
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	//	這是ParttimeEmployee的特色 兼職可以休息 反正是計時計價的
	public void takeBreak() {
		System.out.println("I'm gonna taking a break");
	}
	
	public void introduce() {
		//這邊我們做一個方法 去讓這個Class介紹自己是誰
		System.out.println("Hello I'm ParttimeEmployee!!!");
	}
	
	public void showInfo() {
		System.out.printf("I'm: %s, I'm %d years old, My salary is : %d.\n", this.name, this.age, this.salary);
	}

}

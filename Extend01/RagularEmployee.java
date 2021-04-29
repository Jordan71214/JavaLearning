package ExtendEx;

public class RagularEmployee {
		// 正職的員工
		// 這邊給他姓名, 年齡, 薪資
		String name;
		int age;
		int salary;
		

		// 這邊給這個Class一個空的 『建構式』 
		RagularEmployee() {}

		
		//一樣是有三個參數的建構式
		RagularEmployee(String name, int age, int salary) {
			// 這邊因為參數 跟這個物件的成員名稱相同 故使用this.成員來區分這是要呼叫成員本身 還是呼叫參數的名稱
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		
		//這是正職的加班功能
		public void startOvertiming() {
			System.out.println("Let's get start now until i'm sleep");
		}

		public void introduce() {
			//這邊我們做一個方法 去讓這個Class介紹自己是誰
			System.out.println("Hello I'm RagularEmployee!!!");
		}
		
		public void showInfo() {
			System.out.printf("I'm: %s, I'm %d years old, My salary is : %d.\n", this.name, this.age, this.salary);
		}
}

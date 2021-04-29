package ExtendEx;

public class Main {

	public static void main(String[] args) {
		//這邊我們去實作一個物件 這是一個ParttimeEmployee物件 我們在這邊稱呼他為 emp 並且在建構式裡面 也就是()裡面給他值
		//在ParttimeEmployee.Class中的第27行的部分
		ParttimeEmployee emp = new ParttimeEmployee("Jordan", 20, 22000);
		
		//這邊用ParttimeEmployee的方法去查看他本身的細節
		emp.showInfo();
		emp.introduce();
		
		//因為是兼職員工 所以想休息就休息
		emp.takeBreak();
		
		
		System.out.println("--------------");
		
		
		//實作一個正職員工的物件 這邊稱呼他為emp1 之後就是用這個稱呼去叫他
		RagularEmployee emp1 = new RagularEmployee("Ken", 25, 30000);
		emp1.showInfo();
		emp1.introduce();
		
		//正式員工 老闆叫他加班
		emp1.startOvertiming();
		
		
		
		
	}

}



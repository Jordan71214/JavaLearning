package P03_Override;

public class Main {

	public static void main(String[] args) {
		 
		/*
		 * 這個章節主要說明 override 覆寫
		 * 想要用父Class的東西 但是他給的跟我自己想要用的不一樣
		 * 那我們可以把父Class的東西蓋上一個布 假裝這個功能是我自己的
		 * 在JVM執行的時候 只會看到你蓋上的布 這樣就不會去用到父Class的功能了 
		 */
		
		
		ParttimeEmployee emp = new ParttimeEmployee("Jordan", 20, 20000);
		emp.showInfo();
		emp.introduce();
		emp.takeBreak();
		
		RagularEmployee emp1 = new RagularEmployee("Ken", 25, 30000);
		emp1.showInfo();
		emp1.introduce();
		emp1.startOvertiming();
		
		//這樣在使用introduce()方法就不會去用到父Class的了
		
	}

}



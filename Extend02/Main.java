package Extend02;

public class Main {

	public static void main(String[] args) {
		 
		/* 同學們有沒有發現 這兩個Class的方法跟成員其實都差不多內 
		 * 那我們是不是可以把兩個Class類似的東西都放在一起 要用的時候再用就好了呢
		 * 這就是這個章節的重點
		 * 『繼承』 extends 的功能
		 * 讓父Class 去做差不多的事情 之後 子Class 只要把 父Class沒有 而且自己想要的加上就好了！！
		 * 重點是 今天只有2個Class 如過客戶突然說要新增加兩種員工 那豈不是要花費好多心力去Coding
		 * 繼承的優點是 只要做 父Class沒有的 其他的都用 父Class的 這樣是不是方便很多呢
		 */
		
		ParttimeEmployee emp = new ParttimeEmployee("Jordan", 20, 20000);
		emp.showInfo();
		emp.introduce();
		emp.takeBreak();//當然 他還是一個兼職員工 依舊可以使用休息的特權
		
		RagularEmployee emp1 = new RagularEmployee("Ken", 25, 30000);
		emp1.showInfo();
		emp1.introduce();
		emp1.startOvertiming();//當然 老闆依舊能夠叫正職員工加班
		
		//細心的同學有沒有發現 正職跟兼職的員工 在自我介紹 introduce() 的時候 不能夠分辨出哪個才是兼職 哪個是正職 
		//下個小節告訴大家怎麼去處理這個問題
	}

}



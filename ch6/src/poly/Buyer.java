package poly;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	
	//Product p = Tv1
	void buy(Product p) {
		if (money < p.pirce) {
			System.out.println("잔액 부족으로 구매하실 수 없습니다.");
		return;
		}
	
	money -= p.pirce;
	bounsPoint +=p.bounsPoint;
	System.out.println(p + " 을/를 구매하셨습니다.");
	
	}
	
	
}

package poly;

public class Buyer2 {
	int money = 1000;
	int bounsPoint = 0;
	
	Product cart[] = new Product[5]; // 구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	//Product p = Tv1
	void buy(Product p) {
		if (money < p.pirce) {
			System.out.println("잔액 부족으로 구매하실 수 없습니다.");
		return;
		}
	
	money -= p.pirce;
	bounsPoint +=p.bounsPoint;
	cart[i++] = p;
	System.out.println(p + " 을/를 구매하셨습니다.");
	
	}
	
	void summary() {
		//구매한 물품에 대한 정보를 요약해서 보여주기
		//구입한 물품의 가격합계
		//구입한 물품목록
		
		int sum  = 0;
		String itemList = "";
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i]==null) break;
		
		sum+= cart[i].pirce;
		itemList += cart[i]+",";
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다.");
	}
	
}
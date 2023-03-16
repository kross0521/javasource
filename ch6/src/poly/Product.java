package poly;

public class Product {
	int pirce;
	int bounsPoint;
	
	
	public Product(int pirce) {
		super();
		this.pirce = pirce;
		bounsPoint = (int)(pirce/10.0); // 보너스 점수는 제품가격의 10%
	}
	
	
}

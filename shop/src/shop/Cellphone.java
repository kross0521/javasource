package shop;

public class Cellphone extends Product{

	String carrier;	//통신사정보
	
	public Cellphone(String name, int price, String carrier) {
		super(name, price);
		this.carrier = carrier;
	}

	//Cellphone의 이름과 가격 출력 ==> 부모 메소드 사용

	//통신사정보를 출력
	public void printExtra() {
		System.out.println("통신사 정보"+carrier);
	}
}

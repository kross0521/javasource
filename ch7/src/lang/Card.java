package lang;
// card 인스턴스 생성
//기본생성자,매개인수를 받는 생성자
//Card card1 = new Card();  ==> 기본생성자로 객체 생성 시 무조건 card는 spade,1로 생성
//Card card1 = new Card("HEART",7); ==> 매개변수로 객체 생성 시 내가 원하는 조건으로 생성 가능
public class Card {
	String kind;
	int number;
	
	public Card() {
		this("SPACE",1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
//	@Override
//	public String toString() {
//		
//		return "kind : "+kind+", number : "+number;
//	}
}

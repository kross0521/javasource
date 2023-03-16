package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		// 인스턴스 생성
		// 참조형 타입 변수명 =new 참조형타입();
		// 메소드의 타입이 void 타입이 아닌 경우 return 타입에 대한 준비를 해야한다.
		// 외부에서 부를 때는 클래스명.변수명으로 접근, 내가 작성한 코드는 이름만으로 사용 가능
		Data d = new Data();
		d.x = 10;
		Data d2 = copy(d);	//주소  d.x 값
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2	.x);
		
	}
	
	// int a = 4;
	static Data copy(Data d) {
		Data temp = new Data();
		// temp를 리턴하기 위해서는 Data 타입을 넘긴다.
		temp.x = d.x; 
		return temp;
		
	}
}

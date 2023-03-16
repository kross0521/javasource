package ch5;

// 상품관리
public class GoodStock {
	//속성
	String code; //상품코드(p123456789)
	 int stockNum; //재고수량(200)
	
	 
	 public GoodStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}

	//생성자를 하나도 명시하지 않으면
	 //기본 생성자를 알아서 생성해준다.
//	 public GoodStock() {
//		// TODO Auto-generated constructor stub
//	}
	 
	//기능
	//재고수량 증가
	void addStock() {
		System.out.println("재고수량 증가");
	}

	//재고수량 감소
	void subtractStock() {
		
		System.out.println("재고수량 감소");
// 채널을 증가하고 현재 채널을 리턴
		// int : 메소드가 실행이 끝난 후 int 값을 가지고 돌아감
		int channelUp() {
			channel++;
			return channel;
		}
		
		
		/*
		 * 메소드
		 * 특정 작업을 수행하는 이련의 문장들을 하나로 묶어 놓은 것
		 * 수학 함수와 유사
		 * 
		 * 리턴(반환)타입 작성 순서: 반환타입 메소드명(){}
		 * 리턴(반환)타입 작성 순서: 반환타입 메소드명(타입, 변수명, ...){}
		 * 리턴타입: void
		 * void는 메소드 실행이 끝난 후 그냥 돌아감(리턴값 없음)
		 * void, 앞에서 사용했던 변수 타입 다 가능, 배열 가능,
		 */
		
		
		
	}
	
	
	
}

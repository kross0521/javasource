package ch6;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		
		// 초기화
		// 값만 넘어감
		data.x =10;
		System.out.println("main() : x = "+data.x);
		change(data.x);
		System.out.println("after change(data.x)");
		System.out.println("main() : x = "+data.x);
		// 주소가 넘어감
		change2(data);
		System.out.println("after change2(data.x)");
		System.out.println("main() : x = "+data.x);
	
	
	}
		//기본형 매개변수 :값만 받게 됨
		//int x :x가 가지고 있는 값만 받음
		static	void change(int x) {
			x = 1000;
			System.out.println("change() : x = "+x);
		//호출 스택
		//스택이라는 구조는 입구랑 출구가 같다.
		//그럼 처음 들어간 내용은 맨 마지막에 나온다.
		//상자를 쌓을 때 맨 밑에 상자는 맨 마지막에 옮길 수 있는 것과 같은
		//상황
		// 지금 결과값을 확인 해보았을 때 x값이 1000으로 남는 것이 아닌
		// 10으로 돌아온다.
		// 이유는 x값은 힙에 담겨 있다. 힙의 값을 수정해야만 되돌아왔을 때
		// x의 값이 1000으로 유지가 된다.
		// 어떻게 1000으로 남기냐
		// change(int x)에서 data.x 10이라는 값을 넘기는 게 아닌
		// data.x의 주소(스택)을 넘겨야지만 x값이 1000으로 수정된다.
		
	}
		
		//참조형 매개변수 : 값을 읽고 수정 가능
		static void change2(Data d) {
			d.x =1000;	
		System.out.println("change() : x = "+d.x);
		}
		
		
}

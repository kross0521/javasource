package ch4;



public class WhileEx3 {
	public static void main(String[] args) {
		
		// do ~while : do에서 먼저 실행을 하고 다음에 while에서 조건을 검색하기?
		// while 문 변형으로 조건식과 블럭의 순서를 바꿔놓는 것, 조건식이 만족하지 않아도 블럭이 한번은 수행함.
		//: while 하고 차이점: while은 조건에 맞지 않으면 실행하지 않지만 do while은 일단 한번은 무조건 실행한 후
		//조건이 맞지 않았을 때 실행하지 않는다.
		int input = 0;
		do {
			System.out.println("Hello");
		} while (input!=0);
		
	}

}

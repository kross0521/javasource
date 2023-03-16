package inheritance.code;

import modifier.Account;



public class Modifier1 {
	// 참조타입은 null 로 세팅
	Account acc = new Account();// 포함관계
	String str;
	
	int age; // 기본타입은 정수형인 경우 - 기본적으로 0으로 세팅, 실수형 -0.0, boolean -false으로 세팅
	
	private void print() {
		
		//Account가 가지고 있는 ano 접근하고 싶다면?
		String ano  = acc.getAno();
		System.out.println("ano : "+ano);
		
		
		acc.setAno("111-22");
		System.out.println("ano : "+acc.getAno());
	}
	// Exception in thread "main" java.lang.NullPointerException : 엄청 많이 보는 오류, 참조 타입에서만 나오는 오류
	// 컴파일 오류: 수정하기 쉬운 편, 문법이 잘못된 경우 IDE 사용하면 바로 알려줌 
	// 런타임 오류: 개발 능력 우선하는 오류
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		// 1. 같은 static 으로 만들기
		// 2. 객체 생성 후 접근하기
		
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
	}
}

package ch1;

public class VariableEx1 {
	public static void main(String[] args) {
		//변수  : 메모리 공간
		//타입 변수명 = 값; ==> int num = 1;
		//메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정됨
		//문자 : 문자('가'- char), 문자열("가나다라")
		//숫자 : 정수 - byte, short, int, long
		//		실수 - float, double
		//논리 : 참(ture), 거짓(false)
		
		// 자바 문장의 끝은 세미클론(;)으로 끝나야 함
		// 변수명은 아무거나 써도 되지만 한글은 x
		int a=5, b=4;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}

package ch1;

public class VariableEx2 {
	public static void main(String[] args) {
		//변수  : 단 하나의 값만 저장할 수 있는 메모리 공간
		//타입 변수명 = 값; ==> int num = 1;
		//메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정됨
		//문자 : 문자('가'- char(2byte)), 문자열("가나다라")
		//숫자 : 정수 - byte(1byte), short(2byte), int(5byte), long(8byte)
		//		실수 - float(4byte), double(8byte)
		//논리 : 참(true), 거짓(false), 타입은 boolean
		
		// 자바 문장의 끝은 세미클론(;)으로 끝나야 함
		// 변수명은 아무거나 써도 되지만 한글은 x
		// 타입은 공간의 크기에 차이가 있다. 즉 타입별로 담을 수 있는 크기가 정해져 있다.
		// byte 크기 = -128~ 127, 정수를 사용할 때 대부분 int로 사용한다. short는 c언어 호완때문에 사용
		
		// 변수의 선언(int a;)과 초기화(a=10;)
//		int c;
//		c =15;
		byte a=-10, b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
		//실수형을 담을 때 기본으로 인식하는 타입은 double 임, doubl은 더 정확하게 값을 표현
		double d1 = 0.123456789;
		// 정밀도의 차이, double이 float보다 더 정밀하게 표현한다.
		//float 실수형은 마지막에 f;을 붙여야함, float는 7개 자리까지만 값을 표현
		float f1 = 0.123456789F; //리터럴에 붙는 문자는 대소문자 구별 안함
		
		System.out.println("d1 = "+d1); 
		System.out.println("f1 = "+f1);
		
		boolean b1=true;
		System.out.println(b1);
		
		String b2="true";
		System.out.println(b2);
		
		//빈문자(빈칸)도 프로그래밍언어에서는 문자임
		char ch1='a';
		System.out.println(ch1);
		System.out.print(ch1+1);// a : 97, A:65 ==> 유니코드
		
		//기본타입
		//문자: char
		//숫자 : 정수(byte.short.int,long)
		//	실수(float,double)
		//논리 : boolean
		
		
		
		
		
		
	}
}

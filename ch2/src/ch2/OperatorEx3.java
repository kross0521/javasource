package ch2;

/*연산자
 * 1)단항연산자
 * 	+(양수), -(음수), ++, --, ~, !
 * ~는 비트 전환 할 때 사용(pass)
 * 2)이항연산자
 * 	산술 : -, -, *, /, %, <<, >>, >>>
 * 	비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
 * 	논리 : &&(and), ||(or), ^(xor), &(and), |(or)
 * 3)삼항연산자
 * 	? :
 * 4)대입연산자 
 * 	: =   ex) a=4;
 * 
 * 연산자 우선순위
 * : 연산자 우선순위는 기본적으로 사칙연산 순서와 같다. 확실하게 우선 순위를 주고 싶은 경우는 ()를 활용하여 확실하게 표현하기
 */

public class OperatorEx3 {
	public static void main(String[] args) {

		int charCode='A';
		System.out.println(charCode);
		
		if((charCode>=65)&&(charCode<=90)) {
			System.out.println("대문자");
		}
		
		int x=15;
		if(x > 10 && x < 20) {
			System.out.println("x는 10~20사이에 있음");
		}
		
		
		//논리연산자 : true 나 false 를 주고 결과도 true, false로 나옴
		// &&(and 결합): X는 10보다 크고, 20보다 작다
		// X > 10 AND X < 20
		// X > 10 && X < 20
		// ||(or 결합) : i는 2의 배수 또는 3의 배수이다.
		// i%2==0 || i%3==0
		// i는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다.
		// (i%2==0 || i%3==0) && i%6!=0
	
		
	}
}

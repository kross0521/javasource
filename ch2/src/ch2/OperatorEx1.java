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

public class OperatorEx1 {
	public static void main(String[] args) {
		// ++, --, : 전위, 후위에 위치
		// 전위 : 값이 참조되기 전에 증가시킴	j = ++1;
		// 후위 : 값이 참조된 후 증가시킴		j = i++;
		
//		int i=5;
//		i++; // i= i+1, ++는 +1를 진행하라는 뜻, 후위연산자
//		System.out.println(i);
//		
//		i=5;
//		++i; // i=i+1, 전위연산자
//		System.out.println(i);
		
		int i=5, j=0;
		j=i++; // ① j=i; ② i=i+1;
		// 위에 변수를 보면 = 와 ++ 두 개의 연산자가 있다. 연산자의 우선 순위를 확인해보면 먼저 =를 처리한 후 다음으로 ++를 작업한다.
		System.out.println("j=i++실행 후 i=" + i + ", j="+j);
		
		
		i=5;
		j=0;
		j=++i; // ① i=i+1; ② j=i;
		System.out.println("j=i++실행 후 i="+ i + ", j="+j);
		
		// ! : true==>false, false==>true
		// 피연산자가 boolean 값을 가질때만 사용
		//!true, !false, !3(x)
		boolean play= true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);
		
		
		
		
	}
}

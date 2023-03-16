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

public class OperatorEx2 {
	public static void main(String[] args) {

		int num1=10;
		int num2=10;
		//비교연산자 : 결과값은 boolean 형태로 나옴(true, false 형태)
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		boolean result = num1 == num2;
		System.out.println(result);
		
		// A = 65, a=97 유니코드의 숫자에 비교해서 ch1<=ch2는 true가 나온 것이다.
		char ch1='A';
		char ch2='B';
		System.out.println("ch1==ch2= "+(ch1==ch2));
		System.out.println("ch1!=ch2= "+(ch1!=ch2));
		System.out.println("ch1>=ch2= "+(ch1>=ch2));
		System.out.println("ch1<=ch2= "+(ch1<=ch2));
		
		//double 과 float(소숫점7자리까지)는 정밀도에서 차이가 있다. double이 더욱 정밀도가 높은데
		//표현은 0.4를 표현하지만 실제로 들어가는 값은 차이가 존재한다
		double d1=0.4;
		float f1=0.4f;
		System.out.println("d1==f1="+(d1==f1));
		System.out.println("d1!=f1="+(d1!=f1));
		System.out.println("d1>=f1="+(d1>=f1));
		System.out.println("d1<=f1="+(d1<=f1));
		
		
		
		
		
	}
}

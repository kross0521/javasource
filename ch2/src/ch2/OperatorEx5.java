package ch2;

import java.util.Scanner;


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

public class OperatorEx5 {
	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		// 학생 한 명당 몇 개를 가질 수 있고, 연필의 나머지는 몇 개인지 출력하기
		// 출력) 학생 한명 당 : 30
		// 남은 연필 수 : 5
		
		int x = 534, y = 30 , c= x/y, d= x%y;
		System.out.println("학생 한 명당 가질 수 있는 연필 수 = " +c 
				+"연필의 남은 갯수 =" +d);
		
		//답지
		int pencils=534, students=30;
		System.out.println("학생 한명 당 : "+(pencils/students));
		System.out.println("남은 연필 수 : "+(pencils%students));
		
		
		//문제2) 사다리꼴 너비 구하기
		// 윗변 : 5, 아랫변 : 10, 높이 : 7 인 사다리꼴 너비 구하기
		// 변수 사용, 소숫 자릿수까지 출력
		
		double f = 5, g= 10, z= 7;
		double num1 = ((f+g)*z)/2;
		System.out.printf("사다리꼴의 넓이 =%.3f\n",num1);
		
		// 답지
		int top=5, bottom=10, height=7;
		double area=(double)(top+bottom)*height/2;
		System.out.println("사다리꼴 너비= "+area);
		//문제3) 한 달 월급을 10년동안 저축할 때 최종 저축금액 구하기
		// 조건 : 사용자로부터 한달 월급 입력받기
		// 출력예시 : 10년 저축 금액 : 2000000
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int num3 = (num2 *12)*10;
		System.out.println("10년동안 저축한 총 예산금액 = "+num3);
		
		
		//답지
		System.out.println("한 달 월급을 입력하세요");
		//입력받기
		int salary = Integer.parseInt(sc.nextLine());
		int deposit = salary*12*10;
		System.out.println("10년 저축 금액 : "+deposit);
		
		//문제 4) 화씨 온도를 섭씨 온도로 변경하기
		//	화씨 온도가 100일 때 섭씨 온도가 얼마인지 출력하기
		// 섭씨 온도 = 5/9 *(화시온도-32)임
		
		
		
		//답지
		int fahr = 100;
		double cels= (double)5/9 * (fahr-32);
		System.out.println("썹씨온도 : "+cels);
		
		//문제 5) 삼항연산자 이용(2개 이용)
		//	int num=10 일 때 num 이 양수인지, 음수인지, 0인지 출력
		
		int num = 10;
		
		String result=num> 0 ? "양수":(num < 0 ? "음수" :"0");
		System.out.println(result);
		
		// 삼항연산자 하나
		// 문6) 숫자를 입력받아 짝수인지, 홀수인지 출력하기
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
		result = input%2==0?"짝수":"홀수";
		System.out.println(result);
		
		
		
		
	}
}

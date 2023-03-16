package ch3;

import java.util.Scanner;

public class switchEx4 {
	public static void main(String[] args) {
	//+,-,*,/,%
		
		//사용자로부터 2개의 피연산자와 연산자를 입력받기
		//연산을 수행한 후 출력
		
	Scanner sc = new Scanner(System.in);
	
	//5-3
	//연산자 입력 op
	System.out.println("첫 번째 숫자를 입력해주세요");
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.println("두 번째 숫자를 입력해주세요");
	int num2 = Integer.parseInt(sc.nextLine());
	System.out.println("사칙연산을 입력해주세요"); //"" ==> String
	String op = sc.nextLine();
	
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
		break;
		case "*":
			System.out.println(num1*num2);
		break;
		case "/":
			System.out.println(num1/num2);
		break;
	
		default:
			System.out.println(num1%num2);
			break;
		}		
		
		//오답지
		// String으로 키보드 입력을 받을 시 integer.parseInt는 지우고 작성하면 문자만 받을 수 있다.
		// 앞에 integer.parseInt는 정수로 받겠다는 문구이기 때문에 삭제해도 상관없다.
//		String op = sc.nextLine();
//		int result=0;
		//switch (op) {
//		case "+":
//		result = num1+num2;
//			break;
//		case "-":
//		result = num1+num2;
//			break;
//		case "*":
//		result = num1+num2;
//			break;
//		case "/":
//		result = num1+num2;
//			break;
//		default:
//		result = num1%num2;
//			break;
//			System.out.printf("%d %s %d = %d", num1,op,num2,result);
		
	}
}

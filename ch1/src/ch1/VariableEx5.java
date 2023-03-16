package ch1;

import java.util.Scanner;

/*
 *키보드에서 입력받기 
 *
 * 
 * 
 * 
 * 
 */

public class VariableEx5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.in : 키보드
	//sc.nextLine() : 키보드에 입력된 모든 값()을 문자로 입력받기
	//Integer.parseInt() : 괄호 안에 들어 있는 문자 숫자를 숫자로 변환
	//Integer.parseInt("78") : 78
	//실행순서는 가장 오른쪽에서 시작한다. 아래 문장을 살펴보면 괄호 안에 있는 sc.nextLine()가 먼저 작동,
	// 이후 Integer.parseInt() 작동, 마지막으로 int 작동 결국 num 값이 입력된다.
	
	System.out.println("두자리 정수를 입력해 주세요");
	String input = sc.nextLine();
	int num = Integer.parseInt(input);
	
	
	System.out.printf("입력숫자 : %d", num);
	
	
	
	
	}
}

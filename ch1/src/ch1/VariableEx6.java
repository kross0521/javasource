package ch1;

import java.util.Scanner;


public class VariableEx6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//사용자로부터 두개의 피연산자를 입력받기
	System.out.print("첫번째 수 입력 : ");
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.print("두번 째 수 입력 : ");
	int num2 = Integer.parseInt(sc.nextLine());
	
	int num3 = (num1+num2)+((num1*num2)/2);
	//사직연산 결과 출력
	System.out.printf("num1 + num2 = %d\n",(num1+num2));
	System.out.printf("(num1*num2)/2 = %10d\n",((num1*num2)/2));
	System.out.printf("첫 번째 값과 두번 째 값의 합 = %d\n",num3);
	
	
	
	
	}
}

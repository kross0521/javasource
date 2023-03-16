package ch4;

import java.util.Scanner;

public class DowhileEx1 {
	public static void main(String[] args) {
	//사용자로부터 숫자를 입력받기
	//숫자의 각 자리의 합 구하기	
	// 12345  ==> 5 + 4 + 3 +2 + 1	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력주세요");
	int num = Integer.parseInt(sc.nextLine());
	
	int sum=0;
	while (num!=0) {
		sum+= num %10;
		System.out.printf("sum = %3d  num = %d\n",sum,num);
		num = num/10;
	}
	System.out.println("각 자리 수의 합"+sum);
	
	
	
	
	
	}

}

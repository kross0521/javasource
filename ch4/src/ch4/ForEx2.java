package ch4;

import java.util.Iterator;
import java.util.Scanner;

/* 반복문
 * : 어떤 작업이 반복적으로 수행되도록 할 때 사용
 * 종류 : for(주로 사용됨), while(2번째로 많이 사용됨), do-while
 */
public class ForEx2 {

	public static void main(String[] args) {
		//주사위 5번 던지기
	//	int dice=(int)(Math.random()*6)+1;
		for (int i = 0; i < 5; i++) {
			int dice1=(int)(Math.random()*6)+1;
			System.out.println(dice1);
		}
		
		//구구단 출력
		// 5단 출력, 5*1 = 5, 5*2 = 10
		int num = 5;
		System.out.print("5구구단 : ");
		for (int i = 1; i <= 9; i++) {
			System.out.print(num*i+"  ");
		}
		
		//답안지
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("5 * %d = %d\n",i,(5*i));
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("출력을  원하는 단을 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",num1,i,(num1*i));
		}
		
		//3의 배수와 5의 배수 합 구하기(단 1~100사이의 숫자)
		//i값이 3의 배수냐(OR) 5의 배수냐 그 값을 확인해야한다. ==> IF문 사용
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.println("3과 5의 배수 합 : "+sum);
		
		//3의 배수 합(단, 9의 배수는 빼기)
		int sum1= 0;
		for (int i = 1; i < 101; i++) {
			if (i%3==0 && i%9!=0) {
				sum1+=i;
			}
		}
		System.out.println("9의 배수를 뺀 3의 배수의 합 : " +sum1);
	}

}

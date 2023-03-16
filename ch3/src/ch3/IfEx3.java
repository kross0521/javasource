package ch3;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
//		String result = input%2==0?"짝수":"홀수";
//		System.out.println(result);
	
		//if~else
		String result="";
		// String 은 초기화를 시켜주지 않아도 된다. String은 참조
		if(input%2==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		//result cannot be resolved to a variable
		//= 변수를 설정하지 않했다.
		System.out.println(result);
	}
}

package ch3;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		// 근무 시간 입력받기
		// 8시간 근무 시 시간 당 9800원 일 때,
		// 초과근무 시 1.5배를 지급
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근무 시간를 입력해주세요");
		int hours = Integer.parseInt(sc.nextLine());
		
		
		//  8 * 9800 = 하루일당
		// 12시간 근무 시엔 8시까지는 9800원 
		//초과시간은 9800원 에서 1.5배 지급
		
		
		//답지
		//8 * 9800 = 하루일당
		// 12 시간 근무 시
		int rate=9800;
		int pay=0;
		if(hours>8) {
			pay = (int)((hours-8)*1.5*rate + rate*8);
		}else {// hours가 8이하일때
		pay = hours * rate;
		}
		System.out.println("하루 일당 :"+pay);
		
		//키, 몸무게 입력받기
		//저체중, 표준, 과체중 출력하는 프로그램 작성
		
		//(키-100)*0.9 < 몸무게 : 과체중
		//(키-100)*0.9 == 몸무게 : 표준
		//(키-100)*0.9 > 몸무게 : 저체중
//		System.out.println("몸무게를 입력해주세요");
//		int waight = Integer.parseInt(sc.nextLine());
//		System.out.println("키를 입력해주세요");
//		int tool = Integer.parseInt(sc.nextLine());		
//		if((tool - 100)*0.9 < waight) {
//			System.out.println("과체중");		
//		}else if((tool - 100)*0.9 == waight){
//			System.out.println("표준");
//		}else{System.out.println("저체중");}
		
		
		// 답지
//		System.out.println("몸무게를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("키를 입력해주세요");
//		int mm = Integer.parseInt(sc.nextLine());		
//		// 처음부터 더블로 표현하고 싶다면
//		//double mm = Double.parseDouble(sc.nextLine());
//		double result = (height-100)*0.9;
//		if(result < mm) {
//			System.out.println("과체중");
//		}else if(result == mm) {
//			System.out.println("표준");
//		}else {
//			System.out.println("저체중");
//		}
		
		
		//윤년, 평년 구하기
//		int year=2023;
//		//윤년 : 연도를 4로 나눈 나머지가 0이고,
//		//	연도를 100으로 나눈 나머지가 0이 아니거나 연도를 
//		//	400으로 나눈 나머지가 0이면
//		if (year%4==0 && year%100!=0 || year%400 == 0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("평년");
//		}
		
		// 임의의 숫자 3개 입력받기
		// 입력받은 3개의 숫자 중 가장 작은 수 출력하기
		
		System.out.println("세 번째를 입력해주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째를 입력해주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("첫 번째를 입력해주세요");
		int num3 = Integer.parseInt(sc.nextLine());
		
		String result = " ";
		if(num1>num2 || num2> num3 || num3 > num1) {
		System.out.println(result);
		}
		
		
		System.out.println("임의의 숫자 중 최소값 : "+result);
		// 완전 오답
		
		//답지
		System.out.println("첫 번째를 입력해주세요");
		int num4 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째를 입력해주세요");
		int num5 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째를 입력해주세요");
		int num6 = Integer.parseInt(sc.nextLine());
		//if ~ else 나 if ~else if는 하나만 실행되나
		//if만 쓰면 개체마다 실행된다.
		int min=num5;
		if(min>num5) {
			min=num5;
		}
		if(min>num6) {
			min=num6;
		}
		System.out.println("가장 작은 수 : "+min);
		
		// 반대로 가장 큰 수를 구해보자
		System.out.println("세 번째를 입력해주세요");
		int num7 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째를 입력해주세요");
		int num8 = Integer.parseInt(sc.nextLine());
		System.out.println("첫 번째를 입력해주세요");
		int num9 = Integer.parseInt(sc.nextLine());
		
		int max=num8;
		if(max<num8) {
			max=num7;
		}
		if(max<num9) {
			max=num9;
		}
		System.out.println("가장 큰 수 : "+max);
		
	}
}

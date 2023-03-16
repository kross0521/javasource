package ch3;

import java.util.Scanner;

/* 조건문
 * : 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
 * 종류 : if(주로 사용), switch
 * 
 * 
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 */


public class IfEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if (condition) = if (조건)
		// 조건 : true/false 판별되어야 함
		//	i ==0, i>0, i!=10 ....
		// 조건의 결과가 true/false 로 나올 수 있으나
		// 블럭실행여부는 조건이 true 일때만 실행된다.
		// if문은 조건에서 판별하고 블럭안에는 조건부가 해결되었을 때 표현하고 
		// 싶은 내용 작성
		int num = 0;
		// num 값이 0이라면 num = 0 출력하기
		if(num==0) {
			System.out.println("num=0");
		}
		// num 값이 0아니라면 num != 0 출력하기
		
		if(num!=0) {
			System.out.println("num!=0");
		}
		
		//score가 60이상이면 합격 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");	
		int score=Integer.parseInt(sc.nextLine());
		if (score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		
//		if (condition) {
//			// true 일 때
//		}else {
//			// false 일 때
//		}
//		
//		// 성적 90이상일 때 A, 성적이 80이상일 때 B, 70 C....
//		if (조건1) {
//			//조건1 true 일때
//		}else if(조건2){
//			//조건2 true 일때
//		}else if(조건3) {
//			//조건3 true 일때
//		}
//		
		int jumsu=70;
		//지역변수는 무조건 초기화(값)를 진행해야 한다.
		//char : 문자 '한개'
		char grade=' ';
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}
		else if(jumsu>=70) {
			grade='C';
		}
		else if(jumsu>=60) {
			grade='D';
		}
		else if(jumsu>=50) {
			grade='E';
		}
	System.out.printf("점수 : %d, 등급 : %c\n" , jumsu,grade);
	}

	
	
	
	
	
	
}

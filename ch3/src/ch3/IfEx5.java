package ch3;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		//중첩 if는 아래에 형식처럼 if문 안에 반복적으로 if을 넣을 수 있다.
////		if (condition) {
//			if() {
//				
//			}else {
//				
//			}
//			}
//		
		// 점수를 입력받아서 점수가 90이상이면 A 인데, 98이상이라면 A+,
		// 94미만이면 A-
		// 점수가 80이상이면 B 인데, 88이상이라면 B+, 84미만 B-
		// 점수가 80미만이면 C
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >>");
		int score = Integer.parseInt(sc.nextLine());
		char grade = ' ', opt = '0';
		
		if (score>90) {
			grade='A';
		if(score>=98) {
				opt='+';
			}else if(score < 94) {
				opt='-';
			}
		}
		else if(score>=80) {
			grade = 'b';
		}if(score>=88) {
				opt='+';
			}else if(score <84 ) {
				opt='-';
			}
		System.out.printf("당신의 학점은 %C%C",grade,opt);
	}
}

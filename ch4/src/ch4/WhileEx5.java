package ch4;

import java.util.Scanner;

public class WhileEx5 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 0; // 잔액 변수
		//int amount = Integer.parseInt(sc.nextLine());
		
		while (run) {
			
			System.out.println("--------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("--------------------");
			System.out.print("메뉴 선택 >> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				//예금액 입력받기
				//잔액 - 잔액+ 예금액 
				//현재 잔액 출력
				System.out.println("예금액을 입력해주세요");
				int pay = Integer.parseInt(sc.nextLine());
				balance+=pay;
				
				//축약가능
				//balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액을 입력해주세요");
				int pay1 = Integer.parseInt(sc.nextLine());
				balance-=pay1;
				//마찬가지로 축약 가능
				//balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.printf("현재 잔액은%d원입니다.\n",balance);
				break;
			case 4:
				run=false;
				System.out.println("이용해 주셔서 감사합니다");
				break;
			default:
				break;
				
				// 입, 출금 변수를 while 밖에서 작성하고 변수를 설정해주고 오면 같은 변수 이름을 사용하여
				// 변수 적용이 가능하다. 밖에서 변수 적용하고 온다면 더욱 간단하게 코드를 축약할 수 있다.
			}
		}
		
		
		
	}

}

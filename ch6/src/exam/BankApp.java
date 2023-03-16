package exam;

import java.util.Scanner;

public class BankApp {
	//인스턴스 변수(초기화 완료)
	private static Account[]accountArray = new Account[10]; // Account 객체 배열 10개 선언, 생성
	private static Scanner scanner = new Scanner(System.in); // 사용자 입력
	

	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.계좌생성 |  2, 계좌목록|	3.예금	|	4.출금	|	5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택 >> ");
			
			// sc.nextline(); String 타입으로 입력값을 처리하겠음
			// scanner.nextline(); int 타입으로 입력값을 처리
			int selectNo = Integer.parseInt(scanner.nextLine()); //1이랑 엔터를 입력하나 정수만 가지고 갈 수 있어서 1만 가지고 감
												//그러므로 다음으로 넘어가게 되면 엔터값이 남아있어서 엔터값을 읽을 수 있는 nextline이 있어
												//자동으로 데이터 값이 넘어가게 되버린다.
						switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accoutList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				//while 종료
				run = false;
				break;
			default:
				break;
			}
			
		}//while문 종료
	}//main 종료
	
		private static void createAccount() {
			// 계좌생성
			//Account 인스턴스를 생성하기 값읗 입력받기
			System.out.println("계좌번호 >> ");
			String ano = scanner.nextLine();
			
			System.out.println("예금주 >>");
			String owner = scanner.nextLine();
			
			System.out.println("잔액 >> ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			//accountArray[0] = new Account("123-123", "홍길동", 100000);
			//for문을 돌려 i 에 해당하는 배열 초기값이 null 이면 수행
			// 한번만 수행되고 빠져 나오도록 해야 함
			for (int i = 0; i < accountArray.length; i++) {
				if(accountArray[i]==null) {
					accountArray[i] = new Account(ano,owner,balance);
					System.out.println("계좌가 생성되었습니다.");
					break;
				}
			}
		}
		private static void accoutList() {
			//accountArray 에 있는 내용 출력 ==> 생성된 계좌 정보 출력
			//null이 아닌 경우만 출력
			System.out.println();
			System.out.println("계좌목록");
			System.out.println("-------------------");
			
			// %t는 탭 기능
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i]!=null) {
					System.out.printf("%s\t%s\t%d\n",
							accountArray[i].getAno(),
							accountArray[i].getOwner(),
							accountArray[i].getBalance());
				}
			}
		}
		private static void deposit() {
//			// 예금하다 - 계좌번호 입력받기, 예금액 입력받기
//			// accountArray에서 일치하는 계좌를 찾아 잔액 = 잔액 + 예금액
//			// 맞는 계좌가 있는지 찾아야 한다. 루프를 돌아 계좌를 찾아야 함. null을 찾으면 에러가 난다.
//			System.out.println();
//			String ano = scanner.nextLine();
//			System.out.println();
//			int amount = Integer.parseInt(scanner.nextLine());
//			
//			for (int i = 0; i < accountArray.length; i++) {
//				if (accountArray[i]!=null) {
//					if (accountArray[i].getAno().equals(ano)) {
//						accountArray[i].setBalance(accountArray[i].getbalance() + amount);
//					}
//				}
//			}
//			
			
			System.out.println();
			System.out.println("계좌번호를 입력해주세요");
			String num = scanner.nextLine();
			System.out.println();
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i]!= null) {
				accountArray[i].equals(accountArray[i].getAno() == num ? "예금액을 입력해주세요" : "다른 계좌번호를 입력해주세요");
				}
				int sum = Integer.parseInt(scanner.nextLine());
				System.out.printf(" 잔액 %d=원금%d + 예금액%d",sum+accountArray[i].getBalance(),accountArray[i].getBalance(),sum);
			}
			
			
			
			
			
			
		}
		private static void withdraw() {
			System.out.println();
			String ano = scanner.nextLine();
			System.out.println();
			int amount = Integer.parseInt(scanner.nextLine());
			
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i]!=null) {
					if (accountArray[i].getAno().equals(ano)) {
						accountArray[i].setBalance(accountArray[i].getBalance() + amount);
					}
				}
			}
			
				
			
		}
	}


package ch4;
/*중첩 for
 * : for문 안에 for문 포함
 * 
 */

public class ForEx4 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			System.out.println("*********");
		}
//		1) 바깥 for
//		2) i < 6;
//		3) 안 쪽 for 시작, J = 0
//		4) J < 10;
//		5) System.out.println("*");
//		6) J++ J=1
//		7) J <10;
//		8) System.out.println("*");
//		9) 6)~8) 반복됨
//		10) J가 10이 되면 안쪽 FOR 거짓이 됨 ==> 안쪽 FOR 종료
//		11) System.out.println();
//		12) 바깥쪽 FOR I++ I=2 
//		13) I < 6 조건 비교
//		14) 안쪽 FOR 문 10번 수행
//		15) 계속 반복되다가 I가 6이 되는 순간 문 종료
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
		
		//4x+5y=60의 모든 해 구하기
		// 단, x,y는 10이하의 자연수
		//4*1+5*1=60
		//4*1+5*2=60
		//4*1+5*3=60
		//4*1+5*4=60
		//4*1+5*5=60
		//.........
		//4*2+5*1=60
		//4*2+5*2=60
		//4*2+5*3=60
		//4*2+5*4=60
		//...........
		
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				//60이 나오는 x,y를 출력하는 코드 입력 필요
				if (4*i+5*j==60) {
					System.out.printf("(%d,%d)\n",i,j);
				}				
			}
		}
		
		//break;
		//자신이 포함된 가장 가까운 반복문 벗아나게 된다.(주로 if와 같이 사용됨)
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) break;
		}
	System.out.println();
		
		//continue;
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음
		//반복으로 넘어감.
		
		for (int i = 0; i <= 10; i++) {
			if (i%3==0) continue;
				System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
	}

}

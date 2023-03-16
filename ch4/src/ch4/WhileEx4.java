package ch4;



public class WhileEx4 {
	public static void main(String[] args) {
		// while, Math.random() 사용
		// 두 개의 주사위를 던져 나오는 값을 (값1,값2) 형태로 출력하고
		// 값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료
		
		while (true) {
			int dice=(int)(Math.random()*6)+1;
			int dice1=(int)(Math.random()*6)+1;
			if (dice+dice1!=5) {
				System.out.printf("(%d,%d) ",dice,dice1);
			}else if(dice+dice1==5)break;	
			
			// 답안지
			// while (true) {
			// int dice=(int)(Math.random()*6)+1;
			// int dice1=(int)(Math.random()*6)+1;
			// System.out.printf("(%d,%d) ",dice,dice1);
			// if(dice+dice1==5)break;
			// 반복 실행이 기본 전제인데 굳이 if문으로 두 다이스의 합이 5가 아닌 경우의 수를 말할 필요가 없다.
			// 두 다이스의 합이 5가 되는 경우만 제거하면 더 간단하게 원하는 내용을 뽑을 수 있다.
		}
		
//		for, if, while 은 수행할 문장이 하나라면 블럭을 생략할 수 있음.		
//		Ex)  if(조건) "   ";   - 가능
//			   //수행할 문장
//		     
		
		
		
		
		
		
	}

}

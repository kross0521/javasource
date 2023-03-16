package ch5;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		//사용자한테 답변을 받을 수 있도록 코드 작성
		//답과 비교를 했을 때 equals 써서 true 인 경우 정답입니다.
		//						  false 인 경우 틀렸습니다. 정답은 ~ 입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				
				{"integer","정수"}
		};
		
		
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("(Q%d) %s 의 뜻은?\n",i+1,words[i][0]);
			
		System.out.println(">>");
		//답변 입력받기
		String answer =sc.nextLine();
		//정답과 답변 비교
		if(answer.equals(words[i][1])) {
			System.out.println("정답입니다.");
		}else {
			System.out.printf("틀렸습니다. 정답은 %s 입니다.",words[i][1]);
		}
		
//	오답지(수정완료)			
	//	String ans =(sc.nextLine());
	//	System.out.println(ans.equals(words[i][1])?"일치함":"일치하지 않음");
	//	틀린 이유 이미 for 변수에 들어와 있는데 같은 작업을 반복하는 문구를 만듬.
	//	내가 원하는 답은 정수의 형태가 아닌 문자의 형태. 즉 참조 형으로 받아야 하는데 int를 사용함.
	//	내가 어느 블럭에서 작업하는 지 그리고 내가 원하는 답의 형태가 문자인지 숫자 형식인 지 확인하고 사용할 것.
		}
		
		
	}	
	
}

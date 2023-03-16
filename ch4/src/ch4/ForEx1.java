package ch4;
/* 반복문
 * : 어떤 작업이 반복적으로 수행되도록 할 때 사용
 * 종류 : for(주로 사용됨), while, do-while
 */
public class ForEx1 {

	public static void main(String[] args) {
		// 1)int i=0; 초기화
		// 2) i < 10; 조건식 (★false(거짓)일 때 반복문이 종료가 된다.★)
		// 3)조건식이 true일 때 블럭안으로 진입 : 출력문 실행
		// 4)i++ 증감식, i=1
		// 5)다시 조건식 검사, i < 10;
		// 6)조건식이 true일 때 블럭안으로 진입 : 출력문 실행
		// 7).......
		// 8)위에 방식으로 조건이 거짓이 될 때까지 작업을 반복함.
		for (int i = 0; i < 10; i++) {
			System.out.print(i+"  ");
		}
//			System.out.println(i); 포문({})밖에서는 i를 불러올 수 없음
		
		System.out.println();
		for (int i = 10; i >=1 ; i--) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for (int i = 1; i <=10 ; i++) {
			System.out.print(i+"  ");
		}
		
		//i+=2  는 i = i+2를 축약해서 작성하는 것.
		//ex) int sum=10, sum=sum3+3 ==> sum+=3
		// 1 3 5 7 9
		System.out.println();
		for (int i = 1; i <=10 ; i+=2) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println();
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i+" ");
		}
		
		//sum=1;
		//sum1=sum+2;
		//sum2=sum1+3;
		//......
		System.out.println();
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum=sum+i; // sum+=1;
		}
		System.out.println("1~10까지의 합 : "+sum);
	}

}

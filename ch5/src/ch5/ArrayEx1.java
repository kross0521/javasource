package ch5;
/*배열 (array)
 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
 * int score1=98, score2= 88, ................;
 * 어차피 하나의 같은 int 변수이니까 묶음으로 처리하면 간단하지 않을까?
 * ==> int score[]; // 배열 선언
 * ==> score = new int[30]; 배열 생성
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		
		int score[] = new int[30];//30개는 0~29개의 index를 가지고 있다.
		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성
		//index를 이용해서 접근할 수 있다.
		//int 타입은 0으로 초기화 되어 있다.
		
		System.out.println(score[0]);//0~29 인덱스(index)로 접근
		System.out.println(score[15]);//0~29 인덱스(index)로 접근
		
		score[0]=98;
		score[1]=88;
		//인덱스에 0으로 초기화 된 값을 새로운 값으로 할당한다.
		
		int score2[] = {98,88,78,68,58,48,38,28,18,8,1};
		//배열선언, 생성, 초기화
		// 각 스코어에 점수를 기입을 해줘야하는데 위에 방법처럼 옆에 각 공간에 대한 초기화를 진행해주면 더 빠르게 작성가능하다.
		
		System.out.println("5번 째 학생의 점수 : "+score2[4]);
		
		double score3[] = {98.2,89.1,77.9,77.1,59.1,44.7,66.2,57.1,11.7,56.1,25.7};
		System.out.println("1번 째 학생 점수 : "+score3[0]);
		System.out.println("2번 째 학생 점수 : "+score3[1]);
		System.out.println("3번 째 학생 점수 : "+score3[2]);
		System.out.println("4번 째 학생 점수 : "+score3[3]);
		System.out.println("5번 째 학생 점수 : "+score3[4]);
		System.out.println("6번 째 학생 점수 : "+score3[5]);
		System.out.println("7번 째 학생 점수 : "+score3[6]);
		System.out.println("8번 째 학생 점수 : "+score3[7]);
		System.out.println("9번 째 학생 점수 : "+score3[8]);
		System.out.println("10번 째 학생 점수 : "+score3[9]);
		
		//위에 방법처럼 일일히 10명의 값을 불러오기해서 할 수 있지만 반복문을 만들어서 코드를 요약할 수 있다.
		

		//System.out.println(score3.length);
		// 내가 불로오고 싶은 공간의 길이를 구할 수 있는 방법 : .length
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번 째 학생 점수 : "+score3[i]);
		}
		
		//char 5개를 담는 배열
		char chArr[]= {'o','t','s','b','a'};
		
		
		
		
}
}

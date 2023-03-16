package ch1;

//주석(//): 상세설명(ctrl + /)
/* 변수명 규칙
 * 대소문자 구별, 길이에 제한은 없음
 * 예약어 사용 불가 ex) int ture; int short;
 * 숫자로 시작하면 안됨 ex) int 7d
 * 특수문자는 _,$만 허용 ex) int s#arp;
 * 
 * 변수와 첫글자는 항상 소문자
 * 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 한다(lastIndexOf)
 */

//값은 리터럴이라고 부른다


public class VariableEx3 {
	public static void main(String[] args) {
		//변수  : 메모리 공간
		//타입 변수명 = 값; ==> int num = 1;
		//메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정됨
		//문자 : 문자('가'- char), 문자열("가나다라")
		//숫자 : 정수 - byte, short, int, long
		//		실수 - float, double
		//논리 : 참(ture), 거짓(false)
	
		
		
		//두 변수의 값 교환
		int x=10, y=20;
		
		//비어 있는 공간 작성
		int temp=0;
		
		//둘 중의 하나의 값을 옮기기
		temp=x;
		//나머지 값 옮기기
		x=y;
		y=temp;
		//출력
		System.out.println("x = "+x+", y =" +y);
		//""+ : 앞의 문자열과 연결해서 출력하기
		System.out.println("x = " + x);
		System.out.println(x);
		
		
	}
}

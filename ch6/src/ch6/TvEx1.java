package ch6;

/*
 * 기본형 : int, float,double ....
 * 참조형 : Data, String, 배열 int[]
 * 
 * 매개변수
 * method(매개변수)
 *  매개변수 기본형 ==> 값만 복사
 *  참조형 매개변수 ==> 주소가 복사됨
 */

public class TvEx1 {

	public static void main(String[] args) {
		// TV의 객체를 생성 = 클래스로부터 객체를 만드는 과정(인스턴스(instance)화)
		//Tv tv = new Tv(); // 클래스 이름이 앞으로 오면 객체를 생성할 수 있다.
						  // 순서 : 클래스 이름  변수명 = NEW 클래스이름();
		//객체 선언
		Tv tv;
		// 객체 생성
		tv = new Tv();
		//객체가 가지고 있는 속성, 메소드를 사용하기 위해서는 .(dot)로 접근
		print(tv);// 주소 넘어감
		//멤버변수 초기화
		tv.color = "black";
		tv.channel = 6;
		tv.power = true;
		
		//초기화 후 확인
		print (tv);
		
		//메소드를 호출 ==> 메소드가 실행된다.
		tv.channelUp();
		System.out.println("채널 "+tv.channel);
		
		tv.power();
		System.out.println("전원여부 "+tv.power);
		
		Tv tv2 = new Tv();
		
		tv2.color = "white";
		tv2.channel = 11;
		
		//tv켜기, tv끄기
		tv2.power();
		print(tv2);
		
	}

	static void print(Tv tv) {
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원여부 "+tv.power);
	}
}

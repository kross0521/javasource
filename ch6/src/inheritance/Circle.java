package inheritance;

// 패키지 : 클래스(인터페이스) 묶음
// ==> 폴더
//클래스 이름 : 패키지명.클래스명


// 클래스 관계
// 상속관계(is-a) : Circle is a Point 원은 점이다. 하나의 클래스만 가지고 올 수 있다.
// 포함관계(has-a) : Circle is a Point 원은 점을 가지고 있다. 여러 개가 들어와서 사용할 수 있다.


// Car
// 엔진 클래스
// 도어 클래스

// 포함관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조변수를 선언
public class Circle {
//	int x;	//좌표
//	int y;	//y좌표
	Point p = new Point();	//포함관계

	int r;	//반지름

}

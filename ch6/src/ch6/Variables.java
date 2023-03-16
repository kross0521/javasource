package ch6;

public class Variables {
	//선언위치에 따른 변수의 종류
	//어떤 위치에 생성되냐 어떤 변수이냐에 따라 생성 시기가 다르다.
	//1)클래스 변수: 클래스가 메모리에 올라갔을때
	//2)인스턴스 변수: 인스턴스가 생성되었을 때  ex) Time time = new time();
	//3)지역변수 : 변수 선언문이 수행되었을 때
	int num;	//멤버변수(인스턴스 변수)
	static int cv;	//클래스 변수(static 변수, 공유(?)변수)
	
	void method(String name) {
		int lv = 0; //지역변수
		
	}
}

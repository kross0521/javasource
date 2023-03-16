package ch6;

public class Car2 {
	//속성(property) : 멤버변수
	//- 제조사,모델,색상,최대속도......

	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자(Constructor)
	// [source] - [Generate Constructor(생성자) using fields...]
	//생성자의 이름은 클래스 이름과 동일해야 함
	//리턴값이 없음  Ex) void(메소드)가 없음
	//생성자는 여러 개의 존재 가능(생성자 오버로딩)
	
	// 목적 : 인스턴스가 생성될 때 호출됨
	//		 인스턴스 초기화 담당(or 인스턴스 생성시 수행될 코드)
	
	public Car2() {//기본(default)생성자 : 괄호 안에 매개변수가 없는 생성자이다.
		super();
	}
	
	// 매개변수가 있는 생성자가 머냐? : 괄호안에 멤버변수가 있는 것이 매개변수 있는 생성자이다.
	public Car2(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//기능(function): 메소드
	//- 전진한다, 후진한다......
	void forword() {
		System.out.println("전진한다");

	
	}
	void backword() {
		System.out.println("후진한다");
	}
	
	
	
}

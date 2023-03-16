package ch6;

public class Person {
	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("무게 : "+weight);
	}
	
	//name 매개변수에 값을 받아서 Person에 가지고 있는 name 인스턴스변수의
	//값을 변경하겠다.
	//setName을 부르고 싶으면 인스턴스를 생성한 후에 가능하다.
	public void setName(String name) {
	this.name = name;
		// name 이 공백이 아니고 null이 아니면
		// 공백이나 널이면 기본값을 홍길동으로 세팅
		if (name.equals("")||name == null) {
			this.name = "홍길동";
		} else {
			this.name = name;
		}
		//set을 사용할 때는 값을 리턴할 필요가 없어서 void 사용
		//
	print();
	
	
	}
	
	static void prints2() {
		Person p = new Person();
		p.setName("");
	}
	
}

package ch6;

public class PersonEx {

	public static void main(String[] args) {
		Person p = new Person(); //Person 인스턴스 하나 생성됨 ==> Person 가지고 있는 인스턴스변수, 메소드 사용 가능
		p.setName("아이묭");//String 참조타입을 맞춰서 ()안에 채워야한다.
		p.print();
		
		
		
		Person.prints2();
	}
	

}
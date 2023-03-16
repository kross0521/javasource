package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// Person 객체를 Set 구조에 담기
		Set<Person> set = new HashSet<>();
		// 왼쪽 타입만 담을 수 있기 때문에 오른쪽에 작성 안해도 괜찮다.
		// 사용자 정의 객체는 중복 저장을 허용함
		// 허용하지 않으려면 직접 입력해줘야 한다. ==> person 클래스에서  equals(), hashCode() 오버라이딩 해야 함
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
		
	}

}

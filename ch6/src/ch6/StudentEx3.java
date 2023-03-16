package ch6;

public class StudentEx3 {

	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,76);
		
		String msg = stu.info();
		 
		System.out.println(msg);
		// msg 출력 시
		// 홍길동,1,1,100,60,76, 점수합계,평균
		System.out.println(stu);
		
		
		//Student2 객체 생성
		Student2 stu2 = new Student2("아이묭",2,1,88,89,65);
		System.out.println("이름 : "+stu2.name);
		System.out.println("총점 : "+stu2.getTotal());
		System.out.println("평균 : "+stu2.geAverage());
	
		//이름 : 아이묭
		//총점 : 236
		//평균 : 78.1223
		System.out.println(stu2);
		
		//Student2 student = new Student2("켄시", 3, 5, 75, 80, 90);
		//주소 ==> 인스턴스변수가 가지고 있는 값으로 출력(toString())
		//System.out.println(student);
		
		//입력값으로 Student2 인스턴스를 3개 생성
		
		
		
		
		for (Student2 stu:students) {
			System.out.println(stu);
		}
		
		
		
		
		//향상된 for
		int arr[] = new int [3];
		for(int num:arr) {
			System.out.println(num);
		}
		
		
		
		
		
	}

}

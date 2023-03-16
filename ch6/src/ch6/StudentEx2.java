package ch6;

public class StudentEx2 {

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
	}

}

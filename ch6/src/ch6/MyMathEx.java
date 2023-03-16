package ch6;

public class MyMathEx {

	public static void main(String[] args) {
		
		//	Math.random();
		
		//Static 메소드 호출
		//클래스명.메소드명()
		System.out.println(MyMath.add(200L, 300L));
		System.out.println(MyMath.subtract(200L, 300L));
		System.out.println(MyMath.multiply(200L, 300L));
		System.out.println(MyMath.divide(1000L, 300L));
	//인스턴스 메소드 호출
		MyMath Math = new MyMath();
		Math.a = 200L;
		Math.b = 100L;
		System.out.println(Math.add());
		System.out.println(Math.subtract());
		System.out.println(Math.multiply());
		System.out.println(Math.divide());
	
	
	}

}

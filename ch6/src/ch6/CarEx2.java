package ch6;

public class CarEx2 {
/*
 * 직접 초기화를 할 수 있지만 권장하지 않음.
 * 주로 생성자를 만들어서 작업하는 것을 권장함.
 */
	public static void main(String[] args) {
		
		//객체 생성 시 생성자를 자동으로 호출하도록 되어있다.
		//Car2(String company, String model, 
		//String color, int maxSpeed)
		//아래의 초기화 값을 대입해서 들어간다.
		// 즉, 개체 생성과 초기화를 같이 진행할 수 있다.
		Car2 car = new Car2();
		// 기본 생성자를 호출(실행)하면서 개체 생성을 한 것이다.
		System.out.println("제조사 "+car.company);
		System.out.println("모델명 "+car.model);
		System.out.println("색상 "+car.color);
		System.out.println("최대 속력 "+car.maxSpeed);
		
		System.out.println();
		
		Car2 car2 = new Car2("기아","레이","white",200);
		// 매개변수가 있는 생성자를 호출(실행)하면서 생성한 것이다.
		System.out.println("제조사 "+car2.company);
		System.out.println("모델명 "+car2.model);
		System.out.println("색상 "+car2.color);
		System.out.println("최대 속력 "+car2.maxSpeed);
		
		
		
		
		
		
		
	}

}

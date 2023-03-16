package abstr;

public class CarEx {

	public static void main(String[] args) {
		//다향성
		//car로 접근할 수 있는 범위
		//부모가 가지고 있는 멤버들로만 그능
		//단, 오버라이딩 된 메소드가 있다면 자식의 메소드을 실행함.	
		Car car = new Aicar();
		car.run();
		
		System.out.println("=================================");
		car = new ManuCar();
		car.run();
		
		
	}

}

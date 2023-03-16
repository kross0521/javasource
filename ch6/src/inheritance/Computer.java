package inheritance;

public class Computer extends Calculator {
	//Math.random() : static 메소드
	//Math.PI : final(상수일 때 붙이기) static double PI =3.1415950000
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}

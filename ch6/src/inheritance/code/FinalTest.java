package inheritance.code;


//클래스에 final이 있을 경우 : 상속금지
public final class FinalTest {
		
	final int MAX_SIZE =10;  //상수
	
	
	static final int MIN_SIZE=0;
	//공유해서 쓰는 상수
	
	//메소드에 final이 있을 경우 : 오버라이딩을 금지, final은 무조건 못 바꿔!
	final void getMaxSize() {
		final int LV = MAX_SIZE; //상수 : 초기화 이후에는 값을 변경할 수 없다.
		
	}
	
	
}

package inter;

public interface Action {
	void work();
	
}
//Action action = new Action();  => (x)
//구현 클래스를 만들어야 하지만 여러번 불러쓰지 않을 경우 == > 익명 클래스 사용
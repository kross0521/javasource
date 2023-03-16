package thread;
// 쓰레드에서의 문제 : 하나의 공간에 이미 저장해 놨던 데이터가 있었으나 잠시 멈춘 상태에서
//			 		다른 데이터가 들어와서 데이터를 변경시켰을 때 이미 존재하던 데이터가 가진 값이
//					유지되는 것이 아니라 달라진다.
public class UserMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		User user1 = new User(cal);
		User2 user2 = new User2(cal);
		
		user1.start();
		user2.start();
		
	}

}

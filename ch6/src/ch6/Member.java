package ch6;

public class Member {
	String userid;//아이디 userid ex)hong123
	String password;//비밀번호 password ex)hong123@!
	String confirmPassword;//비밀번호확인 confirmPassword ex)hong123@!
	String hp;//전화번호 hp ex)01012341234
	String address;//주소 address ex)서울
	
	public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		
	}
	
	public Member(String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	} // 매개변수 있는 생성자를 2개 만들 때 똑같은 모양이면 에러가 난다. 그래서 한 가지 차이를 주면 된다.

//	String passwordAndConfirmPasswordEquals() {
//			return password+confirmPassword;
//	}
	boolean passwordAndConfirmPasswordEquals() {
	//문자열 비교 == 사용 하면 안됨
	//equals() t/f
		return password.equals(confirmPassword);
	}
}

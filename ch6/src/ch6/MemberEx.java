package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong123@!","hong123@!","01012341234","서울");
		
		Member member2 = new Member("hong123","hong123@!","hong123@!","01012341234","서울 종로구");
		

		if(member1.passwordAndConfirmPasswordEquals()) {
			//true 라면 비밀번호가 일치합니다.
			System.out.println("비밀번호가 일치합니다.");
		}else {
			//false 라면 비밀번호를 확인해 주세요 메세지 출력
			System.out.println("비밀번호를 확인해 주세요");
		}
		
		System.out.println(member2.passwordAndConfirmPasswordEquals()?"비밀번호가 일치합니다." : "비밀번호를 확인해주세요");
//		static 없이 다른 메소드로 넣을 수 있는 방법		
//		MemberEx obj = new MemberEx();
//		obj.memberInfo(member1);  //member1과 member2 내용 출력
//		obj.memberInfo(member2);  //member1과 member2 내용 출력		
		
		
		memberInfo(member1);  //member1과 member2 내용 출력
		memberInfo(member2);  //member1과 member2 내용 출력		
		//memberInfo 오타 잘 확인하기
		
	}
	static void memberInfo(Member member) {
		// static이 없으면 이미 업로드 된 memberInfo를 불러올 수가 없다.
		//출력결과
		System.out.println("아이디 : "+member.userid);	//아이디 : 초기값 출력
		System.out.println("아이디 : "+member.password);	//비밀번호 : 초기값 출력
		System.out.println("아이디 : "+member.hp);	//전화번호 : 초기값 출력
		System.out.println("아이디 : "+member.address);	//주소 : 초기값 출력
	}
}

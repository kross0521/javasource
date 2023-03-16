package lang;
/*String 클래스
 * - 변경 불가능한(immutable) 클래스
 * - equals() : 값 비교
 * - equalsIgnoreCase() : 대소문자 구별하지 말고 값 비교
 */
public class StringEx1 {
// 콘솔 프로그램 작성 시 main()메소드를 가지고 있는 클래스가 필요
//	==> 화면 출력, 입력 .... main()메소드가 있는 클래스가 필요함
// main 메소드가 없는 클래스 : 
	public static void main(String[] args) {
		//String 클래스의 동작 구현
		//문자열을 다루는 일이 많기 때문에 new를 사용하지 않고도 인스턴스를 생성할 수 있도록 되어 있음
		String str2 = "Hello"; //1) 문자열 리터럴 지정 : 문자열 재사용 함
		String str4 = "Hello"; // str2에서 hello 가 담겨있으면 str4에서 새로 인스턴스 생성했을 때 str2의 주소를 가리켜서 hello값을 가지고 온다.
		String str = new String("안녕하세요");
		String str3 = new String("안녕하세요");
		//str2 = str2+str;
		
		//문자열 비교
		//String 클래스에 equals 오버라이딩(값 비교)되어 있음
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str2==str3); //문자열 비교시는 == 사용하지 말 것
										// ==는 무조건 주소 비교
		
		System.out.println(str2==str4); //true  ==> 값은 true 가 나왔지만 결국 ==는 주소 비교, 
										//str2 와 str4는 같은 주소가 기입되어 있기 때문에 값 비교가 아니다
		
	}

}

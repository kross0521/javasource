package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
	// String 생성자
		
		// new String(char value[])
		char c[] = {'h','e','l','l','o'};
		String str1 = new String(c);
		System.out.println(str1);
		
		String str2 = "Hello";
		
		//length() :
		System.out.println("length() : 문자열 길이 "+str1.length());
		
		//charAt(int index) : char => charAt 호출 시 int 매개변수를 넣어서 호출하고 return값은 char로 받는다.
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
		
		String str3 = "자바 프로그프래밍";
		//str3 문자열에 '프' 문자가 들어있는 지 확인하고 싶다. : length(),for,charAt()
		for (int i = 0; i < str3.length(); i++) {	
					if (str3.charAt(i)=='프') {
			System.out.println("프가 들어있음");
			break;
		}
	}
	
//		int cnt = 0; // 프 문자 갯수를 세는 변수
//		for(int i =0; i <str3.length();i++) {
//			if(str3.charAt(i)=='프') {
//				cnt++;
//			}
//		}
		//indexof(int ch) : 주어진 문자 ch가 문자열에 들어있는 지 확인하고 위치를 리턴한다.(못 찾으면 -1 리턴한다.)
		// String st2 = "Hello"
		System.out.println("indexOf(int ch) : "+str2.indexOf('o'));
		System.out.println("indexOf(int str) : "+str2.indexOf("o"));
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e',0));// e를 찾는데 찾는 시작위치를 0부터 시작해라
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e',2));// e를 찾는데 찾는 시작위치를 2부터 시작해라
		
		// lastIndexof() : 위치를 찾을 때 오른쪽 끝에서부터 찾기 시작해라
		System.out.println("indexof(int ch) : "+str2.lastIndexOf('o'));
		
		// str3 문자열에 '프' 문자가 들어있는 지 확인 : indexof()만 사용
		System.out.println(str3.indexOf('프')>-1 ? "프가 들어있음" : "프가 없음");

		//subString() : 범위에 해당하는 문자열 얻기
		String ssn = "880515-1222012";
		// subString(int beginIndex)
		String result = ssn.substring(3);
		System.out.println(result);
		// subString(int beginIndex,int endIndex) : endIndex 미 포함
		System.out.println("subString(int beginIndex,int endIndex) "+ssn.subSequence(3, 8));//515-1
		
		// concat() : +(문자열)과 같은 역할, + 대신 사용가능
		String result2=str2.concat("안녕하세요");
		System.out.println(result2);
		
		//startSwith(String prefix) : 해당 문자열(prefix)로 시작하느냐? 물어보는 것
		String str4 = "java.lang.Object";
		System.out.println("startSwith(String prefix) "+ str4.startsWith("java"));
		System.out.println("startSwith(String prefix) "+ str4.startsWith("phthon"));
		System.out.println("startSwith(String prefix,int toOffset) "+ str4.startsWith("java", 3));
		
		//endsWith()
		System.out.println("endsWith(String prefix) " + str4.endsWith("java"));
		
		// contains(CharSequence s) : s 문자열이 포함되어 있는 지 검사, true(false)형태로 옴
		System.out.println("contains(CharSequence s)" + str2.contains("Hello"));
		
		// replace(원본문자열, 변경문자열) :
		// replace로 원본 문자를 바꿨는데 변경된 데이터가 str5로 안담긴다. : String 은 원본을 바꿀 수 없다.
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("자바", "java")); // replace()결과를 새로운 문자열로 리턴
		// 원본 문자열 변경하길 원한다면 새로운 문자열로 리턴되는 값을 다시 담아줘야 한다.
		str5 =str5.replace("자바", "java");
		System.out.println(str5);
		
		System.out.println(str2.replace('H', 'h'));
		// replaceFirst(String regex, String replacement)
		System.out.println(str5.replaceFirst("java", "자바"));
		System.out.println(str5.replaceAll("java", "자바"));
		
		//static ==> 클래스이름.메소드명, 클래스이름.상수
		//static String valueOf() : 지정된 값을 문자열로 변환하여 반환
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf('c'));
		System.out.println(String.valueOf(100)); //다시 int로 전환 : integer.parseInt("100")
		
		// a를 문자열로 변경
		int a = 100;
		String str7 = true + "";
		
		//toLowerCase() : 모든 문자를 소문자로 변경 / toUpperCase() : 모든 문자를 대문자로 변경
		System.out.println("toLowerCase() "+str2.toLowerCase());
		System.out.println("toUpperCase() "+str2.toUpperCase());
		
		//split() : 문자열에 많은 기호들을 가지고 있어서 분리를 하고 싶을 때 사용하기 유용함.
		String animals = "dog,cat,bear";
		//regex : Regular expression(정규 표현식) = 특정한 규칙을 가진 문자열의 집합
		String[] arr = animals.split(",");
		System.out.println(arr); //[Ljava.lang.String;@782830e : tostring이 오버라이딩이 안되어 있으면 뜨는 문구
		
		System.out.println(Arrays.toString(arr)); //[dog, cat, bear]

		
		//for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//dog
		//cat
		//bear
		
		//split(String regex, int limit) : regex로 나누되, limit로 나누기
		arr = animals.split(",", 2);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// compareTo(String str) : str과 문자열 비교(사전순서) , 비교 순서 기준은 compareTo()안에 들어오는 문자열부터
		// 같으면 0, 사전 순으로 이전이면 음수. 이후면 양수
		System.out.println("aaa".compareTo("aaa")); //	0
		System.out.println("aaa".compareTo("bbb")); //	-1
		System.out.println("bbb".compareTo("aaa")); //	1
		
		//split() <==> join()
		//join() : 특정 문자열(구분자)로 결합
		arr = animals.split(",");
		System.out.println(Arrays.toString(arr)); //[dog, cat, bear]
		String str8 = String.join("-", arr);
		System.out.println("join() "+str8); //join() dog-cat-bear
		
		
		
		
		
	}

}
